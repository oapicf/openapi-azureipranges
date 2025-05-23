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

package io.swagger.client.model
import play.api.libs.json._

case class ValueProperties (
            /* The number associated with the change. */
                  changeNumber: Option[Int],
            /* The region associated with the value. */
                  region: Option[String],
            /* The ID of the region. */
                  regionId: Option[Int],
            /* The platform associated with the value. */
                  platform: Option[String],
            /* The system service associated with the value. */
                  systemService: Option[String],
            /* The address prefixes associated with the value. */
                  addressPrefixes: Option[Seq[String]],
            /* The network features associated with the value. */
                  networkFeatures: Option[Seq[String]]
)

object ValueProperties {
implicit val format: Format[ValueProperties] = Json.format
}

