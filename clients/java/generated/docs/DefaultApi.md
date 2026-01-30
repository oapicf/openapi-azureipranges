# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud |


<a id="getAzureIpRangesServiceTagsPublicCloud"></a>
# **getAzureIpRangesServiceTagsPublicCloud**
> Change getAzureIpRangesServiceTagsPublicCloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```java
// Import classes:
import com.github.openapiazureipranges.ApiClient;
import com.github.openapiazureipranges.ApiException;
import com.github.openapiazureipranges.Configuration;
import com.github.openapiazureipranges.models.*;
import com.github.openapiazureipranges.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String version = "version_example"; // String | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    try {
      Change result = apiInstance.getAzureIpRangesServiceTagsPublicCloud(version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getAzureIpRangesServiceTagsPublicCloud");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | **String**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | |

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

