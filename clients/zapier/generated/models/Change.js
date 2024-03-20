const utils = require('../utils/utils');
const Value = require('../models/Value');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}changeNumber`,
                label: `The number associated with the change. - [${labelPrefix}changeNumber]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cloud`,
                label: `The cloud environment. - [${labelPrefix}cloud]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}values`,
                label: `[${labelPrefix}values]`,
                children: Value.fields(`${keyPrefix}values${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'changeNumber': bundle.inputData?.[`${keyPrefix}changeNumber`],
            'cloud': bundle.inputData?.[`${keyPrefix}cloud`],
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, Value),
        }
    },
}
