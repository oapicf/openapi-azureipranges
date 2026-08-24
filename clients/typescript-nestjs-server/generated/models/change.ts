import { Value } from './value';


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

