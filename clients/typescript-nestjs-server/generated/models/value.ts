import { ValueProperties } from './value-properties';


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

