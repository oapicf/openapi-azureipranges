-module(openapi_value).

-export([encode/1]).

-export_type([openapi_value/0]).

-type openapi_value() ::
    #{ 'name' => binary(),
       'id' => binary(),
       'properties' => openapi_value_properties:openapi_value_properties()
     }.

encode(#{ 'name' := Name,
          'id' := Id,
          'properties' := Properties
        }) ->
    #{ 'name' => Name,
       'id' => Id,
       'properties' => Properties
     }.
