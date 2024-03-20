const utils = require('../utils/utils');
const ValueProperties = require('../models/ValueProperties');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The name of the value. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `The unique identifier of the value. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...ValueProperties.fields(`${keyPrefix}properties`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'properties': utils.removeIfEmpty(ValueProperties.mapping(bundle, `${keyPrefix}properties`)),
        }
    },
}
