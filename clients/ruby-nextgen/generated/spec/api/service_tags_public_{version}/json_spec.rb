# frozen_string_literal: true

require 'spec_helper'

RSpec.describe OpenapiClient::Api::ServiceTagsPublic{version}Json do
  let(:client) { OpenapiClient::Client.new(base_url: 'https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63') }

  it 'is reachable and shares the client connection' do
    api = described_class.new(client.connection)
    expect(api).to be_a(described_class)
  end
end
