--  Azure IP Ranges and Service Tags _ Public Cloud
--  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
--
--  The version of the OpenAPI document: 0.10.1_pre.0
--  Contact: blah+oapicf@cliffano.com
--
--  NOTE: This package is auto generated by OpenAPI-Generator 7.12.0.
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


      package API_Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud is
         new Swagger.Servers.Operation
            (Handler => Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/ServiceTags_Public_{version}.json",
             Mimes   => Media_List_1'Access);

      --  Get Azure IP Ranges and Service Tags _ Public Cloud
      procedure Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Impl : Implementation_Type;
         Version : Swagger.UString;
         Result : .Models.Change_Type;
      begin
         
         
         Version := To_Swagger.UString (Swagger.Servers.Get_Path_Parameter (Req, 1));

         Impl.Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
            (Version, Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("Successful response");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud;

      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud.Definition);
      end Register;

   end Skeleton;

   package body Shared_Instance is


      --  Get Azure IP Ranges and Service Tags _ Public Cloud
      procedure Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
         (Req     : in out Swagger.Servers.Request'Class;
          Reply   : in out Swagger.Servers.Response'Class;
          Stream  : in out Swagger.Servers.Output_Stream'Class;
          Context : in out Swagger.Servers.Context_Type) is
         Version : Swagger.UString;
         Result : .Models.Change_Type;
      begin

         
         Version := To_Swagger.UString (Swagger.Servers.Get_Path_Parameter (Req, 1));

         Server.Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
            (Version, Result, Context);
         if Context.Get_Status = 200 then
            Context.Set_Description ("Successful response");

            Stream.Start_Document;
            Serialize (Stream, "", Result);
            Stream.End_Document;
            return;
         end if;

      end Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud;

      package API_Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud is
         new Swagger.Servers.Operation
            (Handler => Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud,
             Method  => Swagger.Servers.GET,
             URI     => URI_Prefix & "/ServiceTags_Public_{version}.json",
             Mimes   => Media_List_1'Access);


      procedure Register (Server : in out Swagger.Servers.Application_Type'Class) is
      begin
         Swagger.Servers.Register (Server, API_Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud.Definition);
      end Register;

      protected body Server is
         --  Get Azure IP Ranges and Service Tags _ Public Cloud
         procedure Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
            (Version : in Swagger.UString;
             Result : out .Models.Change_Type;
             Context : in out Swagger.Servers.Context_Type) is
         begin
            Impl.Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud
               (Version,
                Result,
                Context);
         end Get_Azure_Ip_Ranges_Service_Tags_Public_Cloud;

      end Server;

   end Shared_Instance;

end .Skeletons;
