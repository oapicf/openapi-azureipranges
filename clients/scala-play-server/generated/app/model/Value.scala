package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Value.
  * @param name The name of the value.
  * @param id The unique identifier of the value.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-19T12:54:56.193447951Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class Value(
  name: Option[String],
  id: Option[String],
  properties: Option[ValueProperties]
)

object Value {
  implicit lazy val valueJsonFormat: Format[Value] = Json.format[Value]
}

