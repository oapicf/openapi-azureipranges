using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get Azure IP Ranges and Service Tags - Public Cloud
/// </summary>

public class GetAzureIpRangesServiceTagsPublicCloudEndpoint : FastEndpoints.Endpoint<GetAzureIpRangesServiceTagsPublicCloudRequest, Change>
{
    public override void Configure()
    {
        Get("/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Get Azure IP Ranges and Service Tags - Public Cloud";
            s.RequestParam(r => r.Version, "The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506");
            s.Responses[200] = "Successful response";
        });
    }

    public override async Task HandleAsync(GetAzureIpRangesServiceTagsPublicCloudRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

