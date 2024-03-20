
package org.openapitools.client.model


case class ValueProperties (
    /* The number associated with the change. */
    _changeNumber: Option[Integer],
    /* The region associated with the value. */
    _region: Option[String],
    /* The ID of the region. */
    _regionId: Option[Integer],
    /* The platform associated with the value. */
    _platform: Option[String],
    /* The system service associated with the value. */
    _systemService: Option[String],
    /* The address prefixes associated with the value. */
    _addressPrefixes: Option[List[String]],
    /* The network features associated with the value. */
    _networkFeatures: Option[List[String]]
)
object ValueProperties {
    def toStringBody(var_changeNumber: Object, var_region: Object, var_regionId: Object, var_platform: Object, var_systemService: Object, var_addressPrefixes: Object, var_networkFeatures: Object) =
        s"""
        | {
        | "changeNumber":$var_changeNumber,"region":$var_region,"regionId":$var_regionId,"platform":$var_platform,"systemService":$var_systemService,"addressPrefixes":$var_addressPrefixes,"networkFeatures":$var_networkFeatures
        | }
        """.stripMargin
}
