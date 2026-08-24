--
-- "Azure IP Ranges and Service Tags - Public Cloud"
-- Prepared SQL queries for 'ValueProperties' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'value_properties'
--
SELECT change_number, region, region_id, platform, system_service, address_prefixes, network_features FROM value_properties WHERE 1=1;

--
-- INSERT template for table 'value_properties'
--
INSERT INTO value_properties (change_number, region, region_id, platform, system_service, address_prefixes, network_features) VALUES (?, ?, ?, ?, ?, ?, ?);

--
-- UPDATE template for table 'value_properties'
--
UPDATE value_properties SET change_number = ?, region = ?, region_id = ?, platform = ?, system_service = ?, address_prefixes = ?, network_features = ? WHERE 1=2;

--
-- DELETE template for table 'value_properties'
--
DELETE FROM value_properties WHERE 1=2;

