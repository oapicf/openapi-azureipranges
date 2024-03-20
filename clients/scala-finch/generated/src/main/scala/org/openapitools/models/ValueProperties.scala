package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

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
case class ValueProperties(changeNumber: Option[Int],
                region: Option[String],
                regionId: Option[Int],
                platform: Option[String],
                systemService: Option[String],
                addressPrefixes: Option[Seq[String]],
                networkFeatures: Option[Seq[String]]
                )

object ValueProperties {
    /**
     * Creates the codec for converting ValueProperties from and to JSON.
     */
    implicit val decoder: Decoder[ValueProperties] = deriveDecoder
    implicit val encoder: ObjectEncoder[ValueProperties] = deriveEncoder
}
