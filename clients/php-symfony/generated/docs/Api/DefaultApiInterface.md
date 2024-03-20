# OpenAPI\Server\Api\DefaultApiInterface

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**serviceTagsPublic20240318JsonGet**](DefaultApiInterface.md#serviceTagsPublic20240318JsonGet) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\DefaultApi:
        tags:
            - { name: "open_api_server.api", api: "default" }
    # ...
```

## **serviceTagsPublic20240318JsonGet**
> OpenAPI\Server\Model\Change serviceTagsPublic20240318JsonGet()

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#serviceTagsPublic20240318JsonGet
     */
    public function serviceTagsPublic20240318JsonGet(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\Change**](../Model/Change.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

