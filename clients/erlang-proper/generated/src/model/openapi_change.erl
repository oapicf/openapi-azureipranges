-module(openapi_change).

-include("openapi.hrl").

-export([openapi_change/0]).

-export([openapi_change/1]).

-export_type([openapi_change/0]).

-type openapi_change() ::
  [ {'changeNumber', integer() }
  | {'cloud', binary() }
  | {'values', list(openapi_value:openapi_value()) }
  ].


openapi_change() ->
    openapi_change([]).

openapi_change(Fields) ->
  Default = [ {'changeNumber', integer() }
            , {'cloud', binary() }
            , {'values', list(openapi_value:openapi_value()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

