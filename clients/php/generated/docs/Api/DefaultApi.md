# OpenAPI\Client\DefaultApi

All URIs are relative to https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**serviceTagsPublic20240318JsonGet()**](DefaultApi.md#serviceTagsPublic20240318JsonGet) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud |


## `serviceTagsPublic20240318JsonGet()`

```php
serviceTagsPublic20240318JsonGet(): \OpenAPI\Client\Model\Change
```

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->serviceTagsPublic20240318JsonGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->serviceTagsPublic20240318JsonGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\Change**](../Model/Change.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
