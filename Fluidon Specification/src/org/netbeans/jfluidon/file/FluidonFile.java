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
package org.netbeans.jfluidon.file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.netbeans.jfluidon.component.wrapper.IWrapperComponent;
import org.netbeans.jfluidon.specification.annotaton.FluidonConfig;
import org.netbeans.jfluidon.specification.component.IFluidonPanel;
import org.netbeans.jfluidon.specification.vendor.IFluidonVendorSpecification;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.FileUtil;

/**
 *
 *
 */
public class FluidonFile implements IFluidonFile {

    private String id;
    private String name;
    private String tooltip;
    private String extension;
    private String path;
    private IFluidonFileDataObject fluidonFileDataObject;
    private IFluidonVendorSpecification fluidonVendorSpecification;
    private Map<String, Object> attributes = new HashMap<>();
    private FluidonConfig config;
    private File fxmlFile;
    
    private Class<? extends IWrapperComponent> wrapperComponent;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * @param extension the extension to set
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }

    public FileObject getFileObject() {
        return this.getDataObject().getPrimaryFile();
    }

    public File getFile() {
        return FileUtil.toFile(this.getDataObject().getPrimaryFile());
    }

    /**
     * @return the fluidonFileDataObject
     */
    public IFluidonFileDataObject getDataObject() {
        return fluidonFileDataObject;
    }

    /**
     * @param fluidonFileDataObject the fluidonFileDataObject to set
     */
    public void setDataObject(IFluidonFileDataObject fluidonFileDataObject) {
        this.fluidonFileDataObject = fluidonFileDataObject;
    }

    /**
     * @return the fluidonVendorSpecification
     */
    public IFluidonVendorSpecification getVendorSpecification() {
        return fluidonVendorSpecification;
    }

    /**
     * @param fluidonVendorSpecification the fluidonVendorSpecification to set
     */
    public void setVendorSpecification(IFluidonVendorSpecification fluidonVendorSpecification) {
        this.fluidonVendorSpecification = fluidonVendorSpecification;
    }


    /**
     * @return the ModelerPanelTopComponent
     */
    public IFluidonPanel getPanel() {
        return this.getVendorSpecification().getModelSpecification().getPanel();
    }

    /**
     * @return the attributes
     */
    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public Object getAttribute(String key) {
        return attributes.get(key);
    }

    public void addAttribute(String key, Object value) {
        this.attributes.put(key, value);
    }

    public void removeAttribute(String key, Object value) {
        this.attributes.remove(key);
    }

    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    /**
     * @return the tooltip
     */
    public String getTooltip() {
        return tooltip;
    }

    /**
     * @param tooltip the tooltip to set
     */
    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    /**
     * @return the config
     */
    public FluidonConfig getConfig() {
        return config;
    }

    /**
     * @param config the config to set
     */
    public void setConfig(FluidonConfig config) {
        this.config = config;
    }

    /**
     * @return the fxmlFile
     */
    @Override
    public File getFxmlFile() {
        return fxmlFile;
    }

    /**
     * @param fxmlFile the fxmlFile to set
     */
    @Override
    public void setFxmlFile(File fxmlFile) {
        this.fxmlFile = fxmlFile;
    }


            /**
     * @return the wrapperComponent
     */
    @Override
    public Class<? extends IWrapperComponent> getWrapperComponent() {
        return wrapperComponent;
    }

    /**
     * @param wrapperComponent the wrapperComponent to set
     */
    @Override
    public void setWrapperComponent(Class<? extends IWrapperComponent> wrapperComponent) {
        this.wrapperComponent = wrapperComponent;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
}
