
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateCitizenship complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateCitizenship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="citizenship" type="{http://rice.kuali.org/kim/v2_0}EntityCitizenshipType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateCitizenship", propOrder = {
    "citizenship"
})
public class UpdateCitizenship {

    protected EntityCitizenshipType citizenship;

    /**
     * Gets the value of the citizenship property.
     * 
     * @return
     *     possible object is
     *     {@link EntityCitizenshipType }
     *     
     */
    public EntityCitizenshipType getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityCitizenshipType }
     *     
     */
    public void setCitizenship(EntityCitizenshipType value) {
        this.citizenship = value;
    }

}
