package org.openapitools.server.model;

import org.openapitools.server.model.ValueProperties;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Value   {

    private String name;
    private String id;
    private ValueProperties properties;

    /**
     * Default constructor.
     */
    public Value() {
    // JSON-B / Jackson
    }

    /**
     * Create Value.
     *
     * @param name The name of the value.
     * @param id The unique identifier of the value.
     * @param properties properties
     */
    public Value(
        String name, 
        String id, 
        ValueProperties properties
    ) {
        this.name = name;
        this.id = id;
        this.properties = properties;
    }



    /**
     * The name of the value.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The unique identifier of the value.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get properties
     * @return properties
     */
    public ValueProperties getProperties() {
        return properties;
    }

    public void setProperties(ValueProperties properties) {
        this.properties = properties;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

