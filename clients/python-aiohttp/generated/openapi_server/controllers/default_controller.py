from typing import List, Dict
from aiohttp import web

from openapi_server.models.change import Change
from openapi_server import util


async def get_azure_ip_ranges_service_tags_public_cloud(request: web.Request, version) -> web.Response:
    """Get Azure IP Ranges and Service Tags - Public Cloud

    Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.

    :param version: The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    :type version: str

    """
    return web.Response(status=200)
