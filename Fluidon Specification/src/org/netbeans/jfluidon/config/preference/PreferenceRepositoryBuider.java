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
package org.netbeans.jfluidon.config.preference;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.netbeans.jfluidon.config.preference.entity.BackgroundImage;
import org.netbeans.jfluidon.config.preference.entity.PreferenceConfig;
import org.netbeans.jfluidon.core.FluidonCore;
import org.netbeans.jfluidon.core.exception.InvalidLibraryConfigException;
import org.netbeans.jfluidon.util.Util;
import org.openide.util.Exceptions;

public class PreferenceRepositoryBuider {

    public static IPreferenceConfig build(String vendorId, String modelId, String resourcePath) {

        IPreferenceConfig preferencesConfig = FluidonCore.getPreferenceConfig(vendorId + File.pathSeparator + modelId);

        if (preferencesConfig == null) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(PreferenceConfig.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                preferencesConfig = (IPreferenceConfig) jaxbUnmarshaller.unmarshal(Util.loadResource(resourcePath));
                if (preferencesConfig == null) {
                    throw new InvalidLibraryConfigException("No PreferencesConfig found for Model : " + vendorId + " Model : " + modelId + " Resource : " + resourcePath);
                }
//                if (preferencesConfig.getBackgrounds().isEmpty()) {
                BackgroundImage backgroundImage_tmp = new BackgroundImage();
                backgroundImage_tmp.setName("Neutral Grid");
                backgroundImage_tmp.setFile("com/oracle/javafx/scenebuilder/app/preferences/Background-Neutral-Grid.png");
                preferencesConfig.getContainer().getBackgrounds().add(backgroundImage_tmp);
//                }
                FluidonCore.addPreferenceConfig(vendorId + File.pathSeparator + modelId, preferencesConfig);
            } catch (JAXBException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        return preferencesConfig;
    }

}
