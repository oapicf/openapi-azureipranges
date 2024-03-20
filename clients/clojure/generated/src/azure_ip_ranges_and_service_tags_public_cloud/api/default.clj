(ns azure-ip-ranges-and-service-tags-public-cloud.api.default
  (:require [azure-ip-ranges-and-service-tags-public-cloud.core :refer [call-api check-required-params with-collection-format *api-context*]]
            [clojure.spec.alpha :as s]
            [spec-tools.core :as st]
            [orchestra.core :refer [defn-spec]]
            [azure-ip-ranges-and-service-tags-public-cloud.specs.value-properties :refer :all]
            [azure-ip-ranges-and-service-tags-public-cloud.specs.change :refer :all]
            [azure-ip-ranges-and-service-tags-public-cloud.specs.value :refer :all]
            )
  (:import (java.io File)))


(defn-spec service-tags-public20240318-json-get-with-http-info any?
  "Get Azure IP Ranges and Service Tags - Public Cloud
  Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."
  []
  (call-api "/ServiceTags_Public_20240318.json" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec service-tags-public20240318-json-get change-spec
  "Get Azure IP Ranges and Service Tags - Public Cloud
  Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."
  []
  (let [res (:data (service-tags-public20240318-json-get-with-http-info))]
    (if (:decode-models *api-context*)
       (st/decode change-spec res st/string-transformer)
       res)))


