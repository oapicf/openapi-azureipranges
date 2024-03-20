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

/*
 * OAIValueProperties.h
 *
 * 
 */

#ifndef OAIValueProperties_H
#define OAIValueProperties_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIValueProperties : public OAIObject {
public:
    OAIValueProperties();
    OAIValueProperties(QString json);
    ~OAIValueProperties() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getChangeNumber() const;
    void setChangeNumber(const qint32 &change_number);
    bool is_change_number_Set() const;
    bool is_change_number_Valid() const;

    QString getRegion() const;
    void setRegion(const QString &region);
    bool is_region_Set() const;
    bool is_region_Valid() const;

    qint32 getRegionId() const;
    void setRegionId(const qint32 &region_id);
    bool is_region_id_Set() const;
    bool is_region_id_Valid() const;

    QString getPlatform() const;
    void setPlatform(const QString &platform);
    bool is_platform_Set() const;
    bool is_platform_Valid() const;

    QString getSystemService() const;
    void setSystemService(const QString &system_service);
    bool is_system_service_Set() const;
    bool is_system_service_Valid() const;

    QList<QString> getAddressPrefixes() const;
    void setAddressPrefixes(const QList<QString> &address_prefixes);
    bool is_address_prefixes_Set() const;
    bool is_address_prefixes_Valid() const;

    QList<QString> getNetworkFeatures() const;
    void setNetworkFeatures(const QList<QString> &network_features);
    bool is_network_features_Set() const;
    bool is_network_features_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 change_number;
    bool m_change_number_isSet;
    bool m_change_number_isValid;

    QString region;
    bool m_region_isSet;
    bool m_region_isValid;

    qint32 region_id;
    bool m_region_id_isSet;
    bool m_region_id_isValid;

    QString platform;
    bool m_platform_isSet;
    bool m_platform_isValid;

    QString system_service;
    bool m_system_service_isSet;
    bool m_system_service_isValid;

    QList<QString> address_prefixes;
    bool m_address_prefixes_isSet;
    bool m_address_prefixes_isValid;

    QList<QString> network_features;
    bool m_network_features_isSet;
    bool m_network_features_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIValueProperties)

#endif // OAIValueProperties_H
