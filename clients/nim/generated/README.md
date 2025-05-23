# Nim API client for Azure IP Ranges and Service Tags - Public Cloud (Package: openapiclient)

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview

This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 0.10.1-pre.0
- Package version: 1.0.0
    - Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.NimClientCodegen
    For more information, please visit [https://github.com/oapicf/openapi-azureipranges](https://github.com/oapicf/openapi-azureipranges)

## Installation

Put the package under your project folder and add the following to the nimble file of your project:

```
import openapiclient
```

## Documentation for API Endpoints

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Module | Proc | HTTP request | Description
------------ | ------------- | ------------- | -------------
api_default | getAzureIpRangesServiceTagsPublicCloud | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


To generate documentation with Nim DocGen, use:

```
nim doc --project --index:on openapiclient.nim
```
