# Change


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**change_number** | **int** | The number associated with the change. | [optional] 
**cloud** | **str** | The cloud environment. | [optional] 
**values** | [**List[Value]**](Value.md) |  | [optional] 

## Example

```python
from openapiazureipranges.models.change import Change

# TODO update the JSON string below
json = "{}"
# create an instance of Change from a JSON string
change_instance = Change.from_json(json)
# print the JSON string representation of the object
print(Change.to_json())

# convert the object into a dict
change_dict = change_instance.to_dict()
# create an instance of Change from a dict
change_form_dict = change.from_dict(change_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


