package org.netbeans.jfluidon.config.preference.entity;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.10.27 at 10:17:35 PM IST
//
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.jfluidon.config.preference.IPreferenceConfig;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "container"
})
@XmlRootElement(name = "preferences")
public class PreferenceConfig implements IPreferenceConfig {

    @XmlElement(required = true, name = "container")
    private Container container;

    /**
     * @return the container
     */
    public Container getContainer() {
        if (container == null) {
            container = new Container();
        }
        return container;
    }

    /**
     * @param container the container to set
     */
    public void setContainer(Container container) {
        this.container = container;
    }

}
