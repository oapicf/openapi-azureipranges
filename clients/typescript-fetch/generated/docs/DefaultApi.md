# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#getazureiprangesservicetagspubliccloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud |



## getAzureIpRangesServiceTagsPublicCloud

> Change getAzureIpRangesServiceTagsPublicCloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```ts
import {
  Configuration,
  DefaultApi,
} from '';
import type { GetAzureIpRangesServiceTagsPublicCloudRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new DefaultApi();

  const body = {
    // string | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    version: version_example,
  } satisfies GetAzureIpRangesServiceTagsPublicCloudRequest;

  try {
    const data = await api.getAzureIpRangesServiceTagsPublicCloud(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | `string` | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | [Defaults to `undefined`] |

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `application/octet-stream`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

