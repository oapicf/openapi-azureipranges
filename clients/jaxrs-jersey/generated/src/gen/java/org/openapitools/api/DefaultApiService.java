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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2025-05-10T03:06:03.632965970Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public abstract class DefaultApiService {
    public abstract Response getAzureIpRangesServiceTagsPublicCloud(String version,SecurityContext securityContext) throws NotFoundException;
}
