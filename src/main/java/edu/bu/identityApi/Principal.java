
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
    "principalId",
    "principalName",
    "entityId",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class Principal implements Serializable
{

    @JsonProperty("principalId")
    private String principalId;
    @JsonProperty("principalName")
    private String principalName;
    @JsonProperty("entityId")
    private String entityId;
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
    private final static long serialVersionUID = 5547229715020315732L;

    @JsonProperty("principalId")
    public String getPrincipalId() {
        return principalId;
    }

    @JsonProperty("principalId")
    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    public Principal withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    @JsonProperty("principalName")
    public String getPrincipalName() {
        return principalName;
    }

    @JsonProperty("principalName")
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    public Principal withPrincipalName(String principalName) {
        this.principalName = principalName;
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

    public Principal withEntityId(String entityId) {
        this.entityId = entityId;
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

    public Principal withActive(boolean active) {
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

    public Principal withVersionNumber(int versionNumber) {
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

    public Principal withObjectId(String objectId) {
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

    public Principal withAny(List<Object> any) {
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

    public Principal withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("principalId", principalId).append("principalName", principalName).append("entityId", entityId).append("active", active).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(principalName).append(principalId).append(additionalProperties).append(objectId).append(any).append(entityId).append(active).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Principal) == false) {
            return false;
        }
        Principal rhs = ((Principal) other);
        return new EqualsBuilder().append(principalName, rhs.principalName).append(principalId, rhs.principalId).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(any, rhs.any).append(entityId, rhs.entityId).append(active, rhs.active).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
