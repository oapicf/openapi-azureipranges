# OpenApiAzureIpRangesClient::ValueProperties

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **change_number** | **Integer** | The number associated with the change. | [optional] |
| **region** | **String** | The region associated with the value. | [optional] |
| **region_id** | **Integer** | The ID of the region. | [optional] |
| **platform** | **String** | The platform associated with the value. | [optional] |
| **system_service** | **String** | The system service associated with the value. | [optional] |
| **address_prefixes** | **Array&lt;String&gt;** | The address prefixes associated with the value. | [optional] |
| **network_features** | **Array&lt;String&gt;** | The network features associated with the value. | [optional] |

## Example

```ruby
require 'openapi_azureipranges'

instance = OpenApiAzureIpRangesClient::ValueProperties.new(
  change_number: null,
  region: null,
  region_id: null,
  platform: null,
  system_service: null,
  address_prefixes: null,
  network_features: null
)
```

