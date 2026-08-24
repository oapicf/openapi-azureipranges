package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param changeNumber The number associated with the change.
 * @param region The region associated with the value.
 * @param regionId The ID of the region.
 * @param platform The platform associated with the value.
 * @param systemService The system service associated with the value.
 * @param addressPrefixes The address prefixes associated with the value.
 * @param networkFeatures The network features associated with the value.
 */
data class ValueProperties(

    @Schema(description = "The number associated with the change.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("changeNumber")
    @get:JsonProperty("changeNumber") val changeNumber: kotlin.Int? = null,

    @Schema(description = "The region associated with the value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("region")
    @get:JsonProperty("region") val region: kotlin.String? = null,

    @Schema(description = "The ID of the region.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("regionId")
    @get:JsonProperty("regionId") val regionId: kotlin.Int? = null,

    @Schema(description = "The platform associated with the value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("platform")
    @get:JsonProperty("platform") val platform: kotlin.String? = null,

    @Schema(description = "The system service associated with the value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("systemService")
    @get:JsonProperty("systemService") val systemService: kotlin.String? = null,

    @Schema(description = "The address prefixes associated with the value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addressPrefixes")
    @get:JsonProperty("addressPrefixes") val addressPrefixes: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "The network features associated with the value.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("networkFeatures")
    @get:JsonProperty("networkFeatures") val networkFeatures: kotlin.collections.List<kotlin.String>? = null
) {

}

