
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateExternalIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateExternalIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalId" type="{http://rice.kuali.org/kim/v2_0}EntityExternalIdentifierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateExternalIdentifier", propOrder = {
    "externalId"
})
public class UpdateExternalIdentifier {

    protected EntityExternalIdentifierType externalId;

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link EntityExternalIdentifierType }
     *     
     */
    public EntityExternalIdentifierType getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityExternalIdentifierType }
     *     
     */
    public void setExternalId(EntityExternalIdentifierType value) {
        this.externalId = value;
    }

}
