package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ValueProperties._

case class ValueProperties (
  /* The number associated with the change. */
  changeNumber: Option[Integer],
/* The region associated with the value. */
  region: Option[String],
/* The ID of the region. */
  regionId: Option[Integer],
/* The platform associated with the value. */
  platform: Option[String],
/* The system service associated with the value. */
  systemService: Option[String],
/* The address prefixes associated with the value. */
  addressPrefixes: Option[List[String]],
/* The network features associated with the value. */
  networkFeatures: Option[List[String]])

object ValueProperties {
  import DateTimeCodecs._

  implicit val ValuePropertiesCodecJson: CodecJson[ValueProperties] = CodecJson.derive[ValueProperties]
  implicit val ValuePropertiesDecoder: EntityDecoder[ValueProperties] = jsonOf[ValueProperties]
  implicit val ValuePropertiesEncoder: EntityEncoder[ValueProperties] = jsonEncoderOf[ValueProperties]
}
