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
package org.netbeans.jfluidon.specification.vendor;

import org.netbeans.jfluidon.specification.annotaton.Vendor;
import org.netbeans.jfluidon.specification.model.IFluidonModelSpecification;

public abstract class FluidonVendorSpecification implements IFluidonVendorSpecification {

    private Vendor vendor;
    private IFluidonModelSpecification fluidonDesignerModel;

//    private ElementConfigFactory elementConfigFactory;
//    private ModelerDocumentFactory modelerDocumentFactory;
//    public void createElementConfig(String vendorId, String resourcePath) {
//        elementConfigFactory = ElementConfigFactoryRepository.createElementConfigFactory(vendorId, resourcePath);
//    }
//
//    public void createModelerDocumentConfig(String vendorId, String resourcePath) {
//        modelerDocumentFactory = ModelerDocumentFactoryRepository.createModelerDocumentFactory(vendorId, resourcePath);
//    }
//
    /**
     * @return the fluidonDesignerModel
     */
    @Override
    public IFluidonModelSpecification getModelSpecification() {
        return fluidonDesignerModel;
    }

    /**
     * @param fluidonDesignerModel the fluidonDesignerModel to set
     */
    @Override
    public void setModelSpecification(IFluidonModelSpecification fluidonSpecificationDesignerModel) {
        this.fluidonDesignerModel = fluidonSpecificationDesignerModel;
    }

//
//    /**
//     * @return the elementConfigFactory
//     */
//    public ElementConfigFactory getElementConfigFactory() {
//        return elementConfigFactory;
//    }
//
//    /**
//     * @return the modelerDocumentFactory
//     */
//    public ModelerDocumentFactory getModelerDocumentFactory() {
//        return modelerDocumentFactory;
//    }
    /**
     * @return the vendor
     */
    public Vendor getVendor() {
        return vendor;
    }

    /**
     * @param vendor the vendor to set
     */
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

}
