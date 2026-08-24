

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

