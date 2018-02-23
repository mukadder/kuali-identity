
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
    "code",
    "name",
    "sortCode",
    "active",
    "employmentAffiliationType",
    "versionNumber",
    "objectId",
    "any"
})
public class AffiliationType__ implements Serializable
{

    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("sortCode")
    private Object sortCode;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("employmentAffiliationType")
    private boolean employmentAffiliationType;
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
    private final static long serialVersionUID = -2522312483304679782L;

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public AffiliationType__ withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public AffiliationType__ withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("sortCode")
    public Object getSortCode() {
        return sortCode;
    }

    @JsonProperty("sortCode")
    public void setSortCode(Object sortCode) {
        this.sortCode = sortCode;
    }

    public AffiliationType__ withSortCode(Object sortCode) {
        this.sortCode = sortCode;
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

    public AffiliationType__ withActive(boolean active) {
        this.active = active;
        return this;
    }

    @JsonProperty("employmentAffiliationType")
    public boolean isEmploymentAffiliationType() {
        return employmentAffiliationType;
    }

    @JsonProperty("employmentAffiliationType")
    public void setEmploymentAffiliationType(boolean employmentAffiliationType) {
        this.employmentAffiliationType = employmentAffiliationType;
    }

    public AffiliationType__ withEmploymentAffiliationType(boolean employmentAffiliationType) {
        this.employmentAffiliationType = employmentAffiliationType;
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

    public AffiliationType__ withVersionNumber(int versionNumber) {
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

    public AffiliationType__ withObjectId(String objectId) {
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

    public AffiliationType__ withAny(List<Object> any) {
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

    public AffiliationType__ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("code", code).append("name", name).append("sortCode", sortCode).append("active", active).append("employmentAffiliationType", employmentAffiliationType).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(objectId).append(any).append(name).append(sortCode).append(active).append(employmentAffiliationType).append(code).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AffiliationType__) == false) {
            return false;
        }
        AffiliationType__ rhs = ((AffiliationType__) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(any, rhs.any).append(name, rhs.name).append(sortCode, rhs.sortCode).append(active, rhs.active).append(employmentAffiliationType, rhs.employmentAffiliationType).append(code, rhs.code).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
