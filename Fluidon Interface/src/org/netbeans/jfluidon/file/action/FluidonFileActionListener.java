/**
 * Copyright [2014] Gaurav Gupta
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
package org.netbeans.jfluidon.file.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.SwingUtilities;
import org.netbeans.jfluidon.component.editor.FluidonPanel;
import org.netbeans.jfluidon.core.FluidonCore;
import org.netbeans.jfluidon.file.FluidonFile;
import org.netbeans.jfluidon.file.IFluidonFile;
import org.netbeans.jfluidon.file.IFluidonFileDataObject;
import org.netbeans.jfluidon.specification.annotaton.FluidonConfig;
import org.netbeans.jfluidon.specification.annotaton.Vendor;
import org.netbeans.jfluidon.specification.model.DefaultDesignerModel;
import org.netbeans.jfluidon.specification.model.DesignerModel;
import org.netbeans.jfluidon.specification.vendor.DefaultVendorSpecification;
import org.openide.filesystems.FileObject;

public abstract class FluidonFileActionListener implements ActionListener {

    private final IFluidonFileDataObject context;

    public FluidonFileActionListener(IFluidonFileDataObject context) {
        this.context = context;
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                openFluidonFile();
            }
        }); //this::openFluidonFile
    }

    public void openFluidonFile() {
        openFluidonFile(null);
    }

    public void openFluidonFile(String id) {
        //id :=> if file contains multiple Fluidon file then each Fluidon file dom has own that represent it as an single Fluidon file

        FileObject fileObject = context.getPrimaryFile();
        String path = fileObject.getPath();

        String absolutePath;
        if (id == null) {
            absolutePath = path;
        } else {
            absolutePath = path + "#" + id;
        }
        IFluidonFile fluidonFile = FluidonCore.getFile(absolutePath);

        if (fluidonFile == null) {
            fluidonFile = new FluidonFile();
            fluidonFile.setId(Long.toString(new Date().getTime()));
            fluidonFile.setDataObject(context);
            fluidonFile.setName(fileObject.getName());
            fluidonFile.setExtension(fileObject.getExt());
            fluidonFile.setTooltip(path);
            fluidonFile.setPath(absolutePath);

            fluidonFile.setVendorSpecification(new DefaultVendorSpecification()); //Default Implemenation , Developer can replace
            fluidonFile.getVendorSpecification().setModelSpecification(new DefaultDesignerModel()); //Default Implemenation , Developer can replace

            fluidonFile.setFxmlFile(fluidonFile.getFile());

            initSpecification(fluidonFile);

            if (fluidonFile.getVendorSpecification().getModelSpecification().getPanel() == null) {
                fluidonFile.getVendorSpecification().getModelSpecification().setPanel(new FluidonPanel());
            }

            Class _class = this.getClass();
            FluidonConfig fluidonConfig = (FluidonConfig) _class.getAnnotation(FluidonConfig.class);
            Vendor vendorConfig = (Vendor) _class.getAnnotation(Vendor.class);
            org.netbeans.jfluidon.specification.annotaton.Model modelConfig = vendorConfig.model();//(org.netbeans.jfluidon.specification.annotaton.Model) _class.getAnnotation(org.netbeans.jfluidon.specification.annotaton.Model.class);
//
            fluidonFile.getVendorSpecification().setVendor(vendorConfig);
            fluidonFile.getVendorSpecification().getModelSpecification().setDesignerModel(new DesignerModel(modelConfig.id(), modelConfig.name()));
            fluidonFile.getVendorSpecification().getModelSpecification().buildLibrary(vendorConfig.id(), modelConfig.id(), fluidonConfig.library().config());
            fluidonFile.getVendorSpecification().getModelSpecification().buildPreferences(vendorConfig.id(), modelConfig.id(), fluidonConfig.preferences());
            fluidonFile.getVendorSpecification().getModelSpecification().buildProperties(vendorConfig.id(), modelConfig.id(), fluidonConfig.property().config());

            fluidonFile.setConfig(fluidonConfig);

//            fluidonFile.getVendorSpecification().createElementConfig(vendorConfig.id(), fluidonConfig.element());
//            fluidonFile.getVendorSpecification().createModelerDocumentConfig(vendorConfig.id(), fluidonConfig.document());
//
//            fluidonFile.getVendorSpecification().getModelerDiagramModel().init(fluidonFile);//load empty configuration //override it in loadModelerFile() if already have
//            fluidonFile.getVendorSpecification().getModelerDiagramModel().getModelerDiagramEngine().init(fluidonFile);
//
//            IModelerScene scene = fluidonFile.getVendorSpecification().getModelerDiagramModel().getModelerScene();
//
//            scene.setModelerFile(fluidonFile);
//            scene.setModelerPanelTopComponent(fluidonFile.getModelerPanelTopComponent());
//            scene.setModelerDiagramEngine(fluidonFile.getModelerDiagramEngine());
//            fluidonFile.getModelerDiagramEngine().setModelerSceneAction();
//
            FluidonCore.addFile(fluidonFile.getPath(), fluidonFile);

            fluidonFile.getVendorSpecification().getModelSpecification().getPanel().init(fluidonFile);
            fluidonFile.getVendorSpecification().getModelSpecification().getPanel().open();
            fluidonFile.getVendorSpecification().getModelSpecification().getPanel().requestActive();

//            NBModelerUtil.loadModelerFile(fluidonFile);
//            fluidonFile.getVendorSpecification().getDesignerModel().getModelerScene().init();
        } else {
            if (!fluidonFile.getVendorSpecification().getModelSpecification().getPanel().isOpened()) {
                FluidonCore.removeFile(absolutePath);
            }
            fluidonFile.getVendorSpecification().getModelSpecification().getPanel().requestActive();
        }

    }

    protected abstract void initSpecification(IFluidonFile modelerFile);

}
//Sample Usage in public void initSpecification(IFluidonFile fluidonFile);
//          modelerFile.addAttribute("definitionId", this.getDefinitionId());
//        if (this.getDefinitionName() != null) {
//            modelerFile.setName(this.getDefinitionName());
//            modelerFile.setTooltip(this.getDefinitionTooltip());
//        }
//        fluidonFile.setVendorSpecification(new JavaBatchSpecification());
//        FluidonDesignerModel diagramModel = new JobDiagramModel();
//        fluidonFile.getVendorSpecification().setDesignerModel(diagramModel);
//        diagramModel.setModelerUtil(new JobUtil());
//        diagramModel.setModelerDiagramEngine(new JobDiagramEngine());
//        diagramModel.setModelerScene(new JobScene());
//        fluidonFile.getVendorSpecification().getModelSpecification().setPanel(new FluidonPanel(fluidonFile)); //JFXDesignerTopComponent
//        diagramModel.setRelationValidator(new RelationValidator());
