-module(openapi_value_properties).

-export([encode/1]).

-export_type([openapi_value_properties/0]).

-type openapi_value_properties() ::
    #{ 'changeNumber' => integer(),
       'region' => binary(),
       'regionId' => integer(),
       'platform' => binary(),
       'systemService' => binary(),
       'addressPrefixes' => list(),
       'networkFeatures' => list()
     }.

encode(#{ 'changeNumber' := ChangeNumber,
          'region' := Region,
          'regionId' := RegionId,
          'platform' := Platform,
          'systemService' := SystemService,
          'addressPrefixes' := AddressPrefixes,
          'networkFeatures' := NetworkFeatures
        }) ->
    #{ 'changeNumber' => ChangeNumber,
       'region' => Region,
       'regionId' => RegionId,
       'platform' => Platform,
       'systemService' => SystemService,
       'addressPrefixes' => AddressPrefixes,
       'networkFeatures' => NetworkFeatures
     }.
