# Value

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The name of the value. | [optional] 
**Id** | Pointer to **string** | The unique identifier of the value. | [optional] 
**Properties** | Pointer to [**ValueProperties**](ValueProperties.md) |  | [optional] 

## Methods

### NewValue

`func NewValue() *Value`

NewValue instantiates a new Value object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewValueWithDefaults

`func NewValueWithDefaults() *Value`

NewValueWithDefaults instantiates a new Value object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *Value) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Value) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Value) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Value) HasName() bool`

HasName returns a boolean if a field has been set.

### GetId

`func (o *Value) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Value) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Value) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *Value) HasId() bool`

HasId returns a boolean if a field has been set.

### GetProperties

`func (o *Value) GetProperties() ValueProperties`

GetProperties returns the Properties field if non-nil, zero value otherwise.

### GetPropertiesOk

`func (o *Value) GetPropertiesOk() (*ValueProperties, bool)`

GetPropertiesOk returns a tuple with the Properties field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProperties

`func (o *Value) SetProperties(v ValueProperties)`

SetProperties sets Properties field to given value.

### HasProperties

`func (o *Value) HasProperties() bool`

HasProperties returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


