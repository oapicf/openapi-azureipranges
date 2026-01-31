# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#GetAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **GetAzureIpRangesServiceTagsPublicCloud**
> Change GetAzureIpRangesServiceTagsPublicCloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```R
library(openapi)

# Get Azure IP Ranges and Service Tags - Public Cloud
#
# prepare function argument(s)
var_version <- "version_example" # character | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetAzureIpRangesServiceTagsPublicCloud(var_versiondata_file = "result.txt")
result <- api_instance$GetAzureIpRangesServiceTagsPublicCloud(var_version)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **character**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

