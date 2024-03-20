{-# LANGUAGE NoImplicitPrelude #-}
{-# LANGUAGE OverloadedStrings #-}
module Handler.DefaultSpec (spec) where

import           TestImport


spec :: Spec
spec = withApp $ do

    describe "getServiceTagsPublic20240318JsonR" $
        it "returns 501 Not Implemented" $ do
            get ServiceTagsPublic20240318JsonR
            statusIs 501
