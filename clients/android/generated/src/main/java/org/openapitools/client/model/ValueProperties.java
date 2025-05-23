/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ValueProperties {
  
  @SerializedName("changeNumber")
  private Integer changeNumber = null;
  @SerializedName("region")
  private String region = null;
  @SerializedName("regionId")
  private Integer regionId = null;
  @SerializedName("platform")
  private String platform = null;
  @SerializedName("systemService")
  private String systemService = null;
  @SerializedName("addressPrefixes")
  private List<String> addressPrefixes = null;
  @SerializedName("networkFeatures")
  private List<String> networkFeatures = null;

  /**
   * The number associated with the change.
   **/
  @ApiModelProperty(value = "The number associated with the change.")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  /**
   * The region associated with the value.
   **/
  @ApiModelProperty(value = "The region associated with the value.")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * The ID of the region.
   **/
  @ApiModelProperty(value = "The ID of the region.")
  public Integer getRegionId() {
    return regionId;
  }
  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  /**
   * The platform associated with the value.
   **/
  @ApiModelProperty(value = "The platform associated with the value.")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   * The system service associated with the value.
   **/
  @ApiModelProperty(value = "The system service associated with the value.")
  public String getSystemService() {
    return systemService;
  }
  public void setSystemService(String systemService) {
    this.systemService = systemService;
  }

  /**
   * The address prefixes associated with the value.
   **/
  @ApiModelProperty(value = "The address prefixes associated with the value.")
  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }
  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }

  /**
   * The network features associated with the value.
   **/
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
    return (this.changeNumber == null ? valueProperties.changeNumber == null : this.changeNumber.equals(valueProperties.changeNumber)) &&
        (this.region == null ? valueProperties.region == null : this.region.equals(valueProperties.region)) &&
        (this.regionId == null ? valueProperties.regionId == null : this.regionId.equals(valueProperties.regionId)) &&
        (this.platform == null ? valueProperties.platform == null : this.platform.equals(valueProperties.platform)) &&
        (this.systemService == null ? valueProperties.systemService == null : this.systemService.equals(valueProperties.systemService)) &&
        (this.addressPrefixes == null ? valueProperties.addressPrefixes == null : this.addressPrefixes.equals(valueProperties.addressPrefixes)) &&
        (this.networkFeatures == null ? valueProperties.networkFeatures == null : this.networkFeatures.equals(valueProperties.networkFeatures));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.changeNumber == null ? 0: this.changeNumber.hashCode());
    result = 31 * result + (this.region == null ? 0: this.region.hashCode());
    result = 31 * result + (this.regionId == null ? 0: this.regionId.hashCode());
    result = 31 * result + (this.platform == null ? 0: this.platform.hashCode());
    result = 31 * result + (this.systemService == null ? 0: this.systemService.hashCode());
    result = 31 * result + (this.addressPrefixes == null ? 0: this.addressPrefixes.hashCode());
    result = 31 * result + (this.networkFeatures == null ? 0: this.networkFeatures.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueProperties {\n");
    
    sb.append("  changeNumber: ").append(changeNumber).append("\n");
    sb.append("  region: ").append(region).append("\n");
    sb.append("  regionId: ").append(regionId).append("\n");
    sb.append("  platform: ").append(platform).append("\n");
    sb.append("  systemService: ").append(systemService).append("\n");
    sb.append("  addressPrefixes: ").append(addressPrefixes).append("\n");
    sb.append("  networkFeatures: ").append(networkFeatures).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
