# OpenApiAzureIpRangesClient::DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**service_tags_public20240318_json_get**](DefaultApi.md#service_tags_public20240318_json_get) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud |


## service_tags_public20240318_json_get

> <Change> service_tags_public20240318_json_get

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Examples

```ruby
require 'time'
require 'openapi_azureipranges'

api_instance = OpenApiAzureIpRangesClient::DefaultApi.new

begin
  # Get Azure IP Ranges and Service Tags - Public Cloud
  result = api_instance.service_tags_public20240318_json_get
  p result
rescue OpenApiAzureIpRangesClient::ApiError => e
  puts "Error when calling DefaultApi->service_tags_public20240318_json_get: #{e}"
end
```

#### Using the service_tags_public20240318_json_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<Change>, Integer, Hash)> service_tags_public20240318_json_get_with_http_info

```ruby
begin
  # Get Azure IP Ranges and Service Tags - Public Cloud
  data, status_code, headers = api_instance.service_tags_public20240318_json_get_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <Change>
rescue OpenApiAzureIpRangesClient::ApiError => e
  puts "Error when calling DefaultApi->service_tags_public20240318_json_get_with_http_info: #{e}"
end
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

