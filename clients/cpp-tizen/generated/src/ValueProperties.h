/*
 * ValueProperties.h
 *
 * 
 */

#ifndef _ValueProperties_H_
#define _ValueProperties_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ValueProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ValueProperties();
	ValueProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ValueProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The number associated with the change.
	 */
	int getChangeNumber();

	/*! \brief Set The number associated with the change.
	 */
	void setChangeNumber(int  changeNumber);
	/*! \brief Get The region associated with the value.
	 */
	std::string getRegion();

	/*! \brief Set The region associated with the value.
	 */
	void setRegion(std::string  region);
	/*! \brief Get The ID of the region.
	 */
	int getRegionId();

	/*! \brief Set The ID of the region.
	 */
	void setRegionId(int  regionId);
	/*! \brief Get The platform associated with the value.
	 */
	std::string getPlatform();

	/*! \brief Set The platform associated with the value.
	 */
	void setPlatform(std::string  platform);
	/*! \brief Get The system service associated with the value.
	 */
	std::string getSystemService();

	/*! \brief Set The system service associated with the value.
	 */
	void setSystemService(std::string  systemService);
	/*! \brief Get The address prefixes associated with the value.
	 */
	std::list<std::string> getAddressPrefixes();

	/*! \brief Set The address prefixes associated with the value.
	 */
	void setAddressPrefixes(std::list <std::string> addressPrefixes);
	/*! \brief Get The network features associated with the value.
	 */
	std::list<std::string> getNetworkFeatures();

	/*! \brief Set The network features associated with the value.
	 */
	void setNetworkFeatures(std::list <std::string> networkFeatures);

private:
	int changeNumber;
	std::string region;
	int regionId;
	std::string platform;
	std::string systemService;
	std::list <std::string>addressPrefixes;
	std::list <std::string>networkFeatures;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ValueProperties_H_ */
