# DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#getAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud |


## Creating DefaultApi

To initiate an instance of `DefaultApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.DefaultApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(DefaultApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    DefaultApi defaultApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="getAzureIpRangesServiceTagsPublicCloud"></a>
# **getAzureIpRangesServiceTagsPublicCloud**
```java
Mono<Change> DefaultApi.getAzureIpRangesServiceTagsPublicCloud(version)
```

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **version** | `String`| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | |


### Return type
[**Change**](Change.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`, `application/octet-stream`

