--
-- "Azure IP Ranges and Service Tags - Public Cloud"
-- Prepared SQL queries for 'Value' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'value'
--
SELECT "name", "id", properties FROM "value" WHERE 1=1;

--
-- INSERT template for table 'value'
--
INSERT INTO "value" ("name", "id", properties) VALUES (?, ?, ?);

--
-- UPDATE template for table 'value'
--
UPDATE "value" SET "name" = ?, "id" = ?, properties = ? WHERE 1=2;

--
-- DELETE template for table 'value'
--
DELETE FROM "value" WHERE 1=2;

