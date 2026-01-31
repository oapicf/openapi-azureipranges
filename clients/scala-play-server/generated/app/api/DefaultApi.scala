package api

import play.api.libs.json._
import model.Change

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T02:45:18.558558983Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait DefaultApi {
  /**
    * Get Azure IP Ranges and Service Tags - Public Cloud
    * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    */
  def getAzureIpRangesServiceTagsPublicCloud(version: String): Change
}
