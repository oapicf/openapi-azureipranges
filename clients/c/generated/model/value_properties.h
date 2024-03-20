/*
 * value_properties.h
 *
 * 
 */

#ifndef _value_properties_H_
#define _value_properties_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct value_properties_t value_properties_t;




typedef struct value_properties_t {
    int change_number; //numeric
    char *region; // string
    int region_id; //numeric
    char *platform; // string
    char *system_service; // string
    list_t *address_prefixes; //primitive container
    list_t *network_features; //primitive container

} value_properties_t;

value_properties_t *value_properties_create(
    int change_number,
    char *region,
    int region_id,
    char *platform,
    char *system_service,
    list_t *address_prefixes,
    list_t *network_features
);

void value_properties_free(value_properties_t *value_properties);

value_properties_t *value_properties_parseFromJSON(cJSON *value_propertiesJSON);

cJSON *value_properties_convertToJSON(value_properties_t *value_properties);

#endif /* _value_properties_H_ */

