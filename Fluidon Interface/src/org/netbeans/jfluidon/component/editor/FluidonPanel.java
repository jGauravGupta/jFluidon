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
package org.netbeans.jfluidon.component.editor;

import com.oracle.javafx.scenebuilder.app.AppPlatform;
import com.oracle.javafx.scenebuilder.app.DocumentWindowController;
import com.oracle.javafx.scenebuilder.app.SceneBuilderApp;
import com.oracle.javafx.scenebuilder.app.preferences.PreferencesController;
import com.oracle.javafx.scenebuilder.app.preferences.PreferencesRecordDocument;
import com.oracle.javafx.scenebuilder.kit.library.user.UserLibrary;
import java.io.IOException;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.SwingUtilities;
import org.netbeans.jfluidon.component.AbstractFluidonTopComponent;
import org.netbeans.jfluidon.component.hierarchy.HierarchyTopComponent;
import org.netbeans.jfluidon.component.hierarchy.HierarchyWindowController;
import org.netbeans.jfluidon.component.inspector.InspectorTopComponent;
import org.netbeans.jfluidon.component.inspector.InspectorWindowController;
import org.netbeans.jfluidon.component.library.LibraryTopComponent;
import org.netbeans.jfluidon.component.library.LibraryWindowController;
import org.netbeans.jfluidon.component.save.ui.SaveNotifierYesNo;
import org.netbeans.jfluidon.controller.IWindowController;
import org.netbeans.jfluidon.core.FluidonCore;
import org.netbeans.jfluidon.file.IFluidonFile;
import org.netbeans.jfluidon.source.generator.ISourceGenerator;
import org.netbeans.jfluidon.specification.component.IFluidonPanel;
import org.netbeans.spi.actions.AbstractSavable;
import org.netbeans.spi.navigator.NavigatorLookupHint;
import org.openide.NotifyDescriptor;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.util.lookup.AbstractLookup;
import org.openide.util.lookup.InstanceContent;
import org.openide.util.lookup.Lookups;
import org.openide.util.lookup.ProxyLookup;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

/**
 * Top component which displays something.
 */
//@ConvertAsProperties(
//        dtd = "-//org.netbeans.jfluidon.component.editor//FluidonPanel//EN",
//        autostore = false
//)
@TopComponent.Description(
        preferredID = "FluidonPanel",
        //        iconBase = "org/netbeans/fluidon/jsf/prime/component/editor/resource/ICON.png",
        persistenceType = TopComponent.PERSISTENCE_NEVER
)
//@TopComponent.Registration(mode = "editor", openAtStartup = false)
//@ActionID(category = "Window", id = "org.netbeans.jfluidon.component.editor.FluidonPanel")
//@ActionReference(path = "Menu/Window/JSF Core Fluidon" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_FluidonPanelAction",
        preferredID = "FluidonPanel"
)
@Messages({
    "CTL_FluidonPanelAction=Fluidon Designer",
    "CTL_FluidonPanelTopComponent=Fluidon Designer",
    "HINT_FluidonPanelTopComponent=Fluidon Designer"
})
public class FluidonPanel extends AbstractFluidonTopComponent implements IFluidonPanel {

    private UserLibrary userLibrary;
    private DocumentWindowController documentWindowController;

    private IFluidonFile fluidonFile;
    private FluidonFileSavable fluidonFileSavable;

    private IWindowController hierarchyWindowController;
    private IWindowController inspectorWindowController;
    private IWindowController libraryWindowController;
//    private CSSAnalyzerWindowController cssAnalyzerWindowController;
    private SceneBuilderApp sceneBuilderApp;

    private boolean loaded = false;

    @Override
    public void init(IFluidonFile fluidonFile) {
        try {
            this.fluidonFile = fluidonFile;
            if (fluidonFile == null) {
                this.close();
                return;
            }
            super.initComponent();
            sceneBuilderApp = new SceneBuilderApp(fluidonFile);
            sceneBuilderApp.start();

//            lookup = new ProxyLookup(super.getLookup(), Lookups.singleton(new AbcNavigatorLookupHint()));
            this.setName(fluidonFile.getName());

            this.setIcon(fluidonFile.getVendorSpecification().getModelSpecification().getPreferenceConfig().getContainer().getIcon());
            this.setToolTipText(fluidonFile.getTooltip());
            this.setFocusable(true);

            userLibrary = new UserLibrary(fluidonFile, AppPlatform.getUserLibraryFolder());
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    userLibrary.startWatching();
                }
            });
            documentWindowController = new DocumentWindowController(fluidonFile, userLibrary);
            documentWindowController.initController();

            documentWindowController.loadFromFile(fluidonFile.getFxmlFile());//opposite documentWindowController.loadWithDefaultContent();

//            documentWindowController.setPanelVisibilityController(new JFXPanelVisibilityControllerImpl());
            // NetBeans: set it on [VM Options] line in [Run] category of project's Properties.
//            if (System.getProperty("scenic") != null) { //NOI18N
//                Platform.runLater(new ScenicViewStarter(newWindow.getScene()));
//            }
            initSavable();
            setName(fluidonFile.getFile().getName());
            setToolTipText("JFXDesigner");

            Platform.setImplicitExit(false);
            // create JavaFX scene
            Platform.runLater(new Runnable() {
                public void run() {
                    try {

                        documentWindowController.getEditorController().startFileWatching();
                        documentWindowController.getWatchingController().start();

                        hierarchyWindowController = new HierarchyWindowController(documentWindowController);
                        inspectorWindowController = new InspectorWindowController(documentWindowController);
                        libraryWindowController = new LibraryWindowController(documentWindowController);
//                        cssAnalyzerWindowController = new CSSAnalyzerWindowController(documentWindowController);//load all controller before documentWindowController.getScene() => controllerDidLoadFxml()

                        getContainer().setScene(documentWindowController.getScene());

                        openPanels();
                        loaded = true;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                        Exceptions.printStackTrace(ex);
                    }
                }
            });

            initLookup();
        } catch (Exception ex) {
            ex.printStackTrace();
            Exceptions.printStackTrace(ex);
        }

    }

    private final InstanceContent lookupContent = new InstanceContent();
//    private Lookup lookup = null;
//    @Override
//    public Lookup getLookup() { //either override get look or use associateLookup
//        if (lookup == null) {
//            Lookup superLookup = super.getLookup();
////            Lookup[] content = {};
//            lookup = new ProxyLookup(superLookup, new AbstractLookup(lookupContent));
//        }
//        return lookup;
//    }

    private void initLookup() {
        associateLookup(new AbstractLookup(lookupContent));//either override get look or use associateLookup
//        paletteController = getAssociatedPalette();
//        lookupContent.add(ExplorerUtils.createLookup(explorerManager, getActionMap())); //getActionMap() => setupActionMap(getActionMap()) to apply custom action key // it is commented because KeyAdapter functionality is added for key listener
//        lookupContent.add(PaletteSupport.createPalette(modelerFile));
//        lookupContent.add(modelerFile.getModelerScene());
        lookupContent.add(fluidonFile.getDataObject());
//        lookupContent.add(getNavigatorCookie());
        lookupContent.add(fluidonFile);
//        lookupContent.add(zoomManager);
    }
//    private NavigatorLookupHint navigatorCookie = null;

//    private NavigatorLookupHint getNavigatorCookie() {
//        if (navigatorCookie == null) {
//            navigatorCookie = new AbcNavigatorLookupHint();
//        }
//        return navigatorCookie;
//    }

    private LibraryTopComponent libraryTopComponent;
    private HierarchyTopComponent hierarchyTopComponent;
    private InspectorTopComponent inspectorTopComponent;
    
    
    private void openPanels() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    
                if (libraryTopComponent == null) {
                    libraryTopComponent = (LibraryTopComponent) WindowManager.getDefault().findTopComponent(fluidonFile.getConfig().library().component());
                    libraryTopComponent.open();
                    libraryTopComponent.requestActive();
                }
                if (!libraryTopComponent.isOpened()) {
                    libraryTopComponent.open();
                }
                libraryTopComponent.reload(FluidonPanel.this);
                libraryTopComponent.requestActive();

                if (hierarchyTopComponent == null) {
                    hierarchyTopComponent = (HierarchyTopComponent) WindowManager.getDefault().findTopComponent(fluidonFile.getConfig().navigator().component());
                    hierarchyTopComponent.open();
                    hierarchyTopComponent.requestActive();
                }
                if (!hierarchyTopComponent.isOpened()) {
                    hierarchyTopComponent.open();
                }
                hierarchyTopComponent.reload(FluidonPanel.this);
                hierarchyTopComponent.requestActive();
                if (inspectorTopComponent == null) {
                    inspectorTopComponent = (InspectorTopComponent) WindowManager.getDefault().findTopComponent(fluidonFile.getConfig().property().component());
                    inspectorTopComponent.open();
                    inspectorTopComponent.requestActive();
                }
                if (!inspectorTopComponent.isOpened()) {
                    inspectorTopComponent.open();
                }
                inspectorTopComponent.reload(FluidonPanel.this);
                inspectorTopComponent.requestActive();
//                LibraryTopComponent libraryTopComponent = LibraryTopComponent.getInstance();
//                if (!libraryTopComponent.isOpened()) {
//                    libraryTopComponent.open();
//                }
//                libraryTopComponent.reload(FluidonPanel.this);
//                libraryTopComponent.requestActive();

//                HierarchyTopComponent hierarchyTopComponent = HierarchyTopComponent.getInstance();
//                if (!hierarchyTopComponent.isOpened()) {
//                    hierarchyTopComponent.open();
//                }
//                hierarchyTopComponent.reload(FluidonPanel.this);
//                hierarchyTopComponent.requestActive();

//                InspectorTopComponent inspectorTopComponent = InspectorTopComponent.getInstance();
//                if (!inspectorTopComponent.isOpened()) {
//                    inspectorTopComponent.open();
//                }
//                inspectorTopComponent.reload(FluidonPanel.this);
//                inspectorTopComponent.requestActive();

//                CSSAnalyzerTopComponent cssAnalyzerTopComponent = CSSAnalyzerTopComponent.getInstance();
//                if (!cssAnalyzerTopComponent.isOpened()) {
//                    cssAnalyzerTopComponent.open();
//                }
//                cssAnalyzerTopComponent.reload(JFXDesignerTopComponent.this);
//                cssAnalyzerTopComponent.requestActive();
            }
        });

    }

    private void closePanels() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                if (libraryTopComponent == null) {
                    libraryTopComponent = (LibraryTopComponent) WindowManager.getDefault().findTopComponent(fluidonFile.getConfig().library().component());
                }
                if (libraryTopComponent.isOpened()) {
                    libraryTopComponent.close();
                }
            
                if (hierarchyTopComponent == null) {
                    hierarchyTopComponent = (HierarchyTopComponent) WindowManager.getDefault().findTopComponent(fluidonFile.getConfig().navigator().component());
                }
                if (hierarchyTopComponent.isOpened()) {
                    hierarchyTopComponent.close();
                }
               
                if (inspectorTopComponent == null) {
                    inspectorTopComponent = (InspectorTopComponent) WindowManager.getDefault().findTopComponent(fluidonFile.getConfig().property().component());
                }
                if (inspectorTopComponent.isOpened()) {
                    inspectorTopComponent.close();
                }
                
                
//                LibraryTopComponent libraryTopComponent = LibraryTopComponent.getInstance();
//                if (libraryTopComponent.isOpened()) {
//                    libraryTopComponent.close();
//                }
//                HierarchyTopComponent hierarchyTopComponent = HierarchyTopComponent.getInstance();
//                if (hierarchyTopComponent.isOpened()) {
//                    hierarchyTopComponent.close();
//                }
//                InspectorTopComponent inspectorTopComponent = InspectorTopComponent.getInstance();
//                if (inspectorTopComponent.isOpened()) {
//                    inspectorTopComponent.close();
//                }
//                CSSAnalyzerTopComponent cssAnalyzerTopComponent = CSSAnalyzerTopComponent.getInstance();
//                if (cssAnalyzerTopComponent.isOpened()) {
//                    cssAnalyzerTopComponent.close();
//                }
            }
        });
    }

    private void initSavable() {
     
        // Monitor the status of the document to set status icon accordingly in message bar
        documentWindowController.getEditorController().getJobManager().revisionProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> ov, Number t, Number t1) {
                fireSavable(true);
            }
        });
    }

    private boolean persistenceState = true;
    private final static String SPACE_STAR = " *";

    public void fireSavable(boolean modified) {
        if (persistenceState != modified) {
            return;
        }
        String diagramName = fluidonFile.getFile().getName();
        String displayName = "";
        persistenceState = !modified;
        if (persistenceState == Boolean.FALSE) {
            displayName = /*"<b>" + */ diagramName + SPACE_STAR/* +"</b>"*/;
            fluidonFileSavable = new FluidonFileSavable(fluidonFile);
            lookupContent.add(fluidonFileSavable); //If modified, add the Savable implementation to the InstanceContent, which is in the Lookup of the TopComponent:
        } else {
            displayName = diagramName;
            lookupContent.remove(fluidonFileSavable); //Otherwise, remove the Savable from the InstanceContent:
        }
        this.setDiagramDisplayName(displayName);
    }

    private void setDiagramDisplayName(final String name) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                setDisplayName(name);
            }
        });
    }
    private static final int RESULT_CANCEL = 0;
    private static final int RESULT_NO = 1;
    private static final int RESULT_YES = 2;

    @Override
    public boolean canClose() {
        boolean safeToClose = true;

//        if (isForceClose()) {
//            return true;
//        }
        if (documentWindowController == null) {
            return true;
        }
        if (!documentWindowController.isDocumentDirty()) {
            return true;//destroy
        }
//        if (documentWindowController.performCloseAction() == ActionStatus.DONE) {
//            safeToClose = true;
//        } else {
//            safeToClose = false;
//        }

        //prompt to save before close
        switch (saveDiagram()) {
            case RESULT_YES: {
                try {
                    fluidonFileSavable.handleSave();
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            break;

            case RESULT_NO:
                fireSavable(false);
                break;

            case RESULT_CANCEL:
                safeToClose = false;
                break;
        }
        if (safeToClose) {
            final PreferencesController pc = PreferencesController.getSingleton();
            final PreferencesRecordDocument recordDocument = pc.getRecordDocument(documentWindowController);
            recordDocument.writeToJavaPreferences();
        }
        return safeToClose;
    }

    private int saveDiagram() {
        String title = "Save " + "Java FX Diagram " + fluidonFile.getFile().getName(); // NOI18N
        int result;
        Object response = SaveNotifierYesNo.getDefault().displayNotifier(title, fluidonFile.getFile().getName(), "Java FX Diagram");
        if (response == SaveNotifierYesNo.SAVE_ALWAYS_OPTION) {
            result = RESULT_YES;
        } else if (response == NotifyDescriptor.YES_OPTION) {
            result = RESULT_YES;
        } else if (response == NotifyDescriptor.NO_OPTION) {
            result = RESULT_NO;
        } else // cancel or closed (x button)
        {
            result = RESULT_CANCEL;
        }
        return result;
    }

    /**
     * @return the hierarchyWindowController
     */
    public IWindowController getHierarchyWindowController() {
        return hierarchyWindowController;
    }

    /**
     * @return the inspectorWindowController
     */
    public IWindowController getInspectorWindowController() {
        return inspectorWindowController;
    }

    /**
     * @return the libraryWindowController
     */
    public IWindowController getLibraryWindowController() {
        return libraryWindowController;
    }

    /**
     * @return the cssAnalyzerWindowController
     */
//    public CSSAnalyzerWindowController getCssAnalyzerWindowController() {
//        return cssAnalyzerWindowController;
//    }
    /**
     * @return the loaded
     */
    public boolean isLoaded() {
        return loaded;
    }

    @Override
    public IFluidonFile getFluidonFile() {
        return fluidonFile;
    }

//    @Override
//    public void changePersistenceState(boolean state) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean isPersistenceState() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void forceClose() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    private class FluidonFileSavable extends AbstractSavable {

        private final String name;
        private ISourceGenerator sourceGenerator;

        public FluidonFileSavable(IFluidonFile fluidonFile) {
            this.name = fluidonFile.getName();
            try {
                sourceGenerator = fluidonFile.getConfig().generator().newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Exceptions.printStackTrace(ex);
                sourceGenerator = null;
            }
//            sourceGenerator = new JSFPrimeGenerator(fluidonFile);//pending
            register();
        }

        @Override
        protected String findDisplayName() {
            return "Java FX Diagram " + fluidonFile.getFile().getName(); // get display name somehow
        }

        @Override
        protected void handleSave() throws IOException {
            Platform.runLater(new Runnable() {
                public void run() {
                    fireSavable(false);
                    documentWindowController.performControlAction(DocumentWindowController.DocumentControlAction.SAVE_FILE);
                    sourceGenerator.generate(fluidonFile , documentWindowController.getEditorController().getFxomDocument());
                }
            });
        }

        @Override
        public boolean equals(Object other) {
            if (other instanceof FluidonFileSavable) {
                return ((FluidonFileSavable) other).name.equals(name);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

    @Override
    public void componentOpened() {
        super.componentOpened();
    }

    @Override
    public void componentClosed() {
        super.componentClosed();
        if (fluidonFile != null) {
            FluidonCore.removeFile(fluidonFile.getPath());//pending
            if (FluidonCore.getFiles().isEmpty()) {
                closePanels();
            }
        }
    }

    /**
     * @return the documentWindowController
     */
    public DocumentWindowController getDocumentWindowController() {
        return documentWindowController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}

/**
 * Changes *
 */
//AbstractDragSource => INTERNAL_DATA_FORMAT = new DataFormat("scene.builder/internal; class=java.nio.HeapByteBuffer");
