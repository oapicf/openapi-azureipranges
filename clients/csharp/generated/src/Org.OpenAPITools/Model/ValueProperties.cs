/*
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ValueProperties
    /// </summary>
    [DataContract(Name = "ValueProperties")]
    public partial class ValueProperties : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ValueProperties" /> class.
        /// </summary>
        /// <param name="changeNumber">The number associated with the change..</param>
        /// <param name="region">The region associated with the value..</param>
        /// <param name="regionId">The ID of the region..</param>
        /// <param name="platform">The platform associated with the value..</param>
        /// <param name="systemService">The system service associated with the value..</param>
        /// <param name="addressPrefixes">The address prefixes associated with the value..</param>
        /// <param name="networkFeatures">The network features associated with the value..</param>
        public ValueProperties(int changeNumber = default(int), string region = default(string), int regionId = default(int), string platform = default(string), string systemService = default(string), List<string> addressPrefixes = default(List<string>), List<string> networkFeatures = default(List<string>))
        {
            this.ChangeNumber = changeNumber;
            this.Region = region;
            this.RegionId = regionId;
            this.Platform = platform;
            this.SystemService = systemService;
            this.AddressPrefixes = addressPrefixes;
            this.NetworkFeatures = networkFeatures;
        }

        /// <summary>
        /// The number associated with the change.
        /// </summary>
        /// <value>The number associated with the change.</value>
        [DataMember(Name = "changeNumber", EmitDefaultValue = false)]
        public int ChangeNumber { get; set; }

        /// <summary>
        /// The region associated with the value.
        /// </summary>
        /// <value>The region associated with the value.</value>
        [DataMember(Name = "region", EmitDefaultValue = false)]
        public string Region { get; set; }

        /// <summary>
        /// The ID of the region.
        /// </summary>
        /// <value>The ID of the region.</value>
        [DataMember(Name = "regionId", EmitDefaultValue = false)]
        public int RegionId { get; set; }

        /// <summary>
        /// The platform associated with the value.
        /// </summary>
        /// <value>The platform associated with the value.</value>
        [DataMember(Name = "platform", EmitDefaultValue = false)]
        public string Platform { get; set; }

        /// <summary>
        /// The system service associated with the value.
        /// </summary>
        /// <value>The system service associated with the value.</value>
        [DataMember(Name = "systemService", EmitDefaultValue = false)]
        public string SystemService { get; set; }

        /// <summary>
        /// The address prefixes associated with the value.
        /// </summary>
        /// <value>The address prefixes associated with the value.</value>
        [DataMember(Name = "addressPrefixes", EmitDefaultValue = false)]
        public List<string> AddressPrefixes { get; set; }

        /// <summary>
        /// The network features associated with the value.
        /// </summary>
        /// <value>The network features associated with the value.</value>
        [DataMember(Name = "networkFeatures", EmitDefaultValue = false)]
        public List<string> NetworkFeatures { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ValueProperties {\n");
            sb.Append("  ChangeNumber: ").Append(ChangeNumber).Append("\n");
            sb.Append("  Region: ").Append(Region).Append("\n");
            sb.Append("  RegionId: ").Append(RegionId).Append("\n");
            sb.Append("  Platform: ").Append(Platform).Append("\n");
            sb.Append("  SystemService: ").Append(SystemService).Append("\n");
            sb.Append("  AddressPrefixes: ").Append(AddressPrefixes).Append("\n");
            sb.Append("  NetworkFeatures: ").Append(NetworkFeatures).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
