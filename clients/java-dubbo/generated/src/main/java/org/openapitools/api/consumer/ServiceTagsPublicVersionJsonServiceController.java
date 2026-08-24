package org.openapitools.api.consumer;

import org.openapitools.model.Change;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.ServiceTagsPublicVersionJsonService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/ServiceTags_Public_{version}.json")
public class ServiceTagsPublicVersionJsonServiceController {

    @DubboReference
    private ServiceTagsPublicVersionJsonService serviceTagsPublicVersionJsonService;

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public Change getAzureIpRangesServiceTagsPublicCloud(
        @RequestParam(name = "version") String version
    ) {
        return serviceTagsPublicVersionJsonService.getAzureIpRangesServiceTagsPublicCloud(version);
    }
}
