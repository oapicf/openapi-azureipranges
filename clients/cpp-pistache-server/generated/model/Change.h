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
 * Change.h
 *
 * 
 */

#ifndef Change_H_
#define Change_H_


#include "Value.h"
#include <string>
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// 
/// </summary>
class  Change
{
public:
    Change();
    virtual ~Change() = default;


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

    bool operator==(const Change& rhs) const;
    bool operator!=(const Change& rhs) const;

    /////////////////////////////////////////////
    /// Change members

    /// <summary>
    /// The number associated with the change.
    /// </summary>
    int32_t getChangeNumber() const;
    void setChangeNumber(int32_t const value);
    bool changeNumberIsSet() const;
    void unsetChangeNumber();
    /// <summary>
    /// The cloud environment.
    /// </summary>
    std::string getCloud() const;
    void setCloud(std::string const& value);
    bool cloudIsSet() const;
    void unsetCloud();
    /// <summary>
    /// 
    /// </summary>
    std::vector<org::openapitools::server::model::Value> getValues() const;
    void setValues(std::vector<org::openapitools::server::model::Value> const& value);
    bool valuesIsSet() const;
    void unsetValues();

    friend  void to_json(nlohmann::json& j, const Change& o);
    friend  void from_json(const nlohmann::json& j, Change& o);
protected:
    int32_t m_ChangeNumber;
    bool m_ChangeNumberIsSet;
    std::string m_Cloud;
    bool m_CloudIsSet;
    std::vector<org::openapitools::server::model::Value> m_Values;
    bool m_ValuesIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* Change_H_ */