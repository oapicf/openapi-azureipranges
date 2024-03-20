
#include "ChangeTest.cpp"

#include "ValueTest.cpp"

#include "ValuePropertiesTest.cpp"



void setUp(){}

void tearDown(){}

void runTests(){
    
    
    RUN_TEST(test_Change_changeNumber_is_assigned_from_json);
    
    
    RUN_TEST(test_Change_cloud_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_Value_name_is_assigned_from_json);
    
    
    RUN_TEST(test_Value_id_is_assigned_from_json);
    
    
    
    
    RUN_TEST(test_ValueProperties_changeNumber_is_assigned_from_json);
    
    
    RUN_TEST(test_ValueProperties_region_is_assigned_from_json);
    
    
    RUN_TEST(test_ValueProperties_regionId_is_assigned_from_json);
    
    
    RUN_TEST(test_ValueProperties_platform_is_assigned_from_json);
    
    
    RUN_TEST(test_ValueProperties_systemService_is_assigned_from_json);
    
    
    
    

    
    
    RUN_TEST(test_Change_changeNumber_is_converted_to_json);
    
    
    RUN_TEST(test_Change_cloud_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_Value_name_is_converted_to_json);
    
    
    RUN_TEST(test_Value_id_is_converted_to_json);
    
    
    
    
    RUN_TEST(test_ValueProperties_changeNumber_is_converted_to_json);
    
    
    RUN_TEST(test_ValueProperties_region_is_converted_to_json);
    
    
    RUN_TEST(test_ValueProperties_regionId_is_converted_to_json);
    
    
    RUN_TEST(test_ValueProperties_platform_is_converted_to_json);
    
    
    RUN_TEST(test_ValueProperties_systemService_is_converted_to_json);
    
    
    
    


}

int main(void) {
    UNITY_BEGIN();
    runTests();
    return UNITY_END();
}

void setup() {
    UNITY_BEGIN();
    runTests();
    UNITY_END();
}

void loop() {

}
