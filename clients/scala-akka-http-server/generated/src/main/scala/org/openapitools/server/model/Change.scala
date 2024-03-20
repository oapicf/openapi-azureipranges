package org.openapitools.server.model


/**
 * @param changeNumber The number associated with the change. for example: ''null''
 * @param cloud The cloud environment. for example: ''null''
 * @param values  for example: ''null''
*/
final case class Change (
  changeNumber: Option[Int] = None,
  cloud: Option[String] = None,
  values: Option[Seq[Value]] = None
)

