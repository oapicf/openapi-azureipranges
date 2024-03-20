package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Value
import scala.collection.immutable.Seq

/**
 * 
 * @param changeNumber The number associated with the change.
 * @param cloud The cloud environment.
 * @param values 
 */
case class Change(changeNumber: Option[Int],
                cloud: Option[String],
                values: Option[Seq[Value]]
                )

object Change {
    /**
     * Creates the codec for converting Change from and to JSON.
     */
    implicit val decoder: Decoder[Change] = deriveDecoder
    implicit val encoder: ObjectEncoder[Change] = deriveEncoder
}
