@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ValueProperties(
    @field:JsonProperty("changeNumber")
    val changeNumber: kotlin.Int? = null,

    @field:JsonProperty("region")
    val region: kotlin.String? = null,

    @field:JsonProperty("regionId")
    val regionId: kotlin.Int? = null,

    @field:JsonProperty("platform")
    val platform: kotlin.String? = null,

    @field:JsonProperty("systemService")
    val systemService: kotlin.String? = null,

    @field:JsonProperty("addressPrefixes")
    val addressPrefixes: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("networkFeatures")
    val networkFeatures: kotlin.collections.List<kotlin.String>? = null,

)
