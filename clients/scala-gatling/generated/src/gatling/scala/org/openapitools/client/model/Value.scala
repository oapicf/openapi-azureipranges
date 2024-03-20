
package org.openapitools.client.model


case class Value (
    /* The name of the value. */
    _name: Option[String],
    /* The unique identifier of the value. */
    _id: Option[String],
    _properties: Option[ValueProperties]
)
object Value {
    def toStringBody(var_name: Object, var_id: Object, var_properties: Object) =
        s"""
        | {
        | "name":$var_name,"id":$var_id,"properties":$var_properties
        | }
        """.stripMargin
}
