/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
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
   */
  def serviceTagsPublic20240318JsonGet(): ApiRequest[Change] =
    ApiRequest[Change](ApiMethods.GET, baseUrl, "/ServiceTags_Public_20240318.json", "application/json")
      .withSuccessResponse[Change](200)
      



}
