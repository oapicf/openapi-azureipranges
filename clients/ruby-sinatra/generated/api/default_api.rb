require 'json'


MyApp.add_route('GET', '/download/7/1/d/71d86715-5596-4529-9b13-da13a5de5b63/ServiceTags_Public_{version}.json', {
  "resourcePath" => "/Default",
  "summary" => "Get Azure IP Ranges and Service Tags - Public Cloud",
  "nickname" => "get_azure_ip_ranges_service_tags_public_cloud",
  "responseClass" => "Change",
  "endpoint" => "/ServiceTags_Public_{version}.json",
  "notes" => "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.",
  "parameters" => [
    {
      "name" => "version",
      "description" => "The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

