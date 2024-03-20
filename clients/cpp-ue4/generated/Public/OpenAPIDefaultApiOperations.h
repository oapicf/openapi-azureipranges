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
#include "OpenAPIDefaultApi.h"

#include "OpenAPIChange.h"

namespace OpenAPI
{

/* Get Azure IP Ranges and Service Tags - Public Cloud
 *
 * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
*/
class OPENAPI_API OpenAPIDefaultApi::ServiceTagsPublic20240318JsonGetRequest : public Request
{
public:
    virtual ~ServiceTagsPublic20240318JsonGetRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

};

class OPENAPI_API OpenAPIDefaultApi::ServiceTagsPublic20240318JsonGetResponse : public Response
{
public:
    virtual ~ServiceTagsPublic20240318JsonGetResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIChange Content;
};

}
