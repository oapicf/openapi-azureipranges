# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceTagsPublic20240318JsonGet**](DefaultApi.md#serviceTagsPublic20240318JsonGet) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud



## serviceTagsPublic20240318JsonGet

> Change serviceTagsPublic20240318JsonGet()

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```java
// Import classes:
//import org.openapitools.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
try {
    Change result = apiInstance.serviceTagsPublic20240318JsonGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#serviceTagsPublic20240318JsonGet");
    e.printStackTrace();
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

