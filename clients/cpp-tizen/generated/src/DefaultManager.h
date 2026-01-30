#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Change.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Get Azure IP Ranges and Service Tags - Public Cloud. *Synchronous*
 *
 * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
 * \param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAzureIpRangesServiceTagsPublicCloudSync(char * accessToken,
	std::string version, 
	void(* handler)(Change, Error, void* )
	, void* userData);

/*! \brief Get Azure IP Ranges and Service Tags - Public Cloud. *Asynchronous*
 *
 * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
 * \param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506 *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAzureIpRangesServiceTagsPublicCloudAsync(char * accessToken,
	std::string version, 
	void(* handler)(Change, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://download.microsoft.com/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
