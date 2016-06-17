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
package org.netbeans.jfluidon.component.inspector;

import com.oracle.javafx.scenebuilder.app.DocumentWindowController;
import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.inspector.InspectorPanelController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import org.netbeans.jfluidon.controller.WindowController;

/**
 *
 * @author Gaurav Gupta
 */
public class InspectorWindowController extends WindowController {

    public InspectorWindowController(DocumentWindowController documentWindowController) {
        super(InspectorWindowController.class.getResource("resource/InspectorWindow.fxml"), documentWindowController);
    }

    @Override
    public void loadEditor(final EditorController editorController) {
        inspectorPanelHost.getChildren().add(this.getDocumentWindowController().getInspectorPanelController().getPanelRoot());
        inspectorSearchPanelHost.getChildren().add(this.getDocumentWindowController().getInspectorSearchController().getPanelRoot());
        this.getDocumentWindowController().getInspectorSearchController().textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov, String oldStr, String newStr) {
                getDocumentWindowController().getInspectorPanelController().setSearchPattern(newStr);
            }
        });
    }
    @FXML
    public StackPane inspectorPanelHost;

    @FXML
    public ToggleGroup showTg;

    @FXML
    public ToggleGroup viewTg;

    @FXML
    public StackPane inspectorSearchPanelHost;

    @FXML
    public MenuButton InspectorMenu;

    //
    // Inspector menu
    //
    @FXML
    public void onInspectorShowAllAction(ActionEvent event) {
        this.getDocumentWindowController().getInspectorPanelController().setShowMode(InspectorPanelController.ShowMode.ALL);

    }

    @FXML
    public void onInspectorShowEditedAction(ActionEvent event) {
        this.getDocumentWindowController().getInspectorPanelController().setShowMode(InspectorPanelController.ShowMode.EDITED);
    }

    @FXML
    public void onInspectorViewSectionsAction(ActionEvent event) {
        this.getDocumentWindowController().getInspectorPanelController().setViewMode(InspectorPanelController.ViewMode.SECTION);
    }

    @FXML
    public void onInspectorViewByPropertyNameAction(ActionEvent event) {
        this.getDocumentWindowController().getInspectorPanelController().setViewMode(InspectorPanelController.ViewMode.PROPERTY_NAME);
    }

    @FXML
    public void onInspectorViewByPropertyTypeAction(ActionEvent event) {
        this.getDocumentWindowController().getInspectorPanelController().setViewMode(InspectorPanelController.ViewMode.PROPERTY_TYPE);
    }

}
