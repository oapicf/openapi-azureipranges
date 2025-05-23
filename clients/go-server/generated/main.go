// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package main

import (
	"log"
	"net/http"

	openapi "github.com/oapicf/openapi-azureipranges/go"
)

func main() {
	log.Printf("Server started")

	DefaultAPIService := openapi.NewDefaultAPIService()
	DefaultAPIController := openapi.NewDefaultAPIController(DefaultAPIService)

	router := openapi.NewRouter(DefaultAPIController)

	log.Fatal(http.ListenAndServe(":8080", router))
}
