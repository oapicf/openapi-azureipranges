/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ValueProperties.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ValueProperties_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ValueProperties_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {


/// <summary>
/// 
/// </summary>
class  ValueProperties
    : public ModelBase
{
public:
    ValueProperties();
    virtual ~ValueProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ValueProperties members

    /// <summary>
    /// The number associated with the change.
    /// </summary>
    int32_t getChangeNumber() const;
    bool changeNumberIsSet() const;
    void unsetChangeNumber();

    void setChangeNumber(int32_t value);

    /// <summary>
    /// The region associated with the value.
    /// </summary>
    utility::string_t getRegion() const;
    bool regionIsSet() const;
    void unsetRegion();

    void setRegion(const utility::string_t& value);

    /// <summary>
    /// The ID of the region.
    /// </summary>
    int32_t getRegionId() const;
    bool regionIdIsSet() const;
    void unsetRegionId();

    void setRegionId(int32_t value);

    /// <summary>
    /// The platform associated with the value.
    /// </summary>
    utility::string_t getPlatform() const;
    bool platformIsSet() const;
    void unsetPlatform();

    void setPlatform(const utility::string_t& value);

    /// <summary>
    /// The system service associated with the value.
    /// </summary>
    utility::string_t getSystemService() const;
    bool systemServiceIsSet() const;
    void unsetSystemService();

    void setSystemService(const utility::string_t& value);

    /// <summary>
    /// The address prefixes associated with the value.
    /// </summary>
    std::vector<utility::string_t>& getAddressPrefixes();
    bool addressPrefixesIsSet() const;
    void unsetAddressPrefixes();

    void setAddressPrefixes(const std::vector<utility::string_t>& value);

    /// <summary>
    /// The network features associated with the value.
    /// </summary>
    std::vector<utility::string_t>& getNetworkFeatures();
    bool networkFeaturesIsSet() const;
    void unsetNetworkFeatures();

    void setNetworkFeatures(const std::vector<utility::string_t>& value);


protected:
    int32_t m_ChangeNumber;
    bool m_ChangeNumberIsSet;
    utility::string_t m_Region;
    bool m_RegionIsSet;
    int32_t m_RegionId;
    bool m_RegionIdIsSet;
    utility::string_t m_Platform;
    bool m_PlatformIsSet;
    utility::string_t m_SystemService;
    bool m_SystemServiceIsSet;
    std::vector<utility::string_t> m_AddressPrefixes;
    bool m_AddressPrefixesIsSet;
    std::vector<utility::string_t> m_NetworkFeatures;
    bool m_NetworkFeaturesIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ValueProperties_H_ */
