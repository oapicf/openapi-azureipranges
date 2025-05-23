// tslint:disable
/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts } from '../runtime';
import type {
    Change,
} from '../models';

export interface GetAzureIpRangesServiceTagsPublicCloudRequest {
    version: string;
}

/**
 * no description
 */
export class DefaultApi extends BaseAPI {

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     */
    getAzureIpRangesServiceTagsPublicCloud({ version }: GetAzureIpRangesServiceTagsPublicCloudRequest): Observable<Change>
    getAzureIpRangesServiceTagsPublicCloud({ version }: GetAzureIpRangesServiceTagsPublicCloudRequest, opts?: OperationOpts): Observable<AjaxResponse<Change>>
    getAzureIpRangesServiceTagsPublicCloud({ version }: GetAzureIpRangesServiceTagsPublicCloudRequest, opts?: OperationOpts): Observable<Change | AjaxResponse<Change>> {
        throwIfNullOrUndefined(version, 'version', 'getAzureIpRangesServiceTagsPublicCloud');

        return this.request<Change>({
            url: '/ServiceTags_Public_{version}.json'.replace('{version}', encodeURI(version)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}
