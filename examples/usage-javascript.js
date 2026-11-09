var OpenapiAzureipranges = require('openapi_azureipranges');

var api = new OpenapiAzureipranges.DefaultApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getAzureIpRangesServiceTagsPublicCloud(process.env.SERVICE_TAGS_VERSION, callback);
