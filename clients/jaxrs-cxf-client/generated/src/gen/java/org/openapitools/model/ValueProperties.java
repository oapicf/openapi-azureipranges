package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ValueProperties  {
  
  @ApiModelProperty(value = "The number associated with the change.")
 /**
   * The number associated with the change.
  **/
  private Integer changeNumber;

  @ApiModelProperty(value = "The region associated with the value.")
 /**
   * The region associated with the value.
  **/
  private String region;

  @ApiModelProperty(value = "The ID of the region.")
 /**
   * The ID of the region.
  **/
  private Integer regionId;

  @ApiModelProperty(value = "The platform associated with the value.")
 /**
   * The platform associated with the value.
  **/
  private String platform;

  @ApiModelProperty(value = "The system service associated with the value.")
 /**
   * The system service associated with the value.
  **/
  private String systemService;

  @ApiModelProperty(value = "The address prefixes associated with the value.")
 /**
   * The address prefixes associated with the value.
  **/
  private List<String> addressPrefixes;

  @ApiModelProperty(value = "The network features associated with the value.")
 /**
   * The network features associated with the value.
  **/
  private List<String> networkFeatures;
 /**
   * The number associated with the change.
   * @return changeNumber
  **/
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }

  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  public ValueProperties changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

 /**
   * The region associated with the value.
   * @return region
  **/
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public ValueProperties region(String region) {
    this.region = region;
    return this;
  }

 /**
   * The ID of the region.
   * @return regionId
  **/
  @JsonProperty("regionId")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public ValueProperties regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

 /**
   * The platform associated with the value.
   * @return platform
  **/
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public ValueProperties platform(String platform) {
    this.platform = platform;
    return this;
  }

 /**
   * The system service associated with the value.
   * @return systemService
  **/
  @JsonProperty("systemService")
  public String getSystemService() {
    return systemService;
  }

  public void setSystemService(String systemService) {
    this.systemService = systemService;
  }

  public ValueProperties systemService(String systemService) {
    this.systemService = systemService;
    return this;
  }

 /**
   * The address prefixes associated with the value.
   * @return addressPrefixes
  **/
  @JsonProperty("addressPrefixes")
  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }

  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }

  public ValueProperties addressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
    return this;
  }

  public ValueProperties addAddressPrefixesItem(String addressPrefixesItem) {
    this.addressPrefixes.add(addressPrefixesItem);
    return this;
  }

 /**
   * The network features associated with the value.
   * @return networkFeatures
  **/
  @JsonProperty("networkFeatures")
  public List<String> getNetworkFeatures() {
    return networkFeatures;
  }

  public void setNetworkFeatures(List<String> networkFeatures) {
    this.networkFeatures = networkFeatures;
  }

  public ValueProperties networkFeatures(List<String> networkFeatures) {
    this.networkFeatures = networkFeatures;
    return this;
  }

  public ValueProperties addNetworkFeaturesItem(String networkFeaturesItem) {
    this.networkFeatures.add(networkFeaturesItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

