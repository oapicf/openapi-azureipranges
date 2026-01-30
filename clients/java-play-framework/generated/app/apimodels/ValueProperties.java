package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ValueProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-30T14:41:00.899973048Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  public ValueProperties changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

   /**
   * The number associated with the change.
   * @return changeNumber
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

