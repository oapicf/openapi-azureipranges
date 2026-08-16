# Load the gem
require 'openapi_azureipranges'

api_instance = OpenApiAzureIpRangesClient::DefaultApi.new

begin
  # Get Azure IP ranges and service tags for the public cloud
  result = api_instance.get_azure_ip_ranges_service_tags_public_cloud('20260126')
  puts "API called successfully. Returned data: #{result}"
rescue OpenApiAzureIpRangesClient::ApiError => e
  puts "Exception when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud: #{e}"
  raise
end
