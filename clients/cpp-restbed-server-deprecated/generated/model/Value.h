/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
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
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Value 
{
public:
    Value() = default;
    explicit Value(boost::property_tree::ptree const& pt);
    virtual ~Value() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// Value members

    /// <summary>
    /// The name of the value.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// The unique identifier of the value.
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ValueProperties> getProperties() const;
    void setProperties(std::shared_ptr<ValueProperties> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::string m_Name = "";
    std::string m_Id = "";
    std::shared_ptr<ValueProperties> m_Properties;
};

std::vector<Value> createValueVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* Value_H_ */
