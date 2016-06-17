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
package org.netbeans.jfluidon.component;

import javafx.scene.Parent;


public interface Widget {

    /**
     * @return the resourceWidth
     */
    public String getResourceWidth();

    /**
     * @param resourceWidth the resourceWidth to set
     */
    public void setResourceWidth(String resourceWidth);

    /**
     * @return the resourceHeight
     */
    public String getResourceHeight();

    /**
     * @param resourceHeight the resourceHeight to set
     */
    public void setResourceHeight(String resourceHeight);

    /**
     * @return the resourceId
     */
    public String getResourceId();

    /**
     * @param resourceId the resourceId to set
     */
    public void setResourceId(String resourceId);
    
    public Parent getParent();
//    public final void setMaxWidth(double value)
}
