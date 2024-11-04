package org.openapitools.api

import org.openapitools.model.Change
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ServiceTagsPublic{version}JsonApiTest {

    private val api: ServiceTagsPublic{version}JsonApiController = ServiceTagsPublic{version}JsonApiController()

    /**
     * To test ServiceTagsPublic{version}JsonApiController.getAzureIpRangesServiceTagsPublicCloud
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getAzureIpRangesServiceTagsPublicCloudTest() {
        val version: kotlin.String = TODO()
        val response: ResponseEntity<Change> = api.getAzureIpRangesServiceTagsPublicCloud(version)

        // TODO: test validations
    }
}
