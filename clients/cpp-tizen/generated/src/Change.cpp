#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Change.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Change::Change()
{
	//__init();
}

Change::~Change()
{
	//__cleanup();
}

void
Change::__init()
{
	//changeNumber = int(0);
	//cloud = std::string();
	//new std::list()std::list> values;
}

void
Change::__cleanup()
{
	//if(changeNumber != NULL) {
	//
	//delete changeNumber;
	//changeNumber = NULL;
	//}
	//if(cloud != NULL) {
	//
	//delete cloud;
	//cloud = NULL;
	//}
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
Change::fromJson(char* jsonStr)
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
	const gchar *cloudKey = "cloud";
	node = json_object_get_member(pJsonObject, cloudKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cloud, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Value> new_list;
			Value inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Value")) {
					jsonToValue(&inst, temp_json, "Value", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
}

Change::Change(char* json)
{
	this->fromJson(json);
}

char*
Change::toJson()
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
		std::string obj = getCloud();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cloudKey = "cloud";
	json_object_set_member(pJsonObject, cloudKey, node);
	if (isprimitive("Value")) {
		list<Value> new_list = static_cast<list <Value> > (getValues());
		node = converttoJson(&new_list, "Value", "array");
	} else {
		node = json_node_alloc();
		list<Value> new_list = static_cast<list <Value> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Value>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Value obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


