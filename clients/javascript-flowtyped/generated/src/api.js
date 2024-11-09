// @flow
/* eslint-disable no-use-before-define */
/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH: string = "https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 */
export type FetchAPI = {
    (url: string, init?: any): Promise<Response>;
}

/**
 *
 * @export
 */
export type FetchArgs = {
    url: string;
    options: {};
}

/**
 *
 * @export
 */
export type RequestOptions = {
    headers?: {};
    query?: {};
    body?: string | FormData;
}

/**
 * * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name:string = "RequiredError"
    constructor(field: string, msg?: string) {
        super(msg);
    }
}

/**
 * 
 * @export
 */
export type Change = {
    /**
     * The number associated with the change.
     * @type {number}
     * @memberof Change
     */
    changeNumber?: number;
    /**
     * The cloud environment.
     * @type {string}
     * @memberof Change
     */
    cloud?: string;
    /**
     * 
     * @type {Array<Value>}
     * @memberof Change
     */
    values?: Array<Value>;
}

/**
 * 
 * @export
 */
export type Value = {
    /**
     * The name of the value.
     * @type {string}
     * @memberof Value
     */
    name?: string;
    /**
     * The unique identifier of the value.
     * @type {string}
     * @memberof Value
     */
    id?: string;
    /**
     * 
     * @type {ValueProperties}
     * @memberof Value
     */
    properties?: ValueProperties;
}

/**
 * 
 * @export
 */
export type ValueProperties = {
    /**
     * The number associated with the change.
     * @type {number}
     * @memberof ValueProperties
     */
    changeNumber?: number;
    /**
     * The region associated with the value.
     * @type {string}
     * @memberof ValueProperties
     */
    region?: string;
    /**
     * The ID of the region.
     * @type {number}
     * @memberof ValueProperties
     */
    regionId?: number;
    /**
     * The platform associated with the value.
     * @type {string}
     * @memberof ValueProperties
     */
    platform?: string;
    /**
     * The system service associated with the value.
     * @type {string}
     * @memberof ValueProperties
     */
    systemService?: string;
    /**
     * The address prefixes associated with the value.
     * @type {Array<string>}
     * @memberof ValueProperties
     */
    addressPrefixes?: Array<string>;
    /**
     * The network features associated with the value.
     * @type {Array<string>}
     * @memberof ValueProperties
     */
    networkFeatures?: Array<string>;
}



/**
 * DefaultApi - fetch parameter creator
 * @export
 */
export const DefaultApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
         * @summary Get Azure IP Ranges and Service Tags - Public Cloud
         * @throws {RequiredError}
         */
        getAzureIpRangesServiceTagsPublicCloud(version: string, options: RequestOptions): FetchArgs {
            // verify required parameter 'version' is not null or undefined
            if (version === null || version === undefined) {
                throw new RequiredError('version','Required parameter version was null or undefined when calling getAzureIpRangesServiceTagsPublicCloud.');
            }
            const localVarPath = `/ServiceTags_Public_{version}.json`
                .replace(`{${"version"}}`, encodeURIComponent(String(version)));
            const localVarUrlObj = url.parse(localVarPath, true);
            const localVarRequestOptions: RequestOptions = Object.assign({}, { method: 'GET' }, options);
            const localVarHeaderParameter = {};
            const localVarQueryParameter = {};

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            localVarUrlObj.search = null;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

export type DefaultApiType = { 
    getAzureIpRangesServiceTagsPublicCloud(version: string, options?: RequestOptions): Promise<Change>,
}

/**
 * DefaultApi - factory function to inject configuration 
 * @export
 */
export const DefaultApi = function(configuration?: Configuration, fetch: FetchAPI = portableFetch): DefaultApiType {
    const basePath: string = (configuration && configuration.basePath) || BASE_PATH;
    return {
        /**
         * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
         * @summary Get Azure IP Ranges and Service Tags - Public Cloud
         * @throws {RequiredError}
         */
        getAzureIpRangesServiceTagsPublicCloud(version: string, options?: RequestOptions = {}): Promise<Change> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).getAzureIpRangesServiceTagsPublicCloud(version, options);
            return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                if (response.status >= 200 && response.status < 300) {
                    return response.json();
                } else {
                    throw response;
                }
            });
        },
    }
};


export type ApiTypes = { 
    DefaultApi: DefaultApiType,
 }