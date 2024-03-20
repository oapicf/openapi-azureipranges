import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { Change } from '../models/Change';
import { Value } from '../models/Value';
import { ValueProperties } from '../models/ValueProperties';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiServiceTagsPublic20240318JsonGetRequest {
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
    public serviceTagsPublic20240318JsonGetWithHttpInfo(param: DefaultApiServiceTagsPublic20240318JsonGetRequest = {}, options?: Configuration): Promise<HttpInfo<Change>> {
        return this.api.serviceTagsPublic20240318JsonGetWithHttpInfo( options).toPromise();
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * @param param the request object
     */
    public serviceTagsPublic20240318JsonGet(param: DefaultApiServiceTagsPublic20240318JsonGetRequest = {}, options?: Configuration): Promise<Change> {
        return this.api.serviceTagsPublic20240318JsonGet( options).toPromise();
    }

}
