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


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ValueProperties
 */
@JsonPropertyOrder({
  ValueProperties.JSON_PROPERTY_CHANGE_NUMBER,
  ValueProperties.JSON_PROPERTY_REGION,
  ValueProperties.JSON_PROPERTY_REGION_ID,
  ValueProperties.JSON_PROPERTY_PLATFORM,
  ValueProperties.JSON_PROPERTY_SYSTEM_SERVICE,
  ValueProperties.JSON_PROPERTY_ADDRESS_PREFIXES,
  ValueProperties.JSON_PROPERTY_NETWORK_FEATURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-11-08T22:30:34.272088212Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ValueProperties   {
  public static final String JSON_PROPERTY_CHANGE_NUMBER = "changeNumber";
  @JsonProperty(JSON_PROPERTY_CHANGE_NUMBER)
  private Integer changeNumber;

  public static final String JSON_PROPERTY_REGION = "region";
  @JsonProperty(JSON_PROPERTY_REGION)
  private String region;

  public static final String JSON_PROPERTY_REGION_ID = "regionId";
  @JsonProperty(JSON_PROPERTY_REGION_ID)
  private Integer regionId;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  private String platform;

  public static final String JSON_PROPERTY_SYSTEM_SERVICE = "systemService";
  @JsonProperty(JSON_PROPERTY_SYSTEM_SERVICE)
  private String systemService;

  public static final String JSON_PROPERTY_ADDRESS_PREFIXES = "addressPrefixes";
  @JsonProperty(JSON_PROPERTY_ADDRESS_PREFIXES)
  private List<String> addressPrefixes = new ArrayList<>();

  public static final String JSON_PROPERTY_NETWORK_FEATURES = "networkFeatures";
  @JsonProperty(JSON_PROPERTY_NETWORK_FEATURES)
  private List<String> networkFeatures = new ArrayList<>();

  public ValueProperties changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

  /**
   * The number associated with the change.
   * @return changeNumber
   **/
  @JsonProperty(value = "changeNumber")
  @ApiModelProperty(value = "The number associated with the change.")
  
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
  @JsonProperty(value = "region")
  @ApiModelProperty(value = "The region associated with the value.")
  
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
  @JsonProperty(value = "regionId")
  @ApiModelProperty(value = "The ID of the region.")
  
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
  @JsonProperty(value = "platform")
  @ApiModelProperty(value = "The platform associated with the value.")
  
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
  @JsonProperty(value = "systemService")
  @ApiModelProperty(value = "The system service associated with the value.")
  
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
  @JsonProperty(value = "addressPrefixes")
  @ApiModelProperty(value = "The address prefixes associated with the value.")
  
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
  @JsonProperty(value = "networkFeatures")
  @ApiModelProperty(value = "The network features associated with the value.")
  
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
}

