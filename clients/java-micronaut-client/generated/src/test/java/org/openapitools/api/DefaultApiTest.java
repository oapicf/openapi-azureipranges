package org.openapitools.api;

import org.openapitools.model.Change;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for DefaultApi
 */
@MicronautTest
public class DefaultApiTest {

    @Inject
    DefaultApi api;

    
    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud
     *
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     */
    @Test
    @Disabled("Not Implemented")
    public void serviceTagsPublic20240318JsonGetTest() {
        // given

        // when
        Change body = api.serviceTagsPublic20240318JsonGet().block();

        // then
        // TODO implement the serviceTagsPublic20240318JsonGetTest()
    }

    
}
