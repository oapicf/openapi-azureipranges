# OAIDefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceTagsPublic20240318JsonGet**](OAIDefaultApi.md#servicetagspublic20240318jsonget) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **serviceTagsPublic20240318JsonGet**
```objc
-(NSURLSessionTask*) serviceTagsPublic20240318JsonGetWithCompletionHandler: 
        (void (^)(OAIChange* output, NSError* error)) handler;
```

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```objc


OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get Azure IP Ranges and Service Tags - Public Cloud
[apiInstance serviceTagsPublic20240318JsonGetWithCompletionHandler: 
          ^(OAIChange* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->serviceTagsPublic20240318JsonGet: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIChange***](OAIChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

