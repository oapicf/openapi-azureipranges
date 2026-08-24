--
-- Schema objects for PostgreSQL
-- "Azure IP Ranges and Service Tags - Public Cloud"
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--

--
-- DROP OBJECTS
-- (remove comment prefix to start using DROP commands)
--
-- TABLES
--
-- DROP TABLE IF EXISTS change;
-- DROP TABLE IF EXISTS "value";
-- DROP TABLE IF EXISTS value_properties;

--
-- TYPES
--


--
-- CREATE OBJECTS
--
-- TYPES
--

--
-- TABLES
--
--
-- Table 'change' generated from model 'Change'
--
CREATE TABLE IF NOT EXISTS change (
    change_number INTEGER DEFAULT NULL,
    cloud TEXT DEFAULT NULL,
    "values" JSON DEFAULT NULL
);
COMMENT ON TABLE change IS 'Original model name - Change.';
COMMENT ON COLUMN change.change_number IS 'The number associated with the change.. Original param name - changeNumber.';
COMMENT ON COLUMN change.cloud IS 'The cloud environment.';

--
-- Table 'value' generated from model 'Value'
--
CREATE TABLE IF NOT EXISTS "value" (
    "name" TEXT DEFAULT NULL,
    "id" TEXT DEFAULT NULL,
    properties TEXT DEFAULT NULL
);
COMMENT ON TABLE "value" IS 'Original model name - Value.';
COMMENT ON COLUMN "value"."name" IS 'The name of the value.';
COMMENT ON COLUMN "value"."id" IS 'The unique identifier of the value.';

--
-- Table 'value_properties' generated from model 'ValueProperties'
--
CREATE TABLE IF NOT EXISTS value_properties (
    change_number INTEGER DEFAULT NULL,
    region TEXT DEFAULT NULL,
    region_id INTEGER DEFAULT NULL,
    platform TEXT DEFAULT NULL,
    system_service TEXT DEFAULT NULL,
    address_prefixes JSON DEFAULT NULL,
    network_features JSON DEFAULT NULL
);
COMMENT ON TABLE value_properties IS 'Original model name - ValueProperties.';
COMMENT ON COLUMN value_properties.change_number IS 'The number associated with the change.. Original param name - changeNumber.';
COMMENT ON COLUMN value_properties.region IS 'The region associated with the value.';
COMMENT ON COLUMN value_properties.region_id IS 'The ID of the region.. Original param name - regionId.';
COMMENT ON COLUMN value_properties.platform IS 'The platform associated with the value.';
COMMENT ON COLUMN value_properties.system_service IS 'The system service associated with the value.. Original param name - systemService.';
COMMENT ON COLUMN value_properties.address_prefixes IS 'The address prefixes associated with the value.. Original param name - addressPrefixes.';
COMMENT ON COLUMN value_properties.network_features IS 'The network features associated with the value.. Original param name - networkFeatures.';

