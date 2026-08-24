package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ValueProperties(
    /** The number associated with the change. */
    val changeNumber: kotlin.Int? = null,
    /** The region associated with the value. */
    val region: kotlin.String? = null,
    /** The ID of the region. */
    val regionId: kotlin.Int? = null,
    /** The platform associated with the value. */
    val platform: kotlin.String? = null,
    /** The system service associated with the value. */
    val systemService: kotlin.String? = null,
    /** The address prefixes associated with the value. */
    val addressPrefixes: kotlin.collections.List<kotlin.String>? = null,
    /** The network features associated with the value. */
    val networkFeatures: kotlin.collections.List<kotlin.String>? = null
)
