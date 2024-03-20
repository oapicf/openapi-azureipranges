#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "value_properties.h"



value_properties_t *value_properties_create(
    int change_number,
    char *region,
    int region_id,
    char *platform,
    char *system_service,
    list_t *address_prefixes,
    list_t *network_features
    ) {
    value_properties_t *value_properties_local_var = malloc(sizeof(value_properties_t));
    if (!value_properties_local_var) {
        return NULL;
    }
    value_properties_local_var->change_number = change_number;
    value_properties_local_var->region = region;
    value_properties_local_var->region_id = region_id;
    value_properties_local_var->platform = platform;
    value_properties_local_var->system_service = system_service;
    value_properties_local_var->address_prefixes = address_prefixes;
    value_properties_local_var->network_features = network_features;

    return value_properties_local_var;
}


void value_properties_free(value_properties_t *value_properties) {
    if(NULL == value_properties){
        return ;
    }
    listEntry_t *listEntry;
    if (value_properties->region) {
        free(value_properties->region);
        value_properties->region = NULL;
    }
    if (value_properties->platform) {
        free(value_properties->platform);
        value_properties->platform = NULL;
    }
    if (value_properties->system_service) {
        free(value_properties->system_service);
        value_properties->system_service = NULL;
    }
    if (value_properties->address_prefixes) {
        list_ForEach(listEntry, value_properties->address_prefixes) {
            free(listEntry->data);
        }
        list_freeList(value_properties->address_prefixes);
        value_properties->address_prefixes = NULL;
    }
    if (value_properties->network_features) {
        list_ForEach(listEntry, value_properties->network_features) {
            free(listEntry->data);
        }
        list_freeList(value_properties->network_features);
        value_properties->network_features = NULL;
    }
    free(value_properties);
}

cJSON *value_properties_convertToJSON(value_properties_t *value_properties) {
    cJSON *item = cJSON_CreateObject();

    // value_properties->change_number
    if(value_properties->change_number) {
    if(cJSON_AddNumberToObject(item, "changeNumber", value_properties->change_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // value_properties->region
    if(value_properties->region) {
    if(cJSON_AddStringToObject(item, "region", value_properties->region) == NULL) {
    goto fail; //String
    }
    }


    // value_properties->region_id
    if(value_properties->region_id) {
    if(cJSON_AddNumberToObject(item, "regionId", value_properties->region_id) == NULL) {
    goto fail; //Numeric
    }
    }


    // value_properties->platform
    if(value_properties->platform) {
    if(cJSON_AddStringToObject(item, "platform", value_properties->platform) == NULL) {
    goto fail; //String
    }
    }


    // value_properties->system_service
    if(value_properties->system_service) {
    if(cJSON_AddStringToObject(item, "systemService", value_properties->system_service) == NULL) {
    goto fail; //String
    }
    }


    // value_properties->address_prefixes
    if(value_properties->address_prefixes) {
    cJSON *address_prefixes = cJSON_AddArrayToObject(item, "addressPrefixes");
    if(address_prefixes == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *address_prefixesListEntry;
    list_ForEach(address_prefixesListEntry, value_properties->address_prefixes) {
    if(cJSON_AddStringToObject(address_prefixes, "", (char*)address_prefixesListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }


    // value_properties->network_features
    if(value_properties->network_features) {
    cJSON *network_features = cJSON_AddArrayToObject(item, "networkFeatures");
    if(network_features == NULL) {
        goto fail; //primitive container
    }

    listEntry_t *network_featuresListEntry;
    list_ForEach(network_featuresListEntry, value_properties->network_features) {
    if(cJSON_AddStringToObject(network_features, "", (char*)network_featuresListEntry->data) == NULL)
    {
        goto fail;
    }
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

value_properties_t *value_properties_parseFromJSON(cJSON *value_propertiesJSON){

    value_properties_t *value_properties_local_var = NULL;

    // define the local list for value_properties->address_prefixes
    list_t *address_prefixesList = NULL;

    // define the local list for value_properties->network_features
    list_t *network_featuresList = NULL;

    // value_properties->change_number
    cJSON *change_number = cJSON_GetObjectItemCaseSensitive(value_propertiesJSON, "changeNumber");
    if (change_number) { 
    if(!cJSON_IsNumber(change_number))
    {
    goto end; //Numeric
    }
    }

    // value_properties->region
    cJSON *region = cJSON_GetObjectItemCaseSensitive(value_propertiesJSON, "region");
    if (region) { 
    if(!cJSON_IsString(region) && !cJSON_IsNull(region))
    {
    goto end; //String
    }
    }

    // value_properties->region_id
    cJSON *region_id = cJSON_GetObjectItemCaseSensitive(value_propertiesJSON, "regionId");
    if (region_id) { 
    if(!cJSON_IsNumber(region_id))
    {
    goto end; //Numeric
    }
    }

    // value_properties->platform
    cJSON *platform = cJSON_GetObjectItemCaseSensitive(value_propertiesJSON, "platform");
    if (platform) { 
    if(!cJSON_IsString(platform) && !cJSON_IsNull(platform))
    {
    goto end; //String
    }
    }

    // value_properties->system_service
    cJSON *system_service = cJSON_GetObjectItemCaseSensitive(value_propertiesJSON, "systemService");
    if (system_service) { 
    if(!cJSON_IsString(system_service) && !cJSON_IsNull(system_service))
    {
    goto end; //String
    }
    }

    // value_properties->address_prefixes
    cJSON *address_prefixes = cJSON_GetObjectItemCaseSensitive(value_propertiesJSON, "addressPrefixes");
    if (address_prefixes) { 
    cJSON *address_prefixes_local = NULL;
    if(!cJSON_IsArray(address_prefixes)) {
        goto end;//primitive container
    }
    address_prefixesList = list_createList();

    cJSON_ArrayForEach(address_prefixes_local, address_prefixes)
    {
        if(!cJSON_IsString(address_prefixes_local))
        {
            goto end;
        }
        list_addElement(address_prefixesList , strdup(address_prefixes_local->valuestring));
    }
    }

    // value_properties->network_features
    cJSON *network_features = cJSON_GetObjectItemCaseSensitive(value_propertiesJSON, "networkFeatures");
    if (network_features) { 
    cJSON *network_features_local = NULL;
    if(!cJSON_IsArray(network_features)) {
        goto end;//primitive container
    }
    network_featuresList = list_createList();

    cJSON_ArrayForEach(network_features_local, network_features)
    {
        if(!cJSON_IsString(network_features_local))
        {
            goto end;
        }
        list_addElement(network_featuresList , strdup(network_features_local->valuestring));
    }
    }


    value_properties_local_var = value_properties_create (
        change_number ? change_number->valuedouble : 0,
        region && !cJSON_IsNull(region) ? strdup(region->valuestring) : NULL,
        region_id ? region_id->valuedouble : 0,
        platform && !cJSON_IsNull(platform) ? strdup(platform->valuestring) : NULL,
        system_service && !cJSON_IsNull(system_service) ? strdup(system_service->valuestring) : NULL,
        address_prefixes ? address_prefixesList : NULL,
        network_features ? network_featuresList : NULL
        );

    return value_properties_local_var;
end:
    if (address_prefixesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, address_prefixesList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(address_prefixesList);
        address_prefixesList = NULL;
    }
    if (network_featuresList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, network_featuresList) {
            free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(network_featuresList);
        network_featuresList = NULL;
    }
    return NULL;

}
