/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

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
@JsonTypeName("ValueProperties")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2025-05-10T03:05:50.632807873Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@Introspected
public class ValueProperties {
    public static final String JSON_PROPERTY_CHANGE_NUMBER = "changeNumber";
    private Integer changeNumber;

    public static final String JSON_PROPERTY_REGION = "region";
    private String region;

    public static final String JSON_PROPERTY_REGION_ID = "regionId";
    private Integer regionId;

    public static final String JSON_PROPERTY_PLATFORM = "platform";
    private String platform;

    public static final String JSON_PROPERTY_SYSTEM_SERVICE = "systemService";
    private String systemService;

    public static final String JSON_PROPERTY_ADDRESS_PREFIXES = "addressPrefixes";
    private List<String> addressPrefixes = null;

    public static final String JSON_PROPERTY_NETWORK_FEATURES = "networkFeatures";
    private List<String> networkFeatures = null;

    public ValueProperties() {
    }

    public ValueProperties changeNumber(Integer changeNumber) {
        this.changeNumber = changeNumber;
        return this;
    }

    /**
     * The number associated with the change.
     * @return changeNumber
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CHANGE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getChangeNumber() {
        return changeNumber;
    }

    @JsonProperty(JSON_PROPERTY_CHANGE_NUMBER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRegion() {
        return region;
    }

    @JsonProperty(JSON_PROPERTY_REGION)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_REGION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getRegionId() {
        return regionId;
    }

    @JsonProperty(JSON_PROPERTY_REGION_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLATFORM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getPlatform() {
        return platform;
    }

    @JsonProperty(JSON_PROPERTY_PLATFORM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_SYSTEM_SERVICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSystemService() {
        return systemService;
    }

    @JsonProperty(JSON_PROPERTY_SYSTEM_SERVICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_ADDRESS_PREFIXES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getAddressPrefixes() {
        return addressPrefixes;
    }

    @JsonProperty(JSON_PROPERTY_ADDRESS_PREFIXES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_NETWORK_FEATURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<String> getNetworkFeatures() {
        return networkFeatures;
    }

    @JsonProperty(JSON_PROPERTY_NETWORK_FEATURES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

