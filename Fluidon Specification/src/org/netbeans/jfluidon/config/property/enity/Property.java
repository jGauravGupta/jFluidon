package org.netbeans.jfluidon.config.property.enity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({
    CustomProperty.class
})
public class Property {

    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "name")
    private String name;
    @XmlAttribute(name = "residenceClass")
    private String residenceClass;
//    @XmlAttribute(name = "value")
//    private Object value;
//    @XmlAttribute(name = "type")
//    private String type;
    @XmlAttribute(name = "readOnly")
    private boolean readOnly = false;
    @XmlAttribute(name = "visible")
    private boolean visible = true;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

//    /**
//     * @return the type
//     */
//    public String getType() {
//        return type;
//    }
    /**
     * @return the readOnly
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * @return the hide
     */
    public boolean isVisible() {
        return visible;
    }

   

//    /**
//     * @return the value
//     */
//    public Object getValue() {
//        return value;
//    }

    /**
     * @return the residenceClass
     */
    public String getResidenceClass() {
        return residenceClass;
    }

    /**
     * @param residenceClass the residenceClass to set
     */
    public void setResidenceClass(String residenceClass) {
        this.residenceClass = residenceClass;
    }
}
