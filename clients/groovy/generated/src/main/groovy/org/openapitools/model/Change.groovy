package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.Value;

@Canonical
class Change {
    /* The number associated with the change. */
    Integer changeNumber
    /* The cloud environment. */
    String cloud
    
    List<Value> values
}
