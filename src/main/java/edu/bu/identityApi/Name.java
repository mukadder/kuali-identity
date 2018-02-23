
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
    "nameType",
    "namePrefix",
    "nameTitle",
    "firstName",
    "middleName",
    "lastName",
    "nameSuffix",
    "compositeName",
    "namePrefixUnmasked",
    "nameTitleUnmasked",
    "firstNameUnmasked",
    "middleNameUnmasked",
    "lastNameUnmasked",
    "nameSuffixUnmasked",
    "compositeNameUnmasked",
    "noteMessage",
    "nameChangedDate",
    "suppressName",
    "defaultValue",
    "active",
    "versionNumber",
    "objectId",
    "any"
})
public class Name implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("nameType")
    @Valid
    private NameType nameType;
    @JsonProperty("namePrefix")
    private Object namePrefix;
    @JsonProperty("nameTitle")
    private Object nameTitle;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("middleName")
    private Object middleName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("nameSuffix")
    private Object nameSuffix;
    @JsonProperty("compositeName")
    private String compositeName;
    @JsonProperty("namePrefixUnmasked")
    private Object namePrefixUnmasked;
    @JsonProperty("nameTitleUnmasked")
    private Object nameTitleUnmasked;
    @JsonProperty("firstNameUnmasked")
    private String firstNameUnmasked;
    @JsonProperty("middleNameUnmasked")
    private Object middleNameUnmasked;
    @JsonProperty("lastNameUnmasked")
    private String lastNameUnmasked;
    @JsonProperty("nameSuffixUnmasked")
    private Object nameSuffixUnmasked;
    @JsonProperty("compositeNameUnmasked")
    private String compositeNameUnmasked;
    @JsonProperty("noteMessage")
    private Object noteMessage;
    @JsonProperty("nameChangedDate")
    private Object nameChangedDate;
    @JsonProperty("suppressName")
    private boolean suppressName;
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
    private final static long serialVersionUID = -563048036885272566L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Name withId(String id) {
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

    public Name withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("nameType")
    public NameType getNameType() {
        return nameType;
    }

    @JsonProperty("nameType")
    public void setNameType(NameType nameType) {
        this.nameType = nameType;
    }

    public Name withNameType(NameType nameType) {
        this.nameType = nameType;
        return this;
    }

    @JsonProperty("namePrefix")
    public Object getNamePrefix() {
        return namePrefix;
    }

    @JsonProperty("namePrefix")
    public void setNamePrefix(Object namePrefix) {
        this.namePrefix = namePrefix;
    }

    public Name withNamePrefix(Object namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    @JsonProperty("nameTitle")
    public Object getNameTitle() {
        return nameTitle;
    }

    @JsonProperty("nameTitle")
    public void setNameTitle(Object nameTitle) {
        this.nameTitle = nameTitle;
    }

    public Name withNameTitle(Object nameTitle) {
        this.nameTitle = nameTitle;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Name withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("middleName")
    public Object getMiddleName() {
        return middleName;
    }

    @JsonProperty("middleName")
    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public Name withMiddleName(Object middleName) {
        this.middleName = middleName;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Name withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("nameSuffix")
    public Object getNameSuffix() {
        return nameSuffix;
    }

    @JsonProperty("nameSuffix")
    public void setNameSuffix(Object nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public Name withNameSuffix(Object nameSuffix) {
        this.nameSuffix = nameSuffix;
        return this;
    }

    @JsonProperty("compositeName")
    public String getCompositeName() {
        return compositeName;
    }

    @JsonProperty("compositeName")
    public void setCompositeName(String compositeName) {
        this.compositeName = compositeName;
    }

    public Name withCompositeName(String compositeName) {
        this.compositeName = compositeName;
        return this;
    }

    @JsonProperty("namePrefixUnmasked")
    public Object getNamePrefixUnmasked() {
        return namePrefixUnmasked;
    }

    @JsonProperty("namePrefixUnmasked")
    public void setNamePrefixUnmasked(Object namePrefixUnmasked) {
        this.namePrefixUnmasked = namePrefixUnmasked;
    }

    public Name withNamePrefixUnmasked(Object namePrefixUnmasked) {
        this.namePrefixUnmasked = namePrefixUnmasked;
        return this;
    }

    @JsonProperty("nameTitleUnmasked")
    public Object getNameTitleUnmasked() {
        return nameTitleUnmasked;
    }

    @JsonProperty("nameTitleUnmasked")
    public void setNameTitleUnmasked(Object nameTitleUnmasked) {
        this.nameTitleUnmasked = nameTitleUnmasked;
    }

    public Name withNameTitleUnmasked(Object nameTitleUnmasked) {
        this.nameTitleUnmasked = nameTitleUnmasked;
        return this;
    }

    @JsonProperty("firstNameUnmasked")
    public String getFirstNameUnmasked() {
        return firstNameUnmasked;
    }

    @JsonProperty("firstNameUnmasked")
    public void setFirstNameUnmasked(String firstNameUnmasked) {
        this.firstNameUnmasked = firstNameUnmasked;
    }

    public Name withFirstNameUnmasked(String firstNameUnmasked) {
        this.firstNameUnmasked = firstNameUnmasked;
        return this;
    }

    @JsonProperty("middleNameUnmasked")
    public Object getMiddleNameUnmasked() {
        return middleNameUnmasked;
    }

    @JsonProperty("middleNameUnmasked")
    public void setMiddleNameUnmasked(Object middleNameUnmasked) {
        this.middleNameUnmasked = middleNameUnmasked;
    }

    public Name withMiddleNameUnmasked(Object middleNameUnmasked) {
        this.middleNameUnmasked = middleNameUnmasked;
        return this;
    }

    @JsonProperty("lastNameUnmasked")
    public String getLastNameUnmasked() {
        return lastNameUnmasked;
    }

    @JsonProperty("lastNameUnmasked")
    public void setLastNameUnmasked(String lastNameUnmasked) {
        this.lastNameUnmasked = lastNameUnmasked;
    }

    public Name withLastNameUnmasked(String lastNameUnmasked) {
        this.lastNameUnmasked = lastNameUnmasked;
        return this;
    }

    @JsonProperty("nameSuffixUnmasked")
    public Object getNameSuffixUnmasked() {
        return nameSuffixUnmasked;
    }

    @JsonProperty("nameSuffixUnmasked")
    public void setNameSuffixUnmasked(Object nameSuffixUnmasked) {
        this.nameSuffixUnmasked = nameSuffixUnmasked;
    }

    public Name withNameSuffixUnmasked(Object nameSuffixUnmasked) {
        this.nameSuffixUnmasked = nameSuffixUnmasked;
        return this;
    }

    @JsonProperty("compositeNameUnmasked")
    public String getCompositeNameUnmasked() {
        return compositeNameUnmasked;
    }

    @JsonProperty("compositeNameUnmasked")
    public void setCompositeNameUnmasked(String compositeNameUnmasked) {
        this.compositeNameUnmasked = compositeNameUnmasked;
    }

    public Name withCompositeNameUnmasked(String compositeNameUnmasked) {
        this.compositeNameUnmasked = compositeNameUnmasked;
        return this;
    }

    @JsonProperty("noteMessage")
    public Object getNoteMessage() {
        return noteMessage;
    }

    @JsonProperty("noteMessage")
    public void setNoteMessage(Object noteMessage) {
        this.noteMessage = noteMessage;
    }

    public Name withNoteMessage(Object noteMessage) {
        this.noteMessage = noteMessage;
        return this;
    }

    @JsonProperty("nameChangedDate")
    public Object getNameChangedDate() {
        return nameChangedDate;
    }

    @JsonProperty("nameChangedDate")
    public void setNameChangedDate(Object nameChangedDate) {
        this.nameChangedDate = nameChangedDate;
    }

    public Name withNameChangedDate(Object nameChangedDate) {
        this.nameChangedDate = nameChangedDate;
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

    public Name withSuppressName(boolean suppressName) {
        this.suppressName = suppressName;
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

    public Name withDefaultValue(boolean defaultValue) {
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

    public Name withActive(boolean active) {
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

    public Name withVersionNumber(int versionNumber) {
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

    public Name withObjectId(String objectId) {
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

    public Name withAny(List<Object> any) {
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

    public Name withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("entityId", entityId).append("nameType", nameType).append("namePrefix", namePrefix).append("nameTitle", nameTitle).append("firstName", firstName).append("middleName", middleName).append("lastName", lastName).append("nameSuffix", nameSuffix).append("compositeName", compositeName).append("namePrefixUnmasked", namePrefixUnmasked).append("nameTitleUnmasked", nameTitleUnmasked).append("firstNameUnmasked", firstNameUnmasked).append("middleNameUnmasked", middleNameUnmasked).append("lastNameUnmasked", lastNameUnmasked).append("nameSuffixUnmasked", nameSuffixUnmasked).append("compositeNameUnmasked", compositeNameUnmasked).append("noteMessage", noteMessage).append("nameChangedDate", nameChangedDate).append("suppressName", suppressName).append("defaultValue", defaultValue).append("active", active).append("versionNumber", versionNumber).append("objectId", objectId).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(nameSuffix).append(nameTitle).append(entityId).append(nameType).append(id).append(suppressName).append(objectId).append(any).append(nameChangedDate).append(namePrefixUnmasked).append(compositeNameUnmasked).append(defaultValue).append(firstName).append(namePrefix).append(nameTitleUnmasked).append(middleName).append(lastName).append(compositeName).append(lastNameUnmasked).append(noteMessage).append(additionalProperties).append(middleNameUnmasked).append(nameSuffixUnmasked).append(active).append(firstNameUnmasked).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Name) == false) {
            return false;
        }
        Name rhs = ((Name) other);
        return new EqualsBuilder().append(nameSuffix, rhs.nameSuffix).append(nameTitle, rhs.nameTitle).append(entityId, rhs.entityId).append(nameType, rhs.nameType).append(id, rhs.id).append(suppressName, rhs.suppressName).append(objectId, rhs.objectId).append(any, rhs.any).append(nameChangedDate, rhs.nameChangedDate).append(namePrefixUnmasked, rhs.namePrefixUnmasked).append(compositeNameUnmasked, rhs.compositeNameUnmasked).append(defaultValue, rhs.defaultValue).append(firstName, rhs.firstName).append(namePrefix, rhs.namePrefix).append(nameTitleUnmasked, rhs.nameTitleUnmasked).append(middleName, rhs.middleName).append(lastName, rhs.lastName).append(compositeName, rhs.compositeName).append(lastNameUnmasked, rhs.lastNameUnmasked).append(noteMessage, rhs.noteMessage).append(additionalProperties, rhs.additionalProperties).append(middleNameUnmasked, rhs.middleNameUnmasked).append(nameSuffixUnmasked, rhs.nameSuffixUnmasked).append(active, rhs.active).append(firstNameUnmasked, rhs.firstNameUnmasked).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
