
package edu.bu.identityApi;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "entityTypeCode",
    "entityId",
    "addressType",
    "attentionLine",
    "line1",
    "line2",
    "line3",
    "city",
    "stateProvinceCode",
    "postalCode",
    "countryCode",
    "attentionLineUnmasked",
    "line1Unmasked",
    "line2Unmasked",
    "line3Unmasked",
    "cityUnmasked",
    "stateProvinceCodeUnmasked",
    "postalCodeUnmasked",
    "countryCodeUnmasked",
    "addressFormat",
    "modifiedDate",
    "validatedDate",
    "validated",
    "noteMessage",
    "suppressAddress",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class DefaultAddress implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("entityTypeCode")
    private String entityTypeCode;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("addressType")
    @Valid
    private AddressType_ addressType;
    @JsonProperty("attentionLine")
    private Object attentionLine;
    @JsonProperty("line1")
    private String line1;
    @JsonProperty("line2")
    private String line2;
    @JsonProperty("line3")
    private String line3;
    @JsonProperty("city")
    private String city;
    @JsonProperty("stateProvinceCode")
    private String stateProvinceCode;
    @JsonProperty("postalCode")
    private String postalCode;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("attentionLineUnmasked")
    private Object attentionLineUnmasked;
    @JsonProperty("line1Unmasked")
    private String line1Unmasked;
    @JsonProperty("line2Unmasked")
    private String line2Unmasked;
    @JsonProperty("line3Unmasked")
    private String line3Unmasked;
    @JsonProperty("cityUnmasked")
    private String cityUnmasked;
    @JsonProperty("stateProvinceCodeUnmasked")
    private String stateProvinceCodeUnmasked;
    @JsonProperty("postalCodeUnmasked")
    private String postalCodeUnmasked;
    @JsonProperty("countryCodeUnmasked")
    private String countryCodeUnmasked;
    @JsonProperty("addressFormat")
    private Object addressFormat;
    @JsonProperty("modifiedDate")
    private Object modifiedDate;
    @JsonProperty("validatedDate")
    private Object validatedDate;
    @JsonProperty("validated")
    private boolean validated;
    @JsonProperty("noteMessage")
    private Object noteMessage;
    @JsonProperty("suppressAddress")
    private boolean suppressAddress;
    @JsonProperty("defaultValue")
    private boolean defaultValue;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("versionNumber")
    private int versionNumber;
    @JsonProperty("objectId")
    private String objectId;
    @JsonProperty("any")
    @Valid
    private List<Object> any = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5877743909350759747L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public DefaultAddress withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("entityTypeCode")
    public String getEntityTypeCode() {
        return entityTypeCode;
    }

    @JsonProperty("entityTypeCode")
    public void setEntityTypeCode(String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
    }

    public DefaultAddress withEntityTypeCode(String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
        return this;
    }

    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public DefaultAddress withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("addressType")
    public AddressType_ getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(AddressType_ addressType) {
        this.addressType = addressType;
    }

    public DefaultAddress withAddressType(AddressType_ addressType) {
        this.addressType = addressType;
        return this;
    }

    @JsonProperty("attentionLine")
    public Object getAttentionLine() {
        return attentionLine;
    }

    @JsonProperty("attentionLine")
    public void setAttentionLine(Object attentionLine) {
        this.attentionLine = attentionLine;
    }

    public DefaultAddress withAttentionLine(Object attentionLine) {
        this.attentionLine = attentionLine;
        return this;
    }

    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public DefaultAddress withLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public DefaultAddress withLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    @JsonProperty("line3")
    public String getLine3() {
        return line3;
    }

    @JsonProperty("line3")
    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public DefaultAddress withLine3(String line3) {
        this.line3 = line3;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public DefaultAddress withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("stateProvinceCode")
    public String getStateProvinceCode() {
        return stateProvinceCode;
    }

    @JsonProperty("stateProvinceCode")
    public void setStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
    }

    public DefaultAddress withStateProvinceCode(String stateProvinceCode) {
        this.stateProvinceCode = stateProvinceCode;
        return this;
    }

    @JsonProperty("postalCode")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postalCode")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public DefaultAddress withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public DefaultAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("attentionLineUnmasked")
    public Object getAttentionLineUnmasked() {
        return attentionLineUnmasked;
    }

    @JsonProperty("attentionLineUnmasked")
    public void setAttentionLineUnmasked(Object attentionLineUnmasked) {
        this.attentionLineUnmasked = attentionLineUnmasked;
    }

    public DefaultAddress withAttentionLineUnmasked(Object attentionLineUnmasked) {
        this.attentionLineUnmasked = attentionLineUnmasked;
        return this;
    }

    @JsonProperty("line1Unmasked")
    public String getLine1Unmasked() {
        return line1Unmasked;
    }

    @JsonProperty("line1Unmasked")
    public void setLine1Unmasked(String line1Unmasked) {
        this.line1Unmasked = line1Unmasked;
    }

    public DefaultAddress withLine1Unmasked(String line1Unmasked) {
        this.line1Unmasked = line1Unmasked;
        return this;
    }

    @JsonProperty("line2Unmasked")
    public String getLine2Unmasked() {
        return line2Unmasked;
    }

    @JsonProperty("line2Unmasked")
    public void setLine2Unmasked(String line2Unmasked) {
        this.line2Unmasked = line2Unmasked;
    }

    public DefaultAddress withLine2Unmasked(String line2Unmasked) {
        this.line2Unmasked = line2Unmasked;
        return this;
    }

    @JsonProperty("line3Unmasked")
    public String getLine3Unmasked() {
        return line3Unmasked;
    }

    @JsonProperty("line3Unmasked")
    public void setLine3Unmasked(String line3Unmasked) {
        this.line3Unmasked = line3Unmasked;
    }

    public DefaultAddress withLine3Unmasked(String line3Unmasked) {
        this.line3Unmasked = line3Unmasked;
        return this;
    }

    @JsonProperty("cityUnmasked")
    public String getCityUnmasked() {
        return cityUnmasked;
    }

    @JsonProperty("cityUnmasked")
    public void setCityUnmasked(String cityUnmasked) {
        this.cityUnmasked = cityUnmasked;
    }

    public DefaultAddress withCityUnmasked(String cityUnmasked) {
        this.cityUnmasked = cityUnmasked;
        return this;
    }

    @JsonProperty("stateProvinceCodeUnmasked")
    public String getStateProvinceCodeUnmasked() {
        return stateProvinceCodeUnmasked;
    }

    @JsonProperty("stateProvinceCodeUnmasked")
    public void setStateProvinceCodeUnmasked(String stateProvinceCodeUnmasked) {
        this.stateProvinceCodeUnmasked = stateProvinceCodeUnmasked;
    }

    public DefaultAddress withStateProvinceCodeUnmasked(String stateProvinceCodeUnmasked) {
        this.stateProvinceCodeUnmasked = stateProvinceCodeUnmasked;
        return this;
    }

    @JsonProperty("postalCodeUnmasked")
    public String getPostalCodeUnmasked() {
        return postalCodeUnmasked;
    }

    @JsonProperty("postalCodeUnmasked")
    public void setPostalCodeUnmasked(String postalCodeUnmasked) {
        this.postalCodeUnmasked = postalCodeUnmasked;
    }

    public DefaultAddress withPostalCodeUnmasked(String postalCodeUnmasked) {
        this.postalCodeUnmasked = postalCodeUnmasked;
        return this;
    }

    @JsonProperty("countryCodeUnmasked")
    public String getCountryCodeUnmasked() {
        return countryCodeUnmasked;
    }

    @JsonProperty("countryCodeUnmasked")
    public void setCountryCodeUnmasked(String countryCodeUnmasked) {
        this.countryCodeUnmasked = countryCodeUnmasked;
    }

    public DefaultAddress withCountryCodeUnmasked(String countryCodeUnmasked) {
        this.countryCodeUnmasked = countryCodeUnmasked;
        return this;
    }

    @JsonProperty("addressFormat")
    public Object getAddressFormat() {
        return addressFormat;
    }

    @JsonProperty("addressFormat")
    public void setAddressFormat(Object addressFormat) {
        this.addressFormat = addressFormat;
    }

    public DefaultAddress withAddressFormat(Object addressFormat) {
        this.addressFormat = addressFormat;
        return this;
    }

    @JsonProperty("modifiedDate")
    public Object getModifiedDate() {
        return modifiedDate;
    }

    @JsonProperty("modifiedDate")
    public void setModifiedDate(Object modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public DefaultAddress withModifiedDate(Object modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }

    @JsonProperty("validatedDate")
    public Object getValidatedDate() {
        return validatedDate;
    }

    @JsonProperty("validatedDate")
    public void setValidatedDate(Object validatedDate) {
        this.validatedDate = validatedDate;
    }

    public DefaultAddress withValidatedDate(Object validatedDate) {
        this.validatedDate = validatedDate;
        return this;
    }

    @JsonProperty("validated")
    public boolean isValidated() {
        return validated;
    }

    @JsonProperty("validated")
    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public DefaultAddress withValidated(boolean validated) {
        this.validated = validated;
        return this;
    }

    @JsonProperty("noteMessage")
    public Object getNoteMessage() {
        return noteMessage;
    }

    @JsonProperty("noteMessage")
    public void setNoteMessage(Object noteMessage) {
        this.noteMessage = noteMessage;
    }

    public DefaultAddress withNoteMessage(Object noteMessage) {
        this.noteMessage = noteMessage;
        return this;
    }

    @JsonProperty("suppressAddress")
    public boolean isSuppressAddress() {
        return suppressAddress;
    }

    @JsonProperty("suppressAddress")
    public void setSuppressAddress(boolean suppressAddress) {
        this.suppressAddress = suppressAddress;
    }

    public DefaultAddress withSuppressAddress(boolean suppressAddress) {
        this.suppressAddress = suppressAddress;
        return this;
    }

    @JsonProperty("defaultValue")
    public boolean isDefaultValue() {
        return defaultValue;
    }

    @JsonProperty("defaultValue")
    public void setDefaultValue(boolean defaultValue) {
        this.defaultValue = defaultValue;
    }

    public DefaultAddress withDefaultValue(boolean defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    @JsonProperty("active")
    public boolean isActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(boolean active) {
        this.active = active;
    }

    public DefaultAddress withActive(boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("versionNumber")
    public int getVersionNumber() {
        return versionNumber;
    }

    @JsonProperty("versionNumber")
    public void setVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
    }

    public DefaultAddress withVersionNumber(int versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    @JsonProperty("objectId")
    public String getObjectId() {
        return objectId;
    }

    @JsonProperty("objectId")
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public DefaultAddress withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    @JsonProperty("any")
    public List<Object> getAny() {
        return any;
    }

    @JsonProperty("any")
    public void setAny(List<Object> any) {
        this.any = any;
    }

    public DefaultAddress withAny(List<Object> any) {
        this.any = any;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public DefaultAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("entityTypeCode", entityTypeCode).append("entityId", entityId).append("addressType", addressType).append("attentionLine", attentionLine).append("line1", line1).append("line2", line2).append("line3", line3).append("city", city).append("stateProvinceCode", stateProvinceCode).append("postalCode", postalCode).append("countryCode", countryCode).append("attentionLineUnmasked", attentionLineUnmasked).append("line1Unmasked", line1Unmasked).append("line2Unmasked", line2Unmasked).append("line3Unmasked", line3Unmasked).append("cityUnmasked", cityUnmasked).append("stateProvinceCodeUnmasked", stateProvinceCodeUnmasked).append("postalCodeUnmasked", postalCodeUnmasked).append("countryCodeUnmasked", countryCodeUnmasked).append("addressFormat", addressFormat).append("modifiedDate", modifiedDate).append("validatedDate", validatedDate).append("validated", validated).append("noteMessage", noteMessage).append("suppressAddress", suppressAddress).append("defaultValue", defaultValue).append("active", active).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(entityTypeCode).append(entityId).append(validated).append(city).append(id).append(cityUnmasked).append(postalCode).append(suppressAddress).append(postalCodeUnmasked).append(objectId).append(any).append(line3Unmasked).append(countryCodeUnmasked).append(defaultValue).append(addressFormat).append(countryCode).append(addressType).append(attentionLineUnmasked).append(noteMessage).append(line2Unmasked).append(modifiedDate).append(stateProvinceCodeUnmasked).append(line1Unmasked).append(attentionLine).append(validatedDate).append(additionalProperties).append(stateProvinceCode).append(active).append(line1).append(versionNumber).append(line3).append(line2).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultAddress) == false) {
            return false;
        }
        DefaultAddress rhs = ((DefaultAddress) other);
        return new EqualsBuilder().append(entityTypeCode, rhs.entityTypeCode).append(entityId, rhs.entityId).append(validated, rhs.validated).append(city, rhs.city).append(id, rhs.id).append(cityUnmasked, rhs.cityUnmasked).append(postalCode, rhs.postalCode).append(suppressAddress, rhs.suppressAddress).append(postalCodeUnmasked, rhs.postalCodeUnmasked).append(objectId, rhs.objectId).append(any, rhs.any).append(line3Unmasked, rhs.line3Unmasked).append(countryCodeUnmasked, rhs.countryCodeUnmasked).append(defaultValue, rhs.defaultValue).append(addressFormat, rhs.addressFormat).append(countryCode, rhs.countryCode).append(addressType, rhs.addressType).append(attentionLineUnmasked, rhs.attentionLineUnmasked).append(noteMessage, rhs.noteMessage).append(line2Unmasked, rhs.line2Unmasked).append(modifiedDate, rhs.modifiedDate).append(stateProvinceCodeUnmasked, rhs.stateProvinceCodeUnmasked).append(line1Unmasked, rhs.line1Unmasked).append(attentionLine, rhs.attentionLine).append(validatedDate, rhs.validatedDate).append(additionalProperties, rhs.additionalProperties).append(stateProvinceCode, rhs.stateProvinceCode).append(active, rhs.active).append(line1, rhs.line1).append(versionNumber, rhs.versionNumber).append(line3, rhs.line3).append(line2, rhs.line2).isEquals();
    }

}
