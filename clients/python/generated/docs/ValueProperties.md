# ValueProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_number** | **int** | The number associated with the change. | [optional] 
**region** | **str** | The region associated with the value. | [optional] 
**region_id** | **int** | The ID of the region. | [optional] 
**platform** | **str** | The platform associated with the value. | [optional] 
**system_service** | **str** | The system service associated with the value. | [optional] 
**address_prefixes** | **List[str]** | The address prefixes associated with the value. | [optional] 
**network_features** | **List[str]** | The network features associated with the value. | [optional] 

## Example

```python
from openapiazureipranges.models.value_properties import ValueProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ValueProperties from a JSON string
value_properties_instance = ValueProperties.from_json(json)
# print the JSON string representation of the object
print(ValueProperties.to_json())

# convert the object into a dict
value_properties_dict = value_properties_instance.to_dict()
# create an instance of ValueProperties from a dict
value_properties_from_dict = ValueProperties.from_dict(value_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


