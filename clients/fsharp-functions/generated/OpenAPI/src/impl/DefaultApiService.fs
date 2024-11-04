namespace OpenAPI
open OpenAPI.Model.Change
open DefaultApiHandlerParams
open DefaultApiServiceInterface
open System.Collections.Generic
open System

module DefaultApiServiceImplementation =

    //#region Service implementation
    type DefaultApiServiceImpl() =
      interface IDefaultApiService with

        member this.GetAzureIpRangesServiceTagsPublicCloud () =
            let content = "Successful response" :> obj :?> Change // this cast is obviously wrong, and is only intended to allow generated project to compile   
            GetAzureIpRangesServiceTagsPublicCloudStatusCode200 { content = content }

      //#endregion

    let DefaultApiService = DefaultApiServiceImpl() :> IDefaultApiService