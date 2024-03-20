package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ValueProperties   {

    private Integer changeNumber;
    private String region;
    private Integer regionId;
    private String platform;
    private String systemService;
    private List<String> addressPrefixes;
    private List<String> networkFeatures;

    /**
     * Default constructor.
     */
    public ValueProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ValueProperties.
     *
     * @param changeNumber The number associated with the change.
     * @param region The region associated with the value.
     * @param regionId The ID of the region.
     * @param platform The platform associated with the value.
     * @param systemService The system service associated with the value.
     * @param addressPrefixes The address prefixes associated with the value.
     * @param networkFeatures The network features associated with the value.
     */
    public ValueProperties(
        Integer changeNumber, 
        String region, 
        Integer regionId, 
        String platform, 
        String systemService, 
        List<String> addressPrefixes, 
        List<String> networkFeatures
    ) {
        this.changeNumber = changeNumber;
        this.region = region;
        this.regionId = regionId;
        this.platform = platform;
        this.systemService = systemService;
        this.addressPrefixes = addressPrefixes;
        this.networkFeatures = networkFeatures;
    }



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

    /**
      * Create a string representation of this pojo.
    **/
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

