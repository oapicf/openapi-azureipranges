package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }


/**
* 
* @param changeNumber The number associated with the change.
* @param cloud The cloud environment.
* @param values 
*/

case class Change(
  changeNumber: Option[Int],
  cloud: Option[String],
  values: Option[List[Value]]
)
object Change {
  implicit val encoderChange: Encoder[Change] = deriveEncoder[Change].mapJson(_.dropNullValues)
  implicit val decoderChange: Decoder[Change] = deriveDecoder[Change]
}

/**
* 
* @param name The name of the value.
* @param id The unique identifier of the value.
* @param properties 
*/

case class Value(
  name: Option[String],
  id: Option[String],
  properties: Option[ValueProperties]
)
object Value {
  implicit val encoderValue: Encoder[Value] = deriveEncoder[Value].mapJson(_.dropNullValues)
  implicit val decoderValue: Decoder[Value] = deriveDecoder[Value]
}

/**
* 
* @param changeNumber The number associated with the change.
* @param region The region associated with the value.
* @param regionId The ID of the region.
* @param platform The platform associated with the value.
* @param systemService The system service associated with the value.
* @param addressPrefixes The address prefixes associated with the value.
* @param networkFeatures The network features associated with the value.
*/

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
  implicit val encoderValueProperties: Encoder[ValueProperties] = deriveEncoder[ValueProperties].mapJson(_.dropNullValues)
  implicit val decoderValueProperties: Decoder[ValueProperties] = deriveDecoder[ValueProperties]
}

