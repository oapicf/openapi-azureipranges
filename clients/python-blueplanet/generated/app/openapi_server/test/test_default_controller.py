# coding: utf-8

from __future__ import absolute_import

from flask import json
from io import BytesIO

from app.openapi_server.models.change import Change  # noqa: E501
from openapi_server.test import BaseTestCase


class TestDefaultController(BaseTestCase):
    """DefaultController integration test stubs"""

    def test_get_azure_ip_ranges_service_tags_public_cloud(self):
        """Test case for get_azure_ip_ranges_service_tags_public_cloud

        Get Azure IP Ranges and Service Tags - Public Cloud
        """
        response = self.client.open(
            '/download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json'.format(version='version_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
