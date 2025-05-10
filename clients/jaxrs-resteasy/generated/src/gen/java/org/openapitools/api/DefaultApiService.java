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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2025-05-10T03:06:04.679817355Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public interface DefaultApiService {
      Response getAzureIpRangesServiceTagsPublicCloud(String version,SecurityContext securityContext)
      throws NotFoundException;
}
