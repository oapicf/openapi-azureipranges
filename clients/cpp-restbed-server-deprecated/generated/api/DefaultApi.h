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
 * DefaultApi.h
 *
 * 
 */

#ifndef DefaultApi_H_
#define DefaultApi_H_


#include <memory>
#include <utility>
#include <exception>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include "Change.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  DefaultApiException: public std::exception
{
public:
    DefaultApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

/// <summary>
/// Get Azure IP Ranges and Service Tags - Public Cloud
/// </summary>
/// <remarks>
/// Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
/// </remarks>
class  DefaultApiServiceTags_Public_{version}.jsonResource: public restbed::Resource
{
public:
    DefaultApiServiceTags_Public_{version}.jsonResource(const std::string& context = "/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63");
    virtual ~DefaultApiServiceTags_Public_{version}.jsonResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::shared_ptr<Change>> handler_GET(
        std::string const & version);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual std::string getPathParam_version(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("version", "");
    }



    virtual std::pair<int, std::string> handleDefaultApiException(const DefaultApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};



//
// The restbed service to actually implement the REST server
//
class  DefaultApi
{
public:
    explicit DefaultApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~DefaultApi();

    virtual void setDefaultApiServiceTags_Public_{version}.jsonResource(std::shared_ptr<DefaultApiServiceTags_Public_{version}.jsonResource> spDefaultApiServiceTags_Public_{version}.jsonResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<DefaultApiServiceTags_Public_{version}.jsonResource> m_spDefaultApiServiceTags_Public_{version}.jsonResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* DefaultApi_H_ */
