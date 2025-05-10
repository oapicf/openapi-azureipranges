/*
 * change.h
 *
 * 
 */

#ifndef _change_H_
#define _change_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct change_t change_t;

#include "value.h"



typedef struct change_t {
    int change_number; //numeric
    char *cloud; // string
    list_t *values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} change_t;

__attribute__((deprecated)) change_t *change_create(
    int change_number,
    char *cloud,
    list_t *values
);

void change_free(change_t *change);

change_t *change_parseFromJSON(cJSON *changeJSON);

cJSON *change_convertToJSON(change_t *change);

#endif /* _change_H_ */

