package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Change

class DefaultApi {
    String basePath = "https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getAzureIpRangesServiceTagsPublicCloud ( String version, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ServiceTags_Public_${version}.json"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (version == null) {
            throw new RuntimeException("missing required params version")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    Change.class )

    }

}
