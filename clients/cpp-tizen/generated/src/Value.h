/*
 * Value.h
 *
 * 
 */

#ifndef _Value_H_
#define _Value_H_


#include <string>
#include "ValueProperties.h"
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

class Value : public Object {
public:
	/*! \brief Constructor.
	 */
	Value();
	Value(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Value();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the value.
	 */
	std::string getName();

	/*! \brief Set The name of the value.
	 */
	void setName(std::string  name);
	/*! \brief Get The unique identifier of the value.
	 */
	std::string getId();

	/*! \brief Set The unique identifier of the value.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	ValueProperties getProperties();

	/*! \brief Set 
	 */
	void setProperties(ValueProperties  properties);

private:
	std::string name;
	std::string id;
	ValueProperties properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Value_H_ */
