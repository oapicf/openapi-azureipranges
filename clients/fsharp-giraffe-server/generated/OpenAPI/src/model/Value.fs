namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ValueProperties

module Value =

  //#region Value


  type Value = {
    Name : string;
    Id : string;
    Properties : ValueProperties;
  }
  //#endregion
