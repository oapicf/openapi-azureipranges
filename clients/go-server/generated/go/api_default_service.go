// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// DefaultAPIService is a service that implements the logic for the DefaultAPIServicer
// This service should implement the business logic for every endpoint for the DefaultAPI API.
// Include any external packages or services that will be required by this service.
type DefaultAPIService struct {
}

// NewDefaultAPIService creates a default api service
func NewDefaultAPIService() *DefaultAPIService {
	return &DefaultAPIService{}
}

// GetAzureIpRangesServiceTagsPublicCloud - Get Azure IP Ranges and Service Tags - Public Cloud
func (s *DefaultAPIService) GetAzureIpRangesServiceTagsPublicCloud(ctx context.Context, version string) (ImplResponse, error) {
	// TODO - update GetAzureIpRangesServiceTagsPublicCloud with the required logic for this service method.
	// Add api_default_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Change{}) or use other options such as http.Ok ...
	// return Response(200, Change{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAzureIpRangesServiceTagsPublicCloud method not implemented")
}
