/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.5.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/Change.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



Change::Change()
{
    m_ChangeNumber = 0;
    m_ChangeNumberIsSet = false;
    m_Cloud = utility::conversions::to_string_t("");
    m_CloudIsSet = false;
    m_ValuesIsSet = false;
}

Change::~Change()
{
}

void Change::validate()
{
    // TODO: implement validation
}

web::json::value Change::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_ChangeNumberIsSet)
    {
        val[utility::conversions::to_string_t(U("changeNumber"))] = ModelBase::toJson(m_ChangeNumber);
    }
    if(m_CloudIsSet)
    {
        val[utility::conversions::to_string_t(U("cloud"))] = ModelBase::toJson(m_Cloud);
    }
    if(m_ValuesIsSet)
    {
        val[utility::conversions::to_string_t(U("values"))] = ModelBase::toJson(m_Values);
    }

    return val;
}

bool Change::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("cloud"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("cloud")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCloud;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCloud);
            setCloud(refVal_setCloud);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("values"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("values")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<Value>> refVal_setValues;
            ok &= ModelBase::fromJson(fieldValue, refVal_setValues);
            setValues(refVal_setValues);
        }
    }
    return ok;
}

void Change::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_CloudIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("cloud")), m_Cloud));
    }
    if(m_ValuesIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("values")), m_Values));
    }
}

bool Change::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("cloud"))))
    {
        utility::string_t refVal_setCloud;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("cloud"))), refVal_setCloud );
        setCloud(refVal_setCloud);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("values"))))
    {
        std::vector<std::shared_ptr<Value>> refVal_setValues;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("values"))), refVal_setValues );
        setValues(refVal_setValues);
    }
    return ok;
}

int32_t Change::getChangeNumber() const
{
    return m_ChangeNumber;
}

void Change::setChangeNumber(int32_t value)
{
    m_ChangeNumber = value;
    m_ChangeNumberIsSet = true;
}

bool Change::changeNumberIsSet() const
{
    return m_ChangeNumberIsSet;
}

void Change::unsetChangeNumber()
{
    m_ChangeNumberIsSet = false;
}
utility::string_t Change::getCloud() const
{
    return m_Cloud;
}

void Change::setCloud(const utility::string_t& value)
{
    m_Cloud = value;
    m_CloudIsSet = true;
}

bool Change::cloudIsSet() const
{
    return m_CloudIsSet;
}

void Change::unsetCloud()
{
    m_CloudIsSet = false;
}
std::vector<std::shared_ptr<Value>>& Change::getValues()
{
    return m_Values;
}

void Change::setValues(const std::vector<std::shared_ptr<Value>>& value)
{
    m_Values = value;
    m_ValuesIsSet = true;
}

bool Change::valuesIsSet() const
{
    return m_ValuesIsSet;
}

void Change::unsetValues()
{
    m_ValuesIsSet = false;
}
}
}
}
}


