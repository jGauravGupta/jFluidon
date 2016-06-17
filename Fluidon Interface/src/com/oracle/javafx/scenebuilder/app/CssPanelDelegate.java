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

package com.oracle.javafx.scenebuilder.app;

import com.oracle.javafx.scenebuilder.kit.editor.panel.css.CssPanelController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.inspector.InspectorPanelController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.inspector.InspectorPanelController.SectionId;
import com.oracle.javafx.scenebuilder.kit.metadata.property.ValuePropertyMetadata;
import javafx.application.Platform;

/**
 * Implements the interface with the css panel.
 */
public class CssPanelDelegate extends CssPanelController.Delegate {

    private final InspectorPanelController inspectorController;
    private final DocumentWindowController documentWindowController;

    public CssPanelDelegate(InspectorPanelController inspectorController, DocumentWindowController documentWindowController) {
        this.inspectorController = inspectorController;
        this.documentWindowController = documentWindowController;
    }

    @Override
    public void revealInspectorEditor(ValuePropertyMetadata propMeta) {
        if (inspectorController == null || documentWindowController == null
                || propMeta == null) {
            return;
        }

//        // Show the inspector if it is hidden//GG
//        if (!documentWindowController.isRightPanelVisible()) {
//            documentWindowController.performControlAction(DocumentWindowController.DocumentControlAction.TOGGLE_RIGHT_PANEL);
//        }
        // Expand the inspector section
        String inspectorSection = propMeta.getInspectorPath().getSectionTag();
        if (inspectorSection.equalsIgnoreCase("properties")) { //NOI18N
            inspectorController.setExpandedSection(SectionId.PROPERTIES);
        } else if (inspectorSection.equalsIgnoreCase("layout")) {//NOI18N
            inspectorController.setExpandedSection(SectionId.LAYOUT);
        } 

        // Need to delay the focus to the editor, so that the section is actually expanded first.
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                // Need to delay in frame +2 since the TitledPane is built in frame +1 when node selected.
                // And positioning the scrollBar while the content is building does not work.
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        inspectorController.setFocusToEditor(propMeta.getName());
                    }
                });
            }
        });
    }

}