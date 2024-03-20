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
@Path("/ServiceTags_Public_20240318.json")
@Api(description = "the ServiceTags_Public_20240318.json API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-20T11:53:24.156374857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ServiceTagsPublic20240318JsonApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Azure IP Ranges and Service Tags - Public Cloud", notes = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.", response = Change.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Change.class)
    })
    public Response serviceTagsPublic20240318JsonGet() {
        return Response.ok().entity("magic!").build();
    }
}
