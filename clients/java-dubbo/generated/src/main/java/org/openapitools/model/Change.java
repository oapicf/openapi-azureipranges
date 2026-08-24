package org.openapitools.model;

import org.openapitools.model.Value;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class Change implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The number associated with the change.
   */
  @JsonProperty("changeNumber")
  private Integer changeNumber;

  /**
   * The cloud environment.
   */
  @JsonProperty("cloud")
  private String cloud;

  @JsonProperty("values")
  private List<Value> values = new ArrayList<>();

  /**
   * The number associated with the change.
   * @return changeNumber
   */
  public Integer getChangeNumber() {
    return changeNumber;
  }

  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  /**
   * The cloud environment.
   * @return cloud
   */
  public String getCloud() {
    return cloud;
  }

  public void setCloud(String cloud) {
    this.cloud = cloud;
  }

  /**
   * 
   * @return values
   */
  public List<Value> getValues() {
    return values;
  }

  public void setValues(List<Value> values) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
