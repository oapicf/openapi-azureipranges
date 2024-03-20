# This file is responsible for configuring your application
# and its dependencies with the aid of the Config module.
#
# This configuration file is loaded before any dependency and
# is restricted to this project.

# General application configuration
import Config

config :azure_ip_ranges_and_service_tags_public_cloud, base_url: "https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63"

# Import environment specific config. This must remain at the bottom
# of this file so it overrides the configuration defined above.
#
# import_config "#{config_env()}.exs"
