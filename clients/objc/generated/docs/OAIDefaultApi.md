# OAIDefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAzureIpRangesServiceTagsPublicCloud**](OAIDefaultApi.md#getazureiprangesservicetagspubliccloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **getAzureIpRangesServiceTagsPublicCloud**
```objc
-(NSURLSessionTask*) getAzureIpRangesServiceTagsPublicCloudWithVersion: (NSString*) version
        completionHandler: (void (^)(OAIChange* output, NSError* error)) handler;
```

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```objc

NSString* version = @"version_example"; // The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Get Azure IP Ranges and Service Tags - Public Cloud
[apiInstance getAzureIpRangesServiceTagsPublicCloudWithVersion:version
          completionHandler: ^(OAIChange* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->getAzureIpRangesServiceTagsPublicCloud: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **NSString***| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

### Return type

[**OAIChange***](OAIChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

