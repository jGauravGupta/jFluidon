package org.netbeans.jfluidon.config.property.enity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {})
public class Path {

    @XmlAttribute(name = "section")
    private String section;
    @XmlAttribute(name = "subSection")
    private String subSection;
    @XmlAttribute(name = "index")
    private int subSectionIndex;

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @return the subSection
     */
    public String getSubSection() {
        return subSection;
    }

    /**
     * @return the subSectionIndex
     */
    public int getSubSectionIndex() {
        return subSectionIndex;
    }

}
