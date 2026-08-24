@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class DefaultApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation getAzureIpRangesServiceTagsPublicCloud.
     *
     * @param version path parameter version pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAzureIpRangesServiceTagsPublicCloudStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAzureIpRangesServiceTagsPublicCloud(version: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAzureIpRangesServiceTagsPublicCloudStubBuilder =
        GetAzureIpRangesServiceTagsPublicCloudStubBuilder(objectMapper, get(urlPathTemplate("/ServiceTags_Public_{version}.json"))
            .withPathParam("version", version)
            .configurer()
        )
}
