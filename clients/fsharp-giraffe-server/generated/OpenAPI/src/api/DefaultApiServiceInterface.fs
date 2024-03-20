namespace OpenAPI
open DefaultApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member ServiceTagsPublic20240318JsonGet:HttpContext ->ServiceTagsPublic20240318JsonGetResult
    //#endregion