# Helidon SE Server with OpenAPI

## Build and run

With JDK11+
```bash
mvn package
java -jar target/openapi-java-server.jar
```

## Exercise the application

```
curl -X GET https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json

```

## Try health and metrics

```
curl -s -X GET https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/health
{"outcome":"UP",...
. . .

# Prometheus Format
curl -s -X GET https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/metrics
# TYPE base:gc_g1_young_generation_count gauge
. . .

# JSON Format
curl -H 'Accept: application/json' -X GET https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/metrics
{"base":...
. . .
```