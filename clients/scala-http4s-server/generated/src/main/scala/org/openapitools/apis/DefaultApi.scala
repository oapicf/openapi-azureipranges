package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.Change


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class DefaultApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: DefaultApiDelegate[F]) extends Http4sDsl[F] {
  object getAzureIpRangesServiceTagsPublicCloud {
    import DefaultApiDelegate.getAzureIpRangesServiceTagsPublicCloudResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "ServiceTags_Public_{version}.json" =>
        delegate.getAzureIpRangesServiceTagsPublicCloud.handle(req, version, responses)

    }


    val responses: getAzureIpRangesServiceTagsPublicCloudResponses[F] = new getAzureIpRangesServiceTagsPublicCloudResponses[F] {
      def resp200(value: Change): F[Response[F]] = Ok(value)
      def resp200(): F[Response[F]] = Ok()
    }
  }

  val routes =
    getAzureIpRangesServiceTagsPublicCloud.route
}

object DefaultApiDelegate {
  trait getAzureIpRangesServiceTagsPublicCloudResponses[F[_]] {
    def resp200(value: Change): F[Response[F]]
    def resp200(): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_]] {

  trait getAzureIpRangesServiceTagsPublicCloud {
    import DefaultApiDelegate.getAzureIpRangesServiceTagsPublicCloudResponses

    def handle(
      req: Request[F],
      version: ,
      responses: getAzureIpRangesServiceTagsPublicCloudResponses[F]
    ): F[Response[F]]

  }
  def getAzureIpRangesServiceTagsPublicCloud: getAzureIpRangesServiceTagsPublicCloud

}