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


export interface Change {
  /**
   * The number associated with the change.
   */
  changeNumber?: number;
  /**
   * The cloud environment.
   */
  cloud?: string;
  values?: Array<Value>;
}


export interface Value {
  /**
   * The name of the value.
   */
  name?: string;
  /**
   * The unique identifier of the value.
   */
  id?: string;
  properties?: ValueProperties;
}


export interface ValueProperties {
  /**
   * The number associated with the change.
   */
  changeNumber?: number;
  /**
   * The region associated with the value.
   */
  region?: string;
  /**
   * The ID of the region.
   */
  regionId?: number;
  /**
   * The platform associated with the value.
   */
  platform?: string;
  /**
   * The system service associated with the value.
   */
  systemService?: string;
  /**
   * The address prefixes associated with the value.
   */
  addressPrefixes?: Array<string>;
  /**
   * The network features associated with the value.
   */
  networkFeatures?: Array<string>;
}

