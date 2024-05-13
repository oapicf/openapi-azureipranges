package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Change.
  * @param changeNumber The number associated with the change.
  * @param cloud The cloud environment.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-05-13T08:54:16.912049372Z[Etc/UTC]", comments = "Generator version: 7.5.0")
case class Change(
  changeNumber: Option[Int],
  cloud: Option[String],
  values: Option[List[Value]]
)

object Change {
  implicit lazy val changeJsonFormat: Format[Change] = Json.format[Change]
}

