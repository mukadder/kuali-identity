
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
    "entityId",
    "entityTypeCode",
    "entityType",
    "addresses",
    "emailAddresses",
    "phoneNumbers",
    "defaultAddress",
    "defaultEmailAddress",
    "defaultPhoneNumber",
    "versionNumber",
    "objectId",
    "active",
    "any"
})
public class EntityTypeContactInfo implements Serializable
{

    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("entityTypeCode")
    private String entityTypeCode;
    @JsonProperty("entityType")
    @Valid
    private EntityType entityType;
    @JsonProperty("addresses")
    @Valid
    private Addresses addresses;
    @JsonProperty("emailAddresses")
    @Valid
    private EmailAddresses emailAddresses;
    @JsonProperty("phoneNumbers")
    @Valid
    private PhoneNumbers phoneNumbers;
    @JsonProperty("defaultAddress")
    @Valid
    private DefaultAddress defaultAddress;
    @JsonProperty("defaultEmailAddress")
    @Valid
    private DefaultEmailAddress defaultEmailAddress;
    @JsonProperty("defaultPhoneNumber")
    @Valid
    private DefaultPhoneNumber defaultPhoneNumber;
    @JsonProperty("versionNumber")
    private int versionNumber;
    @JsonProperty("objectId")
    private String objectId;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("any")
    @Valid
    private List<Object> any = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8651076258473154935L;

    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public EntityTypeContactInfo withEntityId(String entityId) {
        this.entityId = entityId;
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

    public EntityTypeContactInfo withEntityTypeCode(String entityTypeCode) {
        this.entityTypeCode = entityTypeCode;
        return this;
    }

    @JsonProperty("entityType")
    public EntityType getEntityType() {
        return entityType;
    }

    @JsonProperty("entityType")
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public EntityTypeContactInfo withEntityType(EntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    @JsonProperty("addresses")
    public Addresses getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    public EntityTypeContactInfo withAddresses(Addresses addresses) {
        this.addresses = addresses;
        return this;
    }

    @JsonProperty("emailAddresses")
    public EmailAddresses getEmailAddresses() {
        return emailAddresses;
    }

    @JsonProperty("emailAddresses")
    public void setEmailAddresses(EmailAddresses emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public EntityTypeContactInfo withEmailAddresses(EmailAddresses emailAddresses) {
        this.emailAddresses = emailAddresses;
        return this;
    }

    @JsonProperty("phoneNumbers")
    public PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phoneNumbers")
    public void setPhoneNumbers(PhoneNumbers phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public EntityTypeContactInfo withPhoneNumbers(PhoneNumbers phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    @JsonProperty("defaultAddress")
    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    @JsonProperty("defaultAddress")
    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public EntityTypeContactInfo withDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
        return this;
    }

    @JsonProperty("defaultEmailAddress")
    public DefaultEmailAddress getDefaultEmailAddress() {
        return defaultEmailAddress;
    }

    @JsonProperty("defaultEmailAddress")
    public void setDefaultEmailAddress(DefaultEmailAddress defaultEmailAddress) {
        this.defaultEmailAddress = defaultEmailAddress;
    }

    public EntityTypeContactInfo withDefaultEmailAddress(DefaultEmailAddress defaultEmailAddress) {
        this.defaultEmailAddress = defaultEmailAddress;
        return this;
    }

    @JsonProperty("defaultPhoneNumber")
    public DefaultPhoneNumber getDefaultPhoneNumber() {
        return defaultPhoneNumber;
    }

    @JsonProperty("defaultPhoneNumber")
    public void setDefaultPhoneNumber(DefaultPhoneNumber defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
    }

    public EntityTypeContactInfo withDefaultPhoneNumber(DefaultPhoneNumber defaultPhoneNumber) {
        this.defaultPhoneNumber = defaultPhoneNumber;
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

    public EntityTypeContactInfo withVersionNumber(int versionNumber) {
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

    public EntityTypeContactInfo withObjectId(String objectId) {
        this.objectId = objectId;
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

    public EntityTypeContactInfo withActive(boolean active) {
        this.active = active;
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

    public EntityTypeContactInfo withAny(List<Object> any) {
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

    public EntityTypeContactInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entityId", entityId).append("entityTypeCode", entityTypeCode).append("entityType", entityType).append("addresses", addresses).append("emailAddresses", emailAddresses).append("phoneNumbers", phoneNumbers).append("defaultAddress", defaultAddress).append("defaultEmailAddress", defaultEmailAddress).append("defaultPhoneNumber", defaultPhoneNumber).append("versionNumber", versionNumber).append("objectId", objectId).append("active", active).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultPhoneNumber).append(entityTypeCode).append(entityId).append(phoneNumbers).append(entityType).append(defaultEmailAddress).append(additionalProperties).append(objectId).append(any).append(defaultAddress).append(active).append(addresses).append(versionNumber).append(emailAddresses).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityTypeContactInfo) == false) {
            return false;
        }
        EntityTypeContactInfo rhs = ((EntityTypeContactInfo) other);
        return new EqualsBuilder().append(defaultPhoneNumber, rhs.defaultPhoneNumber).append(entityTypeCode, rhs.entityTypeCode).append(entityId, rhs.entityId).append(phoneNumbers, rhs.phoneNumbers).append(entityType, rhs.entityType).append(defaultEmailAddress, rhs.defaultEmailAddress).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(any, rhs.any).append(defaultAddress, rhs.defaultAddress).append(active, rhs.active).append(addresses, rhs.addresses).append(versionNumber, rhs.versionNumber).append(emailAddresses, rhs.emailAddresses).isEquals();
    }

}
