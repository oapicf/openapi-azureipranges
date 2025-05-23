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



#include "Value.h"

#include <string>
#include <vector>
#include <map>
#include <sstream>
#include <stdexcept>
#include <regex>
#include <boost/lexical_cast.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include "helpers.h"

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Value::Value(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}


std::string Value::toJsonString(bool prettyJson /* = false */) const
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
    // workaround inspired by: https://stackoverflow.com/a/56395440
    std::regex reg("\\\"([0-9]+\\.{0,1}[0-9]*)\\\"");
    std::string result = std::regex_replace(ss.str(), reg, "$1");
    return result;
}

void Value::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Value::toPropertyTree() const
{
	ptree pt;
	ptree tmp_node;
	pt.put("name", m_Name);
	pt.put("id", m_Id);
	pt.add_child("properties", m_Properties.toPropertyTree());
	return pt;
}

void Value::fromPropertyTree(ptree const &pt)
{
	ptree tmp_node;
	m_Name = pt.get("name", "");
	m_Id = pt.get("id", "");
	if (pt.get_child_optional("properties")) {
        m_Properties = fromPt<ValueProperties>(pt.get_child("properties"));
	}
}

std::string Value::getName() const
{
    return m_Name;
}

void Value::setName(std::string value)
{
    m_Name = value;
}


std::string Value::getId() const
{
    return m_Id;
}

void Value::setId(std::string value)
{
    m_Id = value;
}


ValueProperties Value::getProperties() const
{
    return m_Properties;
}

void Value::setProperties(ValueProperties value)
{
    m_Properties = value;
}



std::vector<Value> createValueVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Value>();
    for (const auto& child: pt) {
        vec.emplace_back(Value(child.second));
    }

    return vec;
}

}
}
}
}

