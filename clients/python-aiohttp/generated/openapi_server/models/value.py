# coding: utf-8

from datetime import date, datetime

from typing import List, Dict, Type

from openapi_server.models.base_model import Model
from openapi_server.models.value_properties import ValueProperties
from openapi_server import util


class Value(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name: str=None, id: str=None, properties: ValueProperties=None):
        """Value - a model defined in OpenAPI

        :param name: The name of this Value.
        :param id: The id of this Value.
        :param properties: The properties of this Value.
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
    def from_dict(cls, dikt: dict) -> 'Value':
        """Returns the dict as a model

        :param dikt: A dict.
        :return: The Value of this Value.
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self):
        """Gets the name of this Value.

        The name of the value.

        :return: The name of this Value.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this Value.

        The name of the value.

        :param name: The name of this Value.
        :type name: str
        """

        self._name = name

    @property
    def id(self):
        """Gets the id of this Value.

        The unique identifier of the value.

        :return: The id of this Value.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this Value.

        The unique identifier of the value.

        :param id: The id of this Value.
        :type id: str
        """

        self._id = id

    @property
    def properties(self):
        """Gets the properties of this Value.


        :return: The properties of this Value.
        :rtype: ValueProperties
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """Sets the properties of this Value.


        :param properties: The properties of this Value.
        :type properties: ValueProperties
        """

        self._properties = properties
