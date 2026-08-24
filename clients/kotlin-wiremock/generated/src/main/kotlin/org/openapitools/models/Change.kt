@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Change(
    @field:JsonProperty("changeNumber")
    val changeNumber: kotlin.Int? = null,

    @field:JsonProperty("cloud")
    val cloud: kotlin.String? = null,

    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<Value>? = null,

)
