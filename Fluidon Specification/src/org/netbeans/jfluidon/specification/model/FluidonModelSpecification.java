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
package org.netbeans.jfluidon.specification.model;

import org.netbeans.jfluidon.config.library.ILibraryConfig;
import org.netbeans.jfluidon.config.library.LibraryRepositoryBuider;
import org.netbeans.jfluidon.config.preference.IPreferenceConfig;
import org.netbeans.jfluidon.config.preference.PreferenceRepositoryBuider;
import org.netbeans.jfluidon.config.property.IPropertyConfig;
import org.netbeans.jfluidon.config.property.PropertyRepositoryBuider;
import org.netbeans.jfluidon.specification.component.IFluidonPanel;
import org.netbeans.jfluidon.specification.library.ILibrary;
import org.netbeans.jfluidon.specification.metadata.IMetadata;

public abstract class FluidonModelSpecification implements IFluidonModelSpecification {

    private DesignerModel designerModel;
    private ILibrary library;
    private IPreferenceConfig preferenceConfig;
    private IMetadata metadata;

//    private ModelerUtil modelerUtil;
//
//    private IModelerScene modelerScene;
    private IFluidonPanel fluidonPanel;
//    private IModelerDiagramEngine modelerDiagramEngine;
//
//    private IDefinitionElement definitionElement;
//    private IDiagramElement diagramElement;
//    private IRootElement rootElement;
//
//    private IRelationValidator relationValidator;

//    /**
//     * @return the modelerScene
//     */
//    public IModelerScene getModelerScene() {
//        return modelerScene;
//    }
//
//    /**
//     * @param modelerScene the modelerScene to set
//     */
//    public void setModelerScene(IModelerScene modelerScene) {
//        this.modelerScene = modelerScene;
//    }
    @Override
    public void buildLibrary(String vendorId, String diagramModelId, String resourcePath) {
        library = LibraryRepositoryBuider.build(vendorId, diagramModelId, resourcePath);//.addPaletteConfig(modelerFileClass,resource);
    }

    @Override
    public void buildPreferences(String vendorId, String diagramModelId, String resourcePath) {
        preferenceConfig = PreferenceRepositoryBuider.build(vendorId, diagramModelId, resourcePath);//.addPaletteConfig(modelerFileClass,resource);
    }

    @Override
    public void buildProperties(String vendorId, String diagramModelId, String resourcePath) {
        metadata = PropertyRepositoryBuider.build(vendorId, diagramModelId, resourcePath);//.addPaletteConfig(modelerFileClass,resource);
    }

    /**
     * @return the libraryConfig
     */
    @Override
    public ILibrary getLibrary() {
        return library;
    }

    @Override
    public IPreferenceConfig getPreferenceConfig() {
        return preferenceConfig;
    }

    /**
     * @return the FluidonPanelTopComponent
     */
    @Override
    public IFluidonPanel getPanel() {
        return fluidonPanel;
    }

    /**
     * @param fluidonPanel the FluidonPanelTopComponent to set
     */
    @Override
    public void setPanel(IFluidonPanel fluidonPanel) {
        this.fluidonPanel = fluidonPanel;
    }

    /**
     * @return the designerModel
     */
    @Override
    public DesignerModel getDesignerModel() {
        return designerModel;
    }

    /**
     * @param designerModel the designerModel to set
     */
    @Override
    public void setDesignerModel(DesignerModel designerModel) {
        this.designerModel = designerModel;
    }

    /**
     * @return the propertyConfig
     */
    @Override
    public IPropertyConfig getPropertyConfig() {
        return metadata.getPropertyConfig();
    }

    @Override
    public ILibraryConfig getLibraryConfig() {
        return library.getLibraryConfig();
    }

    /**
     * @return the metadata
     */
    @Override
    public IMetadata getMetadata() {
        return metadata;
    }

}
