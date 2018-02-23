
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
    "ethnicity"
})
public class Ethnicities implements Serializable
{

    @JsonProperty("ethnicity")
    @Valid
    private List<Object> ethnicity = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1277933642392074542L;

    @JsonProperty("ethnicity")
    public List<Object> getEthnicity() {
        return ethnicity;
    }

    @JsonProperty("ethnicity")
    public void setEthnicity(List<Object> ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Ethnicities withEthnicity(List<Object> ethnicity) {
        this.ethnicity = ethnicity;
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

    public Ethnicities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ethnicity", ethnicity).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(ethnicity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ethnicities) == false) {
            return false;
        }
        Ethnicities rhs = ((Ethnicities) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(ethnicity, rhs.ethnicity).isEquals();
    }

}
