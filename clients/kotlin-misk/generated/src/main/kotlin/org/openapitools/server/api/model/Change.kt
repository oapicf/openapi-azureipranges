package org.openapitools.server.api.model

import org.openapitools.server.api.model.Value
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Change(
    /** The number associated with the change. */
    val changeNumber: kotlin.Int? = null,
    /** The cloud environment. */
    val cloud: kotlin.String? = null,
    val propertyValues: kotlin.collections.List<Value>? = null
)
