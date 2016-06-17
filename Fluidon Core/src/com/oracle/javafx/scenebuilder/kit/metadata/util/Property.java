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
package com.oracle.javafx.scenebuilder.kit.metadata.util;

import java.util.Objects;
import org.netbeans.jfluidon.specification.metadata.entity.IProperty;


/**
 * @author Gaurav Gupta
 */
public class Property<T> implements IProperty<T> {
    
    private final String name;
    private T value;

    public Property(String propertyName) {
        assert propertyName != null;
        this.name = propertyName;
    }

  

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public T getValue() {
        return value;
    }
    
    @Override
    public void setValue(T value) {
        this.value=value;
    }
    

    /*
     * Object
     */

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Property other = (Property) obj;
        return Objects.equals(this.name, other.name);
    }
    

            
    
    @Override
    public int hashCode() {
        int result = 7;
        result = 31 * result + name.hashCode();
        return result;
    }

    
    @Override
    public String toString() {
         return name;
    }

    /*
     * Comparable
     */
    @Override
    public int compareTo(IProperty t) {
        int result;
        if (this == t) {
            result = 0;
        } else if (t == null) {
            result = -1;
        } else {
            result = name.compareToIgnoreCase(t.getName());
         }
        return result;
    }

  
}
