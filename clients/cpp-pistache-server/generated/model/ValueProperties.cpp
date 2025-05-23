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


#include "ValueProperties.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

ValueProperties::ValueProperties()
{
    m_ChangeNumber = 0;
    m_ChangeNumberIsSet = false;
    m_Region = "";
    m_RegionIsSet = false;
    m_RegionId = 0;
    m_RegionIdIsSet = false;
    m_Platform = "";
    m_PlatformIsSet = false;
    m_SystemService = "";
    m_SystemServiceIsSet = false;
    m_AddressPrefixesIsSet = false;
    m_NetworkFeaturesIsSet = false;
    
}

void ValueProperties::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool ValueProperties::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool ValueProperties::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "ValueProperties" : pathPrefix;

                             
    if (addressPrefixesIsSet())
    {
        const std::vector<std::string>& value = m_AddressPrefixes;
        const std::string currentValuePath = _pathPrefix + ".addressPrefixes";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
         
    if (networkFeaturesIsSet())
    {
        const std::vector<std::string>& value = m_NetworkFeatures;
        const std::string currentValuePath = _pathPrefix + ".networkFeatures";
                
        
        { // Recursive validation of array elements
            const std::string oldValuePath = currentValuePath;
            int i = 0;
            for (const std::string& value : value)
            { 
                const std::string currentValuePath = oldValuePath + "[" + std::to_string(i) + "]";
                        
        
 
                i++;
            }
        }

    }
    
    return success;
}

bool ValueProperties::operator==(const ValueProperties& rhs) const
{
    return
    
    
    
    ((!changeNumberIsSet() && !rhs.changeNumberIsSet()) || (changeNumberIsSet() && rhs.changeNumberIsSet() && getChangeNumber() == rhs.getChangeNumber())) &&
    
    
    ((!regionIsSet() && !rhs.regionIsSet()) || (regionIsSet() && rhs.regionIsSet() && getRegion() == rhs.getRegion())) &&
    
    
    ((!regionIdIsSet() && !rhs.regionIdIsSet()) || (regionIdIsSet() && rhs.regionIdIsSet() && getRegionId() == rhs.getRegionId())) &&
    
    
    ((!platformIsSet() && !rhs.platformIsSet()) || (platformIsSet() && rhs.platformIsSet() && getPlatform() == rhs.getPlatform())) &&
    
    
    ((!systemServiceIsSet() && !rhs.systemServiceIsSet()) || (systemServiceIsSet() && rhs.systemServiceIsSet() && getSystemService() == rhs.getSystemService())) &&
    
    
    ((!addressPrefixesIsSet() && !rhs.addressPrefixesIsSet()) || (addressPrefixesIsSet() && rhs.addressPrefixesIsSet() && getAddressPrefixes() == rhs.getAddressPrefixes())) &&
    
    
    ((!networkFeaturesIsSet() && !rhs.networkFeaturesIsSet()) || (networkFeaturesIsSet() && rhs.networkFeaturesIsSet() && getNetworkFeatures() == rhs.getNetworkFeatures()))
    
    ;
}

bool ValueProperties::operator!=(const ValueProperties& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const ValueProperties& o)
{
    j = nlohmann::json::object();
    if(o.changeNumberIsSet())
        j["changeNumber"] = o.m_ChangeNumber;
    if(o.regionIsSet())
        j["region"] = o.m_Region;
    if(o.regionIdIsSet())
        j["regionId"] = o.m_RegionId;
    if(o.platformIsSet())
        j["platform"] = o.m_Platform;
    if(o.systemServiceIsSet())
        j["systemService"] = o.m_SystemService;
    if(o.addressPrefixesIsSet() || !o.m_AddressPrefixes.empty())
        j["addressPrefixes"] = o.m_AddressPrefixes;
    if(o.networkFeaturesIsSet() || !o.m_NetworkFeatures.empty())
        j["networkFeatures"] = o.m_NetworkFeatures;
    
}

void from_json(const nlohmann::json& j, ValueProperties& o)
{
    if(j.find("changeNumber") != j.end())
    {
        j.at("changeNumber").get_to(o.m_ChangeNumber);
        o.m_ChangeNumberIsSet = true;
    } 
    if(j.find("region") != j.end())
    {
        j.at("region").get_to(o.m_Region);
        o.m_RegionIsSet = true;
    } 
    if(j.find("regionId") != j.end())
    {
        j.at("regionId").get_to(o.m_RegionId);
        o.m_RegionIdIsSet = true;
    } 
    if(j.find("platform") != j.end())
    {
        j.at("platform").get_to(o.m_Platform);
        o.m_PlatformIsSet = true;
    } 
    if(j.find("systemService") != j.end())
    {
        j.at("systemService").get_to(o.m_SystemService);
        o.m_SystemServiceIsSet = true;
    } 
    if(j.find("addressPrefixes") != j.end())
    {
        j.at("addressPrefixes").get_to(o.m_AddressPrefixes);
        o.m_AddressPrefixesIsSet = true;
    } 
    if(j.find("networkFeatures") != j.end())
    {
        j.at("networkFeatures").get_to(o.m_NetworkFeatures);
        o.m_NetworkFeaturesIsSet = true;
    } 
    
}

int32_t ValueProperties::getChangeNumber() const
{
    return m_ChangeNumber;
}
void ValueProperties::setChangeNumber(int32_t const value)
{
    m_ChangeNumber = value;
    m_ChangeNumberIsSet = true;
}
bool ValueProperties::changeNumberIsSet() const
{
    return m_ChangeNumberIsSet;
}
void ValueProperties::unsetChangeNumber()
{
    m_ChangeNumberIsSet = false;
}
std::string ValueProperties::getRegion() const
{
    return m_Region;
}
void ValueProperties::setRegion(std::string const& value)
{
    m_Region = value;
    m_RegionIsSet = true;
}
bool ValueProperties::regionIsSet() const
{
    return m_RegionIsSet;
}
void ValueProperties::unsetRegion()
{
    m_RegionIsSet = false;
}
int32_t ValueProperties::getRegionId() const
{
    return m_RegionId;
}
void ValueProperties::setRegionId(int32_t const value)
{
    m_RegionId = value;
    m_RegionIdIsSet = true;
}
bool ValueProperties::regionIdIsSet() const
{
    return m_RegionIdIsSet;
}
void ValueProperties::unsetRegionId()
{
    m_RegionIdIsSet = false;
}
std::string ValueProperties::getPlatform() const
{
    return m_Platform;
}
void ValueProperties::setPlatform(std::string const& value)
{
    m_Platform = value;
    m_PlatformIsSet = true;
}
bool ValueProperties::platformIsSet() const
{
    return m_PlatformIsSet;
}
void ValueProperties::unsetPlatform()
{
    m_PlatformIsSet = false;
}
std::string ValueProperties::getSystemService() const
{
    return m_SystemService;
}
void ValueProperties::setSystemService(std::string const& value)
{
    m_SystemService = value;
    m_SystemServiceIsSet = true;
}
bool ValueProperties::systemServiceIsSet() const
{
    return m_SystemServiceIsSet;
}
void ValueProperties::unsetSystemService()
{
    m_SystemServiceIsSet = false;
}
std::vector<std::string> ValueProperties::getAddressPrefixes() const
{
    return m_AddressPrefixes;
}
void ValueProperties::setAddressPrefixes(std::vector<std::string> const& value)
{
    m_AddressPrefixes = value;
    m_AddressPrefixesIsSet = true;
}
bool ValueProperties::addressPrefixesIsSet() const
{
    return m_AddressPrefixesIsSet;
}
void ValueProperties::unsetAddressPrefixes()
{
    m_AddressPrefixesIsSet = false;
}
std::vector<std::string> ValueProperties::getNetworkFeatures() const
{
    return m_NetworkFeatures;
}
void ValueProperties::setNetworkFeatures(std::vector<std::string> const& value)
{
    m_NetworkFeatures = value;
    m_NetworkFeaturesIsSet = true;
}
bool ValueProperties::networkFeaturesIsSet() const
{
    return m_NetworkFeaturesIsSet;
}
void ValueProperties::unsetNetworkFeatures()
{
    m_NetworkFeaturesIsSet = false;
}


} // namespace org::openapitools::server::model

