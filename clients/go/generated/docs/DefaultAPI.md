# \DefaultAPI

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ServiceTagsPublic20240318JsonGet**](DefaultAPI.md#ServiceTagsPublic20240318JsonGet) | **Get** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud



## ServiceTagsPublic20240318JsonGet

> Change ServiceTagsPublic20240318JsonGet(ctx).Execute()

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

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.DefaultAPI.ServiceTagsPublic20240318JsonGet(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `DefaultAPI.ServiceTagsPublic20240318JsonGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `ServiceTagsPublic20240318JsonGet`: Change
	fmt.Fprintf(os.Stdout, "Response from `DefaultAPI.ServiceTagsPublic20240318JsonGet`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiServiceTagsPublic20240318JsonGetRequest struct via the builder pattern


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

