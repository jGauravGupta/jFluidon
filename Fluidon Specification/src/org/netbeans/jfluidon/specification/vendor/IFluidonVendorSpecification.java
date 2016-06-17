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
package org.netbeans.jfluidon.specification.vendor;

import org.netbeans.jfluidon.specification.annotaton.Vendor;
import org.netbeans.jfluidon.specification.model.IFluidonModelSpecification;

/**
 *
 * @author Gaurav Gupta
 */
public interface IFluidonVendorSpecification {

    /**
     * @return the fluidonDesignerModel
     */
    IFluidonModelSpecification getModelSpecification();

    /**
     * @param fluidonSpecificationDesignerModel the
     * fluidonSpecificationDesignerModel to set
     */
    void setModelSpecification(IFluidonModelSpecification fluidonSpecificationDesignerModel);

    /**
     * @return the vendor
     */
    public Vendor getVendor();

    /**
     * @param vendor the vendor to set
     */
    public void setVendor(Vendor vendor);

}