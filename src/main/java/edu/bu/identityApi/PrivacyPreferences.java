
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
    "suppressName",
    "suppressAddress",
    "suppressEmail",
    "suppressPhone",
    "suppressPersonal",
    "versionNumber",
    "objectId",
    "any"
})
public class PrivacyPreferences implements Serializable
{

    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("suppressName")
    private boolean suppressName;
    @JsonProperty("suppressAddress")
    private boolean suppressAddress;
    @JsonProperty("suppressEmail")
    private boolean suppressEmail;
    @JsonProperty("suppressPhone")
    private boolean suppressPhone;
    @JsonProperty("suppressPersonal")
    private boolean suppressPersonal;
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
    private final static long serialVersionUID = -6082382555698196302L;

    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public PrivacyPreferences withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("suppressName")
    public boolean isSuppressName() {
        return suppressName;
    }

    @JsonProperty("suppressName")
    public void setSuppressName(boolean suppressName) {
        this.suppressName = suppressName;
    }

    public PrivacyPreferences withSuppressName(boolean suppressName) {
        this.suppressName = suppressName;
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

    public PrivacyPreferences withSuppressAddress(boolean suppressAddress) {
        this.suppressAddress = suppressAddress;
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

    public PrivacyPreferences withSuppressEmail(boolean suppressEmail) {
        this.suppressEmail = suppressEmail;
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

    public PrivacyPreferences withSuppressPhone(boolean suppressPhone) {
        this.suppressPhone = suppressPhone;
        return this;
    }

    @JsonProperty("suppressPersonal")
    public boolean isSuppressPersonal() {
        return suppressPersonal;
    }

    @JsonProperty("suppressPersonal")
    public void setSuppressPersonal(boolean suppressPersonal) {
        this.suppressPersonal = suppressPersonal;
    }

    public PrivacyPreferences withSuppressPersonal(boolean suppressPersonal) {
        this.suppressPersonal = suppressPersonal;
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

    public PrivacyPreferences withVersionNumber(int versionNumber) {
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

    public PrivacyPreferences withObjectId(String objectId) {
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

    public PrivacyPreferences withAny(List<Object> any) {
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

    public PrivacyPreferences withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entityId", entityId).append("suppressName", suppressName).append("suppressAddress", suppressAddress).append("suppressEmail", suppressEmail).append("suppressPhone", suppressPhone).append("suppressPersonal", suppressPersonal).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(suppressPhone).append(suppressAddress).append(suppressName).append(additionalProperties).append(objectId).append(suppressPersonal).append(any).append(suppressEmail).append(entityId).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrivacyPreferences) == false) {
            return false;
        }
        PrivacyPreferences rhs = ((PrivacyPreferences) other);
        return new EqualsBuilder().append(suppressPhone, rhs.suppressPhone).append(suppressAddress, rhs.suppressAddress).append(suppressName, rhs.suppressName).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(suppressPersonal, rhs.suppressPersonal).append(any, rhs.any).append(suppressEmail, rhs.suppressEmail).append(entityId, rhs.entityId).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
