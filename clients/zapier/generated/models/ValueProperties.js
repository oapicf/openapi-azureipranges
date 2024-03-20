const utils = require('../utils/utils');

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
                key: `${keyPrefix}region`,
                label: `The region associated with the value. - [${labelPrefix}region]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}regionId`,
                label: `The ID of the region. - [${labelPrefix}regionId]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}platform`,
                label: `The platform associated with the value. - [${labelPrefix}platform]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}systemService`,
                label: `The system service associated with the value. - [${labelPrefix}systemService]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}addressPrefixes`,
                label: `The address prefixes associated with the value. - [${labelPrefix}addressPrefixes]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}networkFeatures`,
                label: `The network features associated with the value. - [${labelPrefix}networkFeatures]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'changeNumber': bundle.inputData?.[`${keyPrefix}changeNumber`],
            'region': bundle.inputData?.[`${keyPrefix}region`],
            'regionId': bundle.inputData?.[`${keyPrefix}regionId`],
            'platform': bundle.inputData?.[`${keyPrefix}platform`],
            'systemService': bundle.inputData?.[`${keyPrefix}systemService`],
            'addressPrefixes': bundle.inputData?.[`${keyPrefix}addressPrefixes`],
            'networkFeatures': bundle.inputData?.[`${keyPrefix}networkFeatures`],
        }
    },
}
