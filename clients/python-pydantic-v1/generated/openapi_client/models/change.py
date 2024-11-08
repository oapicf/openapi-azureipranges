# coding: utf-8

"""
    Azure IP Ranges and Service Tags - Public Cloud

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.9.0-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json


from typing import List, Optional
from pydantic import BaseModel, Field, StrictInt, StrictStr, conlist
from openapi_client.models.value import Value

class Change(BaseModel):
    """
    Change
    """
    change_number: Optional[StrictInt] = Field(default=None, alias="changeNumber", description="The number associated with the change.")
    cloud: Optional[StrictStr] = Field(default=None, description="The cloud environment.")
    values: Optional[conlist(Value)] = None
    __properties = ["changeNumber", "cloud", "values"]

    class Config:
        """Pydantic configuration"""
        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Change:
        """Create an instance of Change from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of each item in values (list)
        _items = []
        if self.values:
            for _item in self.values:
                if _item:
                    _items.append(_item.to_dict())
            _dict['values'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> Change:
        """Create an instance of Change from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return Change.parse_obj(obj)

        _obj = Change.parse_obj({
            "change_number": obj.get("changeNumber"),
            "cloud": obj.get("cloud"),
            "values": [Value.from_dict(_item) for _item in obj.get("values")] if obj.get("values") is not None else None
        })
        return _obj

