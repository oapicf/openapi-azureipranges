package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.Value
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
 * @param cloud The cloud environment.
 * @param propertyValues 
 */
data class Change(

    @Schema(description = "The number associated with the change.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("changeNumber")
    @get:JsonProperty("changeNumber") val changeNumber: kotlin.Int? = null,

    @Schema(description = "The cloud environment.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cloud")
    @get:JsonProperty("cloud") val cloud: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("values")
    @get:JsonProperty("values") val propertyValues: kotlin.collections.List<Value>? = null
) {

}

