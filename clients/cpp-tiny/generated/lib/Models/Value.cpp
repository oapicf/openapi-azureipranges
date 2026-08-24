

#include "Value.h"

using namespace Tiny;

Value::Value()
{
	name = std::string();
	id = std::string();
	properties = ValueProperties();
}

Value::Value(std::string jsonString)
{
	this->fromJson(jsonString);
}

Value::~Value()
{

}

void
Value::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ValueProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
Value::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["id"] = getId();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
Value::getName()
{
	return name;
}

void
Value::setName(std::string name)
{
	this->name = name;
}

std::string
Value::getId()
{
	return id;
}

void
Value::setId(std::string id)
{
	this->id = id;
}

ValueProperties
Value::getProperties()
{
	return properties;
}

void
Value::setProperties(ValueProperties properties)
{
	this->properties = properties;
}



