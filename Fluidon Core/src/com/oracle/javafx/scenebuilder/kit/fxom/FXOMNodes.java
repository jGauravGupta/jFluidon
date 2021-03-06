/*
 * Copyright (c) 2012, 2014, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.javafx.scenebuilder.kit.fxom;

import com.oracle.javafx.scenebuilder.kit.metadata.property.value.DoublePropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.value.ImagePropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.util.DesignImage;
import com.oracle.javafx.scenebuilder.kit.metadata.util.PrefixedValue;
import com.oracle.javafx.scenebuilder.kit.metadata.util.PropertyName;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaException;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import org.netbeans.jfluidon.specification.metadata.entity.IComponentClassMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyName;

/**
 * This class groups static utility methods which operate on FXOMNode and
 * subclasses (a bit like Collection and Collections).
 *
 *
 */
public class FXOMNodes {

    /**
     * Sorts the specified set of objects according their location in the fxom
     * document. Objets are sorted according depth first order. In particular,
     * if objects all have the same parent, then the resulting list will be
     * sorted by indexes.
     *
     * @param objects a set of fxom objects (never null but possibly empty)
     * @return the list of objets sorted by position in the fxom document
     */
    public static List<FXOMObject> sort(Set<FXOMObject> objects) {
        final List<FXOMObject> result;

        assert objects != null;

        if (objects.isEmpty()) {
            result = Collections.emptyList();
        } else if (objects.size() == 1) {
            result = Collections.singletonList(objects.iterator().next());
        } else {
            final FXOMObject object0 = objects.iterator().next();
            final FXOMDocument fxomDocument = object0.getFxomDocument();
            assert fxomDocument != null;
            result = new ArrayList<>();
            sort(fxomDocument.getFxomRoot(), objects, result);
        }

        return result;
    }

    /**
     * Flattens a set of fxom objects. A set of fxom objects is declared "flat"
     * if each object member of the set has no ancestor member of the set.
     *
     * @param objects a set of fxom objects (never null)
     * @return the flat set of objects.
     */
    public static Set<FXOMObject> flatten(Set<FXOMObject> objects) {
        final Set<FXOMObject> result = new HashSet<>();

        assert objects != null;

        for (FXOMObject o : objects) {
            if (lookupAncestor(o, objects) == null) {
                result.add(o);
            }
        }

        return result;
    }

    /**
     * Returns null or the first ancestor of "obj" which belongs to
     * "candidates".
     *
     * @param obj an fxom object (never null)
     * @param candidates a set of fxom object (not null and not empty)
     * @return null or the first ancestor of "obj" which belongs to
     * "candidates".
     */
    public static FXOMObject lookupAncestor(FXOMObject obj, Set<FXOMObject> candidates) {
        assert obj != null;
        assert candidates != null;
        assert candidates.isEmpty() == false;

        FXOMObject result = obj.getParentObject();
        while ((result != null) && (candidates.contains(result) == false)) {
            result = result.getParentObject();
        }

        return result;
    }

    public static FXOMNode newNode(FXOMNode source) {
        final FXOMNode result;

        if (source instanceof FXOMObject) {
            result = newObject((FXOMObject) source);
        } else if (source instanceof FXOMProperty) {
            result = newProperty((FXOMProperty) source);
        } else {
            throw new IllegalArgumentException(FXOMNodes.class.getSimpleName()
                    + " needs some additional implementation"); //NOI18N
        }

        return result;
    }

    public static FXOMObject newObject(FXOMObject source) {
        final FXOMObject result;

        if (source instanceof FXOMCollection) {
            result = FXOMCollection.newInstance((FXOMCollection) source);
        } else if (source instanceof FXOMInstance) {
            result = FXOMInstance.newInstance((FXOMInstance) source);
        } else if (source instanceof FXOMIntrinsic) {
            result = FXOMIntrinsic.newInstance((FXOMIntrinsic) source);
        } else {
            throw new IllegalArgumentException(FXOMNodes.class.getSimpleName()
                    + " needs some additional implementation"); //NOI18N
        }

        return result;
    }

    public static FXOMObject newObject(FXOMDocument targetDocument, File file)
            throws IOException {
        assert targetDocument != null;
        assert file != null;
        FXOMObject result = null;
        if (file.getAbsolutePath().endsWith(".fxml")) { //NOI18N
            final String fxmlText
                    = FXOMDocument.readContentFromURL(file.toURI().toURL());
            final FXOMDocument transientDoc = new FXOMDocument(targetDocument.getFluidonFile(),
                    fxmlText,
                    targetDocument.getLocation(),
                    targetDocument.getClassLoader(),
                    targetDocument.getResources(), true);
            result = transientDoc.getFxomRoot();
            if (result != null) {
                result.moveToFxomDocument(targetDocument);
            }
        } else {
            // Try load the file as an image
            final String fileURL = file.toURI().toURL().toString();
            final Image image = new Image(fileURL);
            if (image.isError() == false) {
                final FXOMDocument transientDoc
                        = makeFxomDocumentFromImageURL(image, 200.0);
                result = transientDoc.getFxomRoot();
                if (result != null) {
                    result.moveToFxomDocument(targetDocument);
                }
            } else {
                try {
                    final Media media = new Media(fileURL);
                    if (media.getError() == null) {
                        final FXOMDocument transientDoc
                                = makeFxomDocumentFromMedia(media, 200.0);
                        result = transientDoc.getFxomRoot();
                        if (result != null) {
                            result.moveToFxomDocument(targetDocument);
                        }
                    } else {
                        throw new IOException(media.getError());
                    }
                } catch (MediaException x) {
                    throw new IOException(x);
                }
            }
        }

        return result;
    }

    public static FXOMProperty newProperty(FXOMProperty source) {
        final FXOMProperty result;

        if (source instanceof FXOMPropertyC) {
            result = FXOMPropertyC.newInstance((FXOMPropertyC) source);
        } else if (source instanceof FXOMPropertyT) {
            result = FXOMPropertyT.newInstance((FXOMPropertyT) source);
        } else {
            throw new IllegalArgumentException(FXOMNodes.class.getSimpleName()
                    + " needs some additional implementation");
        }

        return result;
    }

    public static FXOMDocument newDocument(FXOMObject source) {
        final FXOMObject copy = FXOMNodes.newObject(source);

        if (copy instanceof FXOMInstance) {
            trimStaticProperties((FXOMInstance) copy);
        }

        final FXOMDocument result = new FXOMDocument(source.getFxomDocument().getFluidonFile());
        result.beginUpdate();
        result.setLocation(source.getFxomDocument().getLocation());
        copy.moveToFxomDocument(result);
        result.setFxomRoot(copy);
        result.endUpdate();

        return result;
    }

    public static void updateProperty(FXOMInstance fxomInstance, FXOMProperty sourceProperty) {
        assert fxomInstance != null;
        assert sourceProperty != null;
        assert sourceProperty.getFxomDocument() == fxomInstance.getFxomDocument();

        final FXOMProperty currentProperty = fxomInstance.getProperties().get(sourceProperty.getName());
        if (currentProperty == null) {
            sourceProperty.addToParentInstance(-1, fxomInstance);
        } else if ((currentProperty instanceof FXOMPropertyT)
                && (sourceProperty instanceof FXOMPropertyT)) {
            final FXOMPropertyT currentPropertyT = (FXOMPropertyT) currentProperty;
            final FXOMPropertyT newPropertyT = (FXOMPropertyT) sourceProperty;
            updateProperty(currentPropertyT, newPropertyT);
        } else if ((currentProperty instanceof FXOMPropertyC)
                && (sourceProperty instanceof FXOMPropertyC)) {
            final FXOMPropertyC currentPropertyC = (FXOMPropertyC) currentProperty;
            final FXOMPropertyC newPropertyC = (FXOMPropertyC) sourceProperty;
            updateProperty(currentPropertyC, newPropertyC);
        } else {
            final int index = currentProperty.getIndexInParentInstance();
            currentProperty.removeFromParentInstance();
            sourceProperty.addToParentInstance(index, fxomInstance);
        }
    }

    public static void updateProperty(FXOMPropertyT fxomProperty, FXOMPropertyT sourceProperty) {
        assert fxomProperty != null;
        assert sourceProperty != null;
        assert fxomProperty.getName().equals(sourceProperty.getName());
        fxomProperty.setValue(sourceProperty.getValue());
    }

    public static void updateProperty(FXOMPropertyC fxomProperty, FXOMPropertyC sourceProperty) {
        assert fxomProperty != null;
        assert sourceProperty != null;
        assert fxomProperty.getName().equals(sourceProperty.getName());

        final List<FXOMObject> currentValues = new ArrayList<>();
        currentValues.addAll(fxomProperty.getValues());
        final List<FXOMObject> sourceValues = new ArrayList<>();
        sourceValues.addAll(sourceProperty.getValues());

        final int currentCount = currentValues.size();
        final int newCount = sourceValues.size();
        final int updateCount = Math.min(currentCount, newCount);

        // Update items
        for (int i = 0; i < updateCount; i++) {
            final FXOMObject currentValue = currentValues.get(i);
            final FXOMObject newValue = sourceValues.get(i);
            if ((currentValue instanceof FXOMInstance)
                    && (newValue instanceof FXOMInstance)) {
                final FXOMInstance currentInstance = (FXOMInstance) currentValue;
                final FXOMInstance newInstance = (FXOMInstance) newValue;
                if (currentInstance.getDeclaredClass() == newInstance.getDeclaredClass()) {
                    updateInstance(currentInstance, newInstance);
                } else {
                    replacePropertyValue(currentValue, newValue);
                }
            } else if ((currentValue instanceof FXOMCollection)
                    && (newValue instanceof FXOMCollection)) {
                final FXOMCollection currentCollection = (FXOMCollection) currentValue;
                final FXOMCollection newCollection = (FXOMCollection) newValue;
                updateCollection(currentCollection, newCollection);
            } else if ((currentValue instanceof FXOMIntrinsic)
                    && (newValue instanceof FXOMIntrinsic)) {
                final FXOMIntrinsic currentIntrinsic = (FXOMIntrinsic) currentValue;
                final FXOMIntrinsic newIntrinsic = (FXOMIntrinsic) newValue;
                updateIntrinsic(currentIntrinsic, newIntrinsic);
            } else {
                replacePropertyValue(currentValue, newValue);
            }
        }

        if (currentCount < newCount) {
            // Add new items
            for (int i = currentCount; i < newCount; i++) {
                final FXOMObject newValue = sourceValues.get(i);
                newValue.addToParentProperty(-1, fxomProperty);
            }
        } else {
            // Delete old items
            for (int i = newCount; i < currentCount; i++) {
                final FXOMObject currentValue = currentValues.get(i);
                currentValue.removeFromParentProperty();
            }
        }
    }

    public static void updateInstance(FXOMInstance fxomInstance, FXOMInstance sourceInstance) {
        assert fxomInstance != null;
        assert sourceInstance != null;
        assert fxomInstance.getFxomDocument() == sourceInstance.getFxomDocument();
        assert fxomInstance.getDeclaredClass() == sourceInstance.getDeclaredClass();

        // Compute obsolete properties.
        // It must be done here because sourceInstance is going to mutate.
        final Set<IPropertyName> obsoleteNames = new HashSet<>();
        obsoleteNames.addAll(fxomInstance.getProperties().keySet());
        obsoleteNames.removeAll(sourceInstance.getProperties().keySet());

        // Update properties
        final Set<FXOMProperty> sourceProperties = new HashSet<>(sourceInstance.getProperties().values());
        for (FXOMProperty sourceProperty : sourceProperties) {
            updateProperty(fxomInstance, sourceProperty);
        }
        // Remove obsolete properties
        for (IPropertyName pn : obsoleteNames) {
            final FXOMProperty fxomProperty = fxomInstance.getProperties().get(pn);
            assert fxomProperty != null;
            assert fxomProperty.getParentInstance() == fxomInstance;
            fxomProperty.removeFromParentInstance();
        }

        fxomInstance.setFxConstant(sourceInstance.getFxConstant());
        fxomInstance.setFxValue(sourceInstance.getFxValue());
        fxomInstance.setFxFactory(sourceInstance.getFxFactory());
    }

    public static void updateCollection(FXOMCollection fxomCollection, FXOMCollection sourceCollection) {
        assert fxomCollection != null;
        assert sourceCollection != null;
        assert fxomCollection.getFxomDocument() == sourceCollection.getFxomDocument();

        final int currentCount = fxomCollection.getItems().size();
        final int sourceCount = sourceCollection.getItems().size();
        final int updateCount = Math.min(currentCount, sourceCount);

        // Update items
        for (int i = 0; i < updateCount; i++) {
            final FXOMObject currentValue = fxomCollection.getItems().get(i);
            final FXOMObject newValue = sourceCollection.getItems().get(i);
            if ((currentValue instanceof FXOMInstance)
                    && (newValue instanceof FXOMInstance)) {
                final FXOMInstance currentInstance = (FXOMInstance) currentValue;
                final FXOMInstance newInstance = (FXOMInstance) newValue;
                updateInstance(currentInstance, newInstance);
            } else if ((currentValue instanceof FXOMCollection)
                    && (newValue instanceof FXOMCollection)) {
                final FXOMCollection currentCollection = (FXOMCollection) currentValue;
                final FXOMCollection newCollection = (FXOMCollection) newValue;
                updateCollection(currentCollection, newCollection);
            } else if ((currentValue instanceof FXOMIntrinsic)
                    && (newValue instanceof FXOMIntrinsic)) {
                final FXOMIntrinsic currentIntrinsic = (FXOMIntrinsic) currentValue;
                final FXOMIntrinsic newIntrinsic = (FXOMIntrinsic) newValue;
                updateIntrinsic(currentIntrinsic, newIntrinsic);
            } else {
                final int index = currentValue.getIndexInParentProperty();
                assert index != -1;
                currentValue.removeFromParentCollection();
                newValue.addToParentCollection(index, fxomCollection);
            }
        }

        if (currentCount < sourceCount) {
            // Add new items
            final int addCount = sourceCount - currentCount;
            for (int i = 0; i < addCount; i++) {
                final FXOMObject newValue = sourceCollection.getItems().get(i);
                newValue.addToParentCollection(-1, fxomCollection);
            }
        } else {
            // Delete old items
            final int removeCount = currentCount - sourceCount;
            for (int i = 0; i < removeCount; i++) {
                final FXOMObject currentValue = fxomCollection.getItems().get(sourceCount);
                currentValue.removeFromParentProperty();
            }
        }

        fxomCollection.setFxConstant(sourceCollection.getFxConstant());
        fxomCollection.setFxValue(sourceCollection.getFxValue());
        fxomCollection.setFxFactory(sourceCollection.getFxFactory());
    }

    public static void updateIntrinsic(FXOMIntrinsic fxomIntrinsic, FXOMIntrinsic sourceIntrinsic) {
        assert fxomIntrinsic != null;
        assert sourceIntrinsic != null;
        assert fxomIntrinsic.getFxomDocument() != sourceIntrinsic.getFxomDocument();
        assert fxomIntrinsic.getType() == sourceIntrinsic.getType();

        fxomIntrinsic.setSource(sourceIntrinsic.getSource());
        fxomIntrinsic.setFxConstant(sourceIntrinsic.getFxConstant());
        fxomIntrinsic.setFxValue(sourceIntrinsic.getFxValue());
        fxomIntrinsic.setFxFactory(sourceIntrinsic.getFxFactory());
    }

    public static List<FXOMPropertyT> collectToggleGroupReferences(FXOMObject fxomRoot, String toggleGroupId) {
        assert fxomRoot != null;
        assert toggleGroupId != null;

        final IPropertyName toggleGroupName = new PropertyName("toggleGroup");
        final List<FXOMPropertyT> result = new ArrayList<>();

        for (FXOMProperty p : fxomRoot.collectProperties(toggleGroupName)) {
            if (p instanceof FXOMPropertyT) {
                final FXOMPropertyT pt = (FXOMPropertyT) p;
                final PrefixedValue pv = new PrefixedValue(pt.getValue());
                if (pv.isExpression()) {
                    /*
                     * p is an FXOMPropertyT like this:
                     *
                     * <.... toggleGroup="$id" .... />
                     */
                    final String id = pv.getSuffix();
                    if (id.equals(toggleGroupId)) {
                        result.add(pt);
                    }
                }
            }
        }

        return result;
    }

    public static List<FXOMObject> serializeObjects(FXOMObject fxomObject) {
        final List<FXOMObject> result = new ArrayList<>();

        serializeObjects(fxomObject, result);
        assert result.isEmpty() == false;
        assert result.get(0) == fxomObject;

        return result;
    }

    /*
     * Private
     */
    private static void sort(FXOMObject from,
            Set<FXOMObject> objects, List<FXOMObject> result) {

        if (objects.contains(from)) {
            result.add(from);
        }

        if (from instanceof FXOMCollection) {
            final FXOMCollection collection = (FXOMCollection) from;
            for (FXOMObject item : collection.getItems()) {
                sort(item, objects, result);
            }
        } else if (from instanceof FXOMInstance) {
            final FXOMInstance instance = (FXOMInstance) from;
            final List<IPropertyName> propertyNames
                    = new ArrayList<>(instance.getProperties().keySet());
            Collections.sort(propertyNames);
            for (IPropertyName name : propertyNames) {
                final FXOMProperty property = instance.getProperties().get(name);
                assert property != null;
                if (property instanceof FXOMPropertyC) {
                    final FXOMPropertyC propertyC = (FXOMPropertyC) property;
                    for (FXOMObject v : propertyC.getValues()) {
                        sort(v, objects, result);
                    }
                }
            }
        } else {
            assert from instanceof FXOMIntrinsic : "Unexpected FXOMObject subclass " + from.getClass();
        }
    }

    private static void trimStaticProperties(FXOMInstance fxomInstance) {
        final List<FXOMProperty> properties
                = new ArrayList<>(fxomInstance.getProperties().values());
        for (FXOMProperty p : properties) {
            if (p.getName().getResidenceClass() != null) {
                // This is a static property : we remove it.
                p.removeFromParentInstance();
            }
        }
    }

    private static void replacePropertyValue(FXOMObject replacee, FXOMObject replacement) {
        assert replacee.getIndexInParentProperty() != -1;

        final int replaceeIndex = replacee.getIndexInParentProperty();
        assert replaceeIndex != -1;
        replacement.addToParentProperty(replaceeIndex, replacee.getParentProperty());
        replacee.removeFromParentProperty();
    }

    private static FXOMDocument makeFxomDocumentFromImageURL(
            Image image, double fitSize) throws IOException {

        assert image != null;
        assert fitSize > 0.0;

        final double imageWidth = image.getWidth();
        final double imageHeight = image.getHeight();

        final double fitWidth, fitHeight;
        final double imageSize = Math.max(imageWidth, imageHeight);
        if (imageSize < fitSize) {
            fitWidth = 0;
            fitHeight = 0;
        } else {
            final double widthScale = fitSize / imageSize;
            final double heightScale = fitSize / imageHeight;
            final double scale = Math.min(widthScale, heightScale);
            fitWidth = Math.floor(imageWidth * scale);
            fitHeight = Math.floor(imageHeight * scale);
        }

        return makeFxomDocumentFromImageURL(image, fitWidth, fitHeight);
    }

    private static FXOMDocument makeFxomDocumentFromImageURL(
            Image image, double fitWidth, double fitHeight) {

        final FXOMDocument result = new FXOMDocument(null);//GG_CHECK null for IMetadata
        final FXOMInstance imageView = new FXOMInstance(result, ImageView.class);

        final IPropertyName imageName = new PropertyName("image"); //NOI18N
        final IPropertyName fitWidthName = new PropertyName("fitWidth"); //NOI18N
        final IPropertyName fitHeightName = new PropertyName("fitHeight"); //NOI18N

        final IComponentClassMetadata imageViewMeta = null; //GG_INVERT
//                = Metadata.getMetadata().queryComponentMetadata(ImageView.class);
        final IPropertyMetadata imagePropMeta
                = imageViewMeta.lookupProperty(imageName);
        final IPropertyMetadata fitWidthPropMeta
                = imageViewMeta.lookupProperty(fitWidthName);
        final IPropertyMetadata fitHeightPropMeta
                = imageViewMeta.lookupProperty(fitHeightName);

        assert imagePropMeta instanceof ImagePropertyMetadata;
        assert fitWidthPropMeta instanceof DoublePropertyMetadata;
        assert fitHeightPropMeta instanceof DoublePropertyMetadata;

        final ImagePropertyMetadata imageMeta
                = (ImagePropertyMetadata) imagePropMeta;
        final DoublePropertyMetadata fitWidthMeta
                = (DoublePropertyMetadata) fitWidthPropMeta;
        final DoublePropertyMetadata fitHeightMeta
                = (DoublePropertyMetadata) fitHeightPropMeta;

        imageMeta.setValue(imageView, new DesignImage(image));
        fitWidthMeta.setValue(imageView, fitWidth);
        fitHeightMeta.setValue(imageView, fitHeight);

//        result.setFxomRoot(imageView);
        return result;
    }

    private static FXOMDocument makeFxomDocumentFromMedia(
            Media media, double fitSize) throws IOException {

        assert media != null;
        assert fitSize > 0.0;

        final double mediaWidth = media.getWidth();
        final double mediaHeight = media.getHeight();

        final double fitWidth, fitHeight;
        final double mediaSize = Math.max(mediaWidth, mediaHeight);
        if (mediaSize < fitSize) {
            fitWidth = 0;
            fitHeight = 0;
        } else {
            final double widthScale = fitSize / mediaSize;
            final double heightScale = fitSize / mediaHeight;
            final double scale = Math.min(widthScale, heightScale);
            fitWidth = Math.floor(mediaWidth * scale);
            fitHeight = Math.floor(mediaHeight * scale);
        }

        return makeFxomDocumentFromMedia(media, fitWidth, fitHeight);
    }

    private static FXOMDocument makeFxomDocumentFromMedia(
            Media media, double fitWidth, double fitHeight) {

        /*
         * <MediaView fitWidth="200" fitHeight="2003 >
         *   <mediaPlayer>
         *     <MediaPlayer cycleCount="-1">
         *       <media>
         *         <Media>
         *           <source>
         *              <URL value="file:/Users/elp/Dekstop/blah.flv" />
         *           </source>
         *         <Media/>
         *       </media>
         *     </MediaPlayer>
         *   </mediaPlayer>
         * </MediaView>
         */
        final FXOMDocument result = new FXOMDocument(null);//GG_CHECK null for IMetadata

        /*
         * URL
         */
        final IPropertyName valueName
                = new PropertyName("value"); //NOI18N
        final FXOMPropertyT valueProperty
                = new FXOMPropertyT(result, valueName, media.getSource());
        final FXOMInstance urlInstance
                = new FXOMInstance(result, URL.class);
        valueProperty.addToParentInstance(-1, urlInstance);

        /*
         * Media
         */
        final IPropertyName sourceName
                = new PropertyName("source"); //NOI18N
        final FXOMPropertyC sourceProperty
                = new FXOMPropertyC(result, sourceName, urlInstance);
        final FXOMInstance mediaInstance
                = new FXOMInstance(result, Media.class);
        sourceProperty.addToParentInstance(-1, mediaInstance);

        /*
         * MediaPlayer
         */
        final IPropertyName mediaName
                = new PropertyName("media"); //NOI18N
        final FXOMPropertyC mediaProperty
                = new FXOMPropertyC(result, mediaName, mediaInstance);
        final FXOMInstance mediaPlayerInstance
                = new FXOMInstance(result, MediaPlayer.class);
        mediaProperty.addToParentInstance(-1, mediaPlayerInstance);

        /*
         * MediaView
         */
        final IPropertyName mediaPlayerName
                = new PropertyName("mediaPlayer"); //NOI18N
        final FXOMPropertyC mediaPlayerProperty
                = new FXOMPropertyC(result, mediaPlayerName, mediaPlayerInstance);
        final IPropertyName fitWidthName
                = new PropertyName("fitWidth"); //NOI18N
        final FXOMPropertyT fitWidthProperty
                = new FXOMPropertyT(result, fitWidthName, String.valueOf(fitWidth));
        final IPropertyName fitHeightName
                = new PropertyName("fitHeight"); //NOI18N
        final FXOMPropertyT fitHeightProperty
                = new FXOMPropertyT(result, fitHeightName, String.valueOf(fitHeight));
        final FXOMInstance mediaView
                = new FXOMInstance(result, MediaView.class);
        mediaPlayerProperty.addToParentInstance(-1, mediaView);
        fitWidthProperty.addToParentInstance(-1, mediaView);
        fitHeightProperty.addToParentInstance(-1, mediaView);

        result.setFxomRoot(mediaView);

        return result;
    }

    private static void serializeObjects(FXOMObject fxomObject, List<FXOMObject> result) {
        assert fxomObject != null;
        assert result != null;

        result.add(fxomObject);

        if (fxomObject instanceof FXOMInstance) {
            final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
            for (FXOMProperty p : fxomInstance.getProperties().values()) {
                if (p instanceof FXOMPropertyC) {
                    final FXOMPropertyC pc = (FXOMPropertyC) p;
                    for (FXOMObject v : pc.getValues()) {
                        serializeObjects(v, result);
                    }
                }
            }
        } else if (fxomObject instanceof FXOMCollection) {
            final FXOMCollection fxomCollection = (FXOMCollection) fxomObject;
            for (FXOMObject i : fxomCollection.getItems()) {
                serializeObjects(i, result);
            }
        }
    }
}
