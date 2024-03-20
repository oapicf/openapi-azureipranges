
# Table `Change`
(mapped from: Change)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**changeNumber** | changeNumber | int |  | **kotlin.Int** | The number associated with the change. |  [optional]
**cloud** | cloud | text |  | **kotlin.String** | The cloud environment. |  [optional]
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Value&gt;**](Value.md) |  |  [optional]




# **Table `ChangeValue`**
(mapped from: ChangeValue)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
change | change | long | | kotlin.Long | Primary Key | *one*
value | value | long | | kotlin.Long | Foreign Key | *many*



