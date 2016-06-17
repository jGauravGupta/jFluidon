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
package org.netbeans.jfluidon.specification.metadata;

import com.oracle.javafx.scenebuilder.kit.metadata.property.ComponentPropertyMetadata;
import com.oracle.javafx.scenebuilder.kit.metadata.property.ValuePropertyMetadata;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.netbeans.jfluidon.config.library.ILibraryConfig;
import org.netbeans.jfluidon.config.property.IPropertyConfig;
import org.netbeans.jfluidon.config.property.enity.Property;
import org.netbeans.jfluidon.specification.fxom.IFXOMInstance;
import org.netbeans.jfluidon.specification.metadata.entity.IComponentClassMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IInspectorPath;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyMetadata;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyName;

public interface IMetadata {

    void init();

    /**
     * @return the propertyConfig
     */
    public IPropertyConfig getPropertyConfig();

    /**
     * @param propertyConfig the propertyConfig to set
     */
    public void setPropertyConfig(IPropertyConfig propertyConfig);

    /**
     * @return the libraryConfig
     */
    public ILibraryConfig getLibraryConfig();

    /**
     * @param libraryConfig the libraryConfig to set
     */
    public void setLibraryConfig(ILibraryConfig libraryConfig);

    public IPropertyMetadata queryProperty(Class<?> componentClass, IPropertyName targetName);

    public Set<IPropertyName> getHiddenProperties();

    public IComponentClassMetadata queryComponentMetadata(Class<?> componentClass);

    public Comparator<IInspectorPath> getInspectorPathComparator();

    public boolean isPropertyTrimmingNeeded(IPropertyName name);

    public ValuePropertyMetadata queryValueProperty(IFXOMInstance fxomInstance, IPropertyName targetName);

    public Set<ValuePropertyMetadata> queryValueProperties(Set<Class<?>> componentClasses);

    public Set<ComponentPropertyMetadata> queryComponentProperties(Class<?> componentClass);

    public IPropertyMetadata queryProperty(IComponentClassMetadata classMetadata, Property property);

    public Collection<IComponentClassMetadata> getComponentClasses();

    public Set<IPropertyMetadata> queryProperties(Class<?> componentClass);

    public Set<IPropertyMetadata> queryProperties(IComponentClassMetadata classMetadata);

    public Set<IPropertyMetadata> queryProperties(Collection<Class<?>> componentClasses);

}
