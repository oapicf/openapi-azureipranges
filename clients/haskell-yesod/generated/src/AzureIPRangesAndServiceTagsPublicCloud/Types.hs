{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module AzureIPRangesAndServiceTagsPublicCloud.Types (
  Change (..),
  Value_ (..),
  ValueProperties (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data Change = Change
  { changeChangeNumber :: Maybe Int -- ^ The number associated with the change.
  , changeCloud :: Maybe Text -- ^ The cloud environment.
  , changeValues :: Maybe [Value] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Change where
  parseJSON = genericParseJSON optionsChange
instance ToJSON Change where
  toJSON = genericToJSON optionsChange

optionsChange :: Options
optionsChange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("changeChangeNumber", "changeNumber")
      , ("changeCloud", "cloud")
      , ("changeValues", "values")
      ]


-- | 
data Value_ = Value_
  { valueName :: Maybe Text -- ^ The name of the value.
  , valueId :: Maybe Text -- ^ The unique identifier of the value.
  , valueProperties :: Maybe ValueProperties -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Value_ where
  parseJSON = genericParseJSON optionsValue_
instance ToJSON Value_ where
  toJSON = genericToJSON optionsValue_

optionsValue_ :: Options
optionsValue_ =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("valueName", "name")
      , ("valueId", "id")
      , ("valueProperties", "properties")
      ]


-- | 
data ValueProperties = ValueProperties
  { valuePropertiesChangeNumber :: Maybe Int -- ^ The number associated with the change.
  , valuePropertiesRegion :: Maybe Text -- ^ The region associated with the value.
  , valuePropertiesRegionId :: Maybe Int -- ^ The ID of the region.
  , valuePropertiesPlatform :: Maybe Text -- ^ The platform associated with the value.
  , valuePropertiesSystemService :: Maybe Text -- ^ The system service associated with the value.
  , valuePropertiesAddressPrefixes :: Maybe [Text] -- ^ The address prefixes associated with the value.
  , valuePropertiesNetworkFeatures :: Maybe [Text] -- ^ The network features associated with the value.
  } deriving (Show, Eq, Generic)

instance FromJSON ValueProperties where
  parseJSON = genericParseJSON optionsValueProperties
instance ToJSON ValueProperties where
  toJSON = genericToJSON optionsValueProperties

optionsValueProperties :: Options
optionsValueProperties =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("valuePropertiesChangeNumber", "changeNumber")
      , ("valuePropertiesRegion", "region")
      , ("valuePropertiesRegionId", "regionId")
      , ("valuePropertiesPlatform", "platform")
      , ("valuePropertiesSystemService", "systemService")
      , ("valuePropertiesAddressPrefixes", "addressPrefixes")
      , ("valuePropertiesNetworkFeatures", "networkFeatures")
      ]

