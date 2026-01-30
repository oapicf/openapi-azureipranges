# DEFAULT_API

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**azure_ip_ranges_service_tags_public_cloud**](DEFAULT_API.md#azure_ip_ranges_service_tags_public_cloud) | **Get** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **azure_ip_ranges_service_tags_public_cloud**
> azure_ip_ranges_service_tags_public_cloud (version: STRING_32 ): detachable CHANGE


Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **STRING_32**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | [default to null]

### Return type

[**CHANGE**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

