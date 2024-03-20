package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Change;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //GET_ServiceTags_Public_20240318.json
    void serviceTagsPublic20240318JsonGet(Handler<AsyncResult<Change>> handler);

}
