

#include "ValueProperties.h"

using namespace Tiny;

ValueProperties::ValueProperties()
{
	changeNumber = int(0);
	region = std::string();
	regionId = int(0);
	platform = std::string();
	systemService = std::string();
	addressPrefixes = std::list<std::string>();
	networkFeatures = std::list<std::string>();
}

ValueProperties::ValueProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ValueProperties::~ValueProperties()
{

}

void
ValueProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *changeNumberKey = "changeNumber";

    if(object.has_key(changeNumberKey))
    {
        bourne::json value = object[changeNumberKey];



        jsonToValue(&changeNumber, value, "int");


    }

    const char *regionKey = "region";

    if(object.has_key(regionKey))
    {
        bourne::json value = object[regionKey];



        jsonToValue(&region, value, "std::string");


    }

    const char *regionIdKey = "regionId";

    if(object.has_key(regionIdKey))
    {
        bourne::json value = object[regionIdKey];



        jsonToValue(&regionId, value, "int");


    }

    const char *platformKey = "platform";

    if(object.has_key(platformKey))
    {
        bourne::json value = object[platformKey];



        jsonToValue(&platform, value, "std::string");


    }

    const char *systemServiceKey = "systemService";

    if(object.has_key(systemServiceKey))
    {
        bourne::json value = object[systemServiceKey];



        jsonToValue(&systemService, value, "std::string");


    }

    const char *addressPrefixesKey = "addressPrefixes";

    if(object.has_key(addressPrefixesKey))
    {
        bourne::json value = object[addressPrefixesKey];


        std::list<std::string> addressPrefixes_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            addressPrefixes_list.push_back(element);
        }
        addressPrefixes = addressPrefixes_list;


    }

    const char *networkFeaturesKey = "networkFeatures";

    if(object.has_key(networkFeaturesKey))
    {
        bourne::json value = object[networkFeaturesKey];


        std::list<std::string> networkFeatures_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            networkFeatures_list.push_back(element);
        }
        networkFeatures = networkFeatures_list;


    }


}

bourne::json
ValueProperties::toJson()
{
    bourne::json object = bourne::json::object();





    object["changeNumber"] = getChangeNumber();






    object["region"] = getRegion();






    object["regionId"] = getRegionId();






    object["platform"] = getPlatform();






    object["systemService"] = getSystemService();





    std::list<std::string> addressPrefixes_list = getAddressPrefixes();
    bourne::json addressPrefixes_arr = bourne::json::array();

    for(auto& var : addressPrefixes_list)
    {
        addressPrefixes_arr.append(var);
    }
    object["addressPrefixes"] = addressPrefixes_arr;








    std::list<std::string> networkFeatures_list = getNetworkFeatures();
    bourne::json networkFeatures_arr = bourne::json::array();

    for(auto& var : networkFeatures_list)
    {
        networkFeatures_arr.append(var);
    }
    object["networkFeatures"] = networkFeatures_arr;






    return object;

}

int
ValueProperties::getChangeNumber()
{
	return changeNumber;
}

void
ValueProperties::setChangeNumber(int  changeNumber)
{
	this->changeNumber = changeNumber;
}

std::string
ValueProperties::getRegion()
{
	return region;
}

void
ValueProperties::setRegion(std::string  region)
{
	this->region = region;
}

int
ValueProperties::getRegionId()
{
	return regionId;
}

void
ValueProperties::setRegionId(int  regionId)
{
	this->regionId = regionId;
}

std::string
ValueProperties::getPlatform()
{
	return platform;
}

void
ValueProperties::setPlatform(std::string  platform)
{
	this->platform = platform;
}

std::string
ValueProperties::getSystemService()
{
	return systemService;
}

void
ValueProperties::setSystemService(std::string  systemService)
{
	this->systemService = systemService;
}

std::list<std::string>
ValueProperties::getAddressPrefixes()
{
	return addressPrefixes;
}

void
ValueProperties::setAddressPrefixes(std::list <std::string> addressPrefixes)
{
	this->addressPrefixes = addressPrefixes;
}

std::list<std::string>
ValueProperties::getNetworkFeatures()
{
	return networkFeatures;
}

void
ValueProperties::setNetworkFeatures(std::list <std::string> networkFeatures)
{
	this->networkFeatures = networkFeatures;
}



