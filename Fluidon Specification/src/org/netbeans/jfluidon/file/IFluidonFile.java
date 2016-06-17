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
package org.netbeans.jfluidon.file;

import java.io.File;
import java.util.Map;
import org.netbeans.jfluidon.component.wrapper.IWrapperComponent;
import org.netbeans.jfluidon.specification.annotaton.FluidonConfig;
import org.netbeans.jfluidon.specification.vendor.IFluidonVendorSpecification;
import org.openide.filesystems.FileObject;

/**
 *
 * @author Gaurav Gupta
 */
public interface IFluidonFile {

    /**
     * @return the name
     */
    public String getName();

    /**
     * @param name the name to set
     */
    public void setName(String name);

    /**
     * @return the extension
     */
    public String getExtension();

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension);

    /**
     * @return the path
     */
    public String getPath();

    /**
     * @param path the path to set
     */
    public void setPath(String path);
//
//    /**
//     * @return the icon
//     */
//    public Image getIcon();

//    /**
//     * @param icon the icon to set
//     */
//    public void setIcon(Image icon);
    public FileObject getFileObject();

    public File getFile();

    /**
     * @return the fluidonFileDataObject
     */
    public IFluidonFileDataObject getDataObject();

    /**
     * @param fluidonFileDataObject the fluidonFileDataObject to set
     */
    public void setDataObject(IFluidonFileDataObject fluidonFileDataObject);

    /**
     * @return the attributes
     */
    public Map<String, Object> getAttributes();

    public Object getAttribute(String key);

    public void addAttribute(String key, Object value);

    public void removeAttribute(String key, Object value);

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(Map<String, Object> attributes);

    /**
     * @return the tooltip
     */
    public String getTooltip();

    /**
     * @param tooltip the tooltip to set
     */
    public void setTooltip(String tooltip);

    /**
     * @return the fluidonVendorSpecification
     */
    public IFluidonVendorSpecification getVendorSpecification();

    /**
     * @param fluidonVendorSpecification the fluidonVendorSpecification to set
     */
    public void setVendorSpecification(IFluidonVendorSpecification fluidonVendorSpecification);

    /**
     * @return the config
     */
    public FluidonConfig getConfig();

    /**
     * @param config the config to set
     */
    public void setConfig(FluidonConfig config);

    /**
     * @return the fxmlFile
     */
    public File getFxmlFile();

    /**
     * @param fxmlFile the fxmlFile to set
     */
    public void setFxmlFile(File fxmlFile);

    /**
     * @return the wrapperComponent
     */
    public Class<? extends IWrapperComponent> getWrapperComponent();

    /**
     * @param wrapperComponent the wrapperComponent to set
     */
    public void setWrapperComponent(Class<? extends IWrapperComponent> wrapperComponent);

    /**
     * @return the id
     */
    public String getId();

    /**
     * @param id the id to set
     */
    public void setId(String id);
}
