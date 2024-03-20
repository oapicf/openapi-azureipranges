package org.openapitools.server.model


/**
 * @param changeNumber The number associated with the change. for example: ''null''
 * @param region The region associated with the value. for example: ''null''
 * @param regionId The ID of the region. for example: ''null''
 * @param platform The platform associated with the value. for example: ''null''
 * @param systemService The system service associated with the value. for example: ''null''
 * @param addressPrefixes The address prefixes associated with the value. for example: ''null''
 * @param networkFeatures The network features associated with the value. for example: ''null''
*/
final case class ValueProperties (
  changeNumber: Option[Int] = None,
  region: Option[String] = None,
  regionId: Option[Int] = None,
  platform: Option[String] = None,
  systemService: Option[String] = None,
  addressPrefixes: Option[Seq[String]] = None,
  networkFeatures: Option[Seq[String]] = None
)

