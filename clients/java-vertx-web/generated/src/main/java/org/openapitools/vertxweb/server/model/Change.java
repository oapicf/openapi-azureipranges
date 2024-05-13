package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.Value;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Change   {
  
  private Integer changeNumber;
  private String cloud;
  private List<Value> values = new ArrayList<>();

  public Change () {

  }

  public Change (Integer changeNumber, String cloud, List<Value> values) {
    this.changeNumber = changeNumber;
    this.cloud = cloud;
    this.values = values;
  }

    
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

    
  @JsonProperty("cloud")
  public String getCloud() {
    return cloud;
  }
  public void setCloud(String cloud) {
    this.cloud = cloud;
  }

    
  @JsonProperty("values")
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
    return Objects.equals(changeNumber, change.changeNumber) &&
        Objects.equals(cloud, change.cloud) &&
        Objects.equals(values, change.values);
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
