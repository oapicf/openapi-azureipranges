/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
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
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Change 
{
public:
    Change() = default;
    explicit Change(boost::property_tree::ptree const& pt);
    virtual ~Change() = default;

    Change(const Change& other) = default; // copy constructor
    Change(Change&& other) noexcept = default; // move constructor

    Change& operator=(const Change& other) = default; // copy assignment
    Change& operator=(Change&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Change members

    /// <summary>
    /// The number associated with the change.
    /// </summary>
    int32_t getChangeNumber() const;
    void setChangeNumber(int32_t value);

    /// <summary>
    /// The cloud environment.
    /// </summary>
    std::string getCloud() const;
    void setCloud(std::string value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<Value> getValues() const;
    void setValues(std::vector<Value> value);

protected:
    int32_t m_ChangeNumber = 0;
    std::string m_Cloud = "";
    std::vector<Value> m_Values;
};

std::vector<Change> createChangeVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Change>(const Change& val) {
    return val.toPropertyTree();
}

template<>
inline Change fromPt<Change>(const boost::property_tree::ptree& pt) {
    Change ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Change_H_ */
