package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ValueProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The number associated with the change.
   */
  @JsonProperty("changeNumber")
  private Integer changeNumber;

  /**
   * The region associated with the value.
   */
  @JsonProperty("region")
  private String region;

  /**
   * The ID of the region.
   */
  @JsonProperty("regionId")
  private Integer regionId;

  /**
   * The platform associated with the value.
   */
  @JsonProperty("platform")
  private String platform;

  /**
   * The system service associated with the value.
   */
  @JsonProperty("systemService")
  private String systemService;

  /**
   * The address prefixes associated with the value.
   */
  @JsonProperty("addressPrefixes")
  private List<String> addressPrefixes = new ArrayList<>();

  /**
   * The network features associated with the value.
   */
  @JsonProperty("networkFeatures")
  private List<String> networkFeatures = new ArrayList<>();

  /**
   * The number associated with the change.
   * @return changeNumber
   */
  public Integer getChangeNumber() {
    return changeNumber;
  }

  public void setChangeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
  }

  /**
   * The region associated with the value.
   * @return region
   */
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  /**
   * The ID of the region.
   * @return regionId
   */
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  /**
   * The platform associated with the value.
   * @return platform
   */
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  /**
   * The system service associated with the value.
   * @return systemService
   */
  public String getSystemService() {
    return systemService;
  }

  public void setSystemService(String systemService) {
    this.systemService = systemService;
  }

  /**
   * The address prefixes associated with the value.
   * @return addressPrefixes
   */
  public List<String> getAddressPrefixes() {
    return addressPrefixes;
  }

  public void setAddressPrefixes(List<String> addressPrefixes) {
    this.addressPrefixes = addressPrefixes;
  }

  /**
   * The network features associated with the value.
   * @return networkFeatures
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
