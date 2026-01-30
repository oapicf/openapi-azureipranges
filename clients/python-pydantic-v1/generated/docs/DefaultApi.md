# openapi_client.DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_azure_ip_ranges_service_tags_public_cloud**](DefaultApi.md#get_azure_ip_ranges_service_tags_public_cloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **get_azure_ip_ranges_service_tags_public_cloud**
> Change get_azure_ip_ranges_service_tags_public_cloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```python
import time
import os
import openapi_client
from openapi_client.models.change import Change
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)
    version = 'version_example' # str | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

    try:
        # Get Azure IP Ranges and Service Tags - Public Cloud
        api_response = api_instance.get_azure_ip_ranges_service_tags_public_cloud(version)
        print("The response of DefaultApi->get_azure_ip_ranges_service_tags_public_cloud:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

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
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

