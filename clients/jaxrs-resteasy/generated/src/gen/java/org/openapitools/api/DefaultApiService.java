package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;



import org.openapitools.model.Change;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T02:44:06.818860488Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public interface DefaultApiService {
      Response getAzureIpRangesServiceTagsPublicCloud(String version,SecurityContext securityContext)
      throws NotFoundException;


}
