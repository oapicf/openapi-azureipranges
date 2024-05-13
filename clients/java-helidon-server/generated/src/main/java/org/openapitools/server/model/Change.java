package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.Value;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Change   {

    private Integer changeNumber;
    private String cloud;
    private List<@Valid Value> values = new ArrayList<>();

    /**
     * Default constructor.
     */
    public Change() {
    // JSON-B / Jackson
    }

    /**
     * Create Change.
     *
     * @param changeNumber The number associated with the change.
     * @param cloud The cloud environment.
     * @param values values
     */
    public Change(
        Integer changeNumber, 
        String cloud, 
        List<@Valid Value> values
    ) {
        this.changeNumber = changeNumber;
        this.cloud = cloud;
        this.values = values;
    }



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
     * Get values
     * @return values
     */
    public List<@Valid Value> getValues() {
        return values;
    }

    public void setValues(List<@Valid Value> values) {
        this.values = values;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

