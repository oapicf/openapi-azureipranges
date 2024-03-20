# coding: utf-8

from fastapi.testclient import TestClient


from openapi_server.models.change import Change  # noqa: F401


def test_service_tags_public20240318_json_get(client: TestClient):
    """Test case for service_tags_public20240318_json_get

    Get Azure IP Ranges and Service Tags - Public Cloud
    """

    headers = {
    }
    # uncomment below to make a request
    #response = client.request(
    #    "GET",
    #    "/ServiceTags_Public_20240318.json",
    #    headers=headers,
    #)

    # uncomment below to assert the status code of the HTTP response
    #assert response.status_code == 200

