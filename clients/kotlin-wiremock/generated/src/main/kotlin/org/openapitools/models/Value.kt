@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Value(
    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("properties")
    val properties: ValueProperties? = null,

)
