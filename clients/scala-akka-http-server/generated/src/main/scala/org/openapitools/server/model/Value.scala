package org.openapitools.server.model


/**
 * @param name The name of the value. for example: ''null''
 * @param id The unique identifier of the value. for example: ''null''
 * @param properties  for example: ''null''
*/
final case class Value (
  name: Option[String] = None,
  id: Option[String] = None,
  properties: Option[ValueProperties] = None
)

