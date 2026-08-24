package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.Change

/**
* @TODO("Fill out implementation")
*/
@Singleton
class DefaultApiAction @Inject constructor(
) : WebAction {

    @Get("/ServiceTags_Public_{version}.json")
    @Description("Get Azure IP Ranges and Service Tags - Public Cloud")
    @ResponseContentType(MediaTypes.APPLICATION_JSON, MediaTypes.APPLICATION_OCTETSTREAM /* @todo(unknown) -> application/octet-stream */ )
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun getAzureIpRangesServiceTagsPublicCloud(
        @PathParam("version") version: kotlin.String
    ): Change {
        TODO()
    }
}
