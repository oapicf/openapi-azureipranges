// <auto-generated>
/*
 * Azure IP Ranges and Service Tags - Public Cloud
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Change
    /// </summary>
    public partial class Change : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Change" /> class.
        /// </summary>
        /// <param name="changeNumber">The number associated with the change.</param>
        /// <param name="cloud">The cloud environment.</param>
        /// <param name="values">values</param>
        [JsonConstructor]
        public Change(Option<int?> changeNumber = default, Option<string?> cloud = default, Option<List<Value>?> values = default)
        {
            ChangeNumberOption = changeNumber;
            CloudOption = cloud;
            ValuesOption = values;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Used to track the state of ChangeNumber
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public Option<int?> ChangeNumberOption { get; private set; }

        /// <summary>
        /// The number associated with the change.
        /// </summary>
        /// <value>The number associated with the change.</value>
        [JsonPropertyName("changeNumber")]
        public int? ChangeNumber { get { return this.ChangeNumberOption; } set { this.ChangeNumberOption = new(value); } }

        /// <summary>
        /// Used to track the state of Cloud
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public Option<string?> CloudOption { get; private set; }

        /// <summary>
        /// The cloud environment.
        /// </summary>
        /// <value>The cloud environment.</value>
        [JsonPropertyName("cloud")]
        public string? Cloud { get { return this.CloudOption; } set { this.CloudOption = new(value); } }

        /// <summary>
        /// Used to track the state of Values
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public Option<List<Value>?> ValuesOption { get; private set; }

        /// <summary>
        /// Gets or Sets Values
        /// </summary>
        [JsonPropertyName("values")]
        public List<Value>? Values { get { return this.ValuesOption; } set { this.ValuesOption = new(value); } }

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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="Change" />
    /// </summary>
    public class ChangeJsonConverter : JsonConverter<Change>
    {
        /// <summary>
        /// Deserializes json to <see cref="Change" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override Change Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<int?> changeNumber = default;
            Option<string?> cloud = default;
            Option<List<Value>?> values = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "changeNumber":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                changeNumber = new Option<int?>(utf8JsonReader.GetInt32());
                            break;
                        case "cloud":
                            cloud = new Option<string?>(utf8JsonReader.GetString()!);
                            break;
                        case "values":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                values = new Option<List<Value>?>(JsonSerializer.Deserialize<List<Value>>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        default:
                            break;
                    }
                }
            }

            if (changeNumber.IsSet && changeNumber.Value == null)
                throw new ArgumentNullException(nameof(changeNumber), "Property is not nullable for class Change.");

            if (cloud.IsSet && cloud.Value == null)
                throw new ArgumentNullException(nameof(cloud), "Property is not nullable for class Change.");

            if (values.IsSet && values.Value == null)
                throw new ArgumentNullException(nameof(values), "Property is not nullable for class Change.");

            return new Change(changeNumber, cloud, values);
        }

        /// <summary>
        /// Serializes a <see cref="Change" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="change"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, Change change, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(writer, change, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="Change" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="change"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(Utf8JsonWriter writer, Change change, JsonSerializerOptions jsonSerializerOptions)
        {
            if (change.CloudOption.IsSet && change.Cloud == null)
                throw new ArgumentNullException(nameof(change.Cloud), "Property is required for class Change.");

            if (change.ValuesOption.IsSet && change.Values == null)
                throw new ArgumentNullException(nameof(change.Values), "Property is required for class Change.");

            if (change.ChangeNumberOption.IsSet)
                writer.WriteNumber("changeNumber", change.ChangeNumberOption.Value!.Value);

            if (change.CloudOption.IsSet)
                writer.WriteString("cloud", change.Cloud);

            if (change.ValuesOption.IsSet)
            {
                writer.WritePropertyName("values");
                JsonSerializer.Serialize(writer, change.Values, jsonSerializerOptions);
            }
        }
    }
}
