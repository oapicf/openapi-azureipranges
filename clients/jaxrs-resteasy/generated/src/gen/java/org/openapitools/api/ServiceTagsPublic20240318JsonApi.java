package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ServiceTagsPublic20240318JsonApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Change;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ServiceTags_Public_20240318.json")


@io.swagger.annotations.Api(description = "the ServiceTags_Public_20240318.json API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-19T12:38:19.660560893Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ServiceTagsPublic20240318JsonApi  {

    @Inject ServiceTagsPublic20240318JsonApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Azure IP Ranges and Service Tags - Public Cloud", notes = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.", response = Change.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Change.class) })
    public Response serviceTagsPublic20240318JsonGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.serviceTagsPublic20240318JsonGet(securityContext);
    }
}
