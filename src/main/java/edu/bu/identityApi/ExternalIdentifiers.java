
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
    "externalIdentifier"
})
public class ExternalIdentifiers implements Serializable
{

    @JsonProperty("externalIdentifier")
    @Valid
    private List<Object> externalIdentifier = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4317028337544013536L;

    @JsonProperty("externalIdentifier")
    public List<Object> getExternalIdentifier() {
        return externalIdentifier;
    }

    @JsonProperty("externalIdentifier")
    public void setExternalIdentifier(List<Object> externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
    }

    public ExternalIdentifiers withExternalIdentifier(List<Object> externalIdentifier) {
        this.externalIdentifier = externalIdentifier;
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

    public ExternalIdentifiers withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("externalIdentifier", externalIdentifier).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(externalIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExternalIdentifiers) == false) {
            return false;
        }
        ExternalIdentifiers rhs = ((ExternalIdentifiers) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(externalIdentifier, rhs.externalIdentifier).isEquals();
    }

}
