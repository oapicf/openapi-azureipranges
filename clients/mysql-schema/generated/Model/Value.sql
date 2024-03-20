--
-- Azure IP Ranges and Service Tags - Public Cloud.
-- Prepared SQL queries for 'Value' definition.
--


--
-- SELECT template for table `Value`
--
SELECT `name`, `id`, `properties` FROM `Value` WHERE 1;

--
-- INSERT template for table `Value`
--
INSERT INTO `Value`(`name`, `id`, `properties`) VALUES (?, ?, ?);

--
-- UPDATE template for table `Value`
--
UPDATE `Value` SET `name` = ?, `id` = ?, `properties` = ? WHERE 1;

--
-- DELETE template for table `Value`
--
DELETE FROM `Value` WHERE 0;

