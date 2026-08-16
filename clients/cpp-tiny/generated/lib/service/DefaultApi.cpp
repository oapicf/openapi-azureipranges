#include "DefaultApi.h"

using namespace Tiny;



        Response<
            Change
        >
        DefaultApi::
        getAzureIpRangesServiceTagsPublicCloud(
            
            std::string version
            
        )
        {
            std::string url = basepath + "/ServiceTags_Public_{version}.json"; //version 


            // Headers  | 

            // Query    | 

            // Form     | 



                std::string s_version("{");
                s_version.append("version");
                s_version.append("}");

                int pos = url.find(s_version);

                url.erase(pos, s_version.length());
                url.insert(pos, stringify(version));


            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();




            Change obj(output_string);


            Response<Change> response(obj, httpCode);
            return response;
        }



