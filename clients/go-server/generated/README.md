# Go API Server for openapi

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This server was generated by the [openapi-generator]
(https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate a server stub.

To see how to make this your own, look here:

[README](https://openapi-generator.tech)

- API version: 0.10.1-pre.0
- Build date: 2025-05-10T03:05:28.979407885Z[Etc/UTC]
- Generator version: 7.12.0
For more information, please visit [https://github.com/oapicf/openapi-azureipranges](https://github.com/oapicf/openapi-azureipranges)


### Running the server
To run the server, follow these simple steps:

```
go run main.go
```

The server will be available on `http://localhost:8080`.

To run the server in a docker container
```
docker build --network=host -t openapi .
```

Once image is built use
```
docker run --rm -it openapi
```
