# frozen_string_literal: true

module OpenapiClient
  module Api
    class ServiceTagsPublic{version}Json
      def initialize(connection)
        @connection = connection
      end

      def list(version:)
        raise ArgumentError, 'version is required' if version.nil?

        @connection.call(
          :GET,
          '/ServiceTags_Public_{version}.json'
            .gsub('{version}', ERB::Util.url_encode(version.to_s)),
          type: OpenapiClient::Models::Change,
          auth: []
        )
      end
    end
  end
end
