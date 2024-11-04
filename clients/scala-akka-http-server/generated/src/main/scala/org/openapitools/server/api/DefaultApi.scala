package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.Change


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path("ServiceTags_Public_{version}.json") { (version) => 
      get {  
            defaultService.getAzureIpRangesServiceTagsPublicCloud(version = version)
      }
    }
}


trait DefaultApiService {

  def getAzureIpRangesServiceTagsPublicCloud200(responseChange: Change)(implicit toEntityMarshallerChange: ToEntityMarshaller[Change]): Route =
    complete((200, responseChange))
  /**
   * Code: 200, Message: Successful response, DataType: Change
   */
  def getAzureIpRangesServiceTagsPublicCloud(version: String)
      (implicit toEntityMarshallerChange: ToEntityMarshaller[Change]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerChange: ToEntityMarshaller[Change]

}

