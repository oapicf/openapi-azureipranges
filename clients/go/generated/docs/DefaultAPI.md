# \DefaultAPI

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAzureIpRangesServiceTagsPublicCloud**](DefaultAPI.md#GetAzureIpRangesServiceTagsPublicCloud) | **Get** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud



## GetAzureIpRangesServiceTagsPublicCloud

> Change GetAzureIpRangesServiceTagsPublicCloud(ctx, version).Execute()

Get Azure IP Ranges and Service Tags - Public Cloud



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/oapicf/openapi-azureipranges"
)

func main() {
	version := "version_example" // string | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DefaultAPI.GetAzureIpRangesServiceTagsPublicCloud(context.Background(), version).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.GetAzureIpRangesServiceTagsPublicCloud``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `GetAzureIpRangesServiceTagsPublicCloud`: Change
	fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.GetAzureIpRangesServiceTagsPublicCloud`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**version** | **string** | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetAzureIpRangesServiceTagsPublicCloudRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

