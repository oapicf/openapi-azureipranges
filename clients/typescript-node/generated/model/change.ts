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

import { RequestFile } from './models';
import { Value } from './value';

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

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "changeNumber",
            "baseName": "changeNumber",
            "type": "number"
        },
        {
            "name": "cloud",
            "baseName": "cloud",
            "type": "string"
        },
        {
            "name": "values",
            "baseName": "values",
            "type": "Array<Value>"
        }    ];

    static getAttributeTypeMap() {
        return Change.attributeTypeMap;
    }
}

