package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ValueProperties

/**
 * 
 * @param name The name of the value.
 * @param id The unique identifier of the value.
 * @param properties 
 */
case class Value(name: Option[String],
                id: Option[String],
                properties: Option[ValueProperties]
                )

object Value {
    /**
     * Creates the codec for converting Value from and to JSON.
     */
    implicit val decoder: Decoder[Value] = deriveDecoder
    implicit val encoder: ObjectEncoder[Value] = deriveEncoder
}
