#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "value.h"



static value_t *value_create_internal(
    char *name,
    char *id,
    value_properties_t *properties
    ) {
    value_t *value_local_var = malloc(sizeof(value_t));
    if (!value_local_var) {
        return NULL;
    }
    value_local_var->name = name;
    value_local_var->id = id;
    value_local_var->properties = properties;

    value_local_var->_library_owned = 1;
    return value_local_var;
}

__attribute__((deprecated)) value_t *value_create(
    char *name,
    char *id,
    value_properties_t *properties
    ) {
    return value_create_internal (
        name,
        id,
        properties
        );
}

void value_free(value_t *value) {
    if(NULL == value){
        return ;
    }
    if(value->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "value_free");
        return ;
    }
    listEntry_t *listEntry;
    if (value->name) {
        free(value->name);
        value->name = NULL;
    }
    if (value->id) {
        free(value->id);
        value->id = NULL;
    }
    if (value->properties) {
        value_properties_free(value->properties);
        value->properties = NULL;
    }
    free(value);
}

cJSON *value_convertToJSON(value_t *value) {
    cJSON *item = cJSON_CreateObject();

    // value->name
    if(value->name) {
    if(cJSON_AddStringToObject(item, "name", value->name) == NULL) {
    goto fail; //String
    }
    }


    // value->id
    if(value->id) {
    if(cJSON_AddStringToObject(item, "id", value->id) == NULL) {
    goto fail; //String
    }
    }


    // value->properties
    if(value->properties) {
    cJSON *properties_local_JSON = value_properties_convertToJSON(value->properties);
    if(properties_local_JSON == NULL) {
    goto fail; //model
    }
    cJSON_AddItemToObject(item, "properties", properties_local_JSON);
    if(item->child == NULL) {
    goto fail;
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

value_t *value_parseFromJSON(cJSON *valueJSON){

    value_t *value_local_var = NULL;

    // define the local variable for value->properties
    value_properties_t *properties_local_nonprim = NULL;

    // value->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(valueJSON, "name");
    if (cJSON_IsNull(name)) {
        name = NULL;
    }
    if (name) { 
    if(!cJSON_IsString(name) && !cJSON_IsNull(name))
    {
    goto end; //String
    }
    }

    // value->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(valueJSON, "id");
    if (cJSON_IsNull(id)) {
        id = NULL;
    }
    if (id) { 
    if(!cJSON_IsString(id) && !cJSON_IsNull(id))
    {
    goto end; //String
    }
    }

    // value->properties
    cJSON *properties = cJSON_GetObjectItemCaseSensitive(valueJSON, "properties");
    if (cJSON_IsNull(properties)) {
        properties = NULL;
    }
    if (properties) { 
    properties_local_nonprim = value_properties_parseFromJSON(properties); //nonprimitive
    }


    value_local_var = value_create_internal (
        name && !cJSON_IsNull(name) ? strdup(name->valuestring) : NULL,
        id && !cJSON_IsNull(id) ? strdup(id->valuestring) : NULL,
        properties ? properties_local_nonprim : NULL
        );

    return value_local_var;
end:
    if (properties_local_nonprim) {
        value_properties_free(properties_local_nonprim);
        properties_local_nonprim = NULL;
    }
    return NULL;

}
