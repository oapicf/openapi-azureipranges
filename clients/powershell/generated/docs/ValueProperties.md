# ValueProperties
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangeNumber** | **Int32** | The number associated with the change. | [optional] 
**Region** | **String** | The region associated with the value. | [optional] 
**RegionId** | **Int32** | The ID of the region. | [optional] 
**Platform** | **String** | The platform associated with the value. | [optional] 
**SystemService** | **String** | The system service associated with the value. | [optional] 
**AddressPrefixes** | **String[]** | The address prefixes associated with the value. | [optional] 
**NetworkFeatures** | **String[]** | The network features associated with the value. | [optional] 

## Examples

- Prepare the resource
```powershell
$ValueProperties = Initialize-PSOpenAPIToolsValueProperties  -ChangeNumber null `
 -Region null `
 -RegionId null `
 -Platform null `
 -SystemService null `
 -AddressPrefixes null `
 -NetworkFeatures null
```

- Convert the resource to JSON
```powershell
$ValueProperties | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

