#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ValueProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ValueProperties::ValueProperties()
{
	//__init();
}

ValueProperties::~ValueProperties()
{
	//__cleanup();
}

void
ValueProperties::__init()
{
	//changeNumber = int(0);
	//region = std::string();
	//regionId = int(0);
	//platform = std::string();
	//systemService = std::string();
	//new std::list()std::list> addressPrefixes;
	//new std::list()std::list> networkFeatures;
}

void
ValueProperties::__cleanup()
{
	//if(changeNumber != NULL) {
	//
	//delete changeNumber;
	//changeNumber = NULL;
	//}
	//if(region != NULL) {
	//
	//delete region;
	//region = NULL;
	//}
	//if(regionId != NULL) {
	//
	//delete regionId;
	//regionId = NULL;
	//}
	//if(platform != NULL) {
	//
	//delete platform;
	//platform = NULL;
	//}
	//if(systemService != NULL) {
	//
	//delete systemService;
	//systemService = NULL;
	//}
	//if(addressPrefixes != NULL) {
	//addressPrefixes.RemoveAll(true);
	//delete addressPrefixes;
	//addressPrefixes = NULL;
	//}
	//if(networkFeatures != NULL) {
	//networkFeatures.RemoveAll(true);
	//delete networkFeatures;
	//networkFeatures = NULL;
	//}
	//
}

void
ValueProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changeNumberKey = "changeNumber";
	node = json_object_get_member(pJsonObject, changeNumberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&changeNumber, node, "int", "");
		} else {
			
		}
	}
	const gchar *regionKey = "region";
	node = json_object_get_member(pJsonObject, regionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&region, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *regionIdKey = "regionId";
	node = json_object_get_member(pJsonObject, regionIdKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&regionId, node, "int", "");
		} else {
			
		}
	}
	const gchar *platformKey = "platform";
	node = json_object_get_member(pJsonObject, platformKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&platform, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *systemServiceKey = "systemService";
	node = json_object_get_member(pJsonObject, systemServiceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&systemService, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *addressPrefixesKey = "addressPrefixes";
	node = json_object_get_member(pJsonObject, addressPrefixesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			addressPrefixes = new_list;
		}
		
	}
	const gchar *networkFeaturesKey = "networkFeatures";
	node = json_object_get_member(pJsonObject, networkFeaturesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			networkFeatures = new_list;
		}
		
	}
}

ValueProperties::ValueProperties(char* json)
{
	this->fromJson(json);
}

char*
ValueProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getChangeNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *changeNumberKey = "changeNumber";
	json_object_set_member(pJsonObject, changeNumberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRegion();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *regionKey = "region";
	json_object_set_member(pJsonObject, regionKey, node);
	if (isprimitive("int")) {
		int obj = getRegionId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *regionIdKey = "regionId";
	json_object_set_member(pJsonObject, regionIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPlatform();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *platformKey = "platform";
	json_object_set_member(pJsonObject, platformKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSystemService();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *systemServiceKey = "systemService";
	json_object_set_member(pJsonObject, systemServiceKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAddressPrefixes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAddressPrefixes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *addressPrefixesKey = "addressPrefixes";
	json_object_set_member(pJsonObject, addressPrefixesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getNetworkFeatures());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getNetworkFeatures());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *networkFeaturesKey = "networkFeatures";
	json_object_set_member(pJsonObject, networkFeaturesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


