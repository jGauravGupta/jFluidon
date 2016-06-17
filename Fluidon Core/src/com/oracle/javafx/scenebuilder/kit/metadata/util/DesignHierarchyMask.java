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
package com.oracle.javafx.scenebuilder.kit.metadata.util;

import com.oracle.javafx.scenebuilder.kit.editor.images.ImageUtils;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMCollection;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMInstance;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMIntrinsic;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMObject;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMProperty;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMPropertyC;
import com.oracle.javafx.scenebuilder.kit.metadata.property.ComponentPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.ValuePropertyMetadata;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Labeled;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TitledPane;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import org.netbeans.jfluidon.annotation.Component;
import org.netbeans.jfluidon.specification.metadata.IMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IComponentClassMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyName;
import org.netbeans.jfluidon.util.Util;

/**
 *
 */
public class DesignHierarchyMask {

    public enum Accessory {
        // True accessories

        PLACEHOLDER,
        TOOLTIP,
        CONTEXT_MENU,
        CLIP,
        GRAPHIC,
        // Single-valued sub-components treated as accessories
        // TODO(elp) : verify that it is complete
        CONTENT,
        TOP,
        BOTTOM,
        LEFT,
        RIGHT,
        CENTER,
        XAXIS,
        YAXIS,
        TREE_COLUMN
    }
    private static final IPropertyName graphicName = new PropertyName("graphic");
    private static final IPropertyName contentName = new PropertyName("content");
    private static final IPropertyName topName = new PropertyName("top");
    private static final IPropertyName bottomName = new PropertyName("bottom");
    private static final IPropertyName leftName = new PropertyName("left");
    private static final IPropertyName rightName = new PropertyName("right");
    private static final IPropertyName centerName = new PropertyName("center");
    private static final IPropertyName xAxisName = new PropertyName("XAxis");
    private static final IPropertyName yAxisName = new PropertyName("YAxis");
    private static final IPropertyName placeholderName = new PropertyName("placeholder");
    private static final IPropertyName tooltipName = new PropertyName("tooltip");
    private static final IPropertyName contextMenuName = new PropertyName("contextMenu");
    private static final IPropertyName clipName = new PropertyName("clip");
    private static final IPropertyName treeColumnName = new PropertyName("treeColumn");
    private final FXOMObject fxomObject;
    private Map<IPropertyName, ComponentPropertyMetadata> propertyMetadataMap; // Initialized lazily

    public DesignHierarchyMask(FXOMObject fxomObject) {
        assert fxomObject != null;
        this.fxomObject = fxomObject;
    }

    public FXOMObject getFxomObject() {
        return fxomObject;
    }

    public FXOMObject getParentFXOMObject() {
        return fxomObject.getParentObject();
    }

    public boolean isFxNode() {
        return fxomObject.getSceneGraphObject() instanceof Node;
    }

    public FXOMObject getClosestFxNode() {
        FXOMObject result = fxomObject;
        DesignHierarchyMask mask = this;

        while ((result != null) && (mask.isFxNode() == false)) {
            result = mask.getParentFXOMObject();
            mask = (result == null) ? null : new DesignHierarchyMask(result);
        }

        return result;
    }

    public URL getClassNameIconURL() {
        final Object sceneGraphObject;

        // For FXOMIntrinsic, we use the source sceneGraphObject
        if (fxomObject instanceof FXOMIntrinsic) {
            sceneGraphObject = ((FXOMIntrinsic) fxomObject).getSourceSceneGraphObject();
        } else {
            sceneGraphObject = fxomObject.getSceneGraphObject();
        }

        if (sceneGraphObject == null) {
            // For now, handle icons for scenegraph objects only
            return null;
        }
        final URL url;
        
        Component component =  sceneGraphObject.getClass().getAnnotation(Component.class);
        if(component!=null){
            if (component.icon() != null) {
            return Util.getURL(component.icon());
        } 
        }
            // Default
            final String className = sceneGraphObject.getClass().getSimpleName();
            url = ImageUtils.getNodeIconURL(className + ".png"); //NOI18N
        return url;
    }

    public Image getClassNameIcon() {
        final URL resource = getClassNameIconURL();
        return ImageUtils.getImage(resource);
    }

    public String getClassNameInfo() {
        final Object sceneGraphObject;
        String classNameInfo = null;
        String prefix = "", suffix = ""; //NOI18N

        // For FXOMIntrinsic, we use the source sceneGraphObject
        if (fxomObject instanceof FXOMIntrinsic) {
            final FXOMIntrinsic fxomIntrinsic = (FXOMIntrinsic) fxomObject;
            sceneGraphObject = fxomIntrinsic.getSourceSceneGraphObject();
            if (fxomIntrinsic.getType() == FXOMIntrinsic.Type.FX_INCLUDE) {
                // Add FXML prefix for included FXML file
                prefix += "FXML "; //NOI18N
            }
        } else {
            sceneGraphObject = fxomObject.getSceneGraphObject();
        }

        if (sceneGraphObject == null) {
            classNameInfo = prefix + fxomObject.getGlueElement().getTagName() + suffix;
        } else {
            Component component = sceneGraphObject.getClass().getAnnotation(Component.class);
            if (component != null) {
                if (component.name() != null) {
                    classNameInfo = component.name();
                }
            }
            if (classNameInfo == null) {
                classNameInfo = prefix + sceneGraphObject.getClass().getSimpleName() + suffix;
            }
        }
        return classNameInfo;
    }

    /**
     * Returns the string value for this FXOM object description property. If
     * the value is internationalized, the returned value is the resolved one.
     *
     * @return
     */
    public String getDescription() {
        if (hasDescription()) { // (1)
            final IPropertyName propertyName = getPropertyNameForDescription();
            assert propertyName != null; // Because of (1)
            assert fxomObject instanceof FXOMInstance; // Because of (1)
            final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
            final IMetadata metadata = fxomObject.getFxomDocument().getMetadata();
            final ValuePropertyMetadata vpm
                    = metadata.queryValueProperty(fxomInstance, propertyName);
            final Object description = vpm.getValueInSceneGraphObject(fxomInstance); // resolved value
            return description == null ? null : description.toString();
        }
        return null;
    }

    /**
     * Returns a single line description for this FXOM object.
     *
     * @return
     */
    public String getSingleLineDescription() {
        String result = getDescription();
        if (result != null && containsLineFeed(result)) {
            result = result.substring(0, result.indexOf("\n")) + "..."; //NOI18N
        }
        return result;
    }

    /**
     * Returns the object value for this FXOM object node id property.
     *
     * @return
     */
    public Object getNodeIdValue() {
        Object result = null;
        if (fxomObject instanceof FXOMInstance) {
            final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
            final IPropertyName propertyName = new PropertyName("id"); //NOI18N

            final IMetadata metadata = fxomObject.getFxomDocument().getMetadata();
            final ValuePropertyMetadata vpm
                    = metadata.queryValueProperty(fxomInstance, propertyName);
            result = vpm.getValueObject(fxomInstance);
        }
        return result;
    }

    /**
     * Returns the string value for this FXOM object node id property.
     *
     * @return
     */
    public String getNodeId() {
        final Object value = getNodeIdValue();
        String result = null;
        if (value != null) {
            result = value.toString();
        }
        return result;
    }

    public String getFxId() {
        String result = null;
        if (fxomObject instanceof FXOMInstance) { // Can be null for place holder items
            final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
            final String fxId = fxomInstance.getFxId();
            result = fxId == null ? "" : fxId; //NOI18N
        }
        return result;
    }

    public boolean hasDescription() {
        final Object sceneGraphObject = fxomObject.getSceneGraphObject();
        if (sceneGraphObject == null) {
            // For now, handle display label for scenegraph objects only
            return false;
        }
        return sceneGraphObject instanceof ComboBox
                || sceneGraphObject instanceof Labeled
                || sceneGraphObject instanceof Menu
                || sceneGraphObject instanceof MenuItem
                || sceneGraphObject instanceof Tab
                || sceneGraphObject instanceof TableColumn
                || sceneGraphObject instanceof Text
                || sceneGraphObject instanceof TextInputControl
                || sceneGraphObject instanceof TitledPane
                || sceneGraphObject instanceof Tooltip;
    }

    public boolean isResourceKey() {
        if (hasDescription()) { // (1)
            // Retrieve the unresolved description
            final IPropertyName propertyName = getPropertyNameForDescription();
            assert propertyName != null; // Because of (1)
            assert fxomObject instanceof FXOMInstance; // Because of (1)
            final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
            final IMetadata metadata = fxomObject.getFxomDocument().getMetadata();
            final ValuePropertyMetadata vpm
                    = metadata.queryValueProperty(fxomInstance, propertyName);
            final Object description = vpm.getValueObject(fxomInstance); // unresolved value
            final PrefixedValue pv = new PrefixedValue(description.toString());
            return pv.isResourceKey();
        }
        return false;
    }

    public boolean isFreeChildPositioning() {
        boolean result = false;
        if (fxomObject instanceof FXOMInstance) {
            final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
            final Class<?> componentClass = fxomInstance.getDeclaredClass();
            result = componentClass == AnchorPane.class
                    || componentClass == Group.class
                    || componentClass == Pane.class;
        }
        return result;
    }

    public boolean isAcceptingAccessory(Accessory accessory) {
        final IPropertyName propertyName = getPropertyNameForAccessory(accessory);
        final Class<?> valueClass = getClassForAccessory(accessory);
        return isAcceptingProperty(propertyName, valueClass);
    }

    /**
     * Returns true if this mask accepts the specified fxomObject as accessory.
     *
     * @param accessory
     * @param fxomObject
     * @return
     */
    public boolean isAcceptingAccessory(final Accessory accessory, final FXOMObject fxomObject) {
        final Object sceneGraphObject = fxomObject.getSceneGraphObject();
        final Class<?> accessoryClass = getClassForAccessory(accessory);
        return isAcceptingAccessory(accessory)
                && accessoryClass.isInstance(sceneGraphObject);
    }

    public static Class<?> getClassForAccessory(Accessory accessory) {
        final Class<?> result;

        switch (accessory) {
            case GRAPHIC:
            case TOP:
            case BOTTOM:
            case LEFT:
            case RIGHT:
            case CENTER:
            case PLACEHOLDER:
            case CLIP:
            case CONTENT:
                result = javafx.scene.Node.class;
                break;
            case XAXIS:
            case YAXIS:
                result = javafx.scene.chart.Axis.class;
                break;
            case TOOLTIP:
                result = javafx.scene.control.Tooltip.class;
                break;
            case CONTEXT_MENU:
                result = javafx.scene.control.ContextMenu.class;
                break;
            case TREE_COLUMN:
                result = javafx.scene.control.TreeTableColumn.class;
                break;
            default: // Bug
                throw new IllegalStateException("Unexpected accessory " + accessory);
        }

        return result;
    }

    public FXOMObject getAccessory(Accessory accessory) {
        assert isAcceptingAccessory(accessory);
        assert fxomObject instanceof FXOMInstance;

        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        final IPropertyName propertyName = getPropertyNameForAccessory(accessory);
        final FXOMProperty fxomProperty = fxomInstance.getProperties().get(propertyName);
        final FXOMObject result;

        if (fxomProperty instanceof FXOMPropertyC) {
            final FXOMPropertyC fxomPropertyC = (FXOMPropertyC) fxomProperty;
            assert fxomPropertyC.getValues().size() >= 1 : "accessory=" + accessory;
            result = fxomPropertyC.getValues().get(0);
        } else {
            result = null;
        }

        return result;
    }

    public boolean isAcceptingSubComponent() {
        final IPropertyName propertyName = getSubComponentPropertyName();
        return propertyName != null;
    }

    /**
     * Returns true if this mask accepts the specified sub component.
     *
     * @param obj
     * @return
     */
    public boolean isAcceptingSubComponent(FXOMObject obj) {
        final boolean result;

        assert obj != null;

        final IPropertyName propertyName = getSubComponentPropertyName();
        if (propertyName == null) {
            result = false;
        } else {
            queryPropertyMetadata();
            final ComponentPropertyMetadata subComponentMetadata
                    = propertyMetadataMap.get(propertyName);
            assert subComponentMetadata != null;
            final Class<?> subComponentClass
                    = subComponentMetadata.getClassMetadata().getKlass();
            result = subComponentClass.isInstance(obj.getSceneGraphObject());
        }

        return result;
    }

    /**
     * Returns true if this mask accepts the specified sub components.
     *
     * @param fxomObjects
     * @return
     */
    public boolean isAcceptingSubComponent(final Collection<FXOMObject> fxomObjects) {
        final IPropertyName propertyName = getSubComponentPropertyName();
        if (propertyName != null) {
            queryPropertyMetadata();
            final ComponentPropertyMetadata subComponentMetadata
                    = propertyMetadataMap.get(propertyName);
            assert subComponentMetadata != null;
            final Class<?> subComponentClass
                    = subComponentMetadata.getClassMetadata().getKlass();
            for (FXOMObject obj : fxomObjects) {
                final Object sceneGraphObject = obj.getSceneGraphObject();
                if (!subComponentClass.isInstance(sceneGraphObject)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public IPropertyName getSubComponentPropertyName() {
        final IMetadata metadata = fxomObject.getFxomDocument().getMetadata();
        final Object sceneGraphObject = fxomObject.getSceneGraphObject();
        final IPropertyName result;

        if (fxomObject instanceof FXOMCollection) {
            result = null;
        } else if (sceneGraphObject == null) {
            // An unresolved has no subcomponent
            result = null;
        } else {
            final Class<?> componentClass = sceneGraphObject.getClass();
            final IComponentClassMetadata componentClassMedadata
                    = metadata.queryComponentMetadata(componentClass);
            assert componentClassMedadata != null;
            result = componentClassMedadata.getSubComponentProperty();
        }

        return result;
    }

    public int getSubComponentCount() {
        final IPropertyName name = getSubComponentPropertyName();
        return (name == null) ? 0 : getSubComponents().size();
    }

    public FXOMObject getSubComponentAtIndex(int i) {
        assert 0 <= i;
        assert i < getSubComponentCount();
        assert getSubComponentPropertyName() != null;

        return getSubComponents().get(i);
    }

    public List<FXOMObject> getSubComponents() {

        assert getSubComponentPropertyName() != null;
        assert fxomObject instanceof FXOMInstance;

        final IPropertyName subComponentPropertyName = getSubComponentPropertyName();
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        final FXOMProperty fxomProperty
                = fxomInstance.getProperties().get(subComponentPropertyName);

        final List<FXOMObject> result;
        if (fxomProperty instanceof FXOMPropertyC) {
            result = ((FXOMPropertyC) fxomProperty).getValues();
        } else {
            result = Collections.emptyList();
        }

        return result;
    }

    public IPropertyName getPropertyNameForDescription() {
        final Object sceneGraphObject = fxomObject.getSceneGraphObject();
        if (sceneGraphObject == null) {
            return null;
        }
        IPropertyName propertyName = null;
        if (sceneGraphObject instanceof ComboBox) {
            propertyName = new PropertyName("promptText");
        } else if (sceneGraphObject instanceof Labeled
                || sceneGraphObject instanceof Menu
                || sceneGraphObject instanceof MenuItem
                || sceneGraphObject instanceof Tab
                || sceneGraphObject instanceof TableColumn
                || sceneGraphObject instanceof TextInputControl
                || sceneGraphObject instanceof TitledPane
                || sceneGraphObject instanceof Text
                || sceneGraphObject instanceof Tooltip) {
            propertyName = new PropertyName("text");
        }
        return propertyName;
    }

    public IPropertyName getPropertyNameForAccessory(Accessory accessory) {
        final IPropertyName result;

        switch (accessory) {
            case GRAPHIC:
                result = graphicName;
                break;
            case CONTENT:
                result = contentName;
                break;
            case TOP:
                result = topName;
                break;
            case BOTTOM:
                result = bottomName;
                break;
            case LEFT:
                result = leftName;
                break;
            case RIGHT:
                result = rightName;
                break;
            case CENTER:
                result = centerName;
                break;
            case XAXIS:
                result = xAxisName;
                break;
            case YAXIS:
                result = yAxisName;
                break;
            case PLACEHOLDER:
                result = placeholderName;
                break;
            case TOOLTIP:
                result = tooltipName;
                break;
            case CONTEXT_MENU:
                result = contextMenuName;
                break;
            case CLIP:
                result = clipName;
                break;
            case TREE_COLUMN:
                result = treeColumnName;
                break;
            default: // Bug
                throw new IllegalStateException("Unexpected accessory " + accessory);
        }

        return result;
    }

    /*
     * Private
     */
    private boolean isAcceptingProperty(IPropertyName propertyName, Class<?> valueClass) {
        final ComponentPropertyMetadata cpm;
        final boolean result;

        queryPropertyMetadata();
        cpm = propertyMetadataMap.get(propertyName);
        if (cpm == null) {
            result = false;
        } else {
            result = valueClass.isAssignableFrom(cpm.getClassMetadata().getKlass());
        }

        return result;
    }

    public FXOMPropertyC getAccessoryProperty(Accessory accessory) {

        assert getPropertyNameForAccessory(accessory) != null;
        assert fxomObject instanceof FXOMInstance;

        final IPropertyName accessoryPropertyName = getPropertyNameForAccessory(accessory);
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        final FXOMProperty result
                = fxomInstance.getProperties().get(accessoryPropertyName);

        assert (result == null) || (result instanceof FXOMPropertyC);

        return (FXOMPropertyC) result;
    }

    private void queryPropertyMetadata() {
        if (propertyMetadataMap == null) {
            propertyMetadataMap = new HashMap<>();
            if (fxomObject instanceof FXOMInstance) {
                final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
                final IMetadata metadata = fxomObject.getFxomDocument().getMetadata();
                if (fxomInstance.getSceneGraphObject() != null) {
                    final Class<?> componentClass = fxomInstance.getSceneGraphObject().getClass();
                    for (ComponentPropertyMetadata cpm : metadata.queryComponentProperties(componentClass)) {
                        propertyMetadataMap.put(cpm.getName(), cpm);
                    }
                }
            }
        }

        assert propertyMetadataMap != null;
    }

    /**
     * Returns the number of columns constraints for this GridPane mask.
     *
     * @return the number of columns constraints
     */
    public int getColumnsConstraintsSize() {
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        final IPropertyName propertyName = new PropertyName("columnConstraints"); //NOI18N
        final FXOMProperty fxomProperty = fxomInstance.getProperties().get(propertyName);

        final int result;
        if (fxomProperty == null) {
            result = 0;
        } else {
            assert fxomProperty instanceof FXOMPropertyC; // ie cannot be written as an XML attribute
            final FXOMPropertyC fxomPropertyC = (FXOMPropertyC) fxomProperty;
            result = fxomPropertyC.getValues().size();
        }

        return result;
    }

    /**
     * Returns the number of rows constraints for this GridPane mask.
     *
     * @return the number of rows constraints
     */
    public int getRowsConstraintsSize() {
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        final IPropertyName propertyName = new PropertyName("rowConstraints"); //NOI18N
        final FXOMProperty fxomProperty = fxomInstance.getProperties().get(propertyName);

        final int result;
        if (fxomProperty == null) {
            result = 0;
        } else {
            assert fxomProperty instanceof FXOMPropertyC; // ie cannot be written as an XML attribute
            final FXOMPropertyC fxomPropertyC = (FXOMPropertyC) fxomProperty;
            result = fxomPropertyC.getValues().size();
        }

        return result;
    }

    /**
     * Returns the number of columns for this GridPane mask. The number of
     * columns for a GridPane is the max of : - the number of column constraints
     * - the max column index defined in this GridPane children + 1
     *
     * @return the number of columns
     */
    public int getColumnsSize() {
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        // Retrieve the column constraints size
        final int constraintsSize = getColumnsConstraintsSize();

        // Retrieve the max column index
        int maxColumnIndex = 0;
        for (int i = 0, count = getSubComponentCount(); i < count; i++) {
            final FXOMObject childObject = getSubComponentAtIndex(i);
            if (childObject.getSceneGraphObject() != null) {
                final DesignHierarchyMask childMask = new DesignHierarchyMask(childObject);
                if (maxColumnIndex < childMask.getColumnIndex()) {
                    maxColumnIndex = childMask.getColumnIndex();
                }
            }
        }

        return Math.max(constraintsSize, maxColumnIndex + 1);
    }

    /**
     * Returns the number of rows for this GridPane mask. The number of rows for
     * a GridPane is the max of : - the number of row constraints - the max row
     * index defined in this GridPane children + 1
     *
     * @return the number of rows
     */
    public int getRowsSize() {
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        // Retrieve the row constraints size
        final int constraintsSize = getRowsConstraintsSize();

        // Retrieve the max row index
        int maxRowIndex = 0;
        for (int i = 0, count = getSubComponentCount(); i < count; i++) {
            final FXOMObject childObject = getSubComponentAtIndex(i);
            if (childObject.getSceneGraphObject() != null) {
                final DesignHierarchyMask childMask = new DesignHierarchyMask(childObject);
                if (maxRowIndex < childMask.getRowIndex()) {
                    maxRowIndex = childMask.getRowIndex();
                }
            }
        }

        return Math.max(constraintsSize, maxRowIndex + 1);
    }

    public List<FXOMObject> getColumnContentAtIndex(int index) {
        assert 0 <= index;
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        final List<FXOMObject> result = new ArrayList<>();
        for (int i = 0, count = getSubComponentCount(); i < count; i++) {
            final FXOMObject childObject = getSubComponentAtIndex(i);
            final DesignHierarchyMask childMask = new DesignHierarchyMask(childObject);
            if (childMask.getColumnIndex() == index) {
                result.add(childObject);
            }
        }
        return result;
    }

    public List<FXOMObject> getRowContentAtIndex(int index) {
        assert 0 <= index;
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        final List<FXOMObject> result = new ArrayList<>();
        for (int i = 0, count = getSubComponentCount(); i < count; i++) {
            final FXOMObject childObject = getSubComponentAtIndex(i);
            final DesignHierarchyMask childMask = new DesignHierarchyMask(childObject);
            if (childMask.getRowIndex() == index) {
                result.add(childObject);
            }
        }
        return result;
    }

    public FXOMObject getColumnConstraintsAtIndex(int index) {

        assert 0 <= index;
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        FXOMObject result = null;

        // Retrieve the constraints property
        final IPropertyName propertyName = new PropertyName("columnConstraints"); //NOI18N
        final FXOMProperty constraintsProperty
                = fxomInstance.getProperties().get(propertyName);

        if (constraintsProperty != null) {
            assert constraintsProperty instanceof FXOMPropertyC;
            final List<FXOMObject> constraintsValues
                    = ((FXOMPropertyC) constraintsProperty).getValues();
            if (index < constraintsValues.size()) {
                result = constraintsValues.get(index);
            }
        }

        return result;
    }

    public FXOMObject getRowConstraintsAtIndex(int index) {

        assert 0 <= index;
        assert fxomObject instanceof FXOMInstance;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        assert fxomInstance.getSceneGraphObject() instanceof GridPane;

        FXOMObject result = null;

        // Retrieve the constraints property
        final IPropertyName propertyName = new PropertyName("rowConstraints"); //NOI18N
        final FXOMProperty constraintsProperty
                = fxomInstance.getProperties().get(propertyName);

        if (constraintsProperty != null) {
            assert constraintsProperty instanceof FXOMPropertyC;
            final List<FXOMObject> constraintsValues
                    = ((FXOMPropertyC) constraintsProperty).getValues();
            if (index < constraintsValues.size()) {
                result = constraintsValues.get(index);
            }
        }

        return result;
    }

    /**
     * Returns the column index for this GridPane child mask.
     *
     * @return the column index
     */
    public int getColumnIndex() {
        assert fxomObject instanceof FXOMInstance;
        assert fxomObject.getSceneGraphObject() != null;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        final FXOMObject parentFxomObject = fxomInstance.getParentObject();
        assert parentFxomObject.getSceneGraphObject() instanceof GridPane;

        final IPropertyName propertyName
                = new PropertyName("columnIndex", javafx.scene.layout.GridPane.class); //NOI18N
        final IMetadata metadata = fxomObject.getFxomDocument().getMetadata();
        final ValuePropertyMetadata vpm
                = metadata.queryValueProperty(fxomInstance, propertyName);
        final Object value = vpm.getValueObject(fxomInstance);
        // TODO : when DTL-5920 will be fixed, the null check will become unecessary
        final int result;
        if (value == null) {
            result = 0;
        } else {
            assert value instanceof Integer;
            result = ((Integer) value);
        }
        return result;
    }

    /**
     * Returns the row index for this GridPane child mask.
     *
     * @return the row index
     */
    public int getRowIndex() {
        assert fxomObject instanceof FXOMInstance;
        assert fxomObject.getSceneGraphObject() != null;
        final FXOMInstance fxomInstance = (FXOMInstance) fxomObject;
        final FXOMObject parentFxomObject = fxomInstance.getParentObject();
        assert parentFxomObject.getSceneGraphObject() instanceof GridPane;

        final IPropertyName propertyName
                = new PropertyName("rowIndex", javafx.scene.layout.GridPane.class); //NOI18N
        final IMetadata metadata = fxomObject.getFxomDocument().getMetadata();
        final ValuePropertyMetadata vpm
                = metadata.queryValueProperty(fxomInstance, propertyName);
        final Object value = vpm.getValueObject(fxomInstance);
        // TODO : when DTL-5920 will be fixed, the null check will become unecessary
        final int result;
        if (value == null) {
            result = 0;
        } else {
            assert value instanceof Integer;
            result = ((Integer) value);
        }
        return result;
    }

    // Should be in a shared Utils class ?
    public static boolean containsLineFeed(String str) {
        // LF (\n) is used for files generated on UNIX
        // CR+LF (\r\n) is used for files generated on WINDOWS
        // So in both cases, a file containing multi lines will contain LF
        if (str == null) {
            return false;
        }
        return str.contains("\n"); //NOI18N
    }

    /**
     *
     * @return true if the mask deserves a resizing while used as top element of
     * the layout.
     */
    public boolean needResizeWhenTopElement() {
        return (this.isAcceptingSubComponent()
                || this.isAcceptingAccessory(Accessory.CONTENT)
                || this.isAcceptingAccessory(Accessory.CENTER)
                || this.isAcceptingAccessory(Accessory.TOP)
                || this.isAcceptingAccessory(Accessory.RIGHT)
                || this.isAcceptingAccessory(Accessory.BOTTOM)
                || this.isAcceptingAccessory(Accessory.LEFT))
                && !(fxomObject.getSceneGraphObject() instanceof MenuButton
                || fxomObject.getSceneGraphObject() instanceof MenuBar); // Jerome
    }
}
