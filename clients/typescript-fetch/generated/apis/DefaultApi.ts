/* tslint:disable */
/* eslint-disable */
/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  Change,
} from '../models/index';
import {
    ChangeFromJSON,
    ChangeToJSON,
} from '../models/index';

export interface GetAzureIpRangesServiceTagsPublicCloudRequest {
    version: string;
}

/**
 * 
 */
export class DefaultApi extends runtime.BaseAPI {

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     */
    async getAzureIpRangesServiceTagsPublicCloudRaw(requestParameters: GetAzureIpRangesServiceTagsPublicCloudRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Change>> {
        if (requestParameters['version'] == null) {
            throw new runtime.RequiredError(
                'version',
                'Required parameter "version" was null or undefined when calling getAzureIpRangesServiceTagsPublicCloud().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/ServiceTags_Public_{version}.json`.replace(`{${"version"}}`, encodeURIComponent(String(requestParameters['version']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ChangeFromJSON(jsonValue));
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     */
    async getAzureIpRangesServiceTagsPublicCloud(requestParameters: GetAzureIpRangesServiceTagsPublicCloudRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Change> {
        const response = await this.getAzureIpRangesServiceTagsPublicCloudRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
