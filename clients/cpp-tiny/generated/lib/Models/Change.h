
/*
 * Change.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Change_H_
#define TINY_CPP_CLIENT_Change_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Value.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Change{
public:

    /*! \brief Constructor.
	 */
    Change();
    Change(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Change();


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
    int changeNumber{};
    std::string cloud{};
    std::list<Value> values;
};
}

#endif /* TINY_CPP_CLIENT_Change_H_ */
