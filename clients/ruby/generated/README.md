# openapi_client

OpenapiClient - the Ruby gem for the Azure IP Ranges and Service Tags - Public Cloud

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.9.0-pre.0
- Package version: 1.0.0
- Generator version: 7.4.0
- Build package: org.openapitools.codegen.languages.RubyClientCodegen
For more information, please visit [https://github.com/oapicf/openapi-azureipranges](https://github.com/oapicf/openapi-azureipranges)

## Installation

### Build a gem

To build the Ruby code into a gem:

```shell
gem build openapi_client.gemspec
```

Then either install the gem locally:

```shell
gem install ./openapi_client-1.0.0.gem
```

(for development, run `gem install --dev ./openapi_client-1.0.0.gem` to install the development dependencies)

or publish the gem to a gem hosting service, e.g. [RubyGems](https://rubygems.org/).

Finally add this to the Gemfile:

    gem 'openapi_client', '~> 1.0.0'

### Install from Git

If the Ruby gem is hosted at a git repository: https://github.com/oapicf/openapi-azureipranges, then add the following in the Gemfile:

    gem 'openapi_client', :git => 'https://github.com/oapicf/openapi-azureipranges.git'

### Include the Ruby code directly

Include the Ruby code directly using `-I` as follows:

```shell
ruby -Ilib script.rb
```

## Getting Started

Please follow the [installation](#installation) procedure and then run the following code:

```ruby
# Load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new

begin
  #Get Azure IP Ranges and Service Tags - Public Cloud
  result = api_instance.service_tags_public20240318_json_get
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->service_tags_public20240318_json_get: #{e}"
end

```

## Documentation for API Endpoints

All URIs are relative to *https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OpenapiClient::DefaultApi* | [**service_tags_public20240318_json_get**](docs/DefaultApi.md#service_tags_public20240318_json_get) | **GET** /ServiceTags_Public_20240318.json | Get Azure IP Ranges and Service Tags - Public Cloud


## Documentation for Models

 - [OpenapiClient::Change](docs/Change.md)
 - [OpenapiClient::Value](docs/Value.md)
 - [OpenapiClient::ValueProperties](docs/ValueProperties.md)


## Documentation for Authorization

Endpoints do not require authorization.
