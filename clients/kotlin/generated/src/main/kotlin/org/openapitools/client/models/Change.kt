/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.Value

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param changeNumber The number associated with the change.
 * @param cloud The cloud environment.
 * @param propertyValues 
 */


data class Change (

    /* The number associated with the change. */
    @Json(name = "changeNumber")
    val changeNumber: kotlin.Int? = null,

    /* The cloud environment. */
    @Json(name = "cloud")
    val cloud: kotlin.String? = null,

    @Json(name = "values")
    val propertyValues: kotlin.collections.List<Value>? = null

) {


}

