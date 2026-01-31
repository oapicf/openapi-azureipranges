# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_azure_ip_ranges_service_tags_public_cloud**](DefaultApi.md#get_azure_ip_ranges_service_tags_public_cloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


# **get_azure_ip_ranges_service_tags_public_cloud**
> Change get_azure_ip_ranges_service_tags_public_cloud(version => $version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $version = "version_example"; # string | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

eval {
    my $result = $api_instance->get_azure_ip_ranges_service_tags_public_cloud(version => $version);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **string**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

