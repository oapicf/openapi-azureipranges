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
        rules.get("/ServiceTags_Public_20240318.json", this::serviceTagsPublic20240318JsonGet);
    }


    /**
     * GET /ServiceTags_Public_20240318.json : Get Azure IP Ranges and Service Tags - Public Cloud.
     * @param request the server request
     * @param response the server response
     */
    void serviceTagsPublic20240318JsonGet(ServerRequest request, ServerResponse response);

}
