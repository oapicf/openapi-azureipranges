-module(openapi_api).

-export([ get_azure_ip_ranges_service_tags_public_cloud/1
        ]).

-define(BASE_URL, "/download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63").

%% @doc Get Azure IP Ranges and Service Tags - Public Cloud
%% Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
-spec get_azure_ip_ranges_service_tags_public_cloud(binary()) ->
  openapi_utils:response().
get_azure_ip_ranges_service_tags_public_cloud(Version) ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/ServiceTags_Public_", Version, ".json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

