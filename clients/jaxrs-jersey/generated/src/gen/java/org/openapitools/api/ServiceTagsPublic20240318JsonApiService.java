package org.openapitools.api;

import org.openapitools.api.*;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import org.openapitools.model.Change;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-19T12:38:14.061458462Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public abstract class ServiceTagsPublic20240318JsonApiService {
    public abstract Response serviceTagsPublic20240318JsonGet(SecurityContext securityContext) throws NotFoundException;
}
