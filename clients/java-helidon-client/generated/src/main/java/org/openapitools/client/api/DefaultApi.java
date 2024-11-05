/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.annotation.RegisterProvider;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import org.openapitools.client.model.Change;
import java.util.List;
import java.util.Map;

/**
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 */
@RegisterRestClient
@RegisterProvider(ApiExceptionMapper.class)
@Path("/ServiceTags_Public_{version}.json")
public interface DefaultApi  {

    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     */
    @GET
    
    @Produces({ "application/json" })
    Change getAzureIpRangesServiceTagsPublicCloud(@PathParam("version") String version) throws ApiException, ProcessingException;
}
