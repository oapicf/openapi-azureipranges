package api

import play.api.libs.json._
import model.Change

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T00:19:06.933738506Z[Etc/UTC]", comments = "Generator version: 7.9.0")
trait DefaultApi {
  /**
    * Get Azure IP Ranges and Service Tags - Public Cloud
    * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    */
  def getAzureIpRangesServiceTagsPublicCloud(version: String): Change
}
