# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**ServiceTagsPublic20240318JsonGet**](DefaultApi.md#servicetagspublic20240318jsonget) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud |

<a id="servicetagspublic20240318jsonget"></a>
# **ServiceTagsPublic20240318JsonGet**
> Change ServiceTagsPublic20240318JsonGet ()

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ServiceTagsPublic20240318JsonGetExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63";
            var apiInstance = new DefaultApi(config);

            try
            {
                // Get Azure IP Ranges and Service Tags - Public Cloud
                Change result = apiInstance.ServiceTagsPublic20240318JsonGet();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.ServiceTagsPublic20240318JsonGet: " + e.Message);
                Debug.Print("Status Code: " + e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

#### Using the ServiceTagsPublic20240318JsonGetWithHttpInfo variant
This returns an ApiResponse object which contains the response data, status code and headers.

```csharp
try
{
    // Get Azure IP Ranges and Service Tags - Public Cloud
    ApiResponse<Change> response = apiInstance.ServiceTagsPublic20240318JsonGetWithHttpInfo();
    Debug.Write("Status Code: " + response.StatusCode);
    Debug.Write("Response Headers: " + response.Headers);
    Debug.Write("Response Body: " + response.Data);
}
catch (ApiException e)
{
    Debug.Print("Exception when calling DefaultApi.ServiceTagsPublic20240318JsonGetWithHttpInfo: " + e.Message);
    Debug.Print("Status Code: " + e.ErrorCode);
    Debug.Print(e.StackTrace);
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


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

