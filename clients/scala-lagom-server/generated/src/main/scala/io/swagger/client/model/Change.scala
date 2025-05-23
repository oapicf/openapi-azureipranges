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

case class Change (
            /* The number associated with the change. */
                  changeNumber: Option[Int],
            /* The cloud environment. */
                  cloud: Option[String],
                  values: Option[Seq[Value]]
)

object Change {
implicit val format: Format[Change] = Json.format
}

