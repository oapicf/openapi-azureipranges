using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class DefaultApi
    { 
        [FunctionName("DefaultApi_GetAzureIpRangesServiceTagsPublicCloud")]
        public async Task<ActionResult<Change>> _GetAzureIpRangesServiceTagsPublicCloud([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63ServiceTags_Public_{version}.json")]HttpRequest req, ExecutionContext context, string version)
        {
            var method = this.GetType().GetMethod("GetAzureIpRangesServiceTagsPublicCloud");
            return method != null
                ? (await ((Task<Change>)method.Invoke(this, new object[] { req, context, version })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
