<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ValueProperties
{
    /**
     * The number associated with the change.
     * @DTA\Data(field="changeNumber", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $change_number;

    /**
     * The region associated with the value.
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $region;

    /**
     * The ID of the region.
     * @DTA\Data(field="regionId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $region_id;

    /**
     * The platform associated with the value.
     * @DTA\Data(field="platform", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $platform;

    /**
     * The system service associated with the value.
     * @DTA\Data(field="systemService", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $system_service;

    /**
     * The address prefixes associated with the value.
     * @DTA\Data(field="addressPrefixes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     * @var \App\DTO\Collection|null
     */
    public $address_prefixes;

    /**
     * The network features associated with the value.
     * @DTA\Data(field="networkFeatures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection1::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection1::class})
     * @var \App\DTO\Collection1|null
     */
    public $network_features;

}
