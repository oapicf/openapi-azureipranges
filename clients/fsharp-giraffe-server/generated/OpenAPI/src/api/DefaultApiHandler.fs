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

    //#region ServiceTagsPublic20240318JsonGet
    /// <summary>
    /// Get Azure IP Ranges and Service Tags - Public Cloud
    /// </summary>

    let ServiceTagsPublic20240318JsonGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = DefaultApiService.ServiceTagsPublic20240318JsonGet ctx 
          return! (match result with
                      | ServiceTagsPublic20240318JsonGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
          ) next ctx
        }
    //#endregion

