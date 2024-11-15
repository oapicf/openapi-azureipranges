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
    /// Change
    /// </summary>
    [DataContract(Name = "Change")]
    public partial class Change : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Change" /> class.
        /// </summary>
        /// <param name="changeNumber">The number associated with the change..</param>
        /// <param name="cloud">The cloud environment..</param>
        /// <param name="values">values.</param>
        public Change(int changeNumber = default(int), string cloud = default(string), List<Value> values = default(List<Value>))
        {
            this.ChangeNumber = changeNumber;
            this.Cloud = cloud;
            this.Values = values;
        }

        /// <summary>
        /// The number associated with the change.
        /// </summary>
        /// <value>The number associated with the change.</value>
        [DataMember(Name = "changeNumber", EmitDefaultValue = false)]
        public int ChangeNumber { get; set; }

        /// <summary>
        /// The cloud environment.
        /// </summary>
        /// <value>The cloud environment.</value>
        [DataMember(Name = "cloud", EmitDefaultValue = false)]
        public string Cloud { get; set; }

        /// <summary>
        /// Gets or Sets Values
        /// </summary>
        [DataMember(Name = "values", EmitDefaultValue = false)]
        public List<Value> Values { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Change {\n");
            sb.Append("  ChangeNumber: ").Append(ChangeNumber).Append("\n");
            sb.Append("  Cloud: ").Append(Cloud).Append("\n");
            sb.Append("  Values: ").Append(Values).Append("\n");
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
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
