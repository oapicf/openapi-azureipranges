# DefaultAPI

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DefaultAPI_getAzureIpRangesServiceTagsPublicCloud**](DefaultAPI.md#DefaultAPI_getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **DefaultAPI_getAzureIpRangesServiceTagsPublicCloud**
```c
// Get Azure IP Ranges and Service Tags - Public Cloud
//
// Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
//
change_t* DefaultAPI_getAzureIpRangesServiceTagsPublicCloud(apiClient_t *apiClient, char *version);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**version** | **char \*** | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

### Return type

[change_t](change.md) *


### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

