/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

/*
 * OpenAPIValueProperties
 *
 * 
 */
class OPENAPI_API OpenAPIValueProperties : public Model
{
public:
    virtual ~OpenAPIValueProperties() {}
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;
	void WriteJson(JsonWriter& Writer) const final;

	/* The number associated with the change. */
	TOptional<int32> ChangeNumber;
	/* The region associated with the value. */
	TOptional<FString> Region;
	/* The ID of the region. */
	TOptional<int32> RegionId;
	/* The platform associated with the value. */
	TOptional<FString> Platform;
	/* The system service associated with the value. */
	TOptional<FString> SystemService;
	/* The address prefixes associated with the value. */
	TOptional<TArray<FString>> AddressPrefixes;
	/* The network features associated with the value. */
	TOptional<TArray<FString>> NetworkFeatures;
};

}
