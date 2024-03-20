--
-- Azure IP Ranges and Service Tags - Public Cloud.
-- Prepared SQL queries for 'Change' definition.
--


--
-- SELECT template for table `Change`
--
SELECT `changeNumber`, `cloud`, `values` FROM `Change` WHERE 1;

--
-- INSERT template for table `Change`
--
INSERT INTO `Change`(`changeNumber`, `cloud`, `values`) VALUES (?, ?, ?);

--
-- UPDATE template for table `Change`
--
UPDATE `Change` SET `changeNumber` = ?, `cloud` = ?, `values` = ? WHERE 1;

--
-- DELETE template for table `Change`
--
DELETE FROM `Change` WHERE 0;

