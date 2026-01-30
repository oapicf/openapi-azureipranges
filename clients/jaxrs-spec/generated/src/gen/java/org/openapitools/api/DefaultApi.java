package org.openapitools.api;

import org.openapitools.model.Change;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
* Represents a collection of functions to interact with the API endpoints.
*/
@Path("/ServiceTags_Public_{version}.json")
@Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-30T14:41:13.211916369Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class DefaultApi {

    @GET
    @Produces({ "application/json", "application/octet-stream" })
    @ApiOperation(value = "Get Azure IP Ranges and Service Tags - Public Cloud", notes = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.", response = Change.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Change.class)
    })
    public Response getAzureIpRangesServiceTagsPublicCloud(@PathParam("version") @ApiParam("The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506") String version) {
        return Response.ok().entity("magic!").build();
    }
}
