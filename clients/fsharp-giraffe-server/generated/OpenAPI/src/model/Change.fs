namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Value

module Change =

  //#region Change


  type Change = {
    ChangeNumber : int;
    Cloud : string;
    Values : Value[];
  }
  //#endregion
