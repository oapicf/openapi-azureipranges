import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { Change } from '../models/Change';
import { Value } from '../models/Value';
import { ValueProperties } from '../models/ValueProperties';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     */
    public serviceTagsPublic20240318JsonGetWithHttpInfo(_options?: Configuration): Promise<HttpInfo<Change>> {
        const result = this.api.serviceTagsPublic20240318JsonGetWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     */
    public serviceTagsPublic20240318JsonGet(_options?: Configuration): Promise<Change> {
        const result = this.api.serviceTagsPublic20240318JsonGet(_options);
        return result.toPromise();
    }


}



