/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Azure IP Ranges and Service Tags - Public Cloud
* Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
*
* version String The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
* returns Change
* */
const getAzureIpRangesServiceTagsPublicCloud = ({ version }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        version,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getAzureIpRangesServiceTagsPublicCloud,
};
