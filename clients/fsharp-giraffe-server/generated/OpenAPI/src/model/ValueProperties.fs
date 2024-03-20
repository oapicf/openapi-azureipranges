namespace OpenAPI.Model

open System
open System.Collections.Generic

module ValueProperties =

  //#region ValueProperties


  type ValueProperties = {
    ChangeNumber : int;
    Region : string;
    RegionId : int;
    Platform : string;
    SystemService : string;
    AddressPrefixes : string[];
    NetworkFeatures : string[];
  }
  //#endregion
