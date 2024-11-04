import unittest

from flask import json

from openapi_server.models.change import Change  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_azure_ip_ranges_service_tags_public_cloud(self):
        """Test case for get_azure_ip_ranges_service_tags_public_cloud

        Get Azure IP Ranges and Service Tags - Public Cloud
        """
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_{version}.json'.format(version='version_example'),
            method='GET',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
