
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetAzureIpRangesServiceTagsPublicCloudRequest
{
    /// <summary>
    /// The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    /// </summary>
    [FastEndpoints.BindFrom("version")]
    public string Version { get; set; }
}


