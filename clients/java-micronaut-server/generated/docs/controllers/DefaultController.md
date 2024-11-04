# DefaultController

All URIs are relative to `"/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63"`

The controller class is defined in **[DefaultController.java](../../src/main/java/org/openapitools/controller/DefaultController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAzureIpRangesServiceTagsPublicCloud**](#getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud

<a id="getAzureIpRangesServiceTagsPublicCloud"></a>
# **getAzureIpRangesServiceTagsPublicCloud**
```java
Mono<Change> DefaultController.getAzureIpRangesServiceTagsPublicCloud(version)
```

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**version** | `String` | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 |

### Return type
[**Change**](../../docs/models/Change.md)


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

