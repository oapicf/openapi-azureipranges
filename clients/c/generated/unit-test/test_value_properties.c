#ifndef value_properties_TEST
#define value_properties_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define value_properties_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/value_properties.h"
value_properties_t* instantiate_value_properties(int include_optional);



value_properties_t* instantiate_value_properties(int include_optional) {
  value_properties_t* value_properties = NULL;
  if (include_optional) {
    value_properties = value_properties_create(
      56,
      "0",
      56,
      "0",
      "0",
      list_createList(),
      list_createList()
    );
  } else {
    value_properties = value_properties_create(
      56,
      "0",
      56,
      "0",
      "0",
      list_createList(),
      list_createList()
    );
  }

  return value_properties;
}


#ifdef value_properties_MAIN

void test_value_properties(int include_optional) {
    value_properties_t* value_properties_1 = instantiate_value_properties(include_optional);

	cJSON* jsonvalue_properties_1 = value_properties_convertToJSON(value_properties_1);
	printf("value_properties :\n%s\n", cJSON_Print(jsonvalue_properties_1));
	value_properties_t* value_properties_2 = value_properties_parseFromJSON(jsonvalue_properties_1);
	cJSON* jsonvalue_properties_2 = value_properties_convertToJSON(value_properties_2);
	printf("repeating value_properties:\n%s\n", cJSON_Print(jsonvalue_properties_2));
}

int main() {
  test_value_properties(1);
  test_value_properties(0);

  printf("Hello world \n");
  return 0;
}

#endif // value_properties_MAIN
#endif // value_properties_TEST
