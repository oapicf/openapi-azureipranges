{-# LANGUAGE NoImplicitPrelude #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}
module Handler.Default where

import           Import


-- | Get Azure IP Ranges and Service Tags - Public Cloud
--
-- Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
-- operationId: getAzureIpRangesServiceTagsPublicCloud
getServiceTagsPublic{version}JsonR :: Text -- ^ The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
                                   -> Handler Value
getServiceTagsPublic{version}JsonR version = notImplemented
