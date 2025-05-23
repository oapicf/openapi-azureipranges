# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model import Model
from openapi_server import util


class ValueProperties(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, change_number: int=None, region: str=None, region_id: int=None, platform: str=None, system_service: str=None, address_prefixes: List[str]=None, network_features: List[str]=None):  # noqa: E501
        """ValueProperties - a model defined in Swagger

        :param change_number: The change_number of this ValueProperties.  # noqa: E501
        :type change_number: int
        :param region: The region of this ValueProperties.  # noqa: E501
        :type region: str
        :param region_id: The region_id of this ValueProperties.  # noqa: E501
        :type region_id: int
        :param platform: The platform of this ValueProperties.  # noqa: E501
        :type platform: str
        :param system_service: The system_service of this ValueProperties.  # noqa: E501
        :type system_service: str
        :param address_prefixes: The address_prefixes of this ValueProperties.  # noqa: E501
        :type address_prefixes: List[str]
        :param network_features: The network_features of this ValueProperties.  # noqa: E501
        :type network_features: List[str]
        """
        self.swagger_types = {
            'change_number': int,
            'region': str,
            'region_id': int,
            'platform': str,
            'system_service': str,
            'address_prefixes': List[str],
            'network_features': List[str]
        }

        self.attribute_map = {
            'change_number': 'changeNumber',
            'region': 'region',
            'region_id': 'regionId',
            'platform': 'platform',
            'system_service': 'systemService',
            'address_prefixes': 'addressPrefixes',
            'network_features': 'networkFeatures'
        }

        self._change_number = change_number
        self._region = region
        self._region_id = region_id
        self._platform = platform
        self._system_service = system_service
        self._address_prefixes = address_prefixes
        self._network_features = network_features

    @classmethod
    def from_dict(cls, dikt) -> 'ValueProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ValueProperties of this ValueProperties.  # noqa: E501
        :rtype: ValueProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def change_number(self) -> int:
        """Gets the change_number of this ValueProperties.

        The number associated with the change.  # noqa: E501

        :return: The change_number of this ValueProperties.
        :rtype: int
        """
        return self._change_number

    @change_number.setter
    def change_number(self, change_number: int):
        """Sets the change_number of this ValueProperties.

        The number associated with the change.  # noqa: E501

        :param change_number: The change_number of this ValueProperties.
        :type change_number: int
        """

        self._change_number = change_number

    @property
    def region(self) -> str:
        """Gets the region of this ValueProperties.

        The region associated with the value.  # noqa: E501

        :return: The region of this ValueProperties.
        :rtype: str
        """
        return self._region

    @region.setter
    def region(self, region: str):
        """Sets the region of this ValueProperties.

        The region associated with the value.  # noqa: E501

        :param region: The region of this ValueProperties.
        :type region: str
        """

        self._region = region

    @property
    def region_id(self) -> int:
        """Gets the region_id of this ValueProperties.

        The ID of the region.  # noqa: E501

        :return: The region_id of this ValueProperties.
        :rtype: int
        """
        return self._region_id

    @region_id.setter
    def region_id(self, region_id: int):
        """Sets the region_id of this ValueProperties.

        The ID of the region.  # noqa: E501

        :param region_id: The region_id of this ValueProperties.
        :type region_id: int
        """

        self._region_id = region_id

    @property
    def platform(self) -> str:
        """Gets the platform of this ValueProperties.

        The platform associated with the value.  # noqa: E501

        :return: The platform of this ValueProperties.
        :rtype: str
        """
        return self._platform

    @platform.setter
    def platform(self, platform: str):
        """Sets the platform of this ValueProperties.

        The platform associated with the value.  # noqa: E501

        :param platform: The platform of this ValueProperties.
        :type platform: str
        """

        self._platform = platform

    @property
    def system_service(self) -> str:
        """Gets the system_service of this ValueProperties.

        The system service associated with the value.  # noqa: E501

        :return: The system_service of this ValueProperties.
        :rtype: str
        """
        return self._system_service

    @system_service.setter
    def system_service(self, system_service: str):
        """Sets the system_service of this ValueProperties.

        The system service associated with the value.  # noqa: E501

        :param system_service: The system_service of this ValueProperties.
        :type system_service: str
        """

        self._system_service = system_service

    @property
    def address_prefixes(self) -> List[str]:
        """Gets the address_prefixes of this ValueProperties.

        The address prefixes associated with the value.  # noqa: E501

        :return: The address_prefixes of this ValueProperties.
        :rtype: List[str]
        """
        return self._address_prefixes

    @address_prefixes.setter
    def address_prefixes(self, address_prefixes: List[str]):
        """Sets the address_prefixes of this ValueProperties.

        The address prefixes associated with the value.  # noqa: E501

        :param address_prefixes: The address_prefixes of this ValueProperties.
        :type address_prefixes: List[str]
        """

        self._address_prefixes = address_prefixes

    @property
    def network_features(self) -> List[str]:
        """Gets the network_features of this ValueProperties.

        The network features associated with the value.  # noqa: E501

        :return: The network_features of this ValueProperties.
        :rtype: List[str]
        """
        return self._network_features

    @network_features.setter
    def network_features(self, network_features: List[str]):
        """Sets the network_features of this ValueProperties.

        The network features associated with the value.  # noqa: E501

        :param network_features: The network_features of this ValueProperties.
        :type network_features: List[str]
        """

        self._network_features = network_features
