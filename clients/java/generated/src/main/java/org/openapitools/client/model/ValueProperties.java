/*
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ValueProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-19T12:36:53.221466967Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ValueProperties {
  public static final String SERIALIZED_NAME_CHANGE_NUMBER = "changeNumber";
  @SerializedName(SERIALIZED_NAME_CHANGE_NUMBER)
  private Integer changeNumber;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_REGION_ID = "regionId";
  @SerializedName(SERIALIZED_NAME_REGION_ID)
  private Integer regionId;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_SYSTEM_SERVICE = "systemService";
  @SerializedName(SERIALIZED_NAME_SYSTEM_SERVICE)
  private String systemService;

  public static final String SERIALIZED_NAME_ADDRESS_PREFIXES = "addressPrefixes";
  @SerializedName(SERIALIZED_NAME_ADDRESS_PREFIXES)
  private List<String> addressPrefixes;

  public static final String SERIALIZED_NAME_NETWORK_FEATURES = "networkFeatures";
  @SerializedName(SERIALIZED_NAME_NETWORK_FEATURES)
  private List<String> networkFeatures;

  public ValueProperties() {
  }

  public ValueProperties changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

   /**
   * The number associated with the change.
   * @return changeNumber
  **/
  @javax.annotation.Nullable
  public Integer getChangeNumber() {
    return changeNumber;
  }

  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }


  public ValueProperties region(String region) {
    this.region = region;
    return this;
  }

   /**
   * The region associated with the value.
   * @return region
  **/
  @javax.annotation.Nullable
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }


  public ValueProperties regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * The ID of the region.
   * @return regionId
  **/
  @javax.annotation.Nullable
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }


  public ValueProperties platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * The platform associated with the value.
   * @return platform
  **/
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public ValueProperties systemService(String systemService) {
    this.systemService = systemService;
    return this;
  }

   /**
   * The system service associated with the value.
   * @return systemService
  **/
  @javax.annotation.Nullable
  public String getSystemService() {
    return systemService;
  }

  public void setSystemService(String systemService) {
    this.systemService = systemService;
  }


  public ValueProperties addressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
    return this;
  }

  public ValueProperties addAddressPrefixesItem(String addressPrefixesItem) {
    if (this.addressPrefixes == null) {
      this.addressPrefixes = new ArrayList<>();
    }
    this.addressPrefixes.add(addressPrefixesItem);
    return this;
  }

   /**
   * The address prefixes associated with the value.
   * @return addressPrefixes
  **/
  @javax.annotation.Nullable
  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }

  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }


  public ValueProperties networkFeatures(List<String> networkFeatures) {
    this.networkFeatures = networkFeatures;
    return this;
  }

  public ValueProperties addNetworkFeaturesItem(String networkFeaturesItem) {
    if (this.networkFeatures == null) {
      this.networkFeatures = new ArrayList<>();
    }
    this.networkFeatures.add(networkFeaturesItem);
    return this;
  }

   /**
   * The network features associated with the value.
   * @return networkFeatures
  **/
  @javax.annotation.Nullable
  public List<String> getNetworkFeatures() {
    return networkFeatures;
  }

  public void setNetworkFeatures(List<String> networkFeatures) {
    this.networkFeatures = networkFeatures;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueProperties valueProperties = (ValueProperties) o;
    return Objects.equals(this.changeNumber, valueProperties.changeNumber) &&
        Objects.equals(this.region, valueProperties.region) &&
        Objects.equals(this.regionId, valueProperties.regionId) &&
        Objects.equals(this.platform, valueProperties.platform) &&
        Objects.equals(this.systemService, valueProperties.systemService) &&
        Objects.equals(this.addressPrefixes, valueProperties.addressPrefixes) &&
        Objects.equals(this.networkFeatures, valueProperties.networkFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeNumber, region, regionId, platform, systemService, addressPrefixes, networkFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueProperties {\n");
    sb.append("    changeNumber: ").append(toIndentedString(changeNumber)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    systemService: ").append(toIndentedString(systemService)).append("\n");
    sb.append("    addressPrefixes: ").append(toIndentedString(addressPrefixes)).append("\n");
    sb.append("    networkFeatures: ").append(toIndentedString(networkFeatures)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("changeNumber");
    openapiFields.add("region");
    openapiFields.add("regionId");
    openapiFields.add("platform");
    openapiFields.add("systemService");
    openapiFields.add("addressPrefixes");
    openapiFields.add("networkFeatures");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ValueProperties
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ValueProperties.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ValueProperties is not found in the empty JSON string", ValueProperties.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ValueProperties.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ValueProperties` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("systemService") != null && !jsonObj.get("systemService").isJsonNull()) && !jsonObj.get("systemService").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `systemService` to be a primitive type in the JSON string but got `%s`", jsonObj.get("systemService").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("addressPrefixes") != null && !jsonObj.get("addressPrefixes").isJsonNull() && !jsonObj.get("addressPrefixes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `addressPrefixes` to be an array in the JSON string but got `%s`", jsonObj.get("addressPrefixes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("networkFeatures") != null && !jsonObj.get("networkFeatures").isJsonNull() && !jsonObj.get("networkFeatures").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `networkFeatures` to be an array in the JSON string but got `%s`", jsonObj.get("networkFeatures").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ValueProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ValueProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ValueProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ValueProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<ValueProperties>() {
           @Override
           public void write(JsonWriter out, ValueProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ValueProperties read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ValueProperties given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ValueProperties
  * @throws IOException if the JSON string is invalid with respect to ValueProperties
  */
  public static ValueProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ValueProperties.class);
  }

 /**
  * Convert an instance of ValueProperties to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

