package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Change;
import org.openapitools.server.api.MainApiException;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }

    public static final DefaultApiException Default_getAzureIpRangesServiceTagsPublicCloud_200_Exception = new DefaultApiException(200, "Successful response");
    

}