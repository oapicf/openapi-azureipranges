
#include "Change.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_Change_changeNumber_is_assigned_from_json()
{
    bourne::json input =
    {
        "changeNumber", 1
    };

    Change obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getChangeNumber());








}


void test_Change_cloud_is_assigned_from_json()
{


    bourne::json input =
    {
        "cloud", "hello"
    };

    Change obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getCloud().c_str());






}




void test_Change_changeNumber_is_converted_to_json()
{
    bourne::json input =
    {
        "changeNumber", 1
    };

    Change obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["changeNumber"] == output["changeNumber"]);




}


void test_Change_cloud_is_converted_to_json()
{

    bourne::json input =
    {
        "cloud", "hello"
    };

    Change obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["cloud"] == output["cloud"]);



}



