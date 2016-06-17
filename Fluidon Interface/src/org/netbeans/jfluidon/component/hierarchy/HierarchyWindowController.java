/**
 * Copyright [2015] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jfluidon.component.hierarchy;

import com.oracle.javafx.scenebuilder.app.DocumentWindowController;
import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.hierarchy.AbstractHierarchyPanelController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import org.netbeans.jfluidon.controller.WindowController;

/**
 *
 * @author Gaurav Gupta
 */
public class HierarchyWindowController extends WindowController {

    public HierarchyWindowController(DocumentWindowController documentWindowController) {
        super(HierarchyWindowController.class.getResource("resource/HierarchyWindow.fxml"), documentWindowController);
    }

    @Override
    public void loadEditor(final EditorController editorController) {
        hierarchyPanelHost.getChildren().add(this.getDocumentWindowController().getHierarchyPanelController().getPanelRoot());
        this.getDocumentWindowController().getInfoPanelController().getPanelRoot();
//        infoPanelHost.getChildren().add(this.getDocumentWindowController().getInfoPanelController().getPanelRoot());
//        documentAccordion.setExpandedPane(documentAccordion.getPanes().get(0));
    }

    @FXML
    public MenuButton menuButton;

//    @FXML
//    public TitledPane Hierarchy;
    @FXML
    public StackPane hierarchyPanelHost;

    @FXML
    public RadioMenuItem showNodeIdMenuItem;

    @FXML
    public RadioMenuItem showFxIdMenuItem;

//    @FXML
//    public Accordion documentAccordion;
//    @FXML
//    public StackPane infoPanelHost;
    @FXML
    public RadioMenuItem showInfoMenuItem;

//    @FXML
//    public TitledPane Info;
    @FXML
    public ToggleGroup hierarchyDisplayOptionTG;

    //
    // Hierarchy menu
    //
    @FXML
    public void onHierarchyShowInfo(ActionEvent event) {
        this.getDocumentWindowController().getHierarchyPanelController().setDisplayOption(AbstractHierarchyPanelController.DisplayOption.INFO);
//        documentAccordion.setExpandedPane(documentAccordion.getPanes().get(0));
    }

    @FXML
    public void onHierarchyShowFxId(ActionEvent event) {
        this.getDocumentWindowController().getHierarchyPanelController().setDisplayOption(AbstractHierarchyPanelController.DisplayOption.FXID);
//        documentAccordion.setExpandedPane(documentAccordion.getPanes().get(0));
    }

    @FXML
    public void onHierarchyShowNodeId(ActionEvent event) {
        this.getDocumentWindowController().getHierarchyPanelController().setDisplayOption(AbstractHierarchyPanelController.DisplayOption.NODEID);
//        documentAccordion.setExpandedPane(documentAccordion.getPanes().get(0));
    }

}
