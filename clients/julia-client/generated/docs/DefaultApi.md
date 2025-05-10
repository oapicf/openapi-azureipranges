# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_azure_ip_ranges_service_tags_public_cloud**](DefaultApi.md#get_azure_ip_ranges_service_tags_public_cloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **get_azure_ip_ranges_service_tags_public_cloud**
> get_azure_ip_ranges_service_tags_public_cloud(_api::DefaultApi, version::String; _mediaType=nothing) -> Change, OpenAPI.Clients.ApiResponse <br/>
> get_azure_ip_ranges_service_tags_public_cloud(_api::DefaultApi, response_stream::Channel, version::String; _mediaType=nothing) -> Channel{ Change }, OpenAPI.Clients.ApiResponse

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **DefaultApi** | API context | 
**version** | **String** | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 |

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

