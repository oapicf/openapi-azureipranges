package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ValueProperties;

@Canonical
class Value {
    /* The name of the value. */
    String name
    /* The unique identifier of the value. */
    String id
    
    ValueProperties properties
}
