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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface ValueProperties
 */
export interface ValueProperties {
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
 * Check if a given object implements the ValueProperties interface.
 */
export function instanceOfValueProperties(value: object): value is ValueProperties {
    return true;
}

export function ValuePropertiesFromJSON(json: any): ValueProperties {
    return ValuePropertiesFromJSONTyped(json, false);
}

export function ValuePropertiesFromJSONTyped(json: any, ignoreDiscriminator: boolean): ValueProperties {
    if (json == null) {
        return json;
    }
    return {
        
        'changeNumber': json['changeNumber'] == null ? undefined : json['changeNumber'],
        'region': json['region'] == null ? undefined : json['region'],
        'regionId': json['regionId'] == null ? undefined : json['regionId'],
        'platform': json['platform'] == null ? undefined : json['platform'],
        'systemService': json['systemService'] == null ? undefined : json['systemService'],
        'addressPrefixes': json['addressPrefixes'] == null ? undefined : json['addressPrefixes'],
        'networkFeatures': json['networkFeatures'] == null ? undefined : json['networkFeatures'],
    };
}

export function ValuePropertiesToJSON(value?: ValueProperties | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'changeNumber': value['changeNumber'],
        'region': value['region'],
        'regionId': value['regionId'],
        'platform': value['platform'],
        'systemService': value['systemService'],
        'addressPrefixes': value['addressPrefixes'],
        'networkFeatures': value['networkFeatures'],
    };
}

