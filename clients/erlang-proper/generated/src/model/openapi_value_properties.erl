-module(openapi_value_properties).

-include("openapi.hrl").

-export([openapi_value_properties/0]).

-export([openapi_value_properties/1]).

-export_type([openapi_value_properties/0]).

-type openapi_value_properties() ::
  [ {'changeNumber', integer() }
  | {'region', binary() }
  | {'regionId', integer() }
  | {'platform', binary() }
  | {'systemService', binary() }
  | {'addressPrefixes', list(binary()) }
  | {'networkFeatures', list(binary()) }
  ].


openapi_value_properties() ->
    openapi_value_properties([]).

openapi_value_properties(Fields) ->
  Default = [ {'changeNumber', integer() }
            , {'region', binary() }
            , {'regionId', integer() }
            , {'platform', binary() }
            , {'systemService', binary() }
            , {'addressPrefixes', list(binary()) }
            , {'networkFeatures', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

