from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.value_properties import ValueProperties
from openapi_server import util

from openapi_server.models.value_properties import ValueProperties  # noqa: E501

class Value(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, id=None, properties=None):  # noqa: E501
        """Value - a model defined in OpenAPI

        :param name: The name of this Value.  # noqa: E501
        :type name: str
        :param id: The id of this Value.  # noqa: E501
        :type id: str
        :param properties: The properties of this Value.  # noqa: E501
        :type properties: ValueProperties
        """
        self.openapi_types = {
            'name': str,
            'id': str,
            'properties': ValueProperties
        }

        self.attribute_map = {
            'name': 'name',
            'id': 'id',
            'properties': 'properties'
        }

        self._name = name
        self._id = id
        self._properties = properties

    @classmethod
    def from_dict(cls, dikt) -> 'Value':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Value of this Value.  # noqa: E501
        :rtype: Value
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this Value.

        The name of the value.  # noqa: E501

        :return: The name of this Value.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this Value.

        The name of the value.  # noqa: E501

        :param name: The name of this Value.
        :type name: str
        """

        self._name = name

    @property
    def id(self) -> str:
        """Gets the id of this Value.

        The unique identifier of the value.  # noqa: E501

        :return: The id of this Value.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this Value.

        The unique identifier of the value.  # noqa: E501

        :param id: The id of this Value.
        :type id: str
        """

        self._id = id

    @property
    def properties(self) -> ValueProperties:
        """Gets the properties of this Value.


        :return: The properties of this Value.
        :rtype: ValueProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties: ValueProperties):
        """Sets the properties of this Value.


        :param properties: The properties of this Value.
        :type properties: ValueProperties
        """

        self._properties = properties
