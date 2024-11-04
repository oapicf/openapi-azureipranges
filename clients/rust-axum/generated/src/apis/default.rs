use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::{CookieJar, Multipart};
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
    (models::Change)
}


/// Default
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Default {
    /// Get Azure IP Ranges and Service Tags - Public Cloud.
    ///
    /// GetAzureIpRangesServiceTagsPublicCloud - GET /download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_{version}.json
    async fn get_azure_ip_ranges_service_tags_public_cloud(
    &self,
    method: Method,
    host: Host,
    cookies: CookieJar,
      path_params: models::GetAzureIpRangesServiceTagsPublicCloudPathParams,
    ) -> Result<GetAzureIpRangesServiceTagsPublicCloudResponse, String>;
}
