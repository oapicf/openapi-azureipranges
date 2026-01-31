# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**getAzureIpRangesServiceTagsPublicCloud**](#getazureiprangesservicetagspubliccloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud|

# **getAzureIpRangesServiceTagsPublicCloud**
> Change getAzureIpRangesServiceTagsPublicCloud()

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```typescript
import {
    DefaultApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new DefaultApi(configuration);

let version: string; //The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (default to undefined)

const { status, data } = await apiInstance.getAzureIpRangesServiceTagsPublicCloud(
    version
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **version** | [**string**] | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | defaults to undefined|


### Return type

**Change**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

