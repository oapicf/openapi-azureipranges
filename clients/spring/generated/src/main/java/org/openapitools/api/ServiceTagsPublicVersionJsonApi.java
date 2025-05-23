/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.12.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Change;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-10T03:07:07.444578948Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@Validated
@Tag(name = "ServiceTags_Public_{version}.json", description = "the ServiceTags_Public_{version}.json API")
public interface ServiceTagsPublicVersionJsonApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /ServiceTags_Public_{version}.json : Get Azure IP Ranges and Service Tags - Public Cloud
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     *
     * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (required)
     * @return Successful response (status code 200)
     */
    @Operation(
        operationId = "getAzureIpRangesServiceTagsPublicCloud",
        summary = "Get Azure IP Ranges and Service Tags - Public Cloud",
        description = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Change.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/ServiceTags_Public_{version}.json",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Change> getAzureIpRangesServiceTagsPublicCloud(
        @Parameter(name = "version", description = "The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506", required = true, in = ParameterIn.PATH) @PathVariable("version") String version
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"cloud\" : \"cloud\", \"values\" : [ { \"name\" : \"name\", \"id\" : \"id\", \"properties\" : { \"networkFeatures\" : [ \"networkFeatures\", \"networkFeatures\" ], \"systemService\" : \"systemService\", \"regionId\" : 1, \"addressPrefixes\" : [ \"addressPrefixes\", \"addressPrefixes\" ], \"changeNumber\" : 6, \"region\" : \"region\", \"platform\" : \"platform\" } }, { \"name\" : \"name\", \"id\" : \"id\", \"properties\" : { \"networkFeatures\" : [ \"networkFeatures\", \"networkFeatures\" ], \"systemService\" : \"systemService\", \"regionId\" : 1, \"addressPrefixes\" : [ \"addressPrefixes\", \"addressPrefixes\" ], \"changeNumber\" : 6, \"region\" : \"region\", \"platform\" : \"platform\" } } ], \"changeNumber\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
