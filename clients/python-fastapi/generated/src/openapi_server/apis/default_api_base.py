# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from pydantic import Field, StrictStr
from typing_extensions import Annotated
from openapi_server.models.change import Change


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    async def get_azure_ip_ranges_service_tags_public_cloud(
        self,
        version: Annotated[StrictStr, Field(description="The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506")],
    ) -> Change:
        """Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."""
        ...
