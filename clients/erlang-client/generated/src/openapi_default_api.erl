-module(openapi_default_api).

-export([get_azure_ip_ranges_service_tags_public_cloud/2, get_azure_ip_ranges_service_tags_public_cloud/3]).

-define(BASE_URL, <<"/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63">>).

%% @doc Get Azure IP Ranges and Service Tags - Public Cloud
%% Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
-spec get_azure_ip_ranges_service_tags_public_cloud(ctx:ctx(), binary()) -> {ok, openapi_change:openapi_change(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_azure_ip_ranges_service_tags_public_cloud(Ctx, Version) ->
    get_azure_ip_ranges_service_tags_public_cloud(Ctx, Version, #{}).

-spec get_azure_ip_ranges_service_tags_public_cloud(ctx:ctx(), binary(), maps:map()) -> {ok, openapi_change:openapi_change(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
get_azure_ip_ranges_service_tags_public_cloud(Ctx, Version, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ServiceTags_Public_", Version, ".json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


