# OpenApiAzureIpRangesClient::DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_azure_ip_ranges_service_tags_public_cloud**](DefaultApi.md#get_azure_ip_ranges_service_tags_public_cloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud |


## get_azure_ip_ranges_service_tags_public_cloud

> <Change> get_azure_ip_ranges_service_tags_public_cloud(version)

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Examples

```ruby
require 'time'
require 'openapi_azureipranges'

api_instance = OpenApiAzureIpRangesClient::DefaultApi.new
version = 'version_example' # String | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

begin
  # Get Azure IP Ranges and Service Tags - Public Cloud
  result = api_instance.get_azure_ip_ranges_service_tags_public_cloud(version)
  p result
rescue OpenApiAzureIpRangesClient::ApiError => e
  puts "Error when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud: #{e}"
end
```

#### Using the get_azure_ip_ranges_service_tags_public_cloud_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Change>, Integer, Hash)> get_azure_ip_ranges_service_tags_public_cloud_with_http_info(version)

```ruby
begin
  # Get Azure IP Ranges and Service Tags - Public Cloud
  data, status_code, headers = api_instance.get_azure_ip_ranges_service_tags_public_cloud_with_http_info(version)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Change>
rescue OpenApiAzureIpRangesClient::ApiError => e
  puts "Error when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **version** | **String** | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 |  |

### Return type

[**Change**](Change.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/octet-stream

