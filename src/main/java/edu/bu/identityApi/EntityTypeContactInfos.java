
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
    "entityTypeContactInfo"
})
public class EntityTypeContactInfos implements Serializable
{

    @JsonProperty("entityTypeContactInfo")
    @Valid
    private List<EntityTypeContactInfo> entityTypeContactInfo = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2782096586200596296L;

    @JsonProperty("entityTypeContactInfo")
    public List<EntityTypeContactInfo> getEntityTypeContactInfo() {
        return entityTypeContactInfo;
    }

    @JsonProperty("entityTypeContactInfo")
    public void setEntityTypeContactInfo(List<EntityTypeContactInfo> entityTypeContactInfo) {
        this.entityTypeContactInfo = entityTypeContactInfo;
    }

    public EntityTypeContactInfos withEntityTypeContactInfo(List<EntityTypeContactInfo> entityTypeContactInfo) {
        this.entityTypeContactInfo = entityTypeContactInfo;
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

    public EntityTypeContactInfos withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("entityTypeContactInfo", entityTypeContactInfo).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(entityTypeContactInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EntityTypeContactInfos) == false) {
            return false;
        }
        EntityTypeContactInfos rhs = ((EntityTypeContactInfos) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(entityTypeContactInfo, rhs.entityTypeContactInfo).isEquals();
    }

}
