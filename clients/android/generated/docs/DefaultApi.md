# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud



## getAzureIpRangesServiceTagsPublicCloud

> Change getAzureIpRangesServiceTagsPublicCloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String version = null; // String | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
try {
    Change result = apiInstance.getAzureIpRangesServiceTagsPublicCloud(version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAzureIpRangesServiceTagsPublicCloud");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | [default to null]

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

