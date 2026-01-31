package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-31T02:43:51.257075695Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ValueProperties   {
  @JsonProperty("changeNumber")
  private Integer changeNumber;

  @JsonProperty("region")
  private String region;

  @JsonProperty("regionId")
  private Integer regionId;

  @JsonProperty("platform")
  private String platform;

  @JsonProperty("systemService")
  private String systemService;

  @JsonProperty("addressPrefixes")
  private List<String> addressPrefixes = null;

  @JsonProperty("networkFeatures")
  private List<String> networkFeatures = null;

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
  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
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
    return Objects.equals(changeNumber, valueProperties.changeNumber) &&
        Objects.equals(region, valueProperties.region) &&
        Objects.equals(regionId, valueProperties.regionId) &&
        Objects.equals(platform, valueProperties.platform) &&
        Objects.equals(systemService, valueProperties.systemService) &&
        Objects.equals(addressPrefixes, valueProperties.addressPrefixes) &&
        Objects.equals(networkFeatures, valueProperties.networkFeatures);
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

