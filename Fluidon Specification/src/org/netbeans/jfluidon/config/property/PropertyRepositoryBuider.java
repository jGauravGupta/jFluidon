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
package org.netbeans.jfluidon.config.property;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.netbeans.jfluidon.config.property.enity.PropertyConfig;
import org.netbeans.jfluidon.core.FluidonCore;
import org.netbeans.jfluidon.util.Util;
import org.netbeans.jfluidon.core.exception.InvalidLibraryConfigException;
import org.netbeans.jfluidon.specification.library.ILibrary;
import org.netbeans.jfluidon.specification.metadata.IMetadata;
import org.netbeans.jfluidon.specification.metadata.factory.IMetadataFactory;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

public class PropertyRepositoryBuider {

    public static IMetadata build(String vendorId, String modelId, String resourcePath) {

        IMetadata metadata = FluidonCore.getMetadata(vendorId + File.pathSeparator + modelId);
        ILibrary library = FluidonCore.getLibrary(vendorId + File.pathSeparator + modelId);

        if (metadata == null) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(PropertyConfig.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                IPropertyConfig propertyConfig = (IPropertyConfig) jaxbUnmarshaller.unmarshal(Util.loadResource(resourcePath));
                if (propertyConfig == null) {
                    throw new InvalidLibraryConfigException("No PropertyConfig found for Vendor : " + vendorId + " Model : " + modelId + " Resource : " + resourcePath);
                }

                IMetadataFactory metadataFactory = Lookup.getDefault().lookup(IMetadataFactory.class);

                metadata = metadataFactory.getMetadata();
                metadata.setPropertyConfig(propertyConfig);
                metadata.setLibraryConfig(library.getLibraryConfig());
                
//              metadata.init(); //moved to getItems thread => backgroundStartPhase0()

                FluidonCore.addMetadata(vendorId + File.pathSeparator + modelId, metadata);

            } catch (JAXBException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return metadata;
    }

    /*
     public static IPropertyConfig build(String vendorId, String modelId, String resourcePath) {

     IPropertyConfig propertyConfig = FluidonCore.getPropertyConfig(vendorId + File.pathSeparator + modelId);

     if (propertyConfig == null) {
     try {
     JAXBContext jaxbContext = JAXBContext.newInstance(PropertyConfig.class);
     Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
     propertyConfig = (IPropertyConfig) jaxbUnmarshaller.unmarshal(Util.loadResource(resourcePath));
     if (propertyConfig == null) {
     throw new InvalidLibraryConfigException("No PropertyConfig found for Vendor : " + vendorId + " Model : " + modelId + " Resource : " + resourcePath);
     }

                
                
                
     FluidonCore.addPropertyConfig(vendorId + File.pathSeparator + modelId, propertyConfig);

     } catch (JAXBException ex) {
     Exceptions.printStackTrace(ex);
     }
     }
     return propertyConfig;
     }
     */
}
