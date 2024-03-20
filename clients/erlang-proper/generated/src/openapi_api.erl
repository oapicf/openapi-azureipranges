-module(openapi_api).

-export([ service_tags_public20240318_json_get/0
        ]).

-define(BASE_URL, "/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63").

%% @doc Get Azure IP Ranges and Service Tags - Public Cloud
%% Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
-spec service_tags_public20240318_json_get() ->
  openapi_utils:response().
service_tags_public20240318_json_get() ->
  Method      = get,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/ServiceTags_Public_20240318.json"],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path]).

