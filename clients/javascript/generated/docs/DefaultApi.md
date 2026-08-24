# OpenapiAzureipranges.DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud



## getAzureIpRangesServiceTagsPublicCloud

> Change getAzureIpRangesServiceTagsPublicCloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```javascript
import OpenapiAzureipranges from 'openapi_azureipranges';

let apiInstance = new OpenapiAzureipranges.DefaultApi();
let version = "version_example"; // String | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
apiInstance.getAzureIpRangesServiceTagsPublicCloud(version, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **String**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

