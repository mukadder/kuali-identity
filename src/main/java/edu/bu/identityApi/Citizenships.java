
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
    "citizenship"
})
public class Citizenships implements Serializable
{

    @JsonProperty("citizenship")
    @Valid
    private List<Object> citizenship = null;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7591051039839763617L;

    @JsonProperty("citizenship")
    public List<Object> getCitizenship() {
        return citizenship;
    }

    @JsonProperty("citizenship")
    public void setCitizenship(List<Object> citizenship) {
        this.citizenship = citizenship;
    }

    public Citizenships withCitizenship(List<Object> citizenship) {
        this.citizenship = citizenship;
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

    public Citizenships withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("citizenship", citizenship).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(citizenship).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Citizenships) == false) {
            return false;
        }
        Citizenships rhs = ((Citizenships) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(citizenship, rhs.citizenship).isEquals();
    }

}
