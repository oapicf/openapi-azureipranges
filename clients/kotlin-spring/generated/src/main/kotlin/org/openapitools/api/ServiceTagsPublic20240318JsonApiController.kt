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
@RequestMapping("\${api.base-path:/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63}")
class ServiceTagsPublic20240318JsonApiController() {

    @Operation(
        summary = "Get Azure IP Ranges and Service Tags - Public Cloud",
        operationId = "serviceTagsPublic20240318JsonGet",
        description = """Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.""",
        responses = [
            ApiResponse(responseCode = "200", description = "Successful response", content = [Content(schema = Schema(implementation = Change::class))]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/ServiceTags_Public_20240318.json"],
        produces = ["application/json"]
    )
    fun serviceTagsPublic20240318JsonGet(): ResponseEntity<Change> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
