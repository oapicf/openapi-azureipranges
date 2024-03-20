const samples = require('../samples/DefaultApi');
const Change = require('../models/Change');
const utils = require('../utils/utils');

module.exports = {
    serviceTagsPublic20240318JsonGet: {
        key: 'serviceTagsPublic20240318JsonGet',
        noun: 'default',
        display: {
            label: 'Get Azure IP Ranges and Service Tags - Public Cloud',
            description: 'Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.',
            hidden: false,
        },
        operation: {
            inputFields: [
            ],
            outputFields: [
                ...Change.fields('', false),
            ],
            perform: async (z, bundle) => {
                const options = {
                    url: utils.replacePathParameters('https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_20240318.json'),
                    method: 'GET',
                    removeMissingValuesFrom: { params: true, body: true },
                    headers: {
                        'Authorization': 'Bearer {{bundle.authData.access_token}}',
                        'Content-Type': '',
                        'Accept': 'application/json',
                    },
                    params: {
                    },
                    body: {
                    },
                }
                return z.request(options).then((response) => {
                    response.throwForStatus();
                    const results = response.json;
                    return results;
                })
            },
            sample: samples['ChangeSample']
        }
    },
}
