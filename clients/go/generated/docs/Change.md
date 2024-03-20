# Change

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ChangeNumber** | Pointer to **int32** | The number associated with the change. | [optional] 
**Cloud** | Pointer to **string** | The cloud environment. | [optional] 
**Values** | Pointer to [**[]Value**](Value.md) |  | [optional] 

## Methods

### NewChange

`func NewChange() *Change`

NewChange instantiates a new Change object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewChangeWithDefaults

`func NewChangeWithDefaults() *Change`

NewChangeWithDefaults instantiates a new Change object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChangeNumber

`func (o *Change) GetChangeNumber() int32`

GetChangeNumber returns the ChangeNumber field if non-nil, zero value otherwise.

### GetChangeNumberOk

`func (o *Change) GetChangeNumberOk() (*int32, bool)`

GetChangeNumberOk returns a tuple with the ChangeNumber field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChangeNumber

`func (o *Change) SetChangeNumber(v int32)`

SetChangeNumber sets ChangeNumber field to given value.

### HasChangeNumber

`func (o *Change) HasChangeNumber() bool`

HasChangeNumber returns a boolean if a field has been set.

### GetCloud

`func (o *Change) GetCloud() string`

GetCloud returns the Cloud field if non-nil, zero value otherwise.

### GetCloudOk

`func (o *Change) GetCloudOk() (*string, bool)`

GetCloudOk returns a tuple with the Cloud field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCloud

`func (o *Change) SetCloud(v string)`

SetCloud sets Cloud field to given value.

### HasCloud

`func (o *Change) HasCloud() bool`

HasCloud returns a boolean if a field has been set.

### GetValues

`func (o *Change) GetValues() []Value`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *Change) GetValuesOk() (*[]Value, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *Change) SetValues(v []Value)`

SetValues sets Values field to given value.

### HasValues

`func (o *Change) HasValues() bool`

HasValues returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


