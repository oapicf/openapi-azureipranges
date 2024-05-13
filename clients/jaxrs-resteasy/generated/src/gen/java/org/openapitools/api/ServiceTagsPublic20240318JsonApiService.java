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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-05-13T08:49:37.228585867Z[Etc/UTC]", comments = "Generator version: 7.5.0")
public interface ServiceTagsPublic20240318JsonApiService {
      Response serviceTagsPublic20240318JsonGet(SecurityContext securityContext)
      throws NotFoundException;
}
