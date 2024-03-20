--  Azure IP Ranges and Service Tags _ Public Cloud
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  The version of the OpenAPI document: 0.9.0_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.4.0.
--  https://openapi-generator.tech
--  Do not edit the class manually.

pragma Warnings (Off, "*is not referenced");
with Swagger.Streams;
with Swagger.Servers.Operation;
package body .Skeletons is
   pragma Style_Checks ("-bmrIu");
   pragma Warnings (Off, "*use clause for package*");

   use Swagger.Streams;

   Media_List_1 : aliased constant Swagger.Mime_List := (
     1 => Swagger.Mime_Json);

   package body Skeleton is


      package API_Service_Tags_Public_20240318Json_Get is
         new Swagger.Servers.Operation
            (Handler => Service_Tags_Public_20240318Json_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/ServiceTags_Public_20240318.json",
             Mimes   => Media_List_1'Access);

      --  Get Azure IP Ranges and Service Tags _ Public Cloud
      procedure Service_Tags_Public_20240318Json_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Result : .Models.Change_Type;
      begin
         
         
         Impl.Service_Tags_Public_20240318Json_Get (Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("Successful response");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Service_Tags_Public_20240318Json_Get;

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Service_Tags_Public_20240318Json_Get.Definition);
      end Register;

   end Skeleton;

   package body Shared_Instance is


      --  Get Azure IP Ranges and Service Tags _ Public Cloud
      procedure Service_Tags_Public_20240318Json_Get
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Result : .Models.Change_Type;
      begin

         
         Server.Service_Tags_Public_20240318Json_Get (Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("Successful response");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Service_Tags_Public_20240318Json_Get;

      package API_Service_Tags_Public_20240318Json_Get is
         new Swagger.Servers.Operation
            (Handler => Service_Tags_Public_20240318Json_Get,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/ServiceTags_Public_20240318.json",
             Mimes   => Media_List_1'Access);


      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Service_Tags_Public_20240318Json_Get.Definition);
      end Register;

      protected body Server is
         --  Get Azure IP Ranges and Service Tags _ Public Cloud
         procedure Service_Tags_Public_20240318Json_Get (Result : out .Models.Change_Type;
         Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Service_Tags_Public_20240318Json_Get (Result, Context);
         end Service_Tags_Public_20240318Json_Get;

      end Server;

   end Shared_Instance;

end .Skeletons;
