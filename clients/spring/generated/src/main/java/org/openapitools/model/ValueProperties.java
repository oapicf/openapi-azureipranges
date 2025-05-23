package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ValueProperties
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-10T03:07:07.444578948Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class ValueProperties {

  private @Nullable Integer changeNumber;

  private @Nullable String region;

  private @Nullable Integer regionId;

  private @Nullable String platform;

  private @Nullable String systemService;

  @Valid
  private List<String> addressPrefixes = new ArrayList<>();

  @Valid
  private List<String> networkFeatures = new ArrayList<>();

  public ValueProperties changeNumber(Integer changeNumber) {
    this.changeNumber = changeNumber;
    return this;
  }

  /**
   * The number associated with the change.
   * @return changeNumber
   */
  
  @Schema(name = "changeNumber", description = "The number associated with the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeNumber")
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
   */
  
  @Schema(name = "region", description = "The region associated with the value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
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
   */
  
  @Schema(name = "regionId", description = "The ID of the region.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("regionId")
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
   */
  
  @Schema(name = "platform", description = "The platform associated with the value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
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
   */
  
  @Schema(name = "systemService", description = "The system service associated with the value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemService")
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
   */
  
  @Schema(name = "addressPrefixes", description = "The address prefixes associated with the value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addressPrefixes")
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
   */
  
  @Schema(name = "networkFeatures", description = "The network features associated with the value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

