<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Change
{
    /**
     * The number associated with the change.
     * @DTA\Data(field="changeNumber", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $change_number;

    /**
     * The cloud environment.
     * @DTA\Data(field="cloud", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $cloud;

    /**
     * @DTA\Data(field="values", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection2::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection2::class})
     * @var \App\DTO\Collection2|null
     */
    public $values;

}
