
#include "ValueProperties.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_ValueProperties_changeNumber_is_assigned_from_json()
{
    bourne::json input =
    {
        "changeNumber", 1
    };

    ValueProperties obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getChangeNumber());








}


void test_ValueProperties_region_is_assigned_from_json()
{


    bourne::json input =
    {
        "region", "hello"
    };

    ValueProperties obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getRegion().c_str());






}


void test_ValueProperties_regionId_is_assigned_from_json()
{
    bourne::json input =
    {
        "regionId", 1
    };

    ValueProperties obj(input.dump());

    TEST_ASSERT_EQUAL_INT(1, obj.getRegionId());








}


void test_ValueProperties_platform_is_assigned_from_json()
{


    bourne::json input =
    {
        "platform", "hello"
    };

    ValueProperties obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getPlatform().c_str());






}


void test_ValueProperties_systemService_is_assigned_from_json()
{


    bourne::json input =
    {
        "systemService", "hello"
    };

    ValueProperties obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getSystemService().c_str());






}





void test_ValueProperties_changeNumber_is_converted_to_json()
{
    bourne::json input =
    {
        "changeNumber", 1
    };

    ValueProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["changeNumber"] == output["changeNumber"]);




}


void test_ValueProperties_region_is_converted_to_json()
{

    bourne::json input =
    {
        "region", "hello"
    };

    ValueProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["region"] == output["region"]);



}


void test_ValueProperties_regionId_is_converted_to_json()
{
    bourne::json input =
    {
        "regionId", 1
    };

    ValueProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["regionId"] == output["regionId"]);




}


void test_ValueProperties_platform_is_converted_to_json()
{

    bourne::json input =
    {
        "platform", "hello"
    };

    ValueProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["platform"] == output["platform"]);



}


void test_ValueProperties_systemService_is_converted_to_json()
{

    bourne::json input =
    {
        "systemService", "hello"
    };

    ValueProperties obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["systemService"] == output["systemService"]);



}




