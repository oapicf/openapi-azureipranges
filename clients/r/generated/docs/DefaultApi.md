# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ServiceTagsPublic20240318JsonGet**](DefaultApi.md#ServiceTagsPublic20240318JsonGet) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **ServiceTagsPublic20240318JsonGet**
> Change ServiceTagsPublic20240318JsonGet()

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```R
library(openapi)

# Get Azure IP Ranges and Service Tags - Public Cloud
#

api_instance <- DefaultApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ServiceTagsPublic20240318JsonGet(data_file = "result.txt")
result <- api_instance$ServiceTagsPublic20240318JsonGet()
dput(result)
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

