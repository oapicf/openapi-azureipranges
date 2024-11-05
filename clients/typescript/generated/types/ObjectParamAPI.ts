import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { Change } from '../models/Change';
import { Value } from '../models/Value';
import { ValueProperties } from '../models/ValueProperties';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiGetAzureIpRangesServiceTagsPublicCloudRequest {
    /**
     * The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApigetAzureIpRangesServiceTagsPublicCloud
     */
    version: string
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * @param param the request object
     */
    public getAzureIpRangesServiceTagsPublicCloudWithHttpInfo(param: DefaultApiGetAzureIpRangesServiceTagsPublicCloudRequest, options?: Configuration): Promise<HttpInfo<Change>> {
        return this.api.getAzureIpRangesServiceTagsPublicCloudWithHttpInfo(param.version,  options).toPromise();
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * @param param the request object
     */
    public getAzureIpRangesServiceTagsPublicCloud(param: DefaultApiGetAzureIpRangesServiceTagsPublicCloudRequest, options?: Configuration): Promise<Change> {
        return this.api.getAzureIpRangesServiceTagsPublicCloud(param.version,  options).toPromise();
    }

}
