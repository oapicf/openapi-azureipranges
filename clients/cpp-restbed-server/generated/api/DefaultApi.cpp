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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/uri.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include <boost/lexical_cast.hpp>
#include <boost/algorithm/string.hpp>

#include "DefaultApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

namespace {
[[maybe_unused]]
std::string selectPreferredContentType(const std::vector<std::string>& contentTypes) {
    if (contentTypes.size() == 0) {
        return "application/json";
    }

    if (contentTypes.size() == 1) {
        return contentTypes.at(0);
    }

    static const std::array<std::string, 2> preferredTypes = {"json", "xml"};
    for (const auto& preferredType: preferredTypes) {
        const auto ret = std::find_if(contentTypes.cbegin(),
        contentTypes.cend(),
        [preferredType](const std::string& str) {
            return str.find(preferredType) != std::string::npos;});
        if (ret != contentTypes.cend()) {
            return *ret;
        }
    }

    return contentTypes.at(0);
}
}

DefaultApiException::DefaultApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int DefaultApiException::getStatus() const
{
    return m_status;
}
const char* DefaultApiException::what() const noexcept
{
    return m_what.c_str();
}


template<class MODEL_T>
MODEL_T extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = MODEL_T(pt);
    return model;
}

template<class MODEL_T>
std::vector<MODEL_T> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<MODEL_T>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(MODEL_T(child.second));
    }
    return arrayRet;
}

template <class KEY_T, class VAL_T>
std::string convertMapResponse(const std::map<KEY_T, VAL_T>& map)
{
    boost::property_tree::ptree pt;
    for(const auto &kv: map) {
    pt.push_back(boost::property_tree::ptree::value_type(
        boost::lexical_cast<std::string>(kv.first),
        boost::property_tree::ptree(
        boost::lexical_cast<std::string>(kv.second))));
    }
    std::stringstream sstream;
    write_json(sstream, pt);
    std::string result = sstream.str();
    return result;
}

namespace DefaultApiResources {
ServiceTags_Public_version_jsonResource::ServiceTags_Public_version_jsonResource(const std::string& context /* = "/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63" */)
{
	this->set_path(context + "/ServiceTags_Public_{version}.json");
	this->set_method_handler("GET",
		std::bind(&ServiceTags_Public_version_jsonResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ServiceTags_Public_version_jsonResource::handleDefaultApiException(const DefaultApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ServiceTags_Public_version_jsonResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ServiceTags_Public_version_jsonResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ServiceTags_Public_version_jsonResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ServiceTags_Public_version_jsonResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ServiceTags_Public_version_jsonResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ServiceTags_Public_version_jsonResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the path params
    std::string version = request->get_path_parameter("version", "");
    
    int status_code = 500;
    Change resultObject = Change{};
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(version);
    }
    catch(const DefaultApiException& e) {
        std::tie(status_code, result) = handleDefaultApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "application/json",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 200) {
        responseHeaders.insert(std::make_pair("Content-Type", selectPreferredContentType(contentTypes)));
        if (!acceptTypes.empty()) {
            responseHeaders.insert(std::make_pair("Accept", acceptTypes));
        }
    
        result = resultObject.toJsonString();
        returnResponse(session, 200, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
    
    
}


std::pair<int, Change> ServiceTags_Public_version_jsonResource::handler_GET(
        std::string & version)
{
    return handler_GET_func(version);
}


std::string ServiceTags_Public_version_jsonResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

std::string ServiceTags_Public_version_jsonResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}

} /* namespace DefaultApiResources */

DefaultApi::DefaultApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

DefaultApi::~DefaultApi() {}

std::shared_ptr<DefaultApiResources::ServiceTags_Public_version_jsonResource> DefaultApi::getServiceTags_Public_version_jsonResource() {
    if (!m_spServiceTags_Public_version_jsonResource) {
        setResource(std::make_shared<DefaultApiResources::ServiceTags_Public_version_jsonResource>());
    }
    return m_spServiceTags_Public_version_jsonResource;
}
void DefaultApi::setResource(std::shared_ptr<DefaultApiResources::ServiceTags_Public_version_jsonResource> resource) {
    m_spServiceTags_Public_version_jsonResource = resource;
    m_service->publish(m_spServiceTags_Public_version_jsonResource);
}
void DefaultApi::setDefaultApiServiceTags_Public_version_jsonResource(std::shared_ptr<DefaultApiResources::ServiceTags_Public_version_jsonResource> spServiceTags_Public_version_jsonResource) {
    m_spServiceTags_Public_version_jsonResource = spServiceTags_Public_version_jsonResource;
    m_service->publish(m_spServiceTags_Public_version_jsonResource);
}


void DefaultApi::publishDefaultResources() {
    if (!m_spServiceTags_Public_version_jsonResource) {
        setResource(std::make_shared<DefaultApiResources::ServiceTags_Public_version_jsonResource>());
    }
}

std::shared_ptr<restbed::Service> DefaultApi::service() {
    return m_service;
}


}
}
}
}

