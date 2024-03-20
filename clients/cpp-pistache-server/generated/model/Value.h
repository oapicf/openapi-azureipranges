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
 * Value.h
 *
 * 
 */

#ifndef Value_H_
#define Value_H_


#include "ValueProperties.h"
#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Value
{
public:
    Value();
    virtual ~Value() = default;


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

    bool operator==(const Value& rhs) const;
    bool operator!=(const Value& rhs) const;

    /////////////////////////////////////////////
    /// Value members

    /// <summary>
    /// The name of the value.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// The unique identifier of the value.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ValueProperties getProperties() const;
    void setProperties(org::openapitools::server::model::ValueProperties const& value);
    bool propertiesIsSet() const;
    void unsetProperties();

    friend  void to_json(nlohmann::json& j, const Value& o);
    friend  void from_json(const nlohmann::json& j, Value& o);
protected:
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    org::openapitools::server::model::ValueProperties m_Properties;
    bool m_PropertiesIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Value_H_ */
