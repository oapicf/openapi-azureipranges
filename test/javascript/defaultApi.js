const assert = require('assert');
const fs = require('fs');
const path = require('path');
const OpenapiAzureipranges = require('openapi_azureipranges');
const api = new OpenapiAzureipranges.DefaultApi();
const version = fs.readFileSync(path.join(__dirname, '../../stage/service-tags-version.txt'), 'utf8').trim();

describe('default API', function() {
  describe('getAzureIpRangesServiceTagsPublicCloud', function() {
    it('should return data', function(done) {
      const callback = function(error, data, response) {
        if (error) {
          console.error(error);
          done(error);
        } else {
          console.log('API called successfully. Returned data: ' + data);
          done();
        }
      };
      api.getAzureIpRangesServiceTagsPublicCloud(version, callback);
    });
  });
});
