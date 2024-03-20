/*
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Value;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Change
 */
@JsonPropertyOrder({
  Change.JSON_PROPERTY_CHANGE_NUMBER,
  Change.JSON_PROPERTY_CLOUD,
  Change.JSON_PROPERTY_VALUES
})
@JsonTypeName("Change")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-03-20T11:52:28.116670704Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class Change {
    public static final String JSON_PROPERTY_CHANGE_NUMBER = "changeNumber";
    private Integer changeNumber;

    public static final String JSON_PROPERTY_CLOUD = "cloud";
    private String cloud;

    public static final String JSON_PROPERTY_VALUES = "values";
    private List<@Valid Value> values = null;

    public Change() {
    }

    public Change changeNumber(Integer changeNumber) {
        this.changeNumber = changeNumber;
        return this;
    }

    /**
     * The number associated with the change.
     * @return changeNumber
     **/
    @Nullable
    @Schema(name = "changeNumber", description = "The number associated with the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CHANGE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getChangeNumber() {
        return changeNumber;
    }

    @JsonProperty(JSON_PROPERTY_CHANGE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setChangeNumber(Integer changeNumber) {
        this.changeNumber = changeNumber;
    }

    public Change cloud(String cloud) {
        this.cloud = cloud;
        return this;
    }

    /**
     * The cloud environment.
     * @return cloud
     **/
    @Nullable
    @Schema(name = "cloud", description = "The cloud environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_CLOUD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCloud() {
        return cloud;
    }

    @JsonProperty(JSON_PROPERTY_CLOUD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public Change values(List<@Valid Value> values) {
        this.values = values;
        return this;
    }

    public Change addValuesItem(Value valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     * @return values
     **/
    @Nullable
    @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid Value> getValues() {
        return values;
    }

    @JsonProperty(JSON_PROPERTY_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValues(List<@Valid Value> values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Change change = (Change) o;
        return Objects.equals(this.changeNumber, change.changeNumber) &&
            Objects.equals(this.cloud, change.cloud) &&
            Objects.equals(this.values, change.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(changeNumber, cloud, values);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Change {\n");
        sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
        sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

