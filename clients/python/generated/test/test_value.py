# coding: utf-8

"""
    Azure IP Ranges and Service Tags - Public Cloud

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.value import Value

class TestValue(unittest.TestCase):
    """Value unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Value:
        """Test Value
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Value`
        """
        model = Value()
        if include_optional:
            return Value(
                name = '',
                id = '',
                properties = openapi_client.models.value_properties.ValueProperties(
                    change_number = 56, 
                    region = '', 
                    region_id = 56, 
                    platform = '', 
                    system_service = '', 
                    address_prefixes = [
                        ''
                        ], 
                    network_features = [
                        ''
                        ], )
            )
        else:
            return Value(
        )
        """

    def testValue(self):
        """Test Value"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
