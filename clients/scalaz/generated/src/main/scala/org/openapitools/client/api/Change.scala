package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Change._

case class Change (
  /* The number associated with the change. */
  changeNumber: Option[Integer],
/* The cloud environment. */
  cloud: Option[String],
values: Option[List[Value]])

object Change {
  import DateTimeCodecs._

  implicit val ChangeCodecJson: CodecJson[Change] = CodecJson.derive[Change]
  implicit val ChangeDecoder: EntityDecoder[Change] = jsonOf[Change]
  implicit val ChangeEncoder: EntityEncoder[Change] = jsonEncoderOf[Change]
}
