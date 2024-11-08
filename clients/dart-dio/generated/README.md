# openapi (EXPERIMENTAL)
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This Dart package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.9.0-pre.0
- Generator version: 7.9.0
- Build package: org.openapitools.codegen.languages.DartDioClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-azureipranges](https://github.com/oapicf/openapi-azureipranges)

## Requirements

* Dart 2.15.0+ or Flutter 2.8.0+
* Dio 5.0.0+ (https://pub.dev/packages/dio)

## Installation & Usage

### pub.dev
To use the package from [pub.dev](https://pub.dev), please include the following in pubspec.yaml
```yaml
dependencies:
  openapi: 1.0.0
```

### Github
If this Dart package is published to Github, please include the following in pubspec.yaml
```yaml
dependencies:
  openapi:
    git:
      url: https://github.com/oapicf/openapi-azureipranges.git
      #ref: main
```

### Local development
To use the package from your local drive, please include the following in pubspec.yaml
```yaml
dependencies:
  openapi:
    path: /path/to/openapi
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```dart
import 'package:openapi/openapi.dart';


final api = Openapi().getDefaultApi();
final String version = version_example; // String | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506

try {
    final response = await api.getAzureIpRangesServiceTagsPublicCloud(version);
    print(response);
} catch on DioException (e) {
    print("Exception when calling DefaultApi->getAzureIpRangesServiceTagsPublicCloud: $e\n");
}

```

## Documentation for API Endpoints

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
[*DefaultApi*](doc/DefaultApi.md) | [**getAzureIpRangesServiceTagsPublicCloud**](doc/DefaultApi.md#getazureiprangesservicetagspubliccloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


## Documentation For Models

 - [Change](doc/Change.md)
 - [Value](doc/Value.md)
 - [ValueProperties](doc/ValueProperties.md)


## Documentation For Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com
