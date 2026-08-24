
/*
 * ValueProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ValueProperties_H_
#define TINY_CPP_CLIENT_ValueProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ValueProperties{
public:

    /*! \brief Constructor.
	 */
    ValueProperties();
    ValueProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ValueProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The number associated with the change.
	 */
	int getChangeNumber();

	/*! \brief Set The number associated with the change.
	 */
	void setChangeNumber(int changeNumber);
	/*! \brief Get The region associated with the value.
	 */
	std::string getRegion();

	/*! \brief Set The region associated with the value.
	 */
	void setRegion(std::string region);
	/*! \brief Get The ID of the region.
	 */
	int getRegionId();

	/*! \brief Set The ID of the region.
	 */
	void setRegionId(int regionId);
	/*! \brief Get The platform associated with the value.
	 */
	std::string getPlatform();

	/*! \brief Set The platform associated with the value.
	 */
	void setPlatform(std::string platform);
	/*! \brief Get The system service associated with the value.
	 */
	std::string getSystemService();

	/*! \brief Set The system service associated with the value.
	 */
	void setSystemService(std::string systemService);
	/*! \brief Get The address prefixes associated with the value.
	 */
	std::list<std::string> getAddressPrefixes();

	/*! \brief Set The address prefixes associated with the value.
	 */
	void setAddressPrefixes(std::list<std::string> addressPrefixes);
	/*! \brief Get The network features associated with the value.
	 */
	std::list<std::string> getNetworkFeatures();

	/*! \brief Set The network features associated with the value.
	 */
	void setNetworkFeatures(std::list<std::string> networkFeatures);


    private:
    int changeNumber{};
    std::string region{};
    int regionId{};
    std::string platform{};
    std::string systemService{};
    std::list<std::string> addressPrefixes;
    std::list<std::string> networkFeatures;
};
}

#endif /* TINY_CPP_CLIENT_ValueProperties_H_ */
