package api

import play.api.libs.json._
import model.Change

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-20T11:57:18.872865292Z[Etc/UTC]", comments = "Generator version: 7.4.0")
trait DefaultApi {
  /**
    * Get Azure IP Ranges and Service Tags - Public Cloud
    * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    */
  def serviceTagsPublic20240318JsonGet(): Change
}
