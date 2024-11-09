/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { Value } from '../models/Value';
import { HttpFile } from '../http/http';

export class Change {
    /**
    * The number associated with the change.
    */
    'changeNumber'?: number;
    /**
    * The cloud environment.
    */
    'cloud'?: string;
    'values'?: Array<Value>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "changeNumber",
            "baseName": "changeNumber",
            "type": "number",
            "format": ""
        },
        {
            "name": "cloud",
            "baseName": "cloud",
            "type": "string",
            "format": ""
        },
        {
            "name": "values",
            "baseName": "values",
            "type": "Array<Value>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Change.attributeTypeMap;
    }

    public constructor() {
    }
}