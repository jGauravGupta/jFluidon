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
package com.oracle.javafx.scenebuilder.kit.editor.panel.content.driver.relocater;

import java.util.List;
import java.util.Map;
import javafx.geometry.Bounds;
import javafx.scene.Parent;
import org.netbeans.jfluidon.specification.metadata.entity.IPropertyName;


public interface IRelocater<T extends Parent> {

    Map<IPropertyName, Object> getChangeMap();

    List<IPropertyName> getPropertyNames();

    Object getValue(IPropertyName propertyName);

    void moveToLayoutX(double newLayoutX, Bounds newLayoutBounds);

    void moveToLayoutY(double newLayoutY, Bounds newLayoutBounds);

    void revertToOriginalLocation();
    
}
