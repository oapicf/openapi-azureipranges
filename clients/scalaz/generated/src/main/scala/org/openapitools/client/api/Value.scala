package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Value._

case class Value (
  /* The name of the value. */
  name: Option[String],
/* The unique identifier of the value. */
  id: Option[String],
properties: Option[ValueProperties])

object Value {
  import DateTimeCodecs._

  implicit val ValueCodecJson: CodecJson[Value] = CodecJson.derive[Value]
  implicit val ValueDecoder: EntityDecoder[Value] = jsonOf[Value]
  implicit val ValueEncoder: EntityEncoder[Value] = jsonEncoderOf[Value]
}
