# coding: utf-8

import pytest
import json
from aiohttp import web

from openapi_server.models.change import Change


pytestmark = pytest.mark.asyncio

async def test_get_azure_ip_ranges_service_tags_public_cloud(client):
    """Test case for get_azure_ip_ranges_service_tags_public_cloud

    Get Azure IP Ranges and Service Tags - Public Cloud
    """
    headers = { 
        'Accept': 'application/json',
    }
    response = await client.request(
        method='GET',
        path='/download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json'.format(version='version_example'),
        headers=headers,
        )
    assert response.status == 200, 'Response body is : ' + (await response.read()).decode('utf-8')

