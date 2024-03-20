--
-- Azure IP Ranges and Service Tags - Public Cloud.
-- Prepared SQL queries for 'ValueProperties' definition.
--


--
-- SELECT template for table `ValueProperties`
--
SELECT `changeNumber`, `region`, `regionId`, `platform`, `systemService`, `addressPrefixes`, `networkFeatures` FROM `ValueProperties` WHERE 1;

--
-- INSERT template for table `ValueProperties`
--
INSERT INTO `ValueProperties`(`changeNumber`, `region`, `regionId`, `platform`, `systemService`, `addressPrefixes`, `networkFeatures`) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table `ValueProperties`
--
UPDATE `ValueProperties` SET `changeNumber` = ?, `region` = ?, `regionId` = ?, `platform` = ?, `systemService` = ?, `addressPrefixes` = ?, `networkFeatures` = ? WHERE 1;

--
-- DELETE template for table `ValueProperties`
--
DELETE FROM `ValueProperties` WHERE 0;

