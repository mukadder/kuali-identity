
package org.kuali.rice.kim.v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.kuali.rice.core.v2_0.QueryByCriteriaType;


/**
 * <p>Java class for findEntities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findEntities"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="query" type="{http://rice.kuali.org/core/v2_0}QueryByCriteriaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findEntities", propOrder = {
    "query"
})
public class FindEntities {

    protected QueryByCriteriaType query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link QueryByCriteriaType }
     *     
     */
    public QueryByCriteriaType getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryByCriteriaType }
     *     
     */
    public void setQuery(QueryByCriteriaType value) {
        this.query = value;
    }

}
