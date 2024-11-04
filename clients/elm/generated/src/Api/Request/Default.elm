{-
   Azure IP Ranges and Service Tags - Public Cloud
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 0.9.0-pre.0
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Default exposing
    ( getAzureIpRangesServiceTagsPublicCloud
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
-}
getAzureIpRangesServiceTagsPublicCloud : String -> Api.Request Api.Data.Change
getAzureIpRangesServiceTagsPublicCloud version_path =
    Api.request
        "GET"
        "/ServiceTags_Public_{version}.json"
        [ ( "version", identity version_path ) ]
        []
        []
        Nothing
        Api.Data.changeDecoder

