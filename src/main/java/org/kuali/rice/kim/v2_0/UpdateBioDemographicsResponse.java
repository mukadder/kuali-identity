
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateBioDemographicsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateBioDemographicsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bioDemographics" type="{http://rice.kuali.org/kim/v2_0}EntityBioDemographicsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateBioDemographicsResponse", propOrder = {
    "bioDemographics"
})
public class UpdateBioDemographicsResponse {

    protected EntityBioDemographicsType bioDemographics;

    /**
     * Gets the value of the bioDemographics property.
     * 
     * @return
     *     possible object is
     *     {@link EntityBioDemographicsType }
     *     
     */
    public EntityBioDemographicsType getBioDemographics() {
        return bioDemographics;
    }

    /**
     * Sets the value of the bioDemographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityBioDemographicsType }
     *     
     */
    public void setBioDemographics(EntityBioDemographicsType value) {
        this.bioDemographics = value;
    }

}
