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

import { exists, mapValues } from '../runtime';
import {
    Value,
    ValueFromJSON,
    ValueToJSON,
} from './';

/**
 * 
 * @export
 * @interface Change
 */
export interface Change  {
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

export function ChangeFromJSON(json: any): Change {
    return {
        'changeNumber': !exists(json, 'changeNumber') ? undefined : json['changeNumber'],
        'cloud': !exists(json, 'cloud') ? undefined : json['cloud'],
        'values': !exists(json, 'values') ? undefined : (json['values'] as Array<any>).map(ValueFromJSON),
    };
}

export function ChangeToJSON(value?: Change): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'changeNumber': value.changeNumber,
        'cloud': value.cloud,
        'values': value.values === undefined ? undefined : (value.values as Array<any>).map(ValueToJSON),
    };
}


