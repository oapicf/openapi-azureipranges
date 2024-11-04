# coding: utf-8

from typing import ClassVar, Dict, List, Tuple  # noqa: F401

from openapi_server.models.change import Change


class BaseDefaultApi:
    subclasses: ClassVar[Tuple] = ()

    def __init_subclass__(cls, **kwargs):
        super().__init_subclass__(**kwargs)
        BaseDefaultApi.subclasses = BaseDefaultApi.subclasses + (cls,)
    def get_azure_ip_ranges_service_tags_public_cloud(
        self,
        version: str,
    ) -> Change:
        """Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."""
        ...
