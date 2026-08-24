# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud |


<a id="getAzureIpRangesServiceTagsPublicCloud"></a>
# **getAzureIpRangesServiceTagsPublicCloud**
> Change getAzureIpRangesServiceTagsPublicCloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
val version : kotlin.String = version_example // kotlin.String | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
try {
    val result : Change = apiInstance.getAzureIpRangesServiceTagsPublicCloud(version)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getAzureIpRangesServiceTagsPublicCloud")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getAzureIpRangesServiceTagsPublicCloud")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **version** | **kotlin.String**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | |

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

