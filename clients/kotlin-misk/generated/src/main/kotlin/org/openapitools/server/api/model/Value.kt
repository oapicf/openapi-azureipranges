package org.openapitools.server.api.model

import org.openapitools.server.api.model.ValueProperties
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Value(
    /** The name of the value. */
    val name: kotlin.String? = null,
    /** The unique identifier of the value. */
    val id: kotlin.String? = null,
    val properties: ValueProperties? = null
)
