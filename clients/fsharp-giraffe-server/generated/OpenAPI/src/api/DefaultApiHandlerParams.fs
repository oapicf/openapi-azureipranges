namespace OpenAPI

open OpenAPI.Model.Change
open System.Collections.Generic
open System

module DefaultApiHandlerParams =

    //#region Path parameters
    [<CLIMutable>]
    type GetAzureIpRangesServiceTagsPublicCloudPathParams = {
      version : string ;
    }
    //#endregion


    type GetAzureIpRangesServiceTagsPublicCloudStatusCode200Response = {
      content:Change;
      
    }
    type GetAzureIpRangesServiceTagsPublicCloudResult = GetAzureIpRangesServiceTagsPublicCloudStatusCode200 of GetAzureIpRangesServiceTagsPublicCloudStatusCode200Response

    type GetAzureIpRangesServiceTagsPublicCloudArgs = {
      pathParams:GetAzureIpRangesServiceTagsPublicCloudPathParams;
    }
