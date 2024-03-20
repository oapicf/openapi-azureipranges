use std::collections::HashMap;

use axum::{body::Body, extract::*, response::Response, routing::*};
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::{header::CONTENT_TYPE, HeaderMap, HeaderName, HeaderValue, Method, StatusCode};
use tracing::error;
use validator::{Validate, ValidationErrors};

use crate::{header, types::*};

#[allow(unused_imports)]
use crate::models;

use crate::{Api,
     ServiceTagsPublic20240318JsonGetResponse
};

/// Setup API Server.
pub fn new<I, A>(api_impl: I) -> Router
where
    I: AsRef<A> + Clone + Send + Sync + 'static,
    A: Api + 'static,
{
    // build our application with a route
    Router::new()
        .route("/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_20240318.json",
            get(service_tags_public20240318_json_get::<I, A>)
        )
        .with_state(api_impl)
}


#[tracing::instrument(skip_all)]
fn service_tags_public20240318_json_get_validation(
) -> std::result::Result<(
), ValidationErrors>
{

Ok((
))
}

/// ServiceTagsPublic20240318JsonGet - GET /download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_20240318.json
#[tracing::instrument(skip_all)]
async fn service_tags_public20240318_json_get<I, A>(
  method: Method,
  host: Host,
  cookies: CookieJar,
 State(api_impl): State<I>,
) -> Result<Response, StatusCode>
where 
    I: AsRef<A> + Send + Sync,
    A: Api,
{

      #[allow(clippy::redundant_closure)]
      let validation = tokio::task::spawn_blocking(move || 
    service_tags_public20240318_json_get_validation(
    )
  ).await.unwrap();

  let Ok((
  )) = validation else {
    return Response::builder()
            .status(StatusCode::BAD_REQUEST)
            .body(Body::from(validation.unwrap_err().to_string()))
            .map_err(|_| StatusCode::BAD_REQUEST); 
  };

  let result = api_impl.as_ref().service_tags_public20240318_json_get(
      method,
      host,
      cookies,
  ).await;

  let mut response = Response::builder();

  let resp = match result {
                                            Ok(rsp) => match rsp {
                                                ServiceTagsPublic20240318JsonGetResponse::Status200_SuccessfulResponse
                                                    (body)
                                                => {

                                                  let mut response = response.status(200);
                                                  {
                                                    let mut response_headers = response.headers_mut().unwrap();
                                                    response_headers.insert(
                                                        CONTENT_TYPE,
                                                        HeaderValue::from_str("application/json").map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })?);
                                                  }

                                                  let body_content =  tokio::task::spawn_blocking(move ||
                                                      serde_json::to_vec(&body).map_err(|e| {
                                                        error!(error = ?e);
                                                        StatusCode::INTERNAL_SERVER_ERROR
                                                      })).await.unwrap()?;
                                                  response.body(Body::from(body_content))
                                                },
                                            },
                                            Err(_) => {
                                                // Application code returned an error. This should not happen, as the implementation should
                                                // return a valid response.
                                                response.status(500).body(Body::empty())
                                            },
                                        };

                                        resp.map_err(|e| { error!(error = ?e); StatusCode::INTERNAL_SERVER_ERROR })
}
