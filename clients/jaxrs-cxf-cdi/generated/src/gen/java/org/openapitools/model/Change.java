package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Value;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class Change   {
  
  private Integer changeNumber;

  private String cloud;

  private List<@Valid Value> values = new ArrayList<>();

  /**
   * The number associated with the change.
   **/
  public Change changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

  
  @ApiModelProperty(value = "The number associated with the change.")
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }


  /**
   * The cloud environment.
   **/
  public Change cloud(String cloud) {
    this.cloud = cloud;
    return this;
  }

  
  @ApiModelProperty(value = "The cloud environment.")
  @JsonProperty("cloud")
  public String getCloud() {
    return cloud;
  }
  public void setCloud(String cloud) {
    this.cloud = cloud;
  }


  /**
   **/
  public Change values(List<@Valid Value> values) {
    this.values = values;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("values")
  public List<@Valid Value> getValues() {
    return values;
  }
  public void setValues(List<@Valid Value> values) {
    this.values = values;
  }

  public Change addValuesItem(Value valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

