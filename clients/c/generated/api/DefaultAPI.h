#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/change.h"


// Get Azure IP Ranges and Service Tags - Public Cloud
//
// Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
//
change_t*
DefaultAPI_serviceTagsPublic20240318JsonGet(apiClient_t *apiClient);


