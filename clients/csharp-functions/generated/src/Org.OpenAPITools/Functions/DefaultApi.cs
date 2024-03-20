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
        [FunctionName("DefaultApi_ServiceTagsPublic20240318JsonGet")]
        public async Task<ActionResult<Change>> _ServiceTagsPublic20240318JsonGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63ServiceTags_Public_20240318.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ServiceTagsPublic20240318JsonGet");
            return method != null
                ? (await ((Task<Change>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
