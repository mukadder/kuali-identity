
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEntityDefaultByPrincipalIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntityDefaultByPrincipalIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityDefault" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntityDefaultByPrincipalIdResponse", propOrder = {
    "entityDefault"
})
public class GetEntityDefaultByPrincipalIdResponse {

    protected EntityDefaultType entityDefault;

    /**
     * Gets the value of the entityDefault property.
     * 
     * @return
     *     possible object is
     *     {@link EntityDefaultType }
     *     
     */
    public EntityDefaultType getEntityDefault() {
        return entityDefault;
    }

    /**
     * Sets the value of the entityDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityDefaultType }
     *     
     */
    public void setEntityDefault(EntityDefaultType value) {
        this.entityDefault = value;
    }

}
