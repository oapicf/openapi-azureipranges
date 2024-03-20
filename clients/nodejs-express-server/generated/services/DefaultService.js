/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Azure IP Ranges and Service Tags - Public Cloud
* Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
*
* returns Change
* */
const serviceTags_Public_20240318_jsonGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  serviceTags_Public_20240318_jsonGET,
};
