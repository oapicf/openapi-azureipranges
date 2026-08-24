require "json"

module OpenAPIClient
  module Api
  class ServiceTagsPublicVersionJson
    def initialize(@conn : Connection); end

    # Get Azure IP Ranges and Service Tags - Public Cloud Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    def list(version : String) : Response(OpenAPIClient::Change)
      @conn.request(OpenAPIClient::Change,
        method: :GET,
        path: "/ServiceTags_Public_{version}.json".sub("{version}", OpenAPIClient.enc(version)),
        accept: %w[application/json application/octet-stream],
        auth: %w[])
    end
  end
  end

end
