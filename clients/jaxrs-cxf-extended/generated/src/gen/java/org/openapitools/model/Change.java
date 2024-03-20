package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Value;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Change  {
  
 /**
  * The number associated with the change.
  */
  @ApiModelProperty(value = "The number associated with the change.")
  private Integer changeNumber;

 /**
  * The cloud environment.
  */
  @ApiModelProperty(value = "The cloud environment.")
  private String cloud;

  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid Value> values;
 /**
  * The number associated with the change.
  * @return changeNumber
  */
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }

  /**
   * Sets the <code>changeNumber</code> property.
   */
 public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  /**
   * Sets the <code>changeNumber</code> property.
   */
  public Change changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

 /**
  * The cloud environment.
  * @return cloud
  */
  @JsonProperty("cloud")
  public String getCloud() {
    return cloud;
  }

  /**
   * Sets the <code>cloud</code> property.
   */
 public void setCloud(String cloud) {
    this.cloud = cloud;
  }

  /**
   * Sets the <code>cloud</code> property.
   */
  public Change cloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

 /**
  * Get values
  * @return values
  */
  @JsonProperty("values")
  public List<@Valid Value> getValues() {
    return values;
  }

  /**
   * Sets the <code>values</code> property.
   */
 public void setValues(List<@Valid Value> values) {
    this.values = values;
  }

  /**
   * Sets the <code>values</code> property.
   */
  public Change values(List<@Valid Value> values) {
    this.values = values;
    return this;
  }

  /**
   * Adds a new item to the <code>values</code> list.
   */
  public Change addValuesItem(Value valuesItem) {
    this.values.add(valuesItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

