goog.provide('API.Client.ValueProperties');

/**
 * @record
 */
API.Client.ValueProperties = function() {}

/**
 * The number associated with the change.
 * @type {!number}
 * @export
 */
API.Client.ValueProperties.prototype.changeNumber;

/**
 * The region associated with the value.
 * @type {!string}
 * @export
 */
API.Client.ValueProperties.prototype.region;

/**
 * The ID of the region.
 * @type {!number}
 * @export
 */
API.Client.ValueProperties.prototype.regionId;

/**
 * The platform associated with the value.
 * @type {!string}
 * @export
 */
API.Client.ValueProperties.prototype.platform;

/**
 * The system service associated with the value.
 * @type {!string}
 * @export
 */
API.Client.ValueProperties.prototype.systemService;

/**
 * The address prefixes associated with the value.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ValueProperties.prototype.addressPrefixes;

/**
 * The network features associated with the value.
 * @type {!Array<!string>}
 * @export
 */
API.Client.ValueProperties.prototype.networkFeatures;

