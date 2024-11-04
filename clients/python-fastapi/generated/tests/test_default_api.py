# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.change import Change  # noqa: F401


def test_get_azure_ip_ranges_service_tags_public_cloud(client: TestClient):
    """Test case for get_azure_ip_ranges_service_tags_public_cloud

    Get Azure IP Ranges and Service Tags - Public Cloud
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ServiceTags_Public_{version}.json".format(version='version_example'),
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

