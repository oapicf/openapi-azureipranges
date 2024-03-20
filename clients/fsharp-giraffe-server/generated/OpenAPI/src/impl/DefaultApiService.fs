namespace OpenAPI
open OpenAPI.Model.Change
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.ServiceTagsPublic20240318JsonGet ctx  =
            let content = "Successful response" :> obj :?> Change // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ServiceTagsPublic20240318JsonGetStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService