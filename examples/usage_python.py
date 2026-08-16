import openapiazureipranges
from openapiazureipranges.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63
# See configuration.py for a list of all supported configuration parameters.
configuration = openapiazureipranges.Configuration(
    host = "https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63"
)

# Enter a context with an instance of the API client
with openapiazureipranges.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapiazureipranges.DefaultApi(api_client)

    try:
        # Get Azure IP ranges and service tags for the public cloud
        api_response = api_instance.get_azure_ip_ranges_service_tags_public_cloud('20260126')
        print("The response of DefaultApi->get_azure_ip_ranges_service_tags_public_cloud:\n")
        print(api_response.change_number)
        print(api_response.cloud)
        for value in api_response.values:
            print(value.name)
            pprint(value.properties.address_prefixes)
    except ApiException as e:
        print("Exception when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud: %s\n" % e)
        raise
