const assert = require('assert');
const OpenapiAzureipranges = require('openapi_azureipranges');
const api = new OpenapiAzureipranges.DefaultApi();

describe('default API', function() {
  describe('serviceTagsPublic20240318JsonGet', function() {
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
      api.serviceTagsPublic20240318JsonGet(callback);
    });
  });
});
