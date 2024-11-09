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

#include "OpenAPIChange.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIChange::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (ChangeNumber.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("changeNumber")); WriteJsonValue(Writer, ChangeNumber.GetValue());
	}
	if (Cloud.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cloud")); WriteJsonValue(Writer, Cloud.GetValue());
	}
	if (Values.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("values")); WriteJsonValue(Writer, Values.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIChange::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("changeNumber"), ChangeNumber);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cloud"), Cloud);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("values"), Values);

	return ParseSuccess;
}

}