namespace OpenAPI

open DefaultApiHandlerParams
open DefaultApiServiceImplementation
open Microsoft.AspNetCore.Mvc
open Microsoft.AspNetCore.Http
open Newtonsoft.Json
open Microsoft.Azure.WebJobs
open System.IO

module DefaultApiHandlers =

    /// <summary>
    /// 
    /// </summary>

    //#region GetAzureIpRangesServiceTagsPublicCloud
    /// <summary>
    /// Get Azure IP Ranges and Service Tags - Public Cloud
    /// </summary>
   [<FunctionName("GetAzureIpRangesServiceTagsPublicCloud")>]
    let GetAzureIpRangesServiceTagsPublicCloud
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.GetAzureIpRangesServiceTagsPublicCloud ()
      match result with
      | GetAzureIpRangesServiceTagsPublicCloudStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

