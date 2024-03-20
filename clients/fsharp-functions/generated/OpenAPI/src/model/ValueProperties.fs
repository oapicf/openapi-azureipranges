namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module ValueProperties =

  //#region ValueProperties

  [<CLIMutable>]
  type ValueProperties = {
    [<JsonProperty(PropertyName = "changeNumber")>]
    ChangeNumber : int;
    [<JsonProperty(PropertyName = "region")>]
    Region : string;
    [<JsonProperty(PropertyName = "regionId")>]
    RegionId : int;
    [<JsonProperty(PropertyName = "platform")>]
    Platform : string;
    [<JsonProperty(PropertyName = "systemService")>]
    SystemService : string;
    [<JsonProperty(PropertyName = "addressPrefixes")>]
    AddressPrefixes : string[];
    [<JsonProperty(PropertyName = "networkFeatures")>]
    NetworkFeatures : string[];
  }

  //#endregion
