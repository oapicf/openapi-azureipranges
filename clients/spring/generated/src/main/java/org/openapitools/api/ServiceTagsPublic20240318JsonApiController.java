package org.openapitools.api;

import org.openapitools.model.Change;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-19T12:56:59.578654944Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Controller
@RequestMapping("${openapi.azureIPRangesAndServiceTagsPublicCloud.base-path:/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63}")
public class ServiceTagsPublic20240318JsonApiController implements ServiceTagsPublic20240318JsonApi {

    private final NativeWebRequest request;

    @Autowired
    public ServiceTagsPublic20240318JsonApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
