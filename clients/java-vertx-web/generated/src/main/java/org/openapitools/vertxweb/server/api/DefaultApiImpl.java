package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Change;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class DefaultApiImpl implements DefaultApi {
    public Future<ApiResponse<Change>> serviceTagsPublic20240318JsonGet() {
        return Future.failedFuture(new HttpException(501));
    }

}
