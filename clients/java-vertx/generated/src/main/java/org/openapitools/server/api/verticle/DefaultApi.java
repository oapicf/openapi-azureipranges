package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Change;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //getAzureIpRangesServiceTagsPublicCloud
    void getAzureIpRangesServiceTagsPublicCloud(String version, Handler<AsyncResult<Change>> handler);

}
