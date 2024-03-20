(ns azure-ip-ranges-and-service-tags-public-cloud.specs.value-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def value-properties-data
  {
   (ds/opt :changeNumber) int?
   (ds/opt :region) string?
   (ds/opt :regionId) int?
   (ds/opt :platform) string?
   (ds/opt :systemService) string?
   (ds/opt :addressPrefixes) (s/coll-of string?)
   (ds/opt :networkFeatures) (s/coll-of string?)
   })

(def value-properties-spec
  (ds/spec
    {:name ::value-properties
     :spec value-properties-data}))
