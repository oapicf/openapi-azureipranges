
# Table `ValueProperties`
(mapped from: ValueProperties)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**changeNumber** | changeNumber | int |  | **kotlin.Int** | The number associated with the change. |  [optional]
**region** | region | text |  | **kotlin.String** | The region associated with the value. |  [optional]
**regionId** | regionId | int |  | **kotlin.Int** | The ID of the region. |  [optional]
**platform** | platform | text |  | **kotlin.String** | The platform associated with the value. |  [optional]
**systemService** | systemService | text |  | **kotlin.String** | The system service associated with the value. |  [optional]
**addressPrefixes** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The address prefixes associated with the value. |  [optional]
**networkFeatures** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | The network features associated with the value. |  [optional]







# **Table `ValuePropertiesAddressPrefixes`**
(mapped from: ValuePropertiesAddressPrefixes)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
valueProperties | valueProperties | long | | kotlin.Long | Primary Key | *one*
addressPrefixes | addressPrefixes | text | | kotlin.String | Foreign Key | *many*



# **Table `ValuePropertiesNetworkFeatures`**
(mapped from: ValuePropertiesNetworkFeatures)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
valueProperties | valueProperties | long | | kotlin.Long | Primary Key | *one*
networkFeatures | networkFeatures | text | | kotlin.String | Foreign Key | *many*



