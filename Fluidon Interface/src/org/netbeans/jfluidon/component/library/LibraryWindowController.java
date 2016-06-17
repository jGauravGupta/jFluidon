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
package org.netbeans.jfluidon.component.library;

import com.oracle.javafx.scenebuilder.app.DocumentWindowController;
import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.library.LibraryPanelController;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import org.netbeans.jfluidon.controller.WindowController;

/**
 *
 * @author Gaurav Gupta
 */
public class LibraryWindowController extends WindowController {

    public LibraryWindowController(DocumentWindowController documentWindowController) {
        super(LibraryWindowController.class.getResource("resource/LibraryWindow.fxml"), documentWindowController);
    }

    @Override
    public void loadEditor(final EditorController editorController) {

//        LibraryWindowController.class.getResource("resource/Widget.xml")
//
//            JAXBContext jaxbContext = JAXBContext.newInstance(PaletteConfig.class);
//                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//                paletteConfig = (IPaletteConfig) jaxbUnmarshaller.unmarshal(Util.loadResource(resourcePath));
//
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
//                documentWindowController.getLibraryPanelController() = new LibraryPanelController(editorController);
//                librarySearchController = new SearchController(editorController);
                libraryPanelHost.getChildren().add(getDocumentWindowController().getLibraryPanelController().getPanelRoot());
                librarySearchPanelHost.getChildren().add(getDocumentWindowController().getLibrarySearchController().getPanelRoot());
                getDocumentWindowController().getLibrarySearchController().requestFocus();
                getDocumentWindowController().getLibrarySearchController().textProperty().addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> ov, String oldStr, String newStr) {
                        getDocumentWindowController().getLibraryPanelController().setSearchPattern(newStr);
                    }
                });
                getDocumentWindowController().getLibraryPanelController().setDisplayMode(LibraryPanelController.DISPLAY_MODE.LIST);
            }
        });

    }
    @FXML
    public RadioMenuItem libraryViewAsSections;

    @FXML
    public MenuItem libraryReport;

    @FXML
    public StackPane libraryPanelHost;

    @FXML
    public ToggleGroup libraryDisplayOptionTG;

    @FXML
    public MenuItem libraryReveal;

    @FXML
    public RadioMenuItem libraryViewAsList;

    @FXML
    public MenuItem libraryImportSelection;

    @FXML
    public Menu customLibraryMenu;

    @FXML
    public StackPane librarySearchPanelHost;

    @FXML
    public MenuButton libraryMenuButton;

    //
    // Library menu
    //
//    @FXML
//    void onLibraryImportJarFxml(ActionEvent event) {
//        documentWindowController.getLibraryPanelController().performImportJarFxml();
//    }
    @FXML
    public void onLibraryViewAsList(ActionEvent event) {
        if (this.getDocumentWindowController().getLibraryPanelController().getDisplayMode() != LibraryPanelController.DISPLAY_MODE.SEARCH) {
            this.getDocumentWindowController().getLibraryPanelController().setDisplayMode(LibraryPanelController.DISPLAY_MODE.LIST);
        } else {
            this.getDocumentWindowController().getLibraryPanelController().setPreviousDisplayMode(LibraryPanelController.DISPLAY_MODE.LIST);
        }
    }

    @FXML
    public void onLibraryViewAsSections(ActionEvent event) {
        if (this.getDocumentWindowController().getLibraryPanelController().getDisplayMode() != LibraryPanelController.DISPLAY_MODE.SEARCH) {
            this.getDocumentWindowController().getLibraryPanelController().setDisplayMode(LibraryPanelController.DISPLAY_MODE.SECTIONS);
        } else {
            this.getDocumentWindowController().getLibraryPanelController().setPreviousDisplayMode(LibraryPanelController.DISPLAY_MODE.SECTIONS);
        }
    }

//    // This method cannot be called if there is not a valid selection, a selection
//    // eligible for being dropped onto Library panel.
//    @FXML
//    void onLibraryImportSelection(ActionEvent event) {
//        AbstractSelectionGroup asg = getEditorController().getSelection().getGroup();
//
//        if (asg instanceof ObjectSelectionGroup) {
//            ObjectSelectionGroup osg = (ObjectSelectionGroup) asg;
//            assert osg.getItems().isEmpty() == false;
//            List<FXOMObject> selection = new ArrayList<FXOMObject>(osg.getItems());
//            documentWindowController.getLibraryPanelController().performImportSelection(selection);
//        }
//    }
//
//    @FXML
//    void onLibraryRevealCustomFolder(ActionEvent event) {
//        String userLibraryPath = ((UserLibrary) getEditorController().getLibrary()).getPath();
//        try {
//            EditorPlatform.revealInFileBrowser(new File(userLibraryPath));
//        } catch (IOException x) {
//            final ErrorDialog errorDialog = new ErrorDialog(null);
//            errorDialog.setMessage(I18N.getString("alert.reveal.failure.message", "Java FX Designer"));
//            errorDialog.setDetails(I18N.getString("alert.reveal.failure.details"));
//            errorDialog.setDebugInfoWithThrowable(x);
//            errorDialog.showAndWait();
//        }
//    }
//
//    @FXML
//    void onLibraryShowJarAnalysisReport(ActionEvent event) {
////        if (jarAnalysisReportController == null) {
////            jarAnalysisReportController = new JarAnalysisReportController(getEditorController(), getStage());
////            jarAnalysisReportController.setToolStylesheet(getToolStylesheet());
////        }
////
////        jarAnalysisReportController.openWindow();
//    }
}
