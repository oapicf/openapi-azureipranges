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

#include "OAIValueProperties.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIValueProperties::OAIValueProperties(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIValueProperties::OAIValueProperties() {
    this->initializeModel();
}

OAIValueProperties::~OAIValueProperties() {}

void OAIValueProperties::initializeModel() {

    m_change_number_isSet = false;
    m_change_number_isValid = false;

    m_region_isSet = false;
    m_region_isValid = false;

    m_region_id_isSet = false;
    m_region_id_isValid = false;

    m_platform_isSet = false;
    m_platform_isValid = false;

    m_system_service_isSet = false;
    m_system_service_isValid = false;

    m_address_prefixes_isSet = false;
    m_address_prefixes_isValid = false;

    m_network_features_isSet = false;
    m_network_features_isValid = false;
}

void OAIValueProperties::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIValueProperties::fromJsonObject(QJsonObject json) {

    m_change_number_isValid = ::OpenAPI::fromJsonValue(m_change_number, json[QString("changeNumber")]);
    m_change_number_isSet = !json[QString("changeNumber")].isNull() && m_change_number_isValid;

    m_region_isValid = ::OpenAPI::fromJsonValue(m_region, json[QString("region")]);
    m_region_isSet = !json[QString("region")].isNull() && m_region_isValid;

    m_region_id_isValid = ::OpenAPI::fromJsonValue(m_region_id, json[QString("regionId")]);
    m_region_id_isSet = !json[QString("regionId")].isNull() && m_region_id_isValid;

    m_platform_isValid = ::OpenAPI::fromJsonValue(m_platform, json[QString("platform")]);
    m_platform_isSet = !json[QString("platform")].isNull() && m_platform_isValid;

    m_system_service_isValid = ::OpenAPI::fromJsonValue(m_system_service, json[QString("systemService")]);
    m_system_service_isSet = !json[QString("systemService")].isNull() && m_system_service_isValid;

    m_address_prefixes_isValid = ::OpenAPI::fromJsonValue(m_address_prefixes, json[QString("addressPrefixes")]);
    m_address_prefixes_isSet = !json[QString("addressPrefixes")].isNull() && m_address_prefixes_isValid;

    m_network_features_isValid = ::OpenAPI::fromJsonValue(m_network_features, json[QString("networkFeatures")]);
    m_network_features_isSet = !json[QString("networkFeatures")].isNull() && m_network_features_isValid;
}

QString OAIValueProperties::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIValueProperties::asJsonObject() const {
    QJsonObject obj;
    if (m_change_number_isSet) {
        obj.insert(QString("changeNumber"), ::OpenAPI::toJsonValue(m_change_number));
    }
    if (m_region_isSet) {
        obj.insert(QString("region"), ::OpenAPI::toJsonValue(m_region));
    }
    if (m_region_id_isSet) {
        obj.insert(QString("regionId"), ::OpenAPI::toJsonValue(m_region_id));
    }
    if (m_platform_isSet) {
        obj.insert(QString("platform"), ::OpenAPI::toJsonValue(m_platform));
    }
    if (m_system_service_isSet) {
        obj.insert(QString("systemService"), ::OpenAPI::toJsonValue(m_system_service));
    }
    if (m_address_prefixes.size() > 0) {
        obj.insert(QString("addressPrefixes"), ::OpenAPI::toJsonValue(m_address_prefixes));
    }
    if (m_network_features.size() > 0) {
        obj.insert(QString("networkFeatures"), ::OpenAPI::toJsonValue(m_network_features));
    }
    return obj;
}

qint32 OAIValueProperties::getChangeNumber() const {
    return m_change_number;
}
void OAIValueProperties::setChangeNumber(const qint32 &change_number) {
    m_change_number = change_number;
    m_change_number_isSet = true;
}

bool OAIValueProperties::is_change_number_Set() const{
    return m_change_number_isSet;
}

bool OAIValueProperties::is_change_number_Valid() const{
    return m_change_number_isValid;
}

QString OAIValueProperties::getRegion() const {
    return m_region;
}
void OAIValueProperties::setRegion(const QString &region) {
    m_region = region;
    m_region_isSet = true;
}

bool OAIValueProperties::is_region_Set() const{
    return m_region_isSet;
}

bool OAIValueProperties::is_region_Valid() const{
    return m_region_isValid;
}

qint32 OAIValueProperties::getRegionId() const {
    return m_region_id;
}
void OAIValueProperties::setRegionId(const qint32 &region_id) {
    m_region_id = region_id;
    m_region_id_isSet = true;
}

bool OAIValueProperties::is_region_id_Set() const{
    return m_region_id_isSet;
}

bool OAIValueProperties::is_region_id_Valid() const{
    return m_region_id_isValid;
}

QString OAIValueProperties::getPlatform() const {
    return m_platform;
}
void OAIValueProperties::setPlatform(const QString &platform) {
    m_platform = platform;
    m_platform_isSet = true;
}

bool OAIValueProperties::is_platform_Set() const{
    return m_platform_isSet;
}

bool OAIValueProperties::is_platform_Valid() const{
    return m_platform_isValid;
}

QString OAIValueProperties::getSystemService() const {
    return m_system_service;
}
void OAIValueProperties::setSystemService(const QString &system_service) {
    m_system_service = system_service;
    m_system_service_isSet = true;
}

bool OAIValueProperties::is_system_service_Set() const{
    return m_system_service_isSet;
}

bool OAIValueProperties::is_system_service_Valid() const{
    return m_system_service_isValid;
}

QList<QString> OAIValueProperties::getAddressPrefixes() const {
    return m_address_prefixes;
}
void OAIValueProperties::setAddressPrefixes(const QList<QString> &address_prefixes) {
    m_address_prefixes = address_prefixes;
    m_address_prefixes_isSet = true;
}

bool OAIValueProperties::is_address_prefixes_Set() const{
    return m_address_prefixes_isSet;
}

bool OAIValueProperties::is_address_prefixes_Valid() const{
    return m_address_prefixes_isValid;
}

QList<QString> OAIValueProperties::getNetworkFeatures() const {
    return m_network_features;
}
void OAIValueProperties::setNetworkFeatures(const QList<QString> &network_features) {
    m_network_features = network_features;
    m_network_features_isSet = true;
}

bool OAIValueProperties::is_network_features_Set() const{
    return m_network_features_isSet;
}

bool OAIValueProperties::is_network_features_Valid() const{
    return m_network_features_isValid;
}

bool OAIValueProperties::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_change_number_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_region_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_region_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_platform_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_system_service_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_address_prefixes.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_network_features.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIValueProperties::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
