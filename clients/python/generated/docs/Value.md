# Value


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the value. | [optional] 
**id** | **str** | The unique identifier of the value. | [optional] 
**properties** | [**ValueProperties**](ValueProperties.md) |  | [optional] 

## Example

```python
from openapiazureipranges.models.value import Value

# TODO update the JSON string below
json = "{}"
# create an instance of Value from a JSON string
value_instance = Value.from_json(json)
# print the JSON string representation of the object
print(Value.to_json())

# convert the object into a dict
value_dict = value_instance.to_dict()
# create an instance of Value from a dict
value_form_dict = value.from_dict(value_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


