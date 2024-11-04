# #Azure IP Ranges and Service Tags - Public Cloud
#
##No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
#The version of the OpenAPI document: 0.9.0-pre.0
#Contact: blah+oapicf@cliffano.com
#Generated by: https://openapi-generator.tech
#Generator version: 7.6.0
#

# Dependencies
require "crest"
require "log"

module OpenAPIClient
  Log = ::Log.for("OpenAPIClient") # => Log for OpenAPIClient source

  VERSION = {{ `shards version #{__DIR__}`.chomp.stringify }}

  # Return the default `Configuration` object.
  def self.configure
    Configuration.default
  end

  # Customize default settings for the SDK using block.
  #
  # ```
  # OpenAPIClient.configure do |config|
  #   config.username = "xxx"
  #   config.password = "xxx"
  # end
  # ```
  def self.configure
    yield Configuration.default
  end
end

require "./openapi_client/**"
