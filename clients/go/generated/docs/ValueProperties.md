# ValueProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangeNumber** | Pointer to **int32** | The number associated with the change. | [optional] 
**Region** | Pointer to **string** | The region associated with the value. | [optional] 
**RegionId** | Pointer to **int32** | The ID of the region. | [optional] 
**Platform** | Pointer to **string** | The platform associated with the value. | [optional] 
**SystemService** | Pointer to **string** | The system service associated with the value. | [optional] 
**AddressPrefixes** | Pointer to **[]string** | The address prefixes associated with the value. | [optional] 
**NetworkFeatures** | Pointer to **[]string** | The network features associated with the value. | [optional] 

## Methods

### NewValueProperties

`func NewValueProperties() *ValueProperties`

NewValueProperties instantiates a new ValueProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValuePropertiesWithDefaults

`func NewValuePropertiesWithDefaults() *ValueProperties`

NewValuePropertiesWithDefaults instantiates a new ValueProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChangeNumber

`func (o *ValueProperties) GetChangeNumber() int32`

GetChangeNumber returns the ChangeNumber field if non-nil, zero value otherwise.

### GetChangeNumberOk

`func (o *ValueProperties) GetChangeNumberOk() (*int32, bool)`

GetChangeNumberOk returns a tuple with the ChangeNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangeNumber

`func (o *ValueProperties) SetChangeNumber(v int32)`

SetChangeNumber sets ChangeNumber field to given value.

### HasChangeNumber

`func (o *ValueProperties) HasChangeNumber() bool`

HasChangeNumber returns a boolean if a field has been set.

### GetRegion

`func (o *ValueProperties) GetRegion() string`

GetRegion returns the Region field if non-nil, zero value otherwise.

### GetRegionOk

`func (o *ValueProperties) GetRegionOk() (*string, bool)`

GetRegionOk returns a tuple with the Region field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegion

`func (o *ValueProperties) SetRegion(v string)`

SetRegion sets Region field to given value.

### HasRegion

`func (o *ValueProperties) HasRegion() bool`

HasRegion returns a boolean if a field has been set.

### GetRegionId

`func (o *ValueProperties) GetRegionId() int32`

GetRegionId returns the RegionId field if non-nil, zero value otherwise.

### GetRegionIdOk

`func (o *ValueProperties) GetRegionIdOk() (*int32, bool)`

GetRegionIdOk returns a tuple with the RegionId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRegionId

`func (o *ValueProperties) SetRegionId(v int32)`

SetRegionId sets RegionId field to given value.

### HasRegionId

`func (o *ValueProperties) HasRegionId() bool`

HasRegionId returns a boolean if a field has been set.

### GetPlatform

`func (o *ValueProperties) GetPlatform() string`

GetPlatform returns the Platform field if non-nil, zero value otherwise.

### GetPlatformOk

`func (o *ValueProperties) GetPlatformOk() (*string, bool)`

GetPlatformOk returns a tuple with the Platform field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPlatform

`func (o *ValueProperties) SetPlatform(v string)`

SetPlatform sets Platform field to given value.

### HasPlatform

`func (o *ValueProperties) HasPlatform() bool`

HasPlatform returns a boolean if a field has been set.

### GetSystemService

`func (o *ValueProperties) GetSystemService() string`

GetSystemService returns the SystemService field if non-nil, zero value otherwise.

### GetSystemServiceOk

`func (o *ValueProperties) GetSystemServiceOk() (*string, bool)`

GetSystemServiceOk returns a tuple with the SystemService field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSystemService

`func (o *ValueProperties) SetSystemService(v string)`

SetSystemService sets SystemService field to given value.

### HasSystemService

`func (o *ValueProperties) HasSystemService() bool`

HasSystemService returns a boolean if a field has been set.

### GetAddressPrefixes

`func (o *ValueProperties) GetAddressPrefixes() []string`

GetAddressPrefixes returns the AddressPrefixes field if non-nil, zero value otherwise.

### GetAddressPrefixesOk

`func (o *ValueProperties) GetAddressPrefixesOk() (*[]string, bool)`

GetAddressPrefixesOk returns a tuple with the AddressPrefixes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressPrefixes

`func (o *ValueProperties) SetAddressPrefixes(v []string)`

SetAddressPrefixes sets AddressPrefixes field to given value.

### HasAddressPrefixes

`func (o *ValueProperties) HasAddressPrefixes() bool`

HasAddressPrefixes returns a boolean if a field has been set.

### GetNetworkFeatures

`func (o *ValueProperties) GetNetworkFeatures() []string`

GetNetworkFeatures returns the NetworkFeatures field if non-nil, zero value otherwise.

### GetNetworkFeaturesOk

`func (o *ValueProperties) GetNetworkFeaturesOk() (*[]string, bool)`

GetNetworkFeaturesOk returns a tuple with the NetworkFeatures field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNetworkFeatures

`func (o *ValueProperties) SetNetworkFeatures(v []string)`

SetNetworkFeatures sets NetworkFeatures field to given value.

### HasNetworkFeatures

`func (o *ValueProperties) HasNetworkFeatures() bool`

HasNetworkFeatures returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


