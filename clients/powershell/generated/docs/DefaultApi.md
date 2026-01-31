# PSOpenAPITools.PSOpenAPITools\Api.DefaultApi

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-AzureIpRangesServiceTagsPublicCloud**](DefaultApi.md#Get-AzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


<a id="Get-AzureIpRangesServiceTagsPublicCloud"></a>
# **Get-AzureIpRangesServiceTagsPublicCloud**
> Change Get-AzureIpRangesServiceTagsPublicCloud<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Version] <String><br>

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example
```powershell
$Version = "MyVersion" # String | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

# Get Azure IP Ranges and Service Tags - Public Cloud
try {
    $Result = Get-AzureIpRangesServiceTagsPublicCloud -Version $Version
} catch {
    Write-Host ("Exception occurred when calling Get-AzureIpRangesServiceTagsPublicCloud: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Version** | **String**| The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 | 

### Return type

[**Change**](Change.md) (PSCustomObject)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

