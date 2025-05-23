/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.api

import org.openapitools.client.model.Change
import org.openapitools.client.core._
import org.openapitools.client.core.CollectionFormats._
import org.openapitools.client.core.ApiKeyLocations._

object DefaultApi {

  def apply(baseUrl: String = "https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63") = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String) {

  /**
   * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
   * 
   * Expected answers:
   *   code 200 : Change (Successful response)
   * 
   * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
   */
  def getAzureIpRangesServiceTagsPublicCloud(version: String): ApiRequest[Change] =
    ApiRequest[Change](ApiMethods.GET, baseUrl, "/ServiceTags_Public_{version}.json", "application/json")
      .withPathParam("version", version)
      .withSuccessResponse[Change](200)
      



}

