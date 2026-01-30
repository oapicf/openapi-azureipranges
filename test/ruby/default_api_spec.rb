require 'time'
require 'openapi_azureipranges'

describe 'OpenApiAzureIpRangesClient' do
  before do
  end

  after do
  end

  describe 'test get_azure_ip_ranges_service_tags_public_cloud' do
    it 'should return data' do
      api_instance = OpenApiAzureIpRangesClient::DefaultApi.new
      begin
        result = api_instance.get_azure_ip_ranges_service_tags_public_cloud('20260119')
        expect(result).not_to be_nil
        puts "API called successfully. Returned data: #{result}"
      rescue OpenApiAzureIpRangesClient::ApiError => e
        puts "Error when calling DefaultApi->get_azure_ip_ranges_service_tags_public_cloud: #{e}"
        fail
      end
    end
  end

end
