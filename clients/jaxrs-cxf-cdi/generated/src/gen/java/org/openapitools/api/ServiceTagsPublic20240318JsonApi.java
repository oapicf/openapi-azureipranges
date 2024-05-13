package org.openapitools.api;

import org.openapitools.model.Change;
import org.openapitools.api.ServiceTagsPublic20240318JsonApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.PATCH;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@Path("/ServiceTags_Public_20240318.json")
@RequestScoped

@Api(description = "the ServiceTags_Public_20240318.json API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-05-13T08:49:29.273908529Z[Etc/UTC]", comments = "Generator version: 7.5.0")

public class ServiceTagsPublic20240318JsonApi  {

  @Context SecurityContext securityContext;

  @Inject ServiceTagsPublic20240318JsonApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get Azure IP Ranges and Service Tags - Public Cloud", notes = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.", response = Change.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Change.class) })
    public Response serviceTagsPublic20240318JsonGet() {
        return delegate.serviceTagsPublic20240318JsonGet(securityContext);
    }
}
