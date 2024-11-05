<?php
/**
 * Value
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the Value model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class Value 
{
        /**
     * The name of the value.
     *
     * @var string|null
     * @SerializedName("name")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $name = null;

    /**
     * The unique identifier of the value.
     *
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $id = null;

    /**
     * @var ValueProperties|null
     * @SerializedName("properties")
     * @Type("OpenAPI\Server\Model\ValueProperties")
    */
    #[Assert\Type("OpenAPI\Server\Model\ValueProperties")]
    protected ?ValueProperties $properties = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->name = array_key_exists('name', $data) ? $data['name'] : $this->name;
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->properties = array_key_exists('properties', $data) ? $data['properties'] : $this->properties;
        }
    }

    /**
     * Gets name.
     *
     * @return string|null
     */
    public function getName(): ?string
    {
        return $this->name;
    }

    /**
    * Sets name.
    *
    * @param string|null $name  The name of the value.
    *
    * @return $this
    */
    public function setName(?string $name = null): self
    {
        $this->name = $name;

        return $this;
    }




    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId(): ?string
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param string|null $id  The unique identifier of the value.
    *
    * @return $this
    */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets properties.
     *
     * @return ValueProperties|null
     */
    public function getProperties(): ?ValueProperties
    {
        return $this->properties;
    }

    /**
    * Sets properties.
    *
    * @param ValueProperties|null $properties
    *
    * @return $this
    */
    public function setProperties(?ValueProperties $properties = null): self
    {
        $this->properties = $properties;

        return $this;
    }



}


