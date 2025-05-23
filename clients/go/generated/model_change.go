/*
Azure IP Ranges and Service Tags - Public Cloud

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 0.10.1-pre.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// checks if the Change type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Change{}

// Change struct for Change
type Change struct {
	// The number associated with the change.
	ChangeNumber *int32 `json:"changeNumber,omitempty"`
	// The cloud environment.
	Cloud *string `json:"cloud,omitempty"`
	Values []Value `json:"values,omitempty"`
}

// NewChange instantiates a new Change object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewChange() *Change {
	this := Change{}
	return &this
}

// NewChangeWithDefaults instantiates a new Change object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewChangeWithDefaults() *Change {
	this := Change{}
	return &this
}

// GetChangeNumber returns the ChangeNumber field value if set, zero value otherwise.
func (o *Change) GetChangeNumber() int32 {
	if o == nil || IsNil(o.ChangeNumber) {
		var ret int32
		return ret
	}
	return *o.ChangeNumber
}

// GetChangeNumberOk returns a tuple with the ChangeNumber field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Change) GetChangeNumberOk() (*int32, bool) {
	if o == nil || IsNil(o.ChangeNumber) {
		return nil, false
	}
	return o.ChangeNumber, true
}

// HasChangeNumber returns a boolean if a field has been set.
func (o *Change) HasChangeNumber() bool {
	if o != nil && !IsNil(o.ChangeNumber) {
		return true
	}

	return false
}

// SetChangeNumber gets a reference to the given int32 and assigns it to the ChangeNumber field.
func (o *Change) SetChangeNumber(v int32) {
	o.ChangeNumber = &v
}

// GetCloud returns the Cloud field value if set, zero value otherwise.
func (o *Change) GetCloud() string {
	if o == nil || IsNil(o.Cloud) {
		var ret string
		return ret
	}
	return *o.Cloud
}

// GetCloudOk returns a tuple with the Cloud field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Change) GetCloudOk() (*string, bool) {
	if o == nil || IsNil(o.Cloud) {
		return nil, false
	}
	return o.Cloud, true
}

// HasCloud returns a boolean if a field has been set.
func (o *Change) HasCloud() bool {
	if o != nil && !IsNil(o.Cloud) {
		return true
	}

	return false
}

// SetCloud gets a reference to the given string and assigns it to the Cloud field.
func (o *Change) SetCloud(v string) {
	o.Cloud = &v
}

// GetValues returns the Values field value if set, zero value otherwise.
func (o *Change) GetValues() []Value {
	if o == nil || IsNil(o.Values) {
		var ret []Value
		return ret
	}
	return o.Values
}

// GetValuesOk returns a tuple with the Values field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Change) GetValuesOk() ([]Value, bool) {
	if o == nil || IsNil(o.Values) {
		return nil, false
	}
	return o.Values, true
}

// HasValues returns a boolean if a field has been set.
func (o *Change) HasValues() bool {
	if o != nil && !IsNil(o.Values) {
		return true
	}

	return false
}

// SetValues gets a reference to the given []Value and assigns it to the Values field.
func (o *Change) SetValues(v []Value) {
	o.Values = v
}

func (o Change) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Change) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.ChangeNumber) {
		toSerialize["changeNumber"] = o.ChangeNumber
	}
	if !IsNil(o.Cloud) {
		toSerialize["cloud"] = o.Cloud
	}
	if !IsNil(o.Values) {
		toSerialize["values"] = o.Values
	}
	return toSerialize, nil
}

type NullableChange struct {
	value *Change
	isSet bool
}

func (v NullableChange) Get() *Change {
	return v.value
}

func (v *NullableChange) Set(val *Change) {
	v.value = val
	v.isSet = true
}

func (v NullableChange) IsSet() bool {
	return v.isSet
}

func (v *NullableChange) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableChange(val *Change) *NullableChange {
	return &NullableChange{value: val, isSet: true}
}

func (v NullableChange) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableChange) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


