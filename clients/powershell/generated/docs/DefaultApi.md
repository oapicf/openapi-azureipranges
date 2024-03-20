# PSOpenAPITools.PSOpenAPITools\Api.DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ServiceTagsPublic20240318JsonGet**](DefaultApi.md#Invoke-ServiceTagsPublic20240318JsonGet) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


<a id="Invoke-ServiceTagsPublic20240318JsonGet"></a>
# **Invoke-ServiceTagsPublic20240318JsonGet**
> Change Invoke-ServiceTagsPublic20240318JsonGet<br>

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```powershell

# Get Azure IP Ranges and Service Tags - Public Cloud
try {
    $Result = Invoke-ServiceTagsPublic20240318JsonGet
} catch {
    Write-Host ("Exception occurred when calling Invoke-ServiceTagsPublic20240318JsonGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Change**](Change.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

