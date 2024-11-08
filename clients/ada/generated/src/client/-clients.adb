--  Azure IP Ranges and Service Tags _ Public Cloud
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.9.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
package body .Clients is
   pragma Style_Checks ("-bmrIu");

   Media_List_1 : constant Swagger.Mime_List := (
     1 => Swagger.Mime_Json   );


   --  Get Azure IP Ranges and Service Tags _ Public Cloud
   --  Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
   procedure Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
      (Client : in out Client_Type;
       Version : in Swagger.UString;
       Result : out .Models.Change_Type) is
      URI   : Swagger.Clients.URI_Type;
      Reply : Swagger.Value_Type;
   begin
      Client.Set_Accept (Media_List_1);


      URI.Set_Path ("/ServiceTags_Public_{version}.json");
      URI.Set_Path_Param ("version", Version);
      Client.Call (Swagger.Clients.GET, URI, Reply);
      .Models.Deserialize (Reply, "", Result);
   end Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud;
end .Clients;