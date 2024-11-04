namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open DefaultApiServiceImplementation
open OpenAPI.Model.Change

module DefaultApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region GetAzureIpRangesServiceTagsPublicCloud
    /// <summary>
    /// Get Azure IP Ranges and Service Tags - Public Cloud
    /// </summary>

    let GetAzureIpRangesServiceTagsPublicCloud (pathParams:GetAzureIpRangesServiceTagsPublicCloudPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : GetAzureIpRangesServiceTagsPublicCloudArgs
          let result = DefaultApiService.GetAzureIpRangesServiceTagsPublicCloud ctx serviceArgs
          return! (match result with
                      | GetAzureIpRangesServiceTagsPublicCloudStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

