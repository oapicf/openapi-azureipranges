<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getAzureIpRangesServiceTagsPublicCloud
 */
class GetAzureIpRangesServiceTagsPublicCloudParameterData
{
    /**
     * The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
     * @DTA\Data(subset="path", field="version")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $version = null;

}
