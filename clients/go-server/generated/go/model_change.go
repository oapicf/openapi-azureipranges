// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type Change struct {

	// The number associated with the change.
	ChangeNumber int32 `json:"changeNumber,omitempty"`

	// The cloud environment.
	Cloud string `json:"cloud,omitempty"`

	Values []Value `json:"values,omitempty"`
}

// AssertChangeRequired checks if the required fields are not zero-ed
func AssertChangeRequired(obj Change) error {
	for _, el := range obj.Values {
		if err := AssertValueRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertChangeConstraints checks if the values respects the defined constraints
func AssertChangeConstraints(obj Change) error {
	for _, el := range obj.Values {
		if err := AssertValueConstraints(el); err != nil {
			return err
		}
	}
	return nil
}