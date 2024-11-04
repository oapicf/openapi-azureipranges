package org.openapitools.server.api;

import org.openapitools.server.model.Change;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;
import io.helidon.webserver.Service;

public interface DefaultService extends Service { 

    /**
     * A service registers itself by updating the routing rules.
     * @param rules the routing rules.
     */
    @Override
    default void update(Routing.Rules rules) {
        rules.get("/ServiceTags_Public_{version}.json", this::getAzureIpRangesServiceTagsPublicCloud);
    }


    /**
     * GET /ServiceTags_Public_{version}.json : Get Azure IP Ranges and Service Tags - Public Cloud.
     * @param request the server request
     * @param response the server response
     */
    void getAzureIpRangesServiceTagsPublicCloud(ServerRequest request, ServerResponse response);

}
