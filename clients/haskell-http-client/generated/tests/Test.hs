{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import AzureIPRangesAndServiceTags-PublicCloud.Model
import AzureIPRangesAndServiceTags-PublicCloud.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy Change)
      propMimeEq MimeJSON (Proxy :: Proxy Value)
      propMimeEq MimeJSON (Proxy :: Proxy ValueProperties)
      
