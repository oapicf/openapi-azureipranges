# Value
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | The name of the value. | [optional] 
**Id** | **String** | The unique identifier of the value. | [optional] 
**Properties** | [**ValueProperties**](ValueProperties.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$Value = Initialize-PSOpenAPIToolsValue  -Name null `
 -Id null `
 -Properties null
```

- Convert the resource to JSON
```powershell
$Value | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

