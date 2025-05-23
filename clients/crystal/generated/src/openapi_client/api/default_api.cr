# #Azure IP Ranges and Service Tags - Public Cloud
#
##No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 0.10.1-pre.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.12.0
#

require "uri"

module OpenAPIClient
  class DefaultApi
    property api_client : ApiClient

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Get Azure IP Ranges and Service Tags - Public Cloud
    # Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    # @param version [String] The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    # @return [Change]
    def get_azure_ip_ranges_service_tags_public_cloud(version : String)
      data, _status_code, _headers = get_azure_ip_ranges_service_tags_public_cloud_with_http_info(version)
      data
    end

    # Get Azure IP Ranges and Service Tags - Public Cloud
    # Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    # @param version [String] The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    # @return [Array<(Change, Integer, Hash)>] Change data, response status code and response headers
    def get_azure_ip_ranges_service_tags_public_cloud_with_http_info(version : String)
      if @api_client.config.debugging
        Log.debug {"Calling API: DefaultApi.get_azure_ip_ranges_service_tags_public_cloud ..."}
      end
      # verify the required parameter "version" is set
      if @api_client.config.client_side_validation && version.nil?
        raise ArgumentError.new("Missing the required parameter 'version' when calling DefaultApi.get_azure_ip_ranges_service_tags_public_cloud")
      end
      # resource path
      local_var_path = "/ServiceTags_Public_{version}.json".sub("{" + "version" + "}", URI.encode_path(version.to_s))

      # query parameters
      query_params = Hash(String, String).new

      # header parameters
      header_params = Hash(String, String).new
      # HTTP header "Accept" (if needed)
      header_params["Accept"] = @api_client.select_header_accept(["application/json"])

      # form parameters
      form_params = Hash(Symbol, (String | ::File)).new

      # http body (model)
      post_body = nil

      # return_type
      return_type = "Change"

      # auth_names
      auth_names = [] of String

      data, status_code, headers = @api_client.call_api(:GET,
                                                        local_var_path,
                                                        :"DefaultApi.get_azure_ip_ranges_service_tags_public_cloud",
                                                        return_type,
                                                        post_body,
                                                        auth_names,
                                                        header_params,
                                                        query_params,
                                                        form_params)
      if @api_client.config.debugging
        Log.debug {"API called: DefaultApi#get_azure_ip_ranges_service_tags_public_cloud\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"}
      end
      return Change.from_json(data), status_code, headers
    end
  end
end
