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
package org.netbeans.jfluidon.config.preference.entity;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.openide.util.ImageUtilities;

/**
 *
 * @author Gaurav Gupta
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "backgrounds"
})
public class Container {

    @XmlAttribute(required = true, name = "icon")
    private String icon;

    @XmlTransient
    private Image icon_object;

    @XmlAttribute(name = "placeholder")
    private String placeholder;

    @XmlElement(required = true, name = "background")
    protected List<BackgroundImage> backgrounds;

    public List<BackgroundImage> getBackgrounds() {
        if (backgrounds == null) {
            backgrounds = new ArrayList<>();
        }
        return this.backgrounds;
    }

    /**
     * @return the containerPlaceholder
     */
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * @return the icon
     */
    public Image getIcon() {
        if (icon_object == null) {
            try {
                icon_object = ImageUtilities.loadImage(icon);
            } catch (Exception ex) {
                throw new IllegalStateException("Fluidon Container Icon path is invalid");
            }
        }
        return icon_object;
    }
}
