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
use OpenAPIServer\Model\Change;

/**
 * ChangeTest Class Doc Comment
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 *
 * @coversDefaultClass \OpenAPIServer\Model\Change
 */
class ChangeTest extends TestCase
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
     * Test "Change"
     */
    public function testChange()
    {
        $testChange = new Change();
        $namespacedClassname = Change::getModelsNamespace() . '\\Change';
        $this->assertSame('\\' . Change::class, $namespacedClassname);
        $this->assertTrue(
            class_exists($namespacedClassname),
            sprintf('Assertion failed that "%s" class exists', $namespacedClassname)
        );
        self::markTestIncomplete(
            'Test of "Change" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "changeNumber"
     */
    public function testPropertyChangeNumber()
    {
        self::markTestIncomplete(
            'Test of "changeNumber" property in "Change" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "cloud"
     */
    public function testPropertyCloud()
    {
        self::markTestIncomplete(
            'Test of "cloud" property in "Change" model has not been implemented yet.'
        );
    }

    /**
     * Test attribute "values"
     */
    public function testPropertyValues()
    {
        self::markTestIncomplete(
            'Test of "values" property in "Change" model has not been implemented yet.'
        );
    }

    /**
     * Test getOpenApiSchema static method
     * @covers ::getOpenApiSchema
     */
    public function testGetOpenApiSchema()
    {
        $schemaArr = Change::getOpenApiSchema();
        $this->assertIsArray($schemaArr);
    }
}

