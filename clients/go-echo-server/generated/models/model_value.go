package models

type Value struct {

	// The name of the value.
	Name string `json:"name,omitempty"`

	// The unique identifier of the value.
	Id string `json:"id,omitempty"`

	Properties ValueProperties `json:"properties,omitempty"`
}
