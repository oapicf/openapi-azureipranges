package org.openapitools.model;

import org.openapitools.model.ValueProperties;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Value  {
  
  @ApiModelProperty(value = "The name of the value.")
 /**
   * The name of the value.
  **/
  private String name;

  @ApiModelProperty(value = "The unique identifier of the value.")
 /**
   * The unique identifier of the value.
  **/
  private String id;

  @ApiModelProperty(value = "")
  private ValueProperties properties;
 /**
   * The name of the value.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Value name(String name) {
    this.name = name;
    return this;
  }

 /**
   * The unique identifier of the value.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Value id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get properties
   * @return properties
  **/
  @JsonProperty("properties")
  public ValueProperties getProperties() {
    return properties;
  }

  public void setProperties(ValueProperties properties) {
    this.properties = properties;
  }

  public Value properties(ValueProperties properties) {
    this.properties = properties;
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
    Value value = (Value) o;
    return Objects.equals(this.name, value.name) &&
        Objects.equals(this.id, value.id) &&
        Objects.equals(this.properties, value.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Value {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

