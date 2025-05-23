/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.12.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/ValueProperties.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

ValueProperties::ValueProperties()
{
    m_ChangeNumber = 0;
    m_ChangeNumberIsSet = false;
    m_Region = utility::conversions::to_string_t("");
    m_RegionIsSet = false;
    m_RegionId = 0;
    m_RegionIdIsSet = false;
    m_Platform = utility::conversions::to_string_t("");
    m_PlatformIsSet = false;
    m_SystemService = utility::conversions::to_string_t("");
    m_SystemServiceIsSet = false;
    m_AddressPrefixesIsSet = false;
    m_NetworkFeaturesIsSet = false;
}

ValueProperties::~ValueProperties()
{
}

void ValueProperties::validate()
{
    // TODO: implement validation
}

web::json::value ValueProperties::toJson() const
{
    web::json::value val = web::json::value::object();
    if(m_ChangeNumberIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("changeNumber"))] = ModelBase::toJson(m_ChangeNumber);
    }
    if(m_RegionIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("region"))] = ModelBase::toJson(m_Region);
    }
    if(m_RegionIdIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("regionId"))] = ModelBase::toJson(m_RegionId);
    }
    if(m_PlatformIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("platform"))] = ModelBase::toJson(m_Platform);
    }
    if(m_SystemServiceIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("systemService"))] = ModelBase::toJson(m_SystemService);
    }
    if(m_AddressPrefixesIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("addressPrefixes"))] = ModelBase::toJson(m_AddressPrefixes);
    }
    if(m_NetworkFeaturesIsSet)
    {   
        
        val[utility::conversions::to_string_t(U("networkFeatures"))] = ModelBase::toJson(m_NetworkFeatures);
    }

    return val;
}

bool ValueProperties::fromJson(const web::json::value& val)
{
    bool ok = true;
    if(val.has_field(utility::conversions::to_string_t(U("changeNumber"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("changeNumber")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setChangeNumber;
            ok &= ModelBase::fromJson(fieldValue, refVal_setChangeNumber);
            setChangeNumber(refVal_setChangeNumber);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("region"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("region")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setRegion;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRegion);
            setRegion(refVal_setRegion);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("regionId"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("regionId")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setRegionId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setRegionId);
            setRegionId(refVal_setRegionId);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("platform"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("platform")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPlatform;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPlatform);
            setPlatform(refVal_setPlatform);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("systemService"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("systemService")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setSystemService;
            ok &= ModelBase::fromJson(fieldValue, refVal_setSystemService);
            setSystemService(refVal_setSystemService);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("addressPrefixes"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("addressPrefixes")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setAddressPrefixes;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAddressPrefixes);
            setAddressPrefixes(refVal_setAddressPrefixes);
            
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("networkFeatures"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("networkFeatures")));
        if(!fieldValue.is_null())
        {
            std::vector<utility::string_t> refVal_setNetworkFeatures;
            ok &= ModelBase::fromJson(fieldValue, refVal_setNetworkFeatures);
            setNetworkFeatures(refVal_setNetworkFeatures);
            
        }
    }
    return ok;
}

void ValueProperties::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_ChangeNumberIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("changeNumber")), m_ChangeNumber));
    }
    if(m_RegionIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("region")), m_Region));
    }
    if(m_RegionIdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("regionId")), m_RegionId));
    }
    if(m_PlatformIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("platform")), m_Platform));
    }
    if(m_SystemServiceIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("systemService")), m_SystemService));
    }
    if(m_AddressPrefixesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("addressPrefixes")), m_AddressPrefixes));
    }
    if(m_NetworkFeaturesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("networkFeatures")), m_NetworkFeatures));
    }
}

bool ValueProperties::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("changeNumber"))))
    {
        int32_t refVal_setChangeNumber;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("changeNumber"))), refVal_setChangeNumber );
        setChangeNumber(refVal_setChangeNumber);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("region"))))
    {
        utility::string_t refVal_setRegion;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("region"))), refVal_setRegion );
        setRegion(refVal_setRegion);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("regionId"))))
    {
        int32_t refVal_setRegionId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("regionId"))), refVal_setRegionId );
        setRegionId(refVal_setRegionId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("platform"))))
    {
        utility::string_t refVal_setPlatform;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("platform"))), refVal_setPlatform );
        setPlatform(refVal_setPlatform);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("systemService"))))
    {
        utility::string_t refVal_setSystemService;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("systemService"))), refVal_setSystemService );
        setSystemService(refVal_setSystemService);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("addressPrefixes"))))
    {
        std::vector<utility::string_t> refVal_setAddressPrefixes;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("addressPrefixes"))), refVal_setAddressPrefixes );
        setAddressPrefixes(refVal_setAddressPrefixes);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("networkFeatures"))))
    {
        std::vector<utility::string_t> refVal_setNetworkFeatures;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("networkFeatures"))), refVal_setNetworkFeatures );
        setNetworkFeatures(refVal_setNetworkFeatures);
    }
    return ok;
}


int32_t ValueProperties::getChangeNumber() const
{
    return m_ChangeNumber;
}

void ValueProperties::setChangeNumber(int32_t value)
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
utility::string_t ValueProperties::getRegion() const
{
    return m_Region;
}


void ValueProperties::setRegion(const utility::string_t& value)
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

void ValueProperties::setRegionId(int32_t value)
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
utility::string_t ValueProperties::getPlatform() const
{
    return m_Platform;
}


void ValueProperties::setPlatform(const utility::string_t& value)
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
utility::string_t ValueProperties::getSystemService() const
{
    return m_SystemService;
}


void ValueProperties::setSystemService(const utility::string_t& value)
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
std::vector<utility::string_t> ValueProperties::getAddressPrefixes() const
{
    return m_AddressPrefixes;
}


void ValueProperties::setAddressPrefixes(const std::vector<utility::string_t>& value)
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
std::vector<utility::string_t> ValueProperties::getNetworkFeatures() const
{
    return m_NetworkFeatures;
}


void ValueProperties::setNetworkFeatures(const std::vector<utility::string_t>& value)
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

}
}
}
}


