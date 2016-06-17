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
package com.oracle.javafx.scenebuilder.app.preferences;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.oracle.javafx.scenebuilder.app.DocumentWindowController;
import com.oracle.javafx.scenebuilder.app.i18n.I18N;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.ALIGNMENT_GUIDES_COLOR;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.BACKGROUND_IMAGE;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.CSS_TABLE_COLUMNS_ORDERING_REVERSED;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.HIERARCHY_DISPLAY_OPTION;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.LIBRARY_DISPLAY_OPTION;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.PARENT_RING_COLOR;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.RECENT_ITEMS;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.RECENT_ITEMS_SIZE;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.ROOT_CONTAINER_HEIGHT;
import static com.oracle.javafx.scenebuilder.app.preferences.PreferencesController.ROOT_CONTAINER_WIDTH;
import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.content.ContentPanelController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.hierarchy.AbstractHierarchyPanelController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.hierarchy.AbstractHierarchyPanelController.DisplayOption;
import com.oracle.javafx.scenebuilder.kit.editor.panel.library.LibraryPanelController.DISPLAY_MODE;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.prefs.Preferences;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.paint.Color;
import org.netbeans.jfluidon.config.preference.entity.BackgroundImage;
import org.netbeans.jfluidon.util.Util;

/**
 * Defines preferences global to the application.
 */
public class PreferencesRecordGlobal {

//    private static final BackgroundImage DEFAULT_BACKGROUND_IMAGE
//            = BackgroundImage.BACKGROUND_03;
    private static final Color DEFAULT_ALIGNMENT_GUIDES_COLOR = Color.RED;
    private static final Color DEFAULT_PARENT_RING_COLOR = Color.rgb(238, 168, 47);

    private static final DISPLAY_MODE DEFAULT_LIBRARY_DISPLAY_OPTION
            = DISPLAY_MODE.SECTIONS;

    private BackgroundImage backgroundImage;
    private Color alignmentGuidesColor = DEFAULT_ALIGNMENT_GUIDES_COLOR;
    private Color parentRingColor = DEFAULT_PARENT_RING_COLOR;
    private DISPLAY_MODE libraryDisplayOption = DEFAULT_LIBRARY_DISPLAY_OPTION;
    private final Preferences applicationRootPreferences;

//    public enum BackgroundImage {
//
//        BACKGROUND_01 {
//
//                    @Override
//                    public String toString() {
//                        return I18N.getString("prefs.background.value1");
//                    }
//                },
//        BACKGROUND_02 {
//
//                    @Override
//                    public String toString() {
//                        return I18N.getString("prefs.background.value2");
//                    }
//                },
//        BACKGROUND_03 {
//
//                    @Override
//                    public String toString() {
//                        return I18N.getString("prefs.background.value3");
//                    }
//                }
//    }
    public enum CSSAnalyzerColumnsOrder {

        DEFAULTS_FIRST {

                    @Override
                    public String toString() {
                        return I18N.getString("prefs.cssanalyzer.columns.defaults.first");
                    }
                },
        DEFAULTS_LAST {

                    @Override
                    public String toString() {
                        return I18N.getString("prefs.cssanalyzer.columns.defaults.last");
                    }
                }
    }

    public PreferencesRecordGlobal(Preferences applicationRootPreferences) {
        this.applicationRootPreferences = applicationRootPreferences;
    }

    public BackgroundImage getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(BackgroundImage value) {
        backgroundImage = value;
    }

    public Color getAlignmentGuidesColor() {
        return alignmentGuidesColor;
    }

    public void setAlignmentGuidesColor(Color value) {
        alignmentGuidesColor = value;
    }

    public Color getParentRingColor() {
        return parentRingColor;
    }

    public void setParentRingColor(Color value) {
        parentRingColor = value;
    }

    public DISPLAY_MODE getLibraryDisplayOption() {
        return libraryDisplayOption;
    }

    public void setLibraryDisplayOption(DISPLAY_MODE value) {
        libraryDisplayOption = value;
    }


    public void refreshAlignmentGuidesColor(DocumentWindowController dwc) {
        final ContentPanelController cpc = dwc.getContentPanelController();
        cpc.setGuidesColor(alignmentGuidesColor);
    }

    public void refreshBackgroundImage(DocumentWindowController dwc) {
        // Background images
        final Image img1 = getImage(backgroundImage);
        final javafx.scene.layout.BackgroundImage bgi1
                = new javafx.scene.layout.BackgroundImage(img1,
                        BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
                        BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
        // Does the shadow image render something different ?
//        final Image img2 = getShadowImage();
//        final javafx.scene.layout.BackgroundImage bgi2
//                = new javafx.scene.layout.BackgroundImage(img2,
//                        BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
//                        BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
//        final Background bg = new Background(bgi1, bgi2);
        final Background bg = new Background(bgi1);
        final ContentPanelController cpc = dwc.getContentPanelController();
        cpc.getWorkspacePane().setBackground(bg);
    }

   
    public void refreshLibraryDisplayOption(DocumentWindowController dwc) {
        dwc.refreshLibraryDisplayOption(libraryDisplayOption);
    }

    public void refreshParentRingColor(DocumentWindowController dwc) {
        final ContentPanelController cpc = dwc.getContentPanelController();
        cpc.setPringColor(parentRingColor);
        final AbstractHierarchyPanelController hpc = dwc.getHierarchyPanelController();
        hpc.setParentRingColor(parentRingColor);
    }

    public void refresh(DocumentWindowController dwc) {
        refreshAlignmentGuidesColor(dwc);
        refreshBackgroundImage(dwc);
        refreshLibraryDisplayOption(dwc);
        refreshParentRingColor(dwc);
    }

    /**
     * Read data from the java preferences DB and initialize properties.
     */
    public void readFromJavaPreferences() {

        assert applicationRootPreferences != null;

        Gson json = new Gson();
        // Background image
        final String image = applicationRootPreferences.get(BACKGROUND_IMAGE, null);
        BackgroundImage backgroundImage_tmp;
        if (image != null) {
            try {
                backgroundImage_tmp = json.fromJson(image, BackgroundImage.class);
            } catch (JsonSyntaxException ex) {
                backgroundImage_tmp = new BackgroundImage();
                backgroundImage_tmp.setName("Neutral Grid");
                backgroundImage_tmp.setFile("com/oracle/javafx/scenebuilder/app/preferences/Background-Neutral-Grid.png");
            }
        } else {
            backgroundImage_tmp = new BackgroundImage();
            backgroundImage_tmp.setName("Neutral Grid");
            backgroundImage_tmp.setFile("com/oracle/javafx/scenebuilder/app/preferences/Background-Neutral-Grid.png");
        }
        setBackgroundImage(backgroundImage_tmp);

        // Alignment guides color
        final String agColor = applicationRootPreferences.get(ALIGNMENT_GUIDES_COLOR,
                DEFAULT_ALIGNMENT_GUIDES_COLOR.toString());
        setAlignmentGuidesColor(Color.valueOf(agColor));

        // Parent ring color
        final String prColor = applicationRootPreferences.get(PARENT_RING_COLOR,
                DEFAULT_PARENT_RING_COLOR.toString());
        setParentRingColor(Color.valueOf(prColor));

        // Library display option
        final String library_DisplayOption = applicationRootPreferences.get(LIBRARY_DISPLAY_OPTION,
                DEFAULT_LIBRARY_DISPLAY_OPTION.name());
        setLibraryDisplayOption(DISPLAY_MODE.valueOf(library_DisplayOption));

    }

    public void writeToJavaPreferences(String key) {

        assert applicationRootPreferences != null;
        assert key != null;
        switch (key) {
            case BACKGROUND_IMAGE:
                applicationRootPreferences.put(BACKGROUND_IMAGE, new Gson().toJson(getBackgroundImage()));
                break;
            case ALIGNMENT_GUIDES_COLOR:
                applicationRootPreferences.put(ALIGNMENT_GUIDES_COLOR, getAlignmentGuidesColor().toString());
                break;
            case PARENT_RING_COLOR:
                applicationRootPreferences.put(PARENT_RING_COLOR, getParentRingColor().toString());
                break;
            case LIBRARY_DISPLAY_OPTION:
                applicationRootPreferences.put(LIBRARY_DISPLAY_OPTION, getLibraryDisplayOption().name());
                break;
            default:
                assert false;
                break;
        }
    }

    private static Image getImage(BackgroundImage bgi) {
        return new Image(Util.loadResource(bgi.getFile()));
    }

}
