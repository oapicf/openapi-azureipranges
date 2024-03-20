from typing import List, Dict
from aiohttp import web

from openapi_server.models.change import Change
from openapi_server import util


async def service_tags_public20240318_json_get(request: web.Request, ) -> web.Response:
    """Get Azure IP Ranges and Service Tags - Public Cloud

    Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.


    """
    return web.Response(status=200)
