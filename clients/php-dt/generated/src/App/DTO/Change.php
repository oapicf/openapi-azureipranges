<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Change
{
    /**
     * The number associated with the change.
     * @DTA\Data(field="changeNumber", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $change_number = null;

    /**
     * The cloud environment.
     * @DTA\Data(field="cloud", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $cloud = null;

    /**
     * @DTA\Data(field="values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection2::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection2::class})
     */
    public ?\App\DTO\Collection2 $values = null;

}
