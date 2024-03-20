#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "change.h"



change_t *change_create(
    int change_number,
    char *cloud,
    list_t *values
    ) {
    change_t *change_local_var = malloc(sizeof(change_t));
    if (!change_local_var) {
        return NULL;
    }
    change_local_var->change_number = change_number;
    change_local_var->cloud = cloud;
    change_local_var->values = values;

    return change_local_var;
}


void change_free(change_t *change) {
    if(NULL == change){
        return ;
    }
    listEntry_t *listEntry;
    if (change->cloud) {
        free(change->cloud);
        change->cloud = NULL;
    }
    if (change->values) {
        list_ForEach(listEntry, change->values) {
            value_free(listEntry->data);
        }
        list_freeList(change->values);
        change->values = NULL;
    }
    free(change);
}

cJSON *change_convertToJSON(change_t *change) {
    cJSON *item = cJSON_CreateObject();

    // change->change_number
    if(change->change_number) {
    if(cJSON_AddNumberToObject(item, "changeNumber", change->change_number) == NULL) {
    goto fail; //Numeric
    }
    }


    // change->cloud
    if(change->cloud) {
    if(cJSON_AddStringToObject(item, "cloud", change->cloud) == NULL) {
    goto fail; //String
    }
    }


    // change->values
    if(change->values) {
    cJSON *values = cJSON_AddArrayToObject(item, "values");
    if(values == NULL) {
    goto fail; //nonprimitive container
    }

    listEntry_t *valuesListEntry;
    if (change->values) {
    list_ForEach(valuesListEntry, change->values) {
    cJSON *itemLocal = value_convertToJSON(valuesListEntry->data);
    if(itemLocal == NULL) {
    goto fail;
    }
    cJSON_AddItemToArray(values, itemLocal);
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

change_t *change_parseFromJSON(cJSON *changeJSON){

    change_t *change_local_var = NULL;

    // define the local list for change->values
    list_t *valuesList = NULL;

    // change->change_number
    cJSON *change_number = cJSON_GetObjectItemCaseSensitive(changeJSON, "changeNumber");
    if (change_number) { 
    if(!cJSON_IsNumber(change_number))
    {
    goto end; //Numeric
    }
    }

    // change->cloud
    cJSON *cloud = cJSON_GetObjectItemCaseSensitive(changeJSON, "cloud");
    if (cloud) { 
    if(!cJSON_IsString(cloud) && !cJSON_IsNull(cloud))
    {
    goto end; //String
    }
    }

    // change->values
    cJSON *values = cJSON_GetObjectItemCaseSensitive(changeJSON, "values");
    if (values) { 
    cJSON *values_local_nonprimitive = NULL;
    if(!cJSON_IsArray(values)){
        goto end; //nonprimitive container
    }

    valuesList = list_createList();

    cJSON_ArrayForEach(values_local_nonprimitive,values )
    {
        if(!cJSON_IsObject(values_local_nonprimitive)){
            goto end;
        }
        value_t *valuesItem = value_parseFromJSON(values_local_nonprimitive);

        list_addElement(valuesList, valuesItem);
    }
    }


    change_local_var = change_create (
        change_number ? change_number->valuedouble : 0,
        cloud && !cJSON_IsNull(cloud) ? strdup(cloud->valuestring) : NULL,
        values ? valuesList : NULL
        );

    return change_local_var;
end:
    if (valuesList) {
        listEntry_t *listEntry = NULL;
        list_ForEach(listEntry, valuesList) {
            value_free(listEntry->data);
            listEntry->data = NULL;
        }
        list_freeList(valuesList);
        valuesList = NULL;
    }
    return NULL;

}
