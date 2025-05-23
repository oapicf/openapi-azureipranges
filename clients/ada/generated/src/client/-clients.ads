--  Azure IP Ranges and Service Tags _ Public Cloud
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  The version of the OpenAPI document: 0.10.1_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.12.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

with .Models;
with Swagger.Clients;
package .Clients is
   pragma Style_Checks ("-bmrIu");

   type Client_Type is new Swagger.Clients.Client_Type with null record;

   --  Get Azure IP Ranges and Service Tags _ Public Cloud
   --  Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
   procedure Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
      (Client : in out Client_Type;
       Version : in Swagger.UString;
       Result : out .Models.Change_Type);

end .Clients;
