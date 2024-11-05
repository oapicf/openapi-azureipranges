package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ValueProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Value
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T00:04:24.419909408Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Value   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("id")
  private String id;

  @JsonProperty("properties")
  private ValueProperties properties;

  public Value name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the value.
   * @return name
   */
  @ApiModelProperty(value = "The name of the value.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Value id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the value.
   * @return id
   */
  @ApiModelProperty(value = "The unique identifier of the value.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Value properties(ValueProperties properties) {
    this.properties = properties;
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @ApiModelProperty(value = "")
  public ValueProperties getProperties() {
    return properties;
  }

  public void setProperties(ValueProperties properties) {
    this.properties = properties;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

