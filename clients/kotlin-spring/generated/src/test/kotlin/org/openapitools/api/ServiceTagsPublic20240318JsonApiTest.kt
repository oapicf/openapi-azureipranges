package org.openapitools.api

import org.openapitools.model.Change
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class ServiceTagsPublic20240318JsonApiTest {

    private val api: ServiceTagsPublic20240318JsonApiController = ServiceTagsPublic20240318JsonApiController()

    /**
     * To test ServiceTagsPublic20240318JsonApiController.serviceTagsPublic20240318JsonGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun serviceTagsPublic20240318JsonGetTest() {
        val response: ResponseEntity<Change> = api.serviceTagsPublic20240318JsonGet()

        // TODO: test validations
    }
}
