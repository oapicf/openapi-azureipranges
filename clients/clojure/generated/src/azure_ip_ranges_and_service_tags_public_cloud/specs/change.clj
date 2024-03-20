(ns azure-ip-ranges-and-service-tags-public-cloud.specs.change
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [azure-ip-ranges-and-service-tags-public-cloud.specs.value :refer :all]
            )
  (:import (java.io File)))


(def change-data
  {
   (ds/opt :changeNumber) int?
   (ds/opt :cloud) string?
   (ds/opt :values) (s/coll-of value-spec)
   })

(def change-spec
  (ds/spec
    {:name ::change
     :spec change-data}))
