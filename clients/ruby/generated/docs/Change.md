# OpenApiAzureIpRangesClient::Change

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **change_number** | **Integer** | The number associated with the change. | [optional] |
| **cloud** | **String** | The cloud environment. | [optional] |
| **values** | [**Array&lt;Value&gt;**](Value.md) |  | [optional] |

## Example

```ruby
require 'openapi_azureipranges'

instance = OpenApiAzureIpRangesClient::Change.new(
  change_number: null,
  cloud: null,
  values: null
)
```

