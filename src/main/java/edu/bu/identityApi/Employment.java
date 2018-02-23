
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
    "employeeId",
    "employmentRecordId",
    "entityAffiliation",
    "employeeStatus",
    "employeeType",
    "primaryDepartmentCode",
    "baseSalaryAmount",
    "primary",
    "versionNumber",
    "objectId",
    "active",
    "any"
})
public class Employment implements Serializable
{

    @JsonProperty("id")
    private String id;
    @JsonProperty("entityId")
    private String entityId;
    @JsonProperty("employeeId")
    private String employeeId;
    @JsonProperty("employmentRecordId")
    private String employmentRecordId;
    @JsonProperty("entityAffiliation")
    @Valid
    private EntityAffiliation entityAffiliation;
    @JsonProperty("employeeStatus")
    @Valid
    private EmployeeStatus employeeStatus;
    @JsonProperty("employeeType")
    @Valid
    private EmployeeType employeeType;
    @JsonProperty("primaryDepartmentCode")
    private String primaryDepartmentCode;
    @JsonProperty("baseSalaryAmount")
    private String baseSalaryAmount;
    @JsonProperty("primary")
    private boolean primary;
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
    private final static long serialVersionUID = 6254832226025071996L;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Employment withId(String id) {
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

    public Employment withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    @JsonProperty("employeeId")
    public String getEmployeeId() {
        return employeeId;
    }

    @JsonProperty("employeeId")
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Employment withEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    @JsonProperty("employmentRecordId")
    public String getEmploymentRecordId() {
        return employmentRecordId;
    }

    @JsonProperty("employmentRecordId")
    public void setEmploymentRecordId(String employmentRecordId) {
        this.employmentRecordId = employmentRecordId;
    }

    public Employment withEmploymentRecordId(String employmentRecordId) {
        this.employmentRecordId = employmentRecordId;
        return this;
    }

    @JsonProperty("entityAffiliation")
    public EntityAffiliation getEntityAffiliation() {
        return entityAffiliation;
    }

    @JsonProperty("entityAffiliation")
    public void setEntityAffiliation(EntityAffiliation entityAffiliation) {
        this.entityAffiliation = entityAffiliation;
    }

    public Employment withEntityAffiliation(EntityAffiliation entityAffiliation) {
        this.entityAffiliation = entityAffiliation;
        return this;
    }

    @JsonProperty("employeeStatus")
    public EmployeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    @JsonProperty("employeeStatus")
    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public Employment withEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
        return this;
    }

    @JsonProperty("employeeType")
    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    @JsonProperty("employeeType")
    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Employment withEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
        return this;
    }

    @JsonProperty("primaryDepartmentCode")
    public String getPrimaryDepartmentCode() {
        return primaryDepartmentCode;
    }

    @JsonProperty("primaryDepartmentCode")
    public void setPrimaryDepartmentCode(String primaryDepartmentCode) {
        this.primaryDepartmentCode = primaryDepartmentCode;
    }

    public Employment withPrimaryDepartmentCode(String primaryDepartmentCode) {
        this.primaryDepartmentCode = primaryDepartmentCode;
        return this;
    }

    @JsonProperty("baseSalaryAmount")
    public String getBaseSalaryAmount() {
        return baseSalaryAmount;
    }

    @JsonProperty("baseSalaryAmount")
    public void setBaseSalaryAmount(String baseSalaryAmount) {
        this.baseSalaryAmount = baseSalaryAmount;
    }

    public Employment withBaseSalaryAmount(String baseSalaryAmount) {
        this.baseSalaryAmount = baseSalaryAmount;
        return this;
    }

    @JsonProperty("primary")
    public boolean isPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public Employment withPrimary(boolean primary) {
        this.primary = primary;
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

    public Employment withVersionNumber(int versionNumber) {
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

    public Employment withObjectId(String objectId) {
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

    public Employment withActive(boolean active) {
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

    public Employment withAny(List<Object> any) {
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

    public Employment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("entityId", entityId).append("employeeId", employeeId).append("employmentRecordId", employmentRecordId).append("entityAffiliation", entityAffiliation).append("employeeStatus", employeeStatus).append("employeeType", employeeType).append("primaryDepartmentCode", primaryDepartmentCode).append("baseSalaryAmount", baseSalaryAmount).append("primary", primary).append("versionNumber", versionNumber).append("objectId", objectId).append("active", active).append("any", any).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(employeeType).append(employeeId).append(baseSalaryAmount).append(primaryDepartmentCode).append(entityId).append(employeeStatus).append(entityAffiliation).append(id).append(employmentRecordId).append(additionalProperties).append(objectId).append(any).append(primary).append(active).append(versionNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Employment) == false) {
            return false;
        }
        Employment rhs = ((Employment) other);
        return new EqualsBuilder().append(employeeType, rhs.employeeType).append(employeeId, rhs.employeeId).append(baseSalaryAmount, rhs.baseSalaryAmount).append(primaryDepartmentCode, rhs.primaryDepartmentCode).append(entityId, rhs.entityId).append(employeeStatus, rhs.employeeStatus).append(entityAffiliation, rhs.entityAffiliation).append(id, rhs.id).append(employmentRecordId, rhs.employmentRecordId).append(additionalProperties, rhs.additionalProperties).append(objectId, rhs.objectId).append(any, rhs.any).append(primary, rhs.primary).append(active, rhs.active).append(versionNumber, rhs.versionNumber).isEquals();
    }

}
