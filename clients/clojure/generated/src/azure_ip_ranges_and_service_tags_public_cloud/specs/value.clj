(ns azure-ip-ranges-and-service-tags-public-cloud.specs.value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [azure-ip-ranges-and-service-tags-public-cloud.specs.value-properties :refer :all]
            )
  (:import (java.io File)))


(def value-data
  {
   (ds/opt :name) string?
   (ds/opt :id) string?
   (ds/opt :properties) value-properties-spec
   })

(def value-spec
  (ds/spec
    {:name ::value
     :spec value-data}))
