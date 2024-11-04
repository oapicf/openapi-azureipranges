package handlers
import (
	"github.com/oapicf/openapi-azureipranges/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetAzureIpRangesServiceTagsPublicCloud - Get Azure IP Ranges and Service Tags - Public Cloud
func (c *Container) GetAzureIpRangesServiceTagsPublicCloud(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

