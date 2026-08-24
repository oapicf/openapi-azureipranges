package org.openapitools.api.interfaces;

import org.openapitools.model.Change;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface ServiceTagsPublicVersionJsonService {

    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     *
     * @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 (required)
     * @return Change
     */
    Change getAzureIpRangesServiceTagsPublicCloud(
        String version
    );
}
