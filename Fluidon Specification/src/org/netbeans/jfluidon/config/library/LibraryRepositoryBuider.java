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
package org.netbeans.jfluidon.config.library;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.netbeans.jfluidon.config.library.entity.LibraryConfig;
import org.netbeans.jfluidon.core.FluidonCore;
import org.netbeans.jfluidon.specification.library.ILibrary;
import org.netbeans.jfluidon.specification.library.factory.ILibraryFactory;
import org.netbeans.jfluidon.util.Util;
import org.netbeans.jfluidon.core.exception.InvalidLibraryConfigException;
import org.openide.util.Exceptions;
import org.openide.util.Lookup;

public class LibraryRepositoryBuider {

    public static ILibrary build(String vendorId, String modelId, String resourcePath) {

        ILibrary library = FluidonCore.getLibrary(vendorId + File.pathSeparator + modelId);

        if (library == null) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(LibraryConfig.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                ILibraryConfig libraryConfig = (ILibraryConfig) jaxbUnmarshaller.unmarshal(Util.loadResource(resourcePath));
                if (libraryConfig == null) {
                    throw new InvalidLibraryConfigException("No LibraryConfig found for Vendor : " + vendorId + " Model : " + modelId + " Resource : " + resourcePath);
                }

                ILibraryFactory libraryFactory = Lookup.getDefault().lookup(ILibraryFactory.class);

                library = libraryFactory.getLibrary();
                library.setLibraryConfig(libraryConfig);
//                        library.init(); //moved to getItems  thread => backgroundStartPhase2()

                FluidonCore.addLibrary(vendorId + File.pathSeparator + modelId, library);

            } catch (JAXBException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return library;
    }

}
