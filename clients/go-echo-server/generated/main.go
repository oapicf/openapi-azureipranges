package main

import (
	"github.com/oapicf/openapi-azureipranges/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// GetAzureIpRangesServiceTagsPublicCloud - Get Azure IP Ranges and Service Tags - Public Cloud
	e.GET("/download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_:version.json", c.GetAzureIpRangesServiceTagsPublicCloud)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
