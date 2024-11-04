{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getServiceTagsPublic{version}JsonR" $
        it "returns 501 Not Implemented" $ do
            get $ ServiceTagsPublic{version}JsonR "version_example"
            statusIs 501
