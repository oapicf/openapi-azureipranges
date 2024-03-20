

-- --------------------------------------------------------------------------
-- Table structure for table `Change` generated from model 'change'
--

CREATE TABLE IF NOT EXISTS `Change` (
  `changeNumber` int /*The number associated with the change.*/,
  `cloud` text /*The cloud environment.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ChangeValue` generated from model 'ChangeValue'

CREATE TABLE IF NOT EXISTS `ChangeValue` (
  `change` long NOT NULL
  `value` long NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `Value` generated from model 'value'
--

CREATE TABLE IF NOT EXISTS `Value` (
  `name` text /*The name of the value.*/,
  `id` text PRIMARY KEY /*The unique identifier of the value.*/,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `ValueProperties` generated from model 'valueProperties'
--

CREATE TABLE IF NOT EXISTS `ValueProperties` (
  `changeNumber` int /*The number associated with the change.*/,
  `region` text /*The region associated with the value.*/,
  `regionId` int /*The ID of the region.*/,
  `platform` text /*The platform associated with the value.*/,
  `systemService` text /*The system service associated with the value.*/,
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ValuePropertiesAddressPrefixes` generated from model 'ValuePropertiesAddressPrefixes'

CREATE TABLE IF NOT EXISTS `ValuePropertiesAddressPrefixes` (
  `valueProperties` long NOT NULL
  `addressPrefixes` text NOT NULL
);

-- --------------------------------------------------------------------------
-- Table structure for table `ValuePropertiesNetworkFeatures` generated from model 'ValuePropertiesNetworkFeatures'

CREATE TABLE IF NOT EXISTS `ValuePropertiesNetworkFeatures` (
  `valueProperties` long NOT NULL
  `networkFeatures` text NOT NULL
);



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
