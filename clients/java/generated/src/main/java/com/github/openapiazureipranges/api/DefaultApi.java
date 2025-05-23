/*
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.openapiazureipranges.api;

import com.github.openapiazureipranges.ApiCallback;
import com.github.openapiazureipranges.ApiClient;
import com.github.openapiazureipranges.ApiException;
import com.github.openapiazureipranges.ApiResponse;
import com.github.openapiazureipranges.Configuration;
import com.github.openapiazureipranges.Pair;
import com.github.openapiazureipranges.ProgressRequestBody;
import com.github.openapiazureipranges.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.openapiazureipranges.model.Change;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DefaultApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getAzureIpRangesServiceTagsPublicCloud
     * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAzureIpRangesServiceTagsPublicCloudCall(String version, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/ServiceTags_Public_{version}.json"
            .replace("{" + "version" + "}", localVarApiClient.escapeString(version.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAzureIpRangesServiceTagsPublicCloudValidateBeforeCall(String version, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling getAzureIpRangesServiceTagsPublicCloud(Async)");
        }

        return getAzureIpRangesServiceTagsPublicCloudCall(version, _callback);

    }

    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (required)
     * @return Change
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public Change getAzureIpRangesServiceTagsPublicCloud(String version) throws ApiException {
        ApiResponse<Change> localVarResp = getAzureIpRangesServiceTagsPublicCloudWithHttpInfo(version);
        return localVarResp.getData();
    }

    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (required)
     * @return ApiResponse&lt;Change&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Change> getAzureIpRangesServiceTagsPublicCloudWithHttpInfo(String version) throws ApiException {
        okhttp3.Call localVarCall = getAzureIpRangesServiceTagsPublicCloudValidateBeforeCall(version, null);
        Type localVarReturnType = new TypeToken<Change>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud (asynchronously)
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAzureIpRangesServiceTagsPublicCloudAsync(String version, final ApiCallback<Change> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAzureIpRangesServiceTagsPublicCloudValidateBeforeCall(version, _callback);
        Type localVarReturnType = new TypeToken<Change>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
