goog.provide('API.Client.Change');

/**
 * @record
 */
API.Client.Change = function() {}

/**
 * The number associated with the change.
 * @type {!number}
 * @export
 */
API.Client.Change.prototype.changeNumber;

/**
 * The cloud environment.
 * @type {!string}
 * @export
 */
API.Client.Change.prototype.cloud;

/**
 * @type {!Array<!API.Client.Value>}
 * @export
 */
API.Client.Change.prototype.values;

