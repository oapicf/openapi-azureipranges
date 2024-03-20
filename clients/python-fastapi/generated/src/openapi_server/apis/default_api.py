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
    "/ServiceTags_Public_20240318.json",
    responses={
        200: {"model": Change, "description": "Successful response"},
    },
    tags=["default"],
    summary="Get Azure IP Ranges and Service Tags - Public Cloud",
    response_model_by_alias=True,
)
async def service_tags_public20240318_json_get(
) -> Change:
    """Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."""
    return BaseDefaultApi.subclasses[0]().service_tags_public20240318_json_get()
