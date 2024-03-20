goog.provide('API.Client.Value');

/**
 * @record
 */
API.Client.Value = function() {}

/**
 * The name of the value.
 * @type {!string}
 * @export
 */
API.Client.Value.prototype.name;

/**
 * The unique identifier of the value.
 * @type {!string}
 * @export
 */
API.Client.Value.prototype.id;

/**
 * @type {!API.Client.ValueProperties}
 * @export
 */
API.Client.Value.prototype.properties;

