/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */

-- --------------------------------------------------------

--
-- Table structure for table `Change` generated from model 'Change'
--

CREATE TABLE IF NOT EXISTS `Change` (
  `changeNumber` INT DEFAULT NULL COMMENT 'The number associated with the change.',
  `cloud` TEXT DEFAULT NULL COMMENT 'The cloud environment.',
  `values` JSON DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `Value` generated from model 'Value'
--

CREATE TABLE IF NOT EXISTS `Value` (
  `name` TEXT DEFAULT NULL COMMENT 'The name of the value.',
  `id` TEXT DEFAULT NULL COMMENT 'The unique identifier of the value.',
  `properties` TEXT DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Table structure for table `ValueProperties` generated from model 'ValueProperties'
--

CREATE TABLE IF NOT EXISTS `ValueProperties` (
  `changeNumber` INT DEFAULT NULL COMMENT 'The number associated with the change.',
  `region` TEXT DEFAULT NULL COMMENT 'The region associated with the value.',
  `regionId` INT DEFAULT NULL COMMENT 'The ID of the region.',
  `platform` TEXT DEFAULT NULL COMMENT 'The platform associated with the value.',
  `systemService` TEXT DEFAULT NULL COMMENT 'The system service associated with the value.',
  `addressPrefixes` JSON DEFAULT NULL COMMENT 'The address prefixes associated with the value.',
  `networkFeatures` JSON DEFAULT NULL COMMENT 'The network features associated with the value.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


