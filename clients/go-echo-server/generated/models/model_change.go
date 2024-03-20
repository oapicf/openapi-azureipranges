package models

type Change struct {

	// The number associated with the change.
	ChangeNumber int32 `json:"changeNumber,omitempty"`

	// The cloud environment.
	Cloud string `json:"cloud,omitempty"`

	Values []Value `json:"values,omitempty"`
}
