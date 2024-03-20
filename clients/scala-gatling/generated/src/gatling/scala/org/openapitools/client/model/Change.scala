
package org.openapitools.client.model


case class Change (
    /* The number associated with the change. */
    _changeNumber: Option[Integer],
    /* The cloud environment. */
    _cloud: Option[String],
    _values: Option[List[Value]]
)
object Change {
    def toStringBody(var_changeNumber: Object, var_cloud: Object, var_values: Object) =
        s"""
        | {
        | "changeNumber":$var_changeNumber,"cloud":$var_cloud,"values":$var_values
        | }
        """.stripMargin
}
