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
package org.netbeans.jfluidon.specification.model;

import org.netbeans.jfluidon.config.library.ILibraryConfig;
import org.netbeans.jfluidon.config.preference.IPreferenceConfig;
import org.netbeans.jfluidon.config.property.IPropertyConfig;
import org.netbeans.jfluidon.file.IFluidonFile;
import org.netbeans.jfluidon.specification.component.IFluidonPanel;
import org.netbeans.jfluidon.specification.library.ILibrary;
import org.netbeans.jfluidon.specification.metadata.IMetadata;

/**
 *
 * @author Gaurav Gupta
 */
public interface IFluidonModelSpecification {

    /**
     * @return the IFluidonPanel TopComponent
     */
    IFluidonPanel getPanel();

    void init(IFluidonFile fluidonFile); //Load Default Value Like Definition , RootElement , Design , will be raplaced if XML Content exist

    /**
     * @param fluidonPanel the FluidonPanelTopComponent to set
     */
    void setPanel(IFluidonPanel fluidonPanel);

    /**
     * @return the designerModel
     */
    public DesignerModel getDesignerModel();

    /**
     * @param designerModel the designerModel to set
     */
    public void setDesignerModel(DesignerModel designerModel);

    public void buildLibrary(String vendorId, String diagramModelId, String resourcePath);

    public ILibrary getLibrary();

    public void buildPreferences(String vendorId, String diagramModelId, String resourcePath);

    public IPreferenceConfig getPreferenceConfig();

    public void buildProperties(String vendorId, String diagramModelId, String resourcePath);

    public IPropertyConfig getPropertyConfig();

    public ILibraryConfig getLibraryConfig();
    
     /**
     * @return the metadata
     */
    public IMetadata getMetadata() ;

}
