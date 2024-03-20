#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Value.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Value::Value()
{
	//__init();
}

Value::~Value()
{
	//__cleanup();
}

void
Value::__init()
{
	//name = std::string();
	//id = std::string();
	//properties = new ValueProperties();
}

void
Value::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(properties != NULL) {
	//
	//delete properties;
	//properties = NULL;
	//}
	//
}

void
Value::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *propertiesKey = "properties";
	node = json_object_get_member(pJsonObject, propertiesKey);
	if (node !=NULL) {
	

		if (isprimitive("ValueProperties")) {
			jsonToValue(&properties, node, "ValueProperties", "ValueProperties");
		} else {
			
			ValueProperties* obj = static_cast<ValueProperties*> (&properties);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Value::Value(char* json)
{
	this->fromJson(json);
}

char*
Value::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("ValueProperties")) {
		ValueProperties obj = getProperties();
		node = converttoJson(&obj, "ValueProperties", "");
	}
	else {
		
		ValueProperties obj = static_cast<ValueProperties> (getProperties());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *propertiesKey = "properties";
	json_object_set_member(pJsonObject, propertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Value::getName()
{
	return name;
}

void
Value::setName(std::string  name)
{
	this->name = name;
}

std::string
Value::getId()
{
	return id;
}

void
Value::setId(std::string  id)
{
	this->id = id;
}

ValueProperties
Value::getProperties()
{
	return properties;
}

void
Value::setProperties(ValueProperties  properties)
{
	this->properties = properties;
}


