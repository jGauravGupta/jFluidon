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
package org.netbeans.jfluidon.controller;

import com.oracle.javafx.scenebuilder.app.DocumentWindowController;
import com.oracle.javafx.scenebuilder.app.i18n.I18N;
import com.oracle.javafx.scenebuilder.kit.editor.EditorController;
import com.oracle.javafx.scenebuilder.kit.editor.panel.util.AbstractFxmlPanelController;
import com.oracle.javafx.scenebuilder.kit.fxom.FXOMDocument;
import java.net.URL;
import org.netbeans.jfluidon.controller.IWindowController;

/**
 *
 * @author Gaurav Gupta
 */
public abstract class WindowController extends AbstractFxmlPanelController implements IWindowController {

    private final DocumentWindowController documentWindowController;

    public WindowController(URL resource, DocumentWindowController documentWindowController) {
        super(resource, I18N.getBundle(), documentWindowController.getEditorController());
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(resource));
//            fxmlLoader.setRoot(this);
//            fxmlLoader.setController(this);
//
//            fxmlLoader.setResources(I18N.getBundle());
//
//            fxmlLoader.load();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//            Exceptions.printStackTrace(ex);
//            throw new RuntimeException(ex);
//        }
        this.documentWindowController = documentWindowController;
        this.getPanelRoot();
        loadEditor(documentWindowController.getEditorController());
    }

    public abstract void loadEditor(final EditorController editorController);

    @Override
    protected void controllerDidLoadFxml() {
        System.out.println("" + this.getPanelRoot());
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void fxomDocumentDidChange(FXOMDocument fxomd) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void sceneGraphRevisionDidChange() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void cssRevisionDidChange() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void jobManagerRevisionDidChange() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void editorSelectionDidChange() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the documentWindowController
     */
    public DocumentWindowController getDocumentWindowController() {
        return documentWindowController;
    }
}
