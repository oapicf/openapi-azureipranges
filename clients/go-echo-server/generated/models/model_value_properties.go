package models

type ValueProperties struct {

	// The number associated with the change.
	ChangeNumber int32 `json:"changeNumber,omitempty"`

	// The region associated with the value.
	Region string `json:"region,omitempty"`

	// The ID of the region.
	RegionId int32 `json:"regionId,omitempty"`

	// The platform associated with the value.
	Platform string `json:"platform,omitempty"`

	// The system service associated with the value.
	SystemService string `json:"systemService,omitempty"`

	// The address prefixes associated with the value.
	AddressPrefixes []string `json:"addressPrefixes,omitempty"`

	// The network features associated with the value.
	NetworkFeatures []string `json:"networkFeatures,omitempty"`
}
