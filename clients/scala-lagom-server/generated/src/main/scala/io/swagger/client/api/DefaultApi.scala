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

package io.swagger.client.api

import akka.{Done, NotUsed}
import com.lightbend.lagom.scaladsl.api.transport.Method
import com.lightbend.lagom.scaladsl.api.{Service, ServiceCall}
import play.api.libs.json._
import com.lightbend.lagom.scaladsl.api.deser.PathParamSerializer

import io.swagger.client.model.Change

trait DefaultApi extends Service {


  final override def descriptor = {
    import Service._
    named("DefaultApi").withCalls(
      restCall(Method.GET, "/ServiceTags_Public_:version.json", getAzureIpRangesServiceTagsPublicCloud _)
    ).withAutoAcl(true)
  }


  /**
    * Get Azure IP Ranges and Service Tags - Public Cloud
    * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    *  
    * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 
    * @return Change
    */
  def getAzureIpRangesServiceTagsPublicCloud(version: String): ServiceCall[NotUsed ,Change]
  

  }
