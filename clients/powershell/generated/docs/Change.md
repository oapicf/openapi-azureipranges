# Change
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangeNumber** | **Int32** | The number associated with the change. | [optional] 
**Cloud** | **String** | The cloud environment. | [optional] 
**Values** | [**Value[]**](Value.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Change = Initialize-PSOpenAPIToolsChange  -ChangeNumber null `
 -Cloud null `
 -Values null
```

- Convert the resource to JSON
```powershell
$Change | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

