<?php
/**
 * OpenAPIServerApiPass
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\DependencyInjection\Compiler
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\DependencyInjection\Compiler;

use Symfony\Component\DependencyInjection\Compiler\CompilerPassInterface;
use Symfony\Component\DependencyInjection\ContainerBuilder;
use Symfony\Component\DependencyInjection\Reference;

/**
 * OpenAPIServerApiPass Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Server\DependencyInjection\Compiler
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
class OpenAPIServerApiPass implements CompilerPassInterface
{

    /**
     * You can modify the container here before it is dumped to PHP code.
     *
     * @param ContainerBuilder $container
     */
    public function process(ContainerBuilder $container) {
        // always first check if the primary service is defined
        if (!$container->has('open_api_server.api.api_server')) {
            return;
        }

        $definition = $container->findDefinition('open_api_server.api.api_server');

        // find all service IDs with the open_api_server.api tag
        $taggedServices = $container->findTaggedServiceIds('open_api_server.api');

        foreach ($taggedServices as $id => $tags) {
            foreach ($tags as $tag) {
                // add the transport service to the ChainTransport service
                $definition->addMethodCall('addApiHandler', [$tag['api'], new Reference($id)]);
            }
        }
    }
}
