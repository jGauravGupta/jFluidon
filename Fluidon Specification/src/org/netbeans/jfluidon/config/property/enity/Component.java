package org.netbeans.jfluidon.config.property.enity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "property"
})
public class Component {

//    @XmlElement(required = true, name = "property")
    @XmlElementWrapper(name = "properties")
    @XmlElements({
        @XmlElement(name = "basic", type = BaseProperty.class),
        @XmlElement(name = "custom", type = CustomProperty.class)
    })
    private List<Property> property;
    @XmlAttribute(name = "class")
    private String klass;

    /**
     * @return the property
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return property;
    }

    /**
     * @return the id
     */
    public String getKlass() {
        return klass;
    }

}
