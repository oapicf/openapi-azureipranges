-module(openapi_default_api).

-export([service_tags_public20240318_json_get/1, service_tags_public20240318_json_get/2]).

-define(BASE_URL, <<"/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63">>).

%% @doc Get Azure IP Ranges and Service Tags - Public Cloud
%% Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
-spec service_tags_public20240318_json_get(ctx:ctx()) -> {ok, openapi_change:openapi_change(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
service_tags_public20240318_json_get(Ctx) ->
    service_tags_public20240318_json_get(Ctx, #{}).

-spec service_tags_public20240318_json_get(ctx:ctx(), maps:map()) -> {ok, openapi_change:openapi_change(), openapi_utils:response_info()} | {ok, hackney:client_ref()} | {error, term(), openapi_utils:response_info()}.
service_tags_public20240318_json_get(Ctx, Optional) ->
    _OptionalParams = maps:get(params, Optional, #{}),
    Cfg = maps:get(cfg, Optional, application:get_env(openapi_api, config, #{})),

    Method = get,
    Path = [?BASE_URL, "/ServiceTags_Public_20240318.json"],
    QS = [],
    Headers = [],
    Body1 = [],
    ContentTypeHeader = openapi_utils:select_header_content_type([]),
    Opts = maps:get(hackney_opts, Optional, []),

    openapi_utils:request(Ctx, Method, Path, QS, ContentTypeHeader++Headers, Body1, Opts, Cfg).


