# openapi_client.DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**service_tags_public20240318_json_get**](DefaultApi.md#service_tags_public20240318_json_get) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **service_tags_public20240318_json_get**
> Change service_tags_public20240318_json_get()

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

# Defining the host is optional and defaults to https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63"
)


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.DefaultApi(api_client)

    try:
        # Get Azure IP Ranges and Service Tags - Public Cloud
        api_response = api_instance.service_tags_public20240318_json_get()
        print("The response of DefaultApi->service_tags_public20240318_json_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling DefaultApi->service_tags_public20240318_json_get: %s\n" % e)
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
**200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

