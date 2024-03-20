package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Change

class DefaultApi {
    String basePath = "https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def serviceTagsPublic20240318JsonGet ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ServiceTags_Public_20240318.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType






        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Change.class )

    }

}
