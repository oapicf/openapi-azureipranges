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


(defn-spec get-azure-ip-ranges-service-tags-public-cloud-with-http-info any?
  "Get Azure IP Ranges and Service Tags - Public Cloud
  Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."
  [version string?]
  (check-required-params version)
  (call-api "/ServiceTags_Public_{version}.json" :get
            {:path-params   {"version" version }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn-spec get-azure-ip-ranges-service-tags-public-cloud change-spec
  "Get Azure IP Ranges and Service Tags - Public Cloud
  Retrieve details about Azure IP Ranges and Service Tags - Public Cloud."
  [version string?]
  (let [res (:data (get-azure-ip-ranges-service-tags-public-cloud-with-http-info version))]
    (if (:decode-models *api-context*)
       (st/decode change-spec res st/string-transformer)
       res)))


