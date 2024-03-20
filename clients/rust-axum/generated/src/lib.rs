#![allow(missing_docs, trivial_casts, unused_variables, unused_mut, unused_imports, unused_extern_crates, non_camel_case_types)]
#![allow(unused_imports, unused_attributes)]
#![allow(clippy::derive_partial_eq_without_eq, clippy::disallowed_names)]

use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use types::*;

pub const BASE_PATH: &str = "/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63";
pub const API_VERSION: &str = "0.9.0-pre.0";

        #[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ServiceTagsPublic20240318JsonGetResponse {
    /// Successful response
    Status200_SuccessfulResponse
    (models::Change)
}


/// API
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Api {

                /// Get Azure IP Ranges and Service Tags - Public Cloud.
                ///
                /// ServiceTagsPublic20240318JsonGet - GET /download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_20240318.json
                async fn service_tags_public20240318_json_get(
                &self,
                method: Method,
                host: Host,
                cookies: CookieJar,
                ) -> Result<ServiceTagsPublic20240318JsonGetResponse, String>;

}

#[cfg(feature = "server")]
pub mod server;

pub mod models;
pub mod types;

#[cfg(feature = "server")]
pub(crate) mod header;
