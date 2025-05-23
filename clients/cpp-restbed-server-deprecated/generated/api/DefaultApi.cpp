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
std::shared_ptr<MODEL_T> extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = std::make_shared<MODEL_T>(pt);
    return model;
}

template<class MODEL_T>
std::vector<std::shared_ptr<MODEL_T>> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<std::shared_ptr<MODEL_T>>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(std::make_shared<MODEL_T>(child.second));
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

DefaultApiServiceTags_Public_{version}.jsonResource::DefaultApiServiceTags_Public_{version}.jsonResource(const std::string& context /* = "/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63" */)
{
	this->set_path(context + "/ServiceTags_Public_{version}.json/");
	this->set_method_handler("GET",
		std::bind(&DefaultApiServiceTags_Public_{version}.jsonResource::handler_GET_internal, this,
			std::placeholders::_1));
}

DefaultApiServiceTags_Public_{version}.jsonResource::~DefaultApiServiceTags_Public_{version}.jsonResource()
{
}

std::pair<int, std::string> DefaultApiServiceTags_Public_{version}.jsonResource::handleDefaultApiException(const DefaultApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> DefaultApiServiceTags_Public_{version}.jsonResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> DefaultApiServiceTags_Public_{version}.jsonResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void DefaultApiServiceTags_Public_{version}.jsonResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void DefaultApiServiceTags_Public_{version}.jsonResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void DefaultApiServiceTags_Public_{version}.jsonResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void DefaultApiServiceTags_Public_{version}.jsonResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();

    // Getting the path params
    const std::string version = getPathParam_version(request);



    int status_code = 500;
    std::shared_ptr<Change> resultObject = std::make_shared<Change>();
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

    if (status_code == 200) {
        result = resultObject->toJsonString();

        const constexpr auto contentType = "application/json";
        returnResponse(session, 200, result.empty() ? "Successful response" : result, contentType);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::shared_ptr<Change>> DefaultApiServiceTags_Public_{version}.jsonResource::handler_GET(
        std::string const & version)
{
    throw DefaultApiException(501, "Not implemented");
}


std::string DefaultApiServiceTags_Public_{version}.jsonResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

DefaultApi::DefaultApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

DefaultApi::~DefaultApi() {}

void DefaultApi::setDefaultApiServiceTags_Public_{version}.jsonResource(std::shared_ptr<DefaultApiServiceTags_Public_{version}.jsonResource> spDefaultApiServiceTags_Public_{version}.jsonResource) {
    m_spDefaultApiServiceTags_Public_{version}.jsonResource = spDefaultApiServiceTags_Public_{version}.jsonResource;
    m_service->publish(m_spDefaultApiServiceTags_Public_{version}.jsonResource);
}


void DefaultApi::publishDefaultResources() {
    if (!m_spDefaultApiServiceTags_Public_{version}.jsonResource) {
        setDefaultApiServiceTags_Public_{version}.jsonResource(std::make_shared<DefaultApiServiceTags_Public_{version}.jsonResource>());
    }
}

std::shared_ptr<restbed::Service> DefaultApi::service() {
    return m_service;
}


}
}
}
}

