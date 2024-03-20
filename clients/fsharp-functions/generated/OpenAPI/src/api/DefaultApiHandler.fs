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

    //#region ServiceTagsPublic20240318JsonGet
    /// <summary>
    /// Get Azure IP Ranges and Service Tags - Public Cloud
    /// </summary>
   [<FunctionName("ServiceTagsPublic20240318JsonGet")>]
    let ServiceTagsPublic20240318JsonGet
        ([<HttpTrigger(Extensions.Http.AuthorizationLevel.Anonymous, "GET", Route = "/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_20240318.json")>]
        req:HttpRequest ) =

      let result = DefaultApiService.ServiceTagsPublic20240318JsonGet ()
      match result with
      | ServiceTagsPublic20240318JsonGetStatusCode200 resolved ->
          let content = JsonConvert.SerializeObject resolved.content
          let responseContentType = "application/json"
          ContentResult(Content = content, ContentType = responseContentType, StatusCode = System.Nullable(200))

