# R API client for openapi

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project. By using the [OpenAPI spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 0.10.1-pre.0
- Package version: 1.0.0
- Generator version: 7.12.0
- Build package: org.openapitools.codegen.languages.RClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-azureipranges](https://github.com/oapicf/openapi-azureipranges)

## Installation

### Prerequisites

Install the dependencies

```R
install.packages("jsonlite")
install.packages("httr")
install.packages("base64enc")
```

### Build the package

```sh
git clone https://github.com/oapicf/openapi-azureipranges
cd openapi-azureipranges
R CMD build .
R CMD check openapi_1.0.0.tar.gz --no-manual
R CMD INSTALL --preclean openapi_1.0.0.tar.gz
```

### Install the package

```R
install.packages("openapi")
```

To install directly from Github, use `devtools`:
```R
install.packages("devtools")
library(devtools)
install_github("oapicf/openapi-azureipranges")
```

To install the package from a local file:
```R
install.packages("openapi_1.0.0.tar.gz", repos = NULL, type = "source")
```

### Usage

```R
library(openapi)
```

### Reformat code

To reformat code using [styler](https://styler.r-lib.org/index.html), please run the following in the R console:

```R
install.packages("remotes")
remotes::install_github("r-lib/styler@v1.7.0.9003")
library("styler")
style_dir()
```

## Documentation for API Endpoints

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**GetAzureIpRangesServiceTagsPublicCloud**](docs/DefaultApi.md#GetAzureIpRangesServiceTagsPublicCloud) | **GET** /ServiceTags_Public_{version}.json | Get Azure IP Ranges and Service Tags - Public Cloud


## Documentation for Models

 - [Change](docs/Change.md)
 - [Value](docs/Value.md)
 - [ValueProperties](docs/ValueProperties.md)


## Documentation for Authorization

Endpoints do not require authorization.


## Author

blah+oapicf@cliffano.com
