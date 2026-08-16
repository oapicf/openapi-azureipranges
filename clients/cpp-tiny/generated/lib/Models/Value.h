
/*
 * Value.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Value_H_
#define TINY_CPP_CLIENT_Value_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ValueProperties.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Value{
public:

    /*! \brief Constructor.
	 */
    Value();
    Value(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Value();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string name{};
    std::string id{};
    ValueProperties properties;
};
}

#endif /* TINY_CPP_CLIENT_Value_H_ */
