package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValueProperties   {
  
  private Integer changeNumber;
  private String region;
  private Integer regionId;
  private String platform;
  private String systemService;
  private List<String> addressPrefixes;
  private List<String> networkFeatures;

  public ValueProperties () {

  }

  public ValueProperties (Integer changeNumber, String region, Integer regionId, String platform, String systemService, List<String> addressPrefixes, List<String> networkFeatures) {
    this.changeNumber = changeNumber;
    this.region = region;
    this.regionId = regionId;
    this.platform = platform;
    this.systemService = systemService;
    this.addressPrefixes = addressPrefixes;
    this.networkFeatures = networkFeatures;
  }

    
  @JsonProperty("changeNumber")
  public Integer getChangeNumber() {
    return changeNumber;
  }
  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

    
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }

    
  @JsonProperty("regionId")
  public Integer getRegionId() {
    return regionId;
  }
  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

    
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }

    
  @JsonProperty("systemService")
  public String getSystemService() {
    return systemService;
  }
  public void setSystemService(String systemService) {
    this.systemService = systemService;
  }

    
  @JsonProperty("addressPrefixes")
  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }
  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }

    
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
