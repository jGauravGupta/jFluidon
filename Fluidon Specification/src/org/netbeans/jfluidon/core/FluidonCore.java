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
package org.netbeans.jfluidon.core;

import java.util.HashMap;
import java.util.Map;
import org.netbeans.jfluidon.config.preference.IPreferenceConfig;
import org.netbeans.jfluidon.file.IFluidonFile;
import org.netbeans.jfluidon.specification.library.ILibrary;
import org.netbeans.jfluidon.specification.metadata.IMetadata;

public class FluidonCore {

    private static Map<String, IFluidonFile> fluidonFiles = new HashMap<>();
    private static Map<String, ILibrary> libraries = new HashMap<>();
    private static Map<String, IPreferenceConfig> preferenceConfigs = new HashMap<>();
    private static Map<String, IMetadata> metadata = new HashMap<>();

    /**
     * @return the fluidonFiles
     */
    public static Map<String, IFluidonFile> getFiles() {
        return FluidonCore.fluidonFiles;
    }

    /**
     * @param key
     * @return the IFluidonFile
     */
    public static IFluidonFile getFile(String key) {
        return FluidonCore.fluidonFiles.get(key);
    }

    /**
     * @param fluidonFiles the fluidonFiles to set
     */
    public static void setFiles(Map<String, IFluidonFile> fluidonFiles) {
        FluidonCore.fluidonFiles = fluidonFiles;
    }

    public static void addFile(String key, IFluidonFile fluidonFile) {
        FluidonCore.fluidonFiles.put(key, fluidonFile);
    }

    public static void removeFile(String key) {
        FluidonCore.fluidonFiles.remove(key);
    }

    /**
     * @return the libraries
     */
    public static Map<String, ILibrary> getLibraries() {
        return libraries;
    }

    public static ILibrary getLibrary(String key) {
        return libraries.get(key);
    }

    /**
     * @param libraries the libraries to set
     */
    public static void setLibraries(Map<String, ILibrary> libraries) {
        FluidonCore.libraries = libraries;
    }

    public static void addLibrary(String key, ILibrary library) {
        FluidonCore.libraries.put(key, library);
    }

    public static void removeLibrary(String key) {
        FluidonCore.libraries.remove(key);
    }

    /**
     * @return the preferencesConfigs
     */
    public static Map<String, IPreferenceConfig> getPreferenceConfig() {
        return preferenceConfigs;
    }

    public static IPreferenceConfig getPreferenceConfig(String key) {
        return preferenceConfigs.get(key);
    }

    /**
     * @param preferenceConfigs_param the preferenceConfigs to set
     */
    public static void setPreferencesConfigs(Map<String, IPreferenceConfig> preferenceConfigs_param) {
        preferenceConfigs = preferenceConfigs_param;
    }

    public static void addPreferenceConfig(String key, IPreferenceConfig preferenceConfig) {
        FluidonCore.preferenceConfigs.put(key, preferenceConfig);
    }

    public static void removePreferenceConfig(String key) {
        FluidonCore.preferenceConfigs.remove(key);
    }


    /**
     * @return the metadata
     */
    public static Map<String, IMetadata> getMetadata() {
        return metadata;
    }

    public static IMetadata getMetadata(String key) {
        return metadata.get(key);
    }

    /**
     * @param aMetadata the metadata to set
     */
    public static void setMetadata(Map<String, IMetadata> aMetadata) {
        metadata = aMetadata;
    }

    public static void addMetadata(String key, IMetadata metadata) {
        FluidonCore.metadata.put(key, metadata);
    }

    public static void removeMetadata(String key) {
        FluidonCore.metadata.remove(key);
    }

}
