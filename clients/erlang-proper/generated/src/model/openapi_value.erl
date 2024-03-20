-module(openapi_value).

-include("openapi.hrl").

-export([openapi_value/0]).

-export([openapi_value/1]).

-export_type([openapi_value/0]).

-type openapi_value() ::
  [ {'name', binary() }
  | {'id', binary() }
  | {'properties', openapi_value_properties:openapi_value_properties() }
  ].


openapi_value() ->
    openapi_value([]).

openapi_value(Fields) ->
  Default = [ {'name', binary() }
            , {'id', binary() }
            , {'properties', openapi_value_properties:openapi_value_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

