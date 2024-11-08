package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Change

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-08T22:33:35.443713281Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class DefaultApiController @Inject()(cc: ControllerComponents, api: DefaultApi) extends AbstractController(cc) {
  /**
    * GET /download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_:version.json
    * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    */
  def getAzureIpRangesServiceTagsPublicCloud(version: String): Action[AnyContent] = Action { request =>
    def executeApi(): Change = {
      api.getAzureIpRangesServiceTagsPublicCloud(version)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
