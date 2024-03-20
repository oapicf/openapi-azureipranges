namespace OpenAPI
open DefaultApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module DefaultApiServiceInterface =

    //#region Service interface
    type IDefaultApiService =
      abstract member ServiceTagsPublic20240318JsonGet : unit -> ServiceTagsPublic20240318JsonGetResult
    //#endregion