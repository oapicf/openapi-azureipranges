package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ValueProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T00:07:11.775673396Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ValueProperties   {
  private Integer changeNumber;
  private String region;
  private Integer regionId;
  private String platform;
  private String systemService;
  private @Valid List<String> addressPrefixes = new ArrayList<>();
  private @Valid List<String> networkFeatures = new ArrayList<>();

  /**
   * The number associated with the change.
   **/
  public ValueProperties changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

  
  @ApiModelProperty(value = "The number associated with the change.")
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }

  @JsonProperty("changeNumber")
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  /**
   * The region associated with the value.
   **/
  public ValueProperties region(String region) {
    this.region = region;
    return this;
  }

  
  @ApiModelProperty(value = "The region associated with the value.")
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  @JsonProperty("region")
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * The ID of the region.
   **/
  public ValueProperties regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the region.")
  @JsonProperty("regionId")
  public Integer getRegionId() {
    return regionId;
  }

  @JsonProperty("regionId")
  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  /**
   * The platform associated with the value.
   **/
  public ValueProperties platform(String platform) {
    this.platform = platform;
    return this;
  }

  
  @ApiModelProperty(value = "The platform associated with the value.")
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }

  @JsonProperty("platform")
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   * The system service associated with the value.
   **/
  public ValueProperties systemService(String systemService) {
    this.systemService = systemService;
    return this;
  }

  
  @ApiModelProperty(value = "The system service associated with the value.")
  @JsonProperty("systemService")
  public String getSystemService() {
    return systemService;
  }

  @JsonProperty("systemService")
  public void setSystemService(String systemService) {
    this.systemService = systemService;
  }

  /**
   * The address prefixes associated with the value.
   **/
  public ValueProperties addressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
    return this;
  }

  
  @ApiModelProperty(value = "The address prefixes associated with the value.")
  @JsonProperty("addressPrefixes")
  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }

  @JsonProperty("addressPrefixes")
  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }

  public ValueProperties addAddressPrefixesItem(String addressPrefixesItem) {
    if (this.addressPrefixes == null) {
      this.addressPrefixes = new ArrayList<>();
    }

    this.addressPrefixes.add(addressPrefixesItem);
    return this;
  }

  public ValueProperties removeAddressPrefixesItem(String addressPrefixesItem) {
    if (addressPrefixesItem != null && this.addressPrefixes != null) {
      this.addressPrefixes.remove(addressPrefixesItem);
    }

    return this;
  }
  /**
   * The network features associated with the value.
   **/
  public ValueProperties networkFeatures(List<String> networkFeatures) {
    this.networkFeatures = networkFeatures;
    return this;
  }

  
  @ApiModelProperty(value = "The network features associated with the value.")
  @JsonProperty("networkFeatures")
  public List<String> getNetworkFeatures() {
    return networkFeatures;
  }

  @JsonProperty("networkFeatures")
  public void setNetworkFeatures(List<String> networkFeatures) {
    this.networkFeatures = networkFeatures;
  }

  public ValueProperties addNetworkFeaturesItem(String networkFeaturesItem) {
    if (this.networkFeatures == null) {
      this.networkFeatures = new ArrayList<>();
    }

    this.networkFeatures.add(networkFeaturesItem);
    return this;
  }

  public ValueProperties removeNetworkFeaturesItem(String networkFeaturesItem) {
    if (networkFeaturesItem != null && this.networkFeatures != null) {
      this.networkFeatures.remove(networkFeaturesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

