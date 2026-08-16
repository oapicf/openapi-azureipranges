

#include "Change.h"

using namespace Tiny;

Change::Change()
{
	changeNumber = int(0);
	cloud = std::string();
	values = std::list<Value>();
}

Change::Change(std::string jsonString)
{
	this->fromJson(jsonString);
}

Change::~Change()
{

}

void
Change::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *changeNumberKey = "changeNumber";

    if(object.has_key(changeNumberKey))
    {
        bourne::json value = object[changeNumberKey];



        jsonToValue(&changeNumber, value, "int");


    }

    const char *cloudKey = "cloud";

    if(object.has_key(cloudKey))
    {
        bourne::json value = object[cloudKey];



        jsonToValue(&cloud, value, "std::string");


    }

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<Value> values_list;
        Value element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }


}

bourne::json
Change::toJson()
{
    bourne::json object = bourne::json::object();





    object["changeNumber"] = getChangeNumber();






    object["cloud"] = getCloud();





    std::list<Value> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        Value obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;




    return object;

}

int
Change::getChangeNumber()
{
	return changeNumber;
}

void
Change::setChangeNumber(int  changeNumber)
{
	this->changeNumber = changeNumber;
}

std::string
Change::getCloud()
{
	return cloud;
}

void
Change::setCloud(std::string  cloud)
{
	this->cloud = cloud;
}

std::list<Value>
Change::getValues()
{
	return values;
}

void
Change::setValues(std::list <Value> values)
{
	this->values = values;
}



