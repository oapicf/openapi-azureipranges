use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Host};
use bytes::Bytes;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GetAzureIpRangesServiceTagsPublicCloudResponse {
    /// Successful response
    Status200_SuccessfulResponse
    (String)
}




/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    /// Get Azure IP Ranges and Service Tags - Public Cloud.
    ///
    /// GetAzureIpRangesServiceTagsPublicCloud - GET /download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json
    async fn get_azure_ip_ranges_service_tags_public_cloud(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
      path_params: &models::GetAzureIpRangesServiceTagsPublicCloudPathParams,
    ) -> Result<GetAzureIpRangesServiceTagsPublicCloudResponse, E>;
}
