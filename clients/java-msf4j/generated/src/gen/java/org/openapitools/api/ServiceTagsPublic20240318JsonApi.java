package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ServiceTagsPublic20240318JsonApiService;
import org.openapitools.api.factories.ServiceTagsPublic20240318JsonApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Change;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/ServiceTags_Public_20240318.json")


@io.swagger.annotations.Api(description = "the ServiceTags_Public_20240318.json API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-05-13T08:48:52.726892722Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class ServiceTagsPublic20240318JsonApi  {
   private final ServiceTagsPublic20240318JsonApiService delegate = ServiceTagsPublic20240318JsonApiServiceFactory.getServiceTagsPublic20240318JsonApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Azure IP Ranges and Service Tags - Public Cloud", notes = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.", response = Change.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Change.class) })
    public Response serviceTagsPublic20240318JsonGet()
    throws NotFoundException {
        return delegate.serviceTagsPublic20240318JsonGet();
    }
}
