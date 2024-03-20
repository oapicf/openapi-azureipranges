namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Value

module Change =

  //#region Change

  [<CLIMutable>]
  type Change = {
    [<JsonProperty(PropertyName = "changeNumber")>]
    ChangeNumber : int;
    [<JsonProperty(PropertyName = "cloud")>]
    Cloud : string;
    [<JsonProperty(PropertyName = "values")>]
    Values : Value[];
  }

  //#endregion
