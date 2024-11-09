<?php

/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * PHP version 7.4
 *
 * @package OpenAPIServer
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Please update the test case below to test the model.
 */
namespace OpenAPIServer\Model;

use PHPUnit\Framework\TestCase;
use OpenAPIServer\Model\ValueProperties;

/**
 * ValuePropertiesTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\ValueProperties
 */
class ValuePropertiesTest extends TestCase
{

    /**
     * Setup before running any test cases
     */
    public static function setUpBeforeClass(): void
    {
    }

    /**
     * Setup before running each test case
     */
    public function setUp(): void
    {
    }

    /**
     * Clean up after running each test case
     */
    public function tearDown(): void
    {
    }

    /**
     * Clean up after running all test cases
     */
    public static function tearDownAfterClass(): void
    {
    }

    /**
     * Test "ValueProperties"
     */
    public function testValueProperties()
    {
        $testValueProperties = new ValueProperties();
        $namespacedClassname = ValueProperties::getModelsNamespace() . '\\ValueProperties';
        $this->assertSame('\\' . ValueProperties::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "changeNumber"
     */
    public function testPropertyChangeNumber()
    {
        self::markTestIncomplete(
            'Test of "changeNumber" property in "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "region"
     */
    public function testPropertyRegion()
    {
        self::markTestIncomplete(
            'Test of "region" property in "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "regionId"
     */
    public function testPropertyRegionId()
    {
        self::markTestIncomplete(
            'Test of "regionId" property in "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "platform"
     */
    public function testPropertyPlatform()
    {
        self::markTestIncomplete(
            'Test of "platform" property in "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "systemService"
     */
    public function testPropertySystemService()
    {
        self::markTestIncomplete(
            'Test of "systemService" property in "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "addressPrefixes"
     */
    public function testPropertyAddressPrefixes()
    {
        self::markTestIncomplete(
            'Test of "addressPrefixes" property in "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "networkFeatures"
     */
    public function testPropertyNetworkFeatures()
    {
        self::markTestIncomplete(
            'Test of "networkFeatures" property in "ValueProperties" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = ValueProperties::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}
