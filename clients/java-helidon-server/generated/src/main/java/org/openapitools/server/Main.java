package org.openapitools.server;

import org.openapitools.server.api.DefaultServiceImpl;

import io.helidon.common.LogConfig;
import io.helidon.common.reactive.Single;
import io.helidon.config.Config;
import io.helidon.health.HealthSupport;
import io.helidon.health.checks.HealthChecks;
import io.helidon.media.jsonp.JsonpSupport;
import io.helidon.media.jackson.JacksonSupport;
import org.openapitools.server.api.JsonProvider;
import io.helidon.metrics.MetricsSupport;
import io.helidon.openapi.OpenAPISupport;
import io.helidon.webserver.Routing;
import io.helidon.webserver.WebServer;

/**
* The application main class.
*/
public final class Main {

    /**
    * Cannot be instantiated.
    */
    private Main() {
    }

    /**
    * Application main entry point.
    * @param args command line arguments.
    */
    public static void main(final String[] args) {
        startServer();
    }

    /**
    * Start the server.
    * @return the created {@link WebServer} instance
    */
    static Single<WebServer> startServer() {

        // load logging configuration
        LogConfig.configureRuntime();

        // By default this will pick up application.yaml from the classpath
        Config config = Config.create();

        WebServer server = WebServer.builder(createRouting(config))
                                    .config(config.get("server"))
                                    .addMediaSupport(JsonpSupport.create())
                                    .addMediaSupport(JacksonSupport.create(JsonProvider.objectMapper()))
                                    .build();

        Single<WebServer> webserver = server.start();

        // Try to start the server. If successful, print some info and arrange to
        // print a message at shutdown. If unsuccessful, print the exception.
        webserver.thenAccept(ws -> {
                     System.out.println("WEB server is up! https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63");
                     ws.whenShutdown().thenRun(() -> System.out.println("WEB server is DOWN. Good bye!"));
                 })
                 .exceptionallyAccept(t -> {
                     System.err.println("Startup failed: " + t.getMessage());
                     t.printStackTrace(System.err);
                 });

        return webserver;
    }

    /**
    * Creates new {@link Routing}.
    *
    * @return routing configured with JSON support, a health check, and a service
    * @param config configuration of this server
    */
    private static Routing createRouting(Config config) {

        MetricsSupport metrics = MetricsSupport.create();
        HealthSupport health = HealthSupport.builder()
                                            .addLiveness(HealthChecks.healthChecks())   // Adds a convenient set of checks
                                            .build();

        return Routing.builder()
                      .register(OpenAPISupport.create(config.get(OpenAPISupport.Builder.CONFIG_KEY)))
                      .register(health)                   // Health at "/health"
                      .register(metrics)                  // Metrics at "/metrics"
                      .register("/", new DefaultServiceImpl())
                      .build();
    }
}
