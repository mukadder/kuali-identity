
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
    "phoneType",
    "countryCode",
    "phoneNumber",
    "extensionNumber",
    "formattedPhoneNumber",
    "countryCodeUnmasked",
    "phoneNumberUnmasked",
    "extensionNumberUnmasked",
    "formattedPhoneNumberUnmasked",
    "suppressPhone",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class DefaultPhoneNumber implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("entityTypeCode")
    private String entityTypeCode;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("phoneType")
    @Valid
    private PhoneType_ phoneType;
    @JsonProperty("countryCode")
    private Object countryCode;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("extensionNumber")
    private Object extensionNumber;
    @JsonProperty("formattedPhoneNumber")
    private String formattedPhoneNumber;
    @JsonProperty("countryCodeUnmasked")
    private Object countryCodeUnmasked;
    @JsonProperty("phoneNumberUnmasked")
    private String phoneNumberUnmasked;
    @JsonProperty("extensionNumberUnmasked")
    private Object extensionNumberUnmasked;
    @JsonProperty("formattedPhoneNumberUnmasked")
    private String formattedPhoneNumberUnmasked;
    @JsonProperty("suppressPhone")
    private boolean suppressPhone;
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
    private final static long serialVersionUID = 3761977388545309343L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public DefaultPhoneNumber withId(String id) {
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

    public DefaultPhoneNumber withEntityTypeCode(String entityTypeCode) {
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

    public DefaultPhoneNumber withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("phoneType")
    public PhoneType_ getPhoneType() {
        return phoneType;
    }

    @JsonProperty("phoneType")
    public void setPhoneType(PhoneType_ phoneType) {
        this.phoneType = phoneType;
    }

    public DefaultPhoneNumber withPhoneType(PhoneType_ phoneType) {
        this.phoneType = phoneType;
        return this;
    }

    @JsonProperty("countryCode")
    public Object getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public DefaultPhoneNumber withCountryCode(Object countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public DefaultPhoneNumber withPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @JsonProperty("extensionNumber")
    public Object getExtensionNumber() {
        return extensionNumber;
    }

    @JsonProperty("extensionNumber")
    public void setExtensionNumber(Object extensionNumber) {
        this.extensionNumber = extensionNumber;
    }

    public DefaultPhoneNumber withExtensionNumber(Object extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    @JsonProperty("formattedPhoneNumber")
    public String getFormattedPhoneNumber() {
        return formattedPhoneNumber;
    }

    @JsonProperty("formattedPhoneNumber")
    public void setFormattedPhoneNumber(String formattedPhoneNumber) {
        this.formattedPhoneNumber = formattedPhoneNumber;
    }

    public DefaultPhoneNumber withFormattedPhoneNumber(String formattedPhoneNumber) {
        this.formattedPhoneNumber = formattedPhoneNumber;
        return this;
    }

    @JsonProperty("countryCodeUnmasked")
    public Object getCountryCodeUnmasked() {
        return countryCodeUnmasked;
    }

    @JsonProperty("countryCodeUnmasked")
    public void setCountryCodeUnmasked(Object countryCodeUnmasked) {
        this.countryCodeUnmasked = countryCodeUnmasked;
    }

    public DefaultPhoneNumber withCountryCodeUnmasked(Object countryCodeUnmasked) {
        this.countryCodeUnmasked = countryCodeUnmasked;
        return this;
    }

    @JsonProperty("phoneNumberUnmasked")
    public String getPhoneNumberUnmasked() {
        return phoneNumberUnmasked;
    }

    @JsonProperty("phoneNumberUnmasked")
    public void setPhoneNumberUnmasked(String phoneNumberUnmasked) {
        this.phoneNumberUnmasked = phoneNumberUnmasked;
    }

    public DefaultPhoneNumber withPhoneNumberUnmasked(String phoneNumberUnmasked) {
        this.phoneNumberUnmasked = phoneNumberUnmasked;
        return this;
    }

    @JsonProperty("extensionNumberUnmasked")
    public Object getExtensionNumberUnmasked() {
        return extensionNumberUnmasked;
    }

    @JsonProperty("extensionNumberUnmasked")
    public void setExtensionNumberUnmasked(Object extensionNumberUnmasked) {
        this.extensionNumberUnmasked = extensionNumberUnmasked;
    }

    public DefaultPhoneNumber withExtensionNumberUnmasked(Object extensionNumberUnmasked) {
        this.extensionNumberUnmasked = extensionNumberUnmasked;
        return this;
    }

    @JsonProperty("formattedPhoneNumberUnmasked")
    public String getFormattedPhoneNumberUnmasked() {
        return formattedPhoneNumberUnmasked;
    }

    @JsonProperty("formattedPhoneNumberUnmasked")
    public void setFormattedPhoneNumberUnmasked(String formattedPhoneNumberUnmasked) {
        this.formattedPhoneNumberUnmasked = formattedPhoneNumberUnmasked;
    }

    public DefaultPhoneNumber withFormattedPhoneNumberUnmasked(String formattedPhoneNumberUnmasked) {
        this.formattedPhoneNumberUnmasked = formattedPhoneNumberUnmasked;
        return this;
    }

    @JsonProperty("suppressPhone")
    public boolean isSuppressPhone() {
        return suppressPhone;
    }

    @JsonProperty("suppressPhone")
    public void setSuppressPhone(boolean suppressPhone) {
        this.suppressPhone = suppressPhone;
    }

    public DefaultPhoneNumber withSuppressPhone(boolean suppressPhone) {
        this.suppressPhone = suppressPhone;
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

    public DefaultPhoneNumber withDefaultValue(boolean defaultValue) {
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

    public DefaultPhoneNumber withActive(boolean active) {
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

    public DefaultPhoneNumber withVersionNumber(int versionNumber) {
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

    public DefaultPhoneNumber withObjectId(String objectId) {
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

    public DefaultPhoneNumber withAny(List<Object> any) {
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

    public DefaultPhoneNumber withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("entityTypeCode", entityTypeCode).append("entityId", entityId).append("phoneType", phoneType).append("countryCode", countryCode).append("phoneNumber", phoneNumber).append("extensionNumber", extensionNumber).append("formattedPhoneNumber", formattedPhoneNumber).append("countryCodeUnmasked", countryCodeUnmasked).append("phoneNumberUnmasked", phoneNumberUnmasked).append("extensionNumberUnmasked", extensionNumberUnmasked).append("formattedPhoneNumberUnmasked", formattedPhoneNumberUnmasked).append("suppressPhone", suppressPhone).append("defaultValue", defaultValue).append("active", active).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(formattedPhoneNumberUnmasked).append(suppressPhone).append(phoneNumberUnmasked).append(phoneType).append(entityTypeCode).append(extensionNumberUnmasked).append(countryCode).append(entityId).append(id).append(phoneNumber).append(formattedPhoneNumber).append(additionalProperties).append(objectId).append(any).append(active).append(countryCodeUnmasked).append(defaultValue).append(extensionNumber).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultPhoneNumber) == false) {
            return false;
        }
        DefaultPhoneNumber rhs = ((DefaultPhoneNumber) other);
        return new EqualsBuilder().append(formattedPhoneNumberUnmasked, rhs.formattedPhoneNumberUnmasked).append(suppressPhone, rhs.suppressPhone).append(phoneNumberUnmasked, rhs.phoneNumberUnmasked).append(phoneType, rhs.phoneType).append(entityTypeCode, rhs.entityTypeCode).append(extensionNumberUnmasked, rhs.extensionNumberUnmasked).append(countryCode, rhs.countryCode).append(entityId, rhs.entityId).append(id, rhs.id).append(phoneNumber, rhs.phoneNumber).append(formattedPhoneNumber, rhs.formattedPhoneNumber).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(any, rhs.any).append(active, rhs.active).append(countryCodeUnmasked, rhs.countryCodeUnmasked).append(defaultValue, rhs.defaultValue).append(extensionNumber, rhs.extensionNumber).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
