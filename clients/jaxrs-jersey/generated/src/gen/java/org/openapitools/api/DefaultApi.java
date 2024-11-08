package org.openapitools.api;

import org.openapitools.api.DefaultApiService;
import org.openapitools.api.factories.DefaultApiServiceFactory;

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

@Path("/ServiceTags_Public_{version}.json")


@io.swagger.annotations.Api(description = "the default API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-08T22:30:34.272088212Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DefaultApi  {
   private final DefaultApiService delegate;

   public DefaultApi(@Context ServletConfig servletContext) {
      DefaultApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DefaultApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DefaultApiService) Class.forName(implClass).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }

      if (delegate == null) {
         delegate = DefaultApiServiceFactory.getDefaultApi();
      }

      this.delegate = delegate;
   }

    @javax.ws.rs.GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Azure IP Ranges and Service Tags - Public Cloud", notes = "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.", response = Change.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successful response", response = Change.class)
    })
    public Response getAzureIpRangesServiceTagsPublicCloud(@ApiParam(value = "The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506", required = true) @PathParam("version") @NotNull  String version,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAzureIpRangesServiceTagsPublicCloud(version, securityContext);
    }
}
