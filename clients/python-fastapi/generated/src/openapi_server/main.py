# coding: utf-8

"""
    Azure IP Ranges and Service Tags - Public Cloud

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 0.10.1-pre.0
    Contact: blah+oapicf@cliffano.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from fastapi import FastAPI

from openapi_server.apis.default_api import router as DefaultApiRouter

app = FastAPI(
    title="Azure IP Ranges and Service Tags - Public Cloud",
    description="No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)",
    version="0.10.1-pre.0",
)

app.include_router(DefaultApiRouter)
