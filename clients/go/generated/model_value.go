/*
Azure IP Ranges and Service Tags - Public Cloud

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 0.9.0-pre.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the Value type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Value{}

// Value struct for Value
type Value struct {
	// The name of the value.
	Name *string `json:"name,omitempty"`
	// The unique identifier of the value.
	Id *string `json:"id,omitempty"`
	Properties *ValueProperties `json:"properties,omitempty"`
}

// NewValue instantiates a new Value object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewValue() *Value {
	this := Value{}
	return &this
}

// NewValueWithDefaults instantiates a new Value object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewValueWithDefaults() *Value {
	this := Value{}
	return &this
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *Value) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Value) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *Value) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *Value) SetName(v string) {
	o.Name = &v
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *Value) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Value) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *Value) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *Value) SetId(v string) {
	o.Id = &v
}

// GetProperties returns the Properties field value if set, zero value otherwise.
func (o *Value) GetProperties() ValueProperties {
	if o == nil || IsNil(o.Properties) {
		var ret ValueProperties
		return ret
	}
	return *o.Properties
}

// GetPropertiesOk returns a tuple with the Properties field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Value) GetPropertiesOk() (*ValueProperties, bool) {
	if o == nil || IsNil(o.Properties) {
		return nil, false
	}
	return o.Properties, true
}

// HasProperties returns a boolean if a field has been set.
func (o *Value) HasProperties() bool {
	if o != nil && !IsNil(o.Properties) {
		return true
	}

	return false
}

// SetProperties gets a reference to the given ValueProperties and assigns it to the Properties field.
func (o *Value) SetProperties(v ValueProperties) {
	o.Properties = &v
}

func (o Value) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Value) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Properties) {
		toSerialize["properties"] = o.Properties
	}
	return toSerialize, nil
}

type NullableValue struct {
	value *Value
	isSet bool
}

func (v NullableValue) Get() *Value {
	return v.value
}

func (v *NullableValue) Set(val *Value) {
	v.value = val
	v.isSet = true
}

func (v NullableValue) IsSet() bool {
	return v.isSet
}

func (v *NullableValue) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableValue(val *Value) *NullableValue {
	return &NullableValue{value: val, isSet: true}
}

func (v NullableValue) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableValue) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

