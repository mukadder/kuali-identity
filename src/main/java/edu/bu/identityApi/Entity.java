
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
    "principals",
    "entityTypeContactInfos",
    "externalIdentifiers",
    "affiliations",
    "names",
    "employmentInformation",
    "privacyPreferences",
    "bioDemographics",
    "citizenships",
    "primaryEmployment",
    "defaultAffiliation",
    "defaultName",
    "ethnicities",
    "residencies",
    "visas",
    "versionNumber",
    "objectId",
    "active",
    "any"
})
public class Entity implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("principals")
    @Valid
    private Principals principals;
    @JsonProperty("entityTypeContactInfos")
    @Valid
    private EntityTypeContactInfos entityTypeContactInfos;
    @JsonProperty("externalIdentifiers")
    @Valid
    private ExternalIdentifiers externalIdentifiers;
    @JsonProperty("affiliations")
    @Valid
    private Affiliations affiliations;
    @JsonProperty("names")
    @Valid
    private Names names;
    @JsonProperty("employmentInformation")
    @Valid
    private EmploymentInformation employmentInformation;
    @JsonProperty("privacyPreferences")
    @Valid
    private PrivacyPreferences privacyPreferences;
    @JsonProperty("bioDemographics")
    private Object bioDemographics;
    @JsonProperty("citizenships")
    @Valid
    private Citizenships citizenships;
    @JsonProperty("primaryEmployment")
    @Valid
    private PrimaryEmployment primaryEmployment;
    @JsonProperty("defaultAffiliation")
    @Valid
    private DefaultAffiliation defaultAffiliation;
    @JsonProperty("defaultName")
    @Valid
    private DefaultName defaultName;
    @JsonProperty("ethnicities")
    @Valid
    private Ethnicities ethnicities;
    @JsonProperty("residencies")
    @Valid
    private Residencies residencies;
    @JsonProperty("visas")
    @Valid
    private Visas visas;
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
    private final static long serialVersionUID = -4782925332448337540L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Entity withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("principals")
    public Principals getPrincipals() {
        return principals;
    }

    @JsonProperty("principals")
    public void setPrincipals(Principals principals) {
        this.principals = principals;
    }

    public Entity withPrincipals(Principals principals) {
        this.principals = principals;
        return this;
    }

    @JsonProperty("entityTypeContactInfos")
    public EntityTypeContactInfos getEntityTypeContactInfos() {
        return entityTypeContactInfos;
    }

    @JsonProperty("entityTypeContactInfos")
    public void setEntityTypeContactInfos(EntityTypeContactInfos entityTypeContactInfos) {
        this.entityTypeContactInfos = entityTypeContactInfos;
    }

    public Entity withEntityTypeContactInfos(EntityTypeContactInfos entityTypeContactInfos) {
        this.entityTypeContactInfos = entityTypeContactInfos;
        return this;
    }

    @JsonProperty("externalIdentifiers")
    public ExternalIdentifiers getExternalIdentifiers() {
        return externalIdentifiers;
    }

    @JsonProperty("externalIdentifiers")
    public void setExternalIdentifiers(ExternalIdentifiers externalIdentifiers) {
        this.externalIdentifiers = externalIdentifiers;
    }

    public Entity withExternalIdentifiers(ExternalIdentifiers externalIdentifiers) {
        this.externalIdentifiers = externalIdentifiers;
        return this;
    }

    @JsonProperty("affiliations")
    public Affiliations getAffiliations() {
        return affiliations;
    }

    @JsonProperty("affiliations")
    public void setAffiliations(Affiliations affiliations) {
        this.affiliations = affiliations;
    }

    public Entity withAffiliations(Affiliations affiliations) {
        this.affiliations = affiliations;
        return this;
    }

    @JsonProperty("names")
    public Names getNames() {
        return names;
    }

    @JsonProperty("names")
    public void setNames(Names names) {
        this.names = names;
    }

    public Entity withNames(Names names) {
        this.names = names;
        return this;
    }

    @JsonProperty("employmentInformation")
    public EmploymentInformation getEmploymentInformation() {
        return employmentInformation;
    }

    @JsonProperty("employmentInformation")
    public void setEmploymentInformation(EmploymentInformation employmentInformation) {
        this.employmentInformation = employmentInformation;
    }

    public Entity withEmploymentInformation(EmploymentInformation employmentInformation) {
        this.employmentInformation = employmentInformation;
        return this;
    }

    @JsonProperty("privacyPreferences")
    public PrivacyPreferences getPrivacyPreferences() {
        return privacyPreferences;
    }

    @JsonProperty("privacyPreferences")
    public void setPrivacyPreferences(PrivacyPreferences privacyPreferences) {
        this.privacyPreferences = privacyPreferences;
    }

    public Entity withPrivacyPreferences(PrivacyPreferences privacyPreferences) {
        this.privacyPreferences = privacyPreferences;
        return this;
    }

    @JsonProperty("bioDemographics")
    public Object getBioDemographics() {
        return bioDemographics;
    }

    @JsonProperty("bioDemographics")
    public void setBioDemographics(Object bioDemographics) {
        this.bioDemographics = bioDemographics;
    }

    public Entity withBioDemographics(Object bioDemographics) {
        this.bioDemographics = bioDemographics;
        return this;
    }

    @JsonProperty("citizenships")
    public Citizenships getCitizenships() {
        return citizenships;
    }

    @JsonProperty("citizenships")
    public void setCitizenships(Citizenships citizenships) {
        this.citizenships = citizenships;
    }

    public Entity withCitizenships(Citizenships citizenships) {
        this.citizenships = citizenships;
        return this;
    }

    @JsonProperty("primaryEmployment")
    public PrimaryEmployment getPrimaryEmployment() {
        return primaryEmployment;
    }

    @JsonProperty("primaryEmployment")
    public void setPrimaryEmployment(PrimaryEmployment primaryEmployment) {
        this.primaryEmployment = primaryEmployment;
    }

    public Entity withPrimaryEmployment(PrimaryEmployment primaryEmployment) {
        this.primaryEmployment = primaryEmployment;
        return this;
    }

    @JsonProperty("defaultAffiliation")
    public DefaultAffiliation getDefaultAffiliation() {
        return defaultAffiliation;
    }

    @JsonProperty("defaultAffiliation")
    public void setDefaultAffiliation(DefaultAffiliation defaultAffiliation) {
        this.defaultAffiliation = defaultAffiliation;
    }

    public Entity withDefaultAffiliation(DefaultAffiliation defaultAffiliation) {
        this.defaultAffiliation = defaultAffiliation;
        return this;
    }

    @JsonProperty("defaultName")
    public DefaultName getDefaultName() {
        return defaultName;
    }

    @JsonProperty("defaultName")
    public void setDefaultName(DefaultName defaultName) {
        this.defaultName = defaultName;
    }

    public Entity withDefaultName(DefaultName defaultName) {
        this.defaultName = defaultName;
        return this;
    }

    @JsonProperty("ethnicities")
    public Ethnicities getEthnicities() {
        return ethnicities;
    }

    @JsonProperty("ethnicities")
    public void setEthnicities(Ethnicities ethnicities) {
        this.ethnicities = ethnicities;
    }

    public Entity withEthnicities(Ethnicities ethnicities) {
        this.ethnicities = ethnicities;
        return this;
    }

    @JsonProperty("residencies")
    public Residencies getResidencies() {
        return residencies;
    }

    @JsonProperty("residencies")
    public void setResidencies(Residencies residencies) {
        this.residencies = residencies;
    }

    public Entity withResidencies(Residencies residencies) {
        this.residencies = residencies;
        return this;
    }

    @JsonProperty("visas")
    public Visas getVisas() {
        return visas;
    }

    @JsonProperty("visas")
    public void setVisas(Visas visas) {
        this.visas = visas;
    }

    public Entity withVisas(Visas visas) {
        this.visas = visas;
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

    public Entity withVersionNumber(int versionNumber) {
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

    public Entity withObjectId(String objectId) {
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

    public Entity withActive(boolean active) {
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

    public Entity withAny(List<Object> any) {
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

    public Entity withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("principals", principals).append("entityTypeContactInfos", entityTypeContactInfos).append("externalIdentifiers", externalIdentifiers).append("affiliations", affiliations).append("names", names).append("employmentInformation", employmentInformation).append("privacyPreferences", privacyPreferences).append("bioDemographics", bioDemographics).append("citizenships", citizenships).append("primaryEmployment", primaryEmployment).append("defaultAffiliation", defaultAffiliation).append("defaultName", defaultName).append("ethnicities", ethnicities).append("residencies", residencies).append("visas", visas).append("versionNumber", versionNumber).append("objectId", objectId).append("active", active).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(visas).append(defaultName).append(affiliations).append(ethnicities).append(entityTypeContactInfos).append(externalIdentifiers).append(defaultAffiliation).append(principals).append(citizenships).append(privacyPreferences).append(residencies).append(id).append(employmentInformation).append(bioDemographics).append(primaryEmployment).append(additionalProperties).append(objectId).append(names).append(any).append(active).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entity) == false) {
            return false;
        }
        Entity rhs = ((Entity) other);
        return new EqualsBuilder().append(visas, rhs.visas).append(defaultName, rhs.defaultName).append(affiliations, rhs.affiliations).append(ethnicities, rhs.ethnicities).append(entityTypeContactInfos, rhs.entityTypeContactInfos).append(externalIdentifiers, rhs.externalIdentifiers).append(defaultAffiliation, rhs.defaultAffiliation).append(principals, rhs.principals).append(citizenships, rhs.citizenships).append(privacyPreferences, rhs.privacyPreferences).append(residencies, rhs.residencies).append(id, rhs.id).append(employmentInformation, rhs.employmentInformation).append(bioDemographics, rhs.bioDemographics).append(primaryEmployment, rhs.primaryEmployment).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(names, rhs.names).append(any, rhs.any).append(active, rhs.active).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
