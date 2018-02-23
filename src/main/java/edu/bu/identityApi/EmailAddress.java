
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
    "emailType",
    "emailAddress",
    "emailAddressUnmasked",
    "suppressEmail",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class EmailAddress implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("entityTypeCode")
    private String entityTypeCode;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("emailType")
    @Valid
    private EmailType emailType;
    @JsonProperty("emailAddress")
    private String emailAddress;
    @JsonProperty("emailAddressUnmasked")
    private String emailAddressUnmasked;
    @JsonProperty("suppressEmail")
    private boolean suppressEmail;
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
    private final static long serialVersionUID = 4341903934574062129L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EmailAddress withId(String id) {
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

    public EmailAddress withEntityTypeCode(String entityTypeCode) {
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

    public EmailAddress withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("emailType")
    public EmailType getEmailType() {
        return emailType;
    }

    @JsonProperty("emailType")
    public void setEmailType(EmailType emailType) {
        this.emailType = emailType;
    }

    public EmailAddress withEmailType(EmailType emailType) {
        this.emailType = emailType;
        return this;
    }

    @JsonProperty("emailAddress")
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty("emailAddress")
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public EmailAddress withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    @JsonProperty("emailAddressUnmasked")
    public String getEmailAddressUnmasked() {
        return emailAddressUnmasked;
    }

    @JsonProperty("emailAddressUnmasked")
    public void setEmailAddressUnmasked(String emailAddressUnmasked) {
        this.emailAddressUnmasked = emailAddressUnmasked;
    }

    public EmailAddress withEmailAddressUnmasked(String emailAddressUnmasked) {
        this.emailAddressUnmasked = emailAddressUnmasked;
        return this;
    }

    @JsonProperty("suppressEmail")
    public boolean isSuppressEmail() {
        return suppressEmail;
    }

    @JsonProperty("suppressEmail")
    public void setSuppressEmail(boolean suppressEmail) {
        this.suppressEmail = suppressEmail;
    }

    public EmailAddress withSuppressEmail(boolean suppressEmail) {
        this.suppressEmail = suppressEmail;
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

    public EmailAddress withDefaultValue(boolean defaultValue) {
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

    public EmailAddress withActive(boolean active) {
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

    public EmailAddress withVersionNumber(int versionNumber) {
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

    public EmailAddress withObjectId(String objectId) {
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

    public EmailAddress withAny(List<Object> any) {
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

    public EmailAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("entityTypeCode", entityTypeCode).append("entityId", entityId).append("emailType", emailType).append("emailAddress", emailAddress).append("emailAddressUnmasked", emailAddressUnmasked).append("suppressEmail", suppressEmail).append("defaultValue", defaultValue).append("active", active).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(entityTypeCode).append(suppressEmail).append(entityId).append(emailAddress).append(emailAddressUnmasked).append(id).append(emailType).append(additionalProperties).append(objectId).append(any).append(active).append(defaultValue).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EmailAddress) == false) {
            return false;
        }
        EmailAddress rhs = ((EmailAddress) other);
        return new EqualsBuilder().append(entityTypeCode, rhs.entityTypeCode).append(suppressEmail, rhs.suppressEmail).append(entityId, rhs.entityId).append(emailAddress, rhs.emailAddress).append(emailAddressUnmasked, rhs.emailAddressUnmasked).append(id, rhs.id).append(emailType, rhs.emailType).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(any, rhs.any).append(active, rhs.active).append(defaultValue, rhs.defaultValue).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
