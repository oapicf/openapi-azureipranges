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
  object serviceTagsPublic20240318JsonGet {
    import DefaultApiDelegate.serviceTagsPublic20240318JsonGetResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "ServiceTags_Public_20240318.json" =>
        delegate.serviceTagsPublic20240318JsonGet.handle(req, responses)

    }


    val responses: serviceTagsPublic20240318JsonGetResponses[F] = new serviceTagsPublic20240318JsonGetResponses[F] {
      def resp200(value: Change): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    serviceTagsPublic20240318JsonGet.route
}

object DefaultApiDelegate {
  trait serviceTagsPublic20240318JsonGetResponses[F[_]] {
    def resp200(value: Change): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_]] {

  trait serviceTagsPublic20240318JsonGet {
    import DefaultApiDelegate.serviceTagsPublic20240318JsonGetResponses

    def handle(
      req: Request[F],
      responses: serviceTagsPublic20240318JsonGetResponses[F]
    ): F[Response[F]]

  }
  def serviceTagsPublic20240318JsonGet: serviceTagsPublic20240318JsonGet

}