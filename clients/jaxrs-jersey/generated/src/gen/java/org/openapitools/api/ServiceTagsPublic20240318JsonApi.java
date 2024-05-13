package org.openapitools.api;

import org.openapitools.api.ServiceTagsPublic20240318JsonApiService;
import org.openapitools.api.factories.ServiceTagsPublic20240318JsonApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Change;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataParam;
import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ServiceTags_Public_20240318.json")


@io.swagger.annotations.Api(description = "the ServiceTags_Public_20240318.json API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-05-13T08:49:33.218586014Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public class ServiceTagsPublic20240318JsonApi  {
   private final ServiceTagsPublic20240318JsonApiService delegate;

   public ServiceTagsPublic20240318JsonApi(@Context ServletConfig servletContext) {
      ServiceTagsPublic20240318JsonApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ServiceTagsPublic20240318JsonApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ServiceTagsPublic20240318JsonApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = ServiceTagsPublic20240318JsonApiServiceFactory.getServiceTagsPublic20240318JsonApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Azure IP Ranges and Service Tags - Public Cloud", notes = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.", response = Change.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Change.class)
    })
    public Response serviceTagsPublic20240318JsonGet(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.serviceTagsPublic20240318JsonGet(securityContext);
    }
}
