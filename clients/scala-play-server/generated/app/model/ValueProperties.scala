package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ValueProperties.
  * @param changeNumber The number associated with the change.
  * @param region The region associated with the value.
  * @param regionId The ID of the region.
  * @param platform The platform associated with the value.
  * @param systemService The system service associated with the value.
  * @param addressPrefixes The address prefixes associated with the value.
  * @param networkFeatures The network features associated with the value.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-05-13T08:54:16.912049372Z[Etc/UTC]", comments = "Generator version: 7.5.0")
case class ValueProperties(
  changeNumber: Option[Int],
  region: Option[String],
  regionId: Option[Int],
  platform: Option[String],
  systemService: Option[String],
  addressPrefixes: Option[List[String]],
  networkFeatures: Option[List[String]]
)

object ValueProperties {
  implicit lazy val valuePropertiesJsonFormat: Format[ValueProperties] = Json.format[ValueProperties]
}

