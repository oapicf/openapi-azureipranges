namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ValueProperties

module Value =

  //#region Value

  [<CLIMutable>]
  type Value = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ValueProperties;
  }

  //#endregion
