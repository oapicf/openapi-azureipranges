package org.openapitools.api

import org.openapitools.model.Change
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired
import org.openapitools.api.ServiceTagsPublic{version}JsonApiController.Companion.BASE_PATH

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${openapi.azureIPRangesAndServiceTagsPublicCloud.base-path:\${api.base-path:$BASE_PATH}}")
class ServiceTagsPublic{version}JsonApiController() {

    @Operation(
        summary = "Get Azure IP Ranges and Service Tags - Public Cloud",
        operationId = "getAzureIpRangesServiceTagsPublicCloud",
        description = """Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful response", content = [Content(schema = Schema(implementation = Change::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = [PATH_GET_AZURE_IP_RANGES_SERVICE_TAGS_PUBLIC_CLOUD /* "/ServiceTags_Public_{version}.json" */],
        produces = ["application/octet-stream"]
    )
    fun getAzureIpRangesServiceTagsPublicCloud(
        @Parameter(description = "The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506", required = true) @PathVariable("version") version: kotlin.String
    ): ResponseEntity<Change> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    companion object {
        //for your own safety never directly reuse these path definitions in tests
        const val BASE_PATH: String = "/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63"
        const val PATH_GET_AZURE_IP_RANGES_SERVICE_TAGS_PUBLIC_CLOUD: String = "/ServiceTags_Public_{version}.json"
    }
}
