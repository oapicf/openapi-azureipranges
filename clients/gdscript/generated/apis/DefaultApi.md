<a name="__pageTop"></a>
# DefaultApi   { #DefaultApi }


All URIs are relative to *https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_azure_ip_ranges_service_tags_public_cloud**](#get_azure_ip_ranges_service_tags_public_cloud) | **GET** `/ServiceTags_Public_{version}.json` | Get Azure IP Ranges and Service Tags - Public Cloud

# **get_azure_ip_ranges_service_tags_public_cloud**   { #get_azure_ip_ranges_service_tags_public_cloud }
<a name="get_azure_ip_ranges_service_tags_public_cloud"></a>

> `get_azure_ip_ranges_service_tags_public_cloud(version: String, on_success: Callable, on_failure: Callable)`

Get Azure IP Ranges and Service Tags - Public Cloud

Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

### Example


```gdscript

# Customize configuration
var config := ApiConfig.new()
config.host = "localhost"
config.port = 8080
#config.tls_enabled = true
#config.trusted_chain = preload("res://my_cert_chain.crt")

# Instantiate the api
var api = DefaultApi.new(config)
# You can also provide your own HTTPClient, to re-use it across apis.
#var api = DefaultApi.new(config, client)


# Invoke an endpoint
api.get_azure_ip_ranges_service_tags_public_cloud(
	# version: String   Eg: version_example
	# The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
	version,
	# On Success
	func(response):  # response is ApiResponse
		prints("Success!", "get_azure_ip_ranges_service_tags_public_cloud", response)
		assert(response.data is Change)
		pass  # do things, make stuff
		,
	# On Error
	func(error):  # error is ApiError
		push_error(str(error))
		,
)

```


### Authorization

No authorization required.

[[Back to top]](#__pageTop) \
[[Back to API list]](../README.md#documentation-for-api-endpoints) \
[[Back to Model list]](../README.md#documentation-for-models) \
[[Back to README]](../README.md) \

