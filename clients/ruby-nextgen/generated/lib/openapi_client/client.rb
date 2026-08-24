# frozen_string_literal: true

module OpenapiClient
  class Client
    attr_reader :configuration, :connection

    def initialize(base_url: nil, **options, &block)
      @configuration = Configuration.new(base_url: base_url, **options, &block)
      @connection = Connection.new(@configuration)
    end

    def service_tags_public_version_json
      @service_tags_public_version_json ||= OpenapiClient::Api::ServiceTagsPublic{version}Json.new(@connection)
    end
  end
end
