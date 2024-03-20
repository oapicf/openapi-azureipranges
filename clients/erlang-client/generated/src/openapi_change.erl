-module(openapi_change).

-export([encode/1]).

-export_type([openapi_change/0]).

-type openapi_change() ::
    #{ 'changeNumber' => integer(),
       'cloud' => binary(),
       'values' => list()
     }.

encode(#{ 'changeNumber' := ChangeNumber,
          'cloud' := Cloud,
          'values' := Values
        }) ->
    #{ 'changeNumber' => ChangeNumber,
       'cloud' => Cloud,
       'values' => Values
     }.
