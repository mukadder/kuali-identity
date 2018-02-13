
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getDefaultNamesForPrincipalIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getDefaultNamesForPrincipalIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://rice.kuali.org/kim/v2_0}entityNamePrincipalName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultNamesForPrincipalIdResponse", propOrder = {
    "entityNamePrincipalName"
})
public class GetDefaultNamesForPrincipalIdResponse {

    protected EntityNamePrincipalNameType entityNamePrincipalName;

    /**
     * Gets the value of the entityNamePrincipalName property.
     * 
     * @return
     *     possible object is
     *     {@link EntityNamePrincipalNameType }
     *     
     */
    public EntityNamePrincipalNameType getEntityNamePrincipalName() {
        return entityNamePrincipalName;
    }

    /**
     * Sets the value of the entityNamePrincipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityNamePrincipalNameType }
     *     
     */
    public void setEntityNamePrincipalName(EntityNamePrincipalNameType value) {
        this.entityNamePrincipalName = value;
    }

}
