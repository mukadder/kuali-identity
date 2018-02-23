
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
    "entityId",
    "affiliationType",
    "campusCode",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class DefaultAffiliation implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("affiliationType")
    @Valid
    private AffiliationType___ affiliationType;
    @JsonProperty("campusCode")
    private String campusCode;
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
    private final static long serialVersionUID = 6981634241087577065L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public DefaultAffiliation withId(String id) {
        this.id = id;
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

    public DefaultAffiliation withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("affiliationType")
    public AffiliationType___ getAffiliationType() {
        return affiliationType;
    }

    @JsonProperty("affiliationType")
    public void setAffiliationType(AffiliationType___ affiliationType) {
        this.affiliationType = affiliationType;
    }

    public DefaultAffiliation withAffiliationType(AffiliationType___ affiliationType) {
        this.affiliationType = affiliationType;
        return this;
    }

    @JsonProperty("campusCode")
    public String getCampusCode() {
        return campusCode;
    }

    @JsonProperty("campusCode")
    public void setCampusCode(String campusCode) {
        this.campusCode = campusCode;
    }

    public DefaultAffiliation withCampusCode(String campusCode) {
        this.campusCode = campusCode;
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

    public DefaultAffiliation withDefaultValue(boolean defaultValue) {
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

    public DefaultAffiliation withActive(boolean active) {
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

    public DefaultAffiliation withVersionNumber(int versionNumber) {
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

    public DefaultAffiliation withObjectId(String objectId) {
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

    public DefaultAffiliation withAny(List<Object> any) {
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

    public DefaultAffiliation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("entityId", entityId).append("affiliationType", affiliationType).append("campusCode", campusCode).append("defaultValue", defaultValue).append("active", active).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(affiliationType).append(id).append(additionalProperties).append(objectId).append(any).append(entityId).append(active).append(campusCode).append(defaultValue).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultAffiliation) == false) {
            return false;
        }
        DefaultAffiliation rhs = ((DefaultAffiliation) other);
        return new EqualsBuilder().append(affiliationType, rhs.affiliationType).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(any, rhs.any).append(entityId, rhs.entityId).append(active, rhs.active).append(campusCode, rhs.campusCode).append(defaultValue, rhs.defaultValue).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
