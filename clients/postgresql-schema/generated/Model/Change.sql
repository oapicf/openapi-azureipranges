--
-- "Azure IP Ranges and Service Tags - Public Cloud"
-- Prepared SQL queries for 'Change' definition.
-- Created using 'openapi-generator' ('postgresql-schema' generator)
-- (https://openapi-generator.tech/docs/generators/postgresql-schema)
--


--
-- SELECT template for table 'change'
--
SELECT change_number, cloud, "values" FROM change WHERE 1=1;

--
-- INSERT template for table 'change'
--
INSERT INTO change (change_number, cloud, "values") VALUES (?, ?, ?);

--
-- UPDATE template for table 'change'
--
UPDATE change SET change_number = ?, cloud = ?, "values" = ? WHERE 1=2;

--
-- DELETE template for table 'change'
--
DELETE FROM change WHERE 1=2;

