/*
 * value.h
 *
 * 
 */

#ifndef _value_H_
#define _value_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct value_t value_t;

#include "value_properties.h"



typedef struct value_t {
    char *name; // string
    char *id; // string
    struct value_properties_t *properties; //model

    int _library_owned; // Is the library responsible for freeing this object?
} value_t;

__attribute__((deprecated)) value_t *value_create(
    char *name,
    char *id,
    value_properties_t *properties
);

void value_free(value_t *value);

value_t *value_parseFromJSON(cJSON *valueJSON);

cJSON *value_convertToJSON(value_t *value);

#endif /* _value_H_ */

