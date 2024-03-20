/**
 * Azure IP Ranges and Service Tags - Public Cloud
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIChange.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIChange::OAIChange(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIChange::OAIChange() {
    this->initializeModel();
}

OAIChange::~OAIChange() {}

void OAIChange::initializeModel() {

    m_change_number_isSet = false;
    m_change_number_isValid = false;

    m_cloud_isSet = false;
    m_cloud_isValid = false;

    m_values_isSet = false;
    m_values_isValid = false;
}

void OAIChange::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIChange::fromJsonObject(QJsonObject json) {

    m_change_number_isValid = ::OpenAPI::fromJsonValue(m_change_number, json[QString("changeNumber")]);
    m_change_number_isSet = !json[QString("changeNumber")].isNull() && m_change_number_isValid;

    m_cloud_isValid = ::OpenAPI::fromJsonValue(m_cloud, json[QString("cloud")]);
    m_cloud_isSet = !json[QString("cloud")].isNull() && m_cloud_isValid;

    m_values_isValid = ::OpenAPI::fromJsonValue(m_values, json[QString("values")]);
    m_values_isSet = !json[QString("values")].isNull() && m_values_isValid;
}

QString OAIChange::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIChange::asJsonObject() const {
    QJsonObject obj;
    if (m_change_number_isSet) {
        obj.insert(QString("changeNumber"), ::OpenAPI::toJsonValue(m_change_number));
    }
    if (m_cloud_isSet) {
        obj.insert(QString("cloud"), ::OpenAPI::toJsonValue(m_cloud));
    }
    if (m_values.size() > 0) {
        obj.insert(QString("values"), ::OpenAPI::toJsonValue(m_values));
    }
    return obj;
}

qint32 OAIChange::getChangeNumber() const {
    return m_change_number;
}
void OAIChange::setChangeNumber(const qint32 &change_number) {
    m_change_number = change_number;
    m_change_number_isSet = true;
}

bool OAIChange::is_change_number_Set() const{
    return m_change_number_isSet;
}

bool OAIChange::is_change_number_Valid() const{
    return m_change_number_isValid;
}

QString OAIChange::getCloud() const {
    return m_cloud;
}
void OAIChange::setCloud(const QString &cloud) {
    m_cloud = cloud;
    m_cloud_isSet = true;
}

bool OAIChange::is_cloud_Set() const{
    return m_cloud_isSet;
}

bool OAIChange::is_cloud_Valid() const{
    return m_cloud_isValid;
}

QList<OAIValue> OAIChange::getValues() const {
    return m_values;
}
void OAIChange::setValues(const QList<OAIValue> &values) {
    m_values = values;
    m_values_isSet = true;
}

bool OAIChange::is_values_Set() const{
    return m_values_isSet;
}

bool OAIChange::is_values_Valid() const{
    return m_values_isValid;
}

bool OAIChange::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_change_number_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_cloud_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_values.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIChange::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
