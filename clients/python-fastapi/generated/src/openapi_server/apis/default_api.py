# coding: utf-8

from typing import Dict, List  # noqa: F401
import importlib
import pkgutil

from openapi_server.apis.default_api_base import BaseDefaultApi
import openapi_server.impl

from fastapi import (  # noqa: F401
    APIRouter,
    Body,
    Cookie,
    Depends,
    Form,
    Header,
    HTTPException,
    Path,
    Query,
    Response,
    Security,
    status,
)

from openapi_server.models.extra_models import TokenModel  # noqa: F401
from openapi_server.models.change import Change


router = APIRouter()

ns_pkg = openapi_server.impl
for _, name, _ in pkgutil.iter_modules(ns_pkg.__path__, ns_pkg.__name__ + "."):
    importlib.import_module(name)


@router.get(
    "/ServiceTags_Public_{version}.json",
    responses={
        200: {"model": Change, "description": "Successful response"},
    },
    tags=["default"],
    summary="Get Azure IP Ranges and Service Tags - Public Cloud",
    response_model_by_alias=True,
)
async def get_azure_ip_ranges_service_tags_public_cloud(
    version: str = Path(..., description="The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506"),
) -> Change:
    """Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."""
    if not BaseDefaultApi.subclasses:
        raise HTTPException(status_code=500, detail="Not implemented")
    return await BaseDefaultApi.subclasses[0]().get_azure_ip_ranges_service_tags_public_cloud(version)
