// tslint:disable
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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    Change,
    ChangeFromJSON,
    ChangeToJSON,
} from '../models';


/**
 * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
 * Get Azure IP Ranges and Service Tags - Public Cloud
 */
function serviceTagsPublic20240318JsonGetRaw<T>( requestConfig: runtime.TypedQueryConfig<T, Change> = {}): QueryConfig<T> {
    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/ServiceTags_Public_20240318.json`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ChangeFromJSON(body), text);
    }

    return config;
}

/**
* Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
* Get Azure IP Ranges and Service Tags - Public Cloud
*/
export function serviceTagsPublic20240318JsonGet<T>( requestConfig?: runtime.TypedQueryConfig<T, Change>): QueryConfig<T> {
    return serviceTagsPublic20240318JsonGetRaw( requestConfig);
}

