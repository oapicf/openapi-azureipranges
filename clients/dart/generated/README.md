# openapi
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This Dart package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.9.0-pre.0
- Generator version: 7.4.0
- Build package: org.openapitools.codegen.languages.DartClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-azureipranges](https://github.com/oapicf/openapi-azureipranges)

## Requirements

Dart 2.12 or later

## Installation & Usage

### Github
If this Dart package is published to Github, add the following dependency to your pubspec.yaml
```
dependencies:
  openapi:
    git: https://github.com/oapicf/openapi-azureipranges.git
```

### Local
To use the package in your local drive, add the following dependency to your pubspec.yaml
```
dependencies:
  openapi:
    path: /path/to/openapi
```

## Tests

TODO

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```dart
import 'package:openapi/api.dart';


final api_instance = DefaultApi();

try {
    final result = api_instance.serviceTagsPublic20240318JsonGet();
    print(result);
} catch (e) {
    print('Exception when calling DefaultApi->serviceTagsPublic20240318JsonGet: $e\n');
}

```

## Documentation for API Endpoints

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**serviceTagsPublic20240318JsonGet**](doc//DefaultApi.md#servicetagspublic20240318jsonget) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


## Documentation For Models

 - [Change](doc//Change.md)
 - [Value](doc//Value.md)
 - [ValueProperties](doc//ValueProperties.md)


## Documentation For Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com
