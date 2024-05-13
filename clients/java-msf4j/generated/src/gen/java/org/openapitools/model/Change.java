package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Value;

/**
 * Change
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-05-13T08:48:52.726892722Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class Change   {
  @JsonProperty("changeNumber")
  private Integer changeNumber;

  @JsonProperty("cloud")
  private String cloud;

  @JsonProperty("values")
  private List<@Valid Value> values = null;

  public Change changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

   /**
   * The number associated with the change.
   * @return changeNumber
  **/
  @ApiModelProperty(value = "The number associated with the change.")
  public Integer getChangeNumber() {
    return changeNumber;
  }

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
  @ApiModelProperty(value = "The cloud environment.")
  public String getCloud() {
    return cloud;
  }

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
  @ApiModelProperty(value = "")
  public List<@Valid Value> getValues() {
    return values;
  }

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

