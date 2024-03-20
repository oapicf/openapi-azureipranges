/**
* Azure IP Ranges and Service Tags - Public Cloud
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * ValueProperties.h
 *
 * 
 */

#ifndef ValueProperties_H_
#define ValueProperties_H_


#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  ValueProperties
{
public:
    ValueProperties();
    virtual ~ValueProperties() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const ValueProperties& rhs) const;
    bool operator!=(const ValueProperties& rhs) const;

    /////////////////////////////////////////////
    /// ValueProperties members

    /// <summary>
    /// The number associated with the change.
    /// </summary>
    int32_t getChangeNumber() const;
    void setChangeNumber(int32_t const value);
    bool changeNumberIsSet() const;
    void unsetChangeNumber();
    /// <summary>
    /// The region associated with the value.
    /// </summary>
    std::string getRegion() const;
    void setRegion(std::string const& value);
    bool regionIsSet() const;
    void unsetRegion();
    /// <summary>
    /// The ID of the region.
    /// </summary>
    int32_t getRegionId() const;
    void setRegionId(int32_t const value);
    bool regionIdIsSet() const;
    void unsetRegionId();
    /// <summary>
    /// The platform associated with the value.
    /// </summary>
    std::string getPlatform() const;
    void setPlatform(std::string const& value);
    bool platformIsSet() const;
    void unsetPlatform();
    /// <summary>
    /// The system service associated with the value.
    /// </summary>
    std::string getSystemService() const;
    void setSystemService(std::string const& value);
    bool systemServiceIsSet() const;
    void unsetSystemService();
    /// <summary>
    /// The address prefixes associated with the value.
    /// </summary>
    std::vector<std::string> getAddressPrefixes() const;
    void setAddressPrefixes(std::vector<std::string> const& value);
    bool addressPrefixesIsSet() const;
    void unsetAddressPrefixes();
    /// <summary>
    /// The network features associated with the value.
    /// </summary>
    std::vector<std::string> getNetworkFeatures() const;
    void setNetworkFeatures(std::vector<std::string> const& value);
    bool networkFeaturesIsSet() const;
    void unsetNetworkFeatures();

    friend  void to_json(nlohmann::json& j, const ValueProperties& o);
    friend  void from_json(const nlohmann::json& j, ValueProperties& o);
protected:
    int32_t m_ChangeNumber;
    bool m_ChangeNumberIsSet;
    std::string m_Region;
    bool m_RegionIsSet;
    int32_t m_RegionId;
    bool m_RegionIdIsSet;
    std::string m_Platform;
    bool m_PlatformIsSet;
    std::string m_SystemService;
    bool m_SystemServiceIsSet;
    std::vector<std::string> m_AddressPrefixes;
    bool m_AddressPrefixesIsSet;
    std::vector<std::string> m_NetworkFeatures;
    bool m_NetworkFeaturesIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* ValueProperties_H_ */
