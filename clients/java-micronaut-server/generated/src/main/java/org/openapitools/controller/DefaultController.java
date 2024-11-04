/*
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.controller;

import io.micronaut.http.annotation.*;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.core.convert.format.Format;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import reactor.core.publisher.Mono;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.exceptions.HttpStatusException;
import org.openapitools.model.Change;
import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-07-10T08:57:04.688280870Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Controller
@Tag(name = "Default", description = "The Default API")
public class DefaultController {
    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     *
     * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (required)
     * @return Change
     */
    @Operation(
        operationId = "getAzureIpRangesServiceTagsPublicCloud",
        summary = "Get Azure IP Ranges and Service Tags - Public Cloud",
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful response", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Change.class))
            })
        },
        parameters = {
            @Parameter(name = "version", description = "The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506", required = true)
        }
    )
    @Get(uri="/ServiceTags_Public_{version}.json")
    @Produces(value = {"application/json"})
    @Secured({SecurityRule.IS_ANONYMOUS})
    public Mono<Change> getAzureIpRangesServiceTagsPublicCloud(
        @PathVariable(value="version") @NotNull String version
    ) {
        // TODO implement getAzureIpRangesServiceTagsPublicCloud();
        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
