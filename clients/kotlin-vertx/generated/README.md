# org.openapitools - Kotlin Server library for Azure IP Ranges and Service Tags - Public Cloud

## Requires

* Kotlin 1.3.10
* Maven 3.3

## Build

```
mvn clean package
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getAzureIpRangesServiceTagsPublicCloud**](docs/DefaultApi.md#getazureiprangesservicetagspubliccloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.server.api.model.Change](docs/Change.md)
 - [org.openapitools.server.api.model.Value](docs/Value.md)
 - [org.openapitools.server.api.model.ValueProperties](docs/ValueProperties.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization

Endpoints do not require authorization.

