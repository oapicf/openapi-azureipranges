#ifndef value_TEST
#define value_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define value_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/value.h"
value_t* instantiate_value(int include_optional);

#include "test_value_properties.c"


value_t* instantiate_value(int include_optional) {
  value_t* value = NULL;
  if (include_optional) {
    value = value_create(
      "0",
      "0",
       // false, not to have infinite recursion
      instantiate_value_properties(0)
    );
  } else {
    value = value_create(
      "0",
      "0",
      NULL
    );
  }

  return value;
}


#ifdef value_MAIN

void test_value(int include_optional) {
    value_t* value_1 = instantiate_value(include_optional);

	cJSON* jsonvalue_1 = value_convertToJSON(value_1);
	printf("value :\n%s\n", cJSON_Print(jsonvalue_1));
	value_t* value_2 = value_parseFromJSON(jsonvalue_1);
	cJSON* jsonvalue_2 = value_convertToJSON(value_2);
	printf("repeating value:\n%s\n", cJSON_Print(jsonvalue_2));
}

int main() {
  test_value(1);
  test_value(0);

  printf("Hello world \n");
  return 0;
}

#endif // value_MAIN
#endif // value_TEST
