# AzureIpRangesAndServiceTagsPublicCloud.DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud



## getAzureIpRangesServiceTagsPublicCloud

> Change getAzureIpRangesServiceTagsPublicCloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```javascript
import AzureIpRangesAndServiceTagsPublicCloud from 'azure_ip_ranges_and_service_tags_public_cloud';

let apiInstance = new AzureIpRangesAndServiceTagsPublicCloud.DefaultApi();
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
- **Accept**: application/json

