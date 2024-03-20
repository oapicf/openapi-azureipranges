# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceTagsPublic20240318JsonGet**](DefaultApi.md#serviceTagsPublic20240318JsonGet) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


<a id="serviceTagsPublic20240318JsonGet"></a>
# **serviceTagsPublic20240318JsonGet**
> Change serviceTagsPublic20240318JsonGet()

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : Change = apiInstance.serviceTagsPublic20240318JsonGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#serviceTagsPublic20240318JsonGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#serviceTagsPublic20240318JsonGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

