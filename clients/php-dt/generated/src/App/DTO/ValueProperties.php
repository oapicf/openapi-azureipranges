<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ValueProperties
{
    /**
     * The number associated with the change.
     * @DTA\Data(field="changeNumber", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $change_number = null;

    /**
     * The region associated with the value.
     * @DTA\Data(field="region", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $region = null;

    /**
     * The ID of the region.
     * @DTA\Data(field="regionId", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $region_id = null;

    /**
     * The platform associated with the value.
     * @DTA\Data(field="platform", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $platform = null;

    /**
     * The system service associated with the value.
     * @DTA\Data(field="systemService", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $system_service = null;

    /**
     * The address prefixes associated with the value.
     * @DTA\Data(field="addressPrefixes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     */
    public ?\App\DTO\Collection $address_prefixes = null;

    /**
     * The network features associated with the value.
     * @DTA\Data(field="networkFeatures", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection1::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection1::class})
     */
    public ?\App\DTO\Collection1 $network_features = null;

}
