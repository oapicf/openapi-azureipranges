#ifndef change_TEST
#define change_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define change_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/change.h"
change_t* instantiate_change(int include_optional);



change_t* instantiate_change(int include_optional) {
  change_t* change = NULL;
  if (include_optional) {
    change = change_create(
      56,
      "0",
      list_createList()
    );
  } else {
    change = change_create(
      56,
      "0",
      list_createList()
    );
  }

  return change;
}


#ifdef change_MAIN

void test_change(int include_optional) {
    change_t* change_1 = instantiate_change(include_optional);

	cJSON* jsonchange_1 = change_convertToJSON(change_1);
	printf("change :\n%s\n", cJSON_Print(jsonchange_1));
	change_t* change_2 = change_parseFromJSON(jsonchange_1);
	cJSON* jsonchange_2 = change_convertToJSON(change_2);
	printf("repeating change:\n%s\n", cJSON_Print(jsonchange_2));
}

int main() {
  test_change(1);
  test_change(0);

  printf("Hello world \n");
  return 0;
}

#endif // change_MAIN
#endif // change_TEST
