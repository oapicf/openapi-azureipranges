#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Change.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi();

    /**
    * Get Azure IP Ranges and Service Tags - Public Cloud.
    *
    * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    * \param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 *Required*
    */
    Response<
                Change
        >
    getAzureIpRangesServiceTagsPublicCloud(
            
            std::string version
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */