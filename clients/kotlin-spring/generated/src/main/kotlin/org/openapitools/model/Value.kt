package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ValueProperties
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
 * @param name The name of the value.
 * @param id The unique identifier of the value.
 * @param properties 
 */
data class Value(

    @Schema(example = "null", description = "The name of the value.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "The unique identifier of the value.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("properties") val properties: ValueProperties? = null
    ) {

}

