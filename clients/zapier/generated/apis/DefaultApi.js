const samples = require('../samples/DefaultApi');
const Change = require('../models/Change');
const utils = require('../utils/utils');

module.exports = {
    getAzureIpRangesServiceTagsPublicCloud: {
        key: 'getAzureIpRangesServiceTagsPublicCloud',
        noun: 'default',
        display: {
            label: 'Get Azure IP Ranges and Service Tags - Public Cloud',
            description: 'Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.',
            hidden: false,
        },
        operation: {
            inputFields: [
                {
                    key: 'version',
                    label: 'The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506',
                    type: 'string',
                    required: true,
                },
            ],
            outputFields: [
                ...Change.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Content-Type': '',
                        'Accept': 'application/json, application/octet-stream',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(utils.requestOptionsMiddleware(z, bundle, options)).then((response) => {
                    response.throwForStatus();
                    const results = utils.responseOptionsMiddleware(z, bundle, 'getAzureIpRangesServiceTagsPublicCloud', response.json);
                    return results;
                })
            },
            sample: samples['ChangeSample']
        }
    },
}
