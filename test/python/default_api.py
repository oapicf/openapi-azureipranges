# pylint: disable=missing-module-docstring,missing-class-docstring,missing-function-docstring,duplicate-code,too-many-locals
from unittest.mock import patch, call
import unittest.mock
import unittest
import openapiazureipranges
from openapiazureipranges.rest import ApiException
from pprint import pprint

class TestDefaultApi(unittest.TestCase):

    def test_get( # pylint: disable=too-many-arguments
            self):

        configuration = openapiazureipranges.Configuration(
            host = "https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63"
        )

        with openapiazureipranges.ApiClient(configuration) as api_client:
            # Create an instance of the API class
            api_instance = openapiazureipranges.DefaultApi(api_client)

            try:
                api_response = api_instance.get_azure_ip_ranges_service_tags_public_cloud('20241104')
                print("The response of DefaultApi->get_azure_ip_ranges_service_tags_public_cloud:\n")
                # pprint(api_response)
                print(type(api_response))
                print(api_response.change_number)
                print(api_response.cloud)
                for value in api_response.values:
                    print(value.name)
                    print(value.id)
                    print(value.properties.change_number)
                    print(value.properties.region)
                    print(value.properties.platform)
                    print(value.properties.system_service)
                    pprint(value.properties.address_prefixes)
            except ApiException as e:
                print("Exception when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud: %s\n" % e)

