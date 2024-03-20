package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class ValueProperties {
    /* The number associated with the change. */
    Integer changeNumber
    /* The region associated with the value. */
    String region
    /* The ID of the region. */
    Integer regionId
    /* The platform associated with the value. */
    String platform
    /* The system service associated with the value. */
    String systemService
    /* The address prefixes associated with the value. */
    List<String> addressPrefixes
    /* The network features associated with the value. */
    List<String> networkFeatures
}
