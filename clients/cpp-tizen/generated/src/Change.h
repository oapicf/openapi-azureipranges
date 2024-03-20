/*
 * Change.h
 *
 * 
 */

#ifndef _Change_H_
#define _Change_H_


#include <string>
#include "Value.h"
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

class Change : public Object {
public:
	/*! \brief Constructor.
	 */
	Change();
	Change(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Change();

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
	/*! \brief Get The cloud environment.
	 */
	std::string getCloud();

	/*! \brief Set The cloud environment.
	 */
	void setCloud(std::string  cloud);
	/*! \brief Get 
	 */
	std::list<Value> getValues();

	/*! \brief Set 
	 */
	void setValues(std::list <Value> values);

private:
	int changeNumber;
	std::string cloud;
	std::list <Value>values;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Change_H_ */
