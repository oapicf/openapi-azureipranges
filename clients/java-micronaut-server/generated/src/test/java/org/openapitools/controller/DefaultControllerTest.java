package org.openapitools.controller;

import org.openapitools.model.Change;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for DefaultController
 */
@MicronautTest
public class DefaultControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    DefaultController controller;

    /**
     * This test is used to validate the implementation of getAzureIpRangesServiceTagsPublicCloud() method
     *
     * The method should: Get Azure IP Ranges and Service Tags - Public Cloud
     *
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getAzureIpRangesServiceTagsPublicCloudMethodTest() {
        // given
        String version = "example";

        // when
        Change result = controller.getAzureIpRangesServiceTagsPublicCloud(version).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/ServiceTags_Public_{version}.json' to the features of getAzureIpRangesServiceTagsPublicCloud() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getAzureIpRangesServiceTagsPublicCloudClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/ServiceTags_Public_{version}.json").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("version", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@abbc908");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, Change.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
