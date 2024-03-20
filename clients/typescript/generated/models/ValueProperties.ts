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

import { HttpFile } from '../http/http';

export class ValueProperties {
    /**
    * The number associated with the change.
    */
    'changeNumber'?: number;
    /**
    * The region associated with the value.
    */
    'region'?: string;
    /**
    * The ID of the region.
    */
    'regionId'?: number;
    /**
    * The platform associated with the value.
    */
    'platform'?: string;
    /**
    * The system service associated with the value.
    */
    'systemService'?: string;
    /**
    * The address prefixes associated with the value.
    */
    'addressPrefixes'?: Array<string>;
    /**
    * The network features associated with the value.
    */
    'networkFeatures'?: Array<string>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "changeNumber",
            "baseName": "changeNumber",
            "type": "number",
            "format": ""
        },
        {
            "name": "region",
            "baseName": "region",
            "type": "string",
            "format": ""
        },
        {
            "name": "regionId",
            "baseName": "regionId",
            "type": "number",
            "format": ""
        },
        {
            "name": "platform",
            "baseName": "platform",
            "type": "string",
            "format": ""
        },
        {
            "name": "systemService",
            "baseName": "systemService",
            "type": "string",
            "format": ""
        },
        {
            "name": "addressPrefixes",
            "baseName": "addressPrefixes",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "networkFeatures",
            "baseName": "networkFeatures",
            "type": "Array<string>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ValueProperties.attributeTypeMap;
    }

    public constructor() {
    }
}

