require 'json'


MyApp.add_route('GET', '/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63/ServiceTags_Public_20240318.json', {
  "resourcePath" => "/Default",
  "summary" => "Get Azure IP Ranges and Service Tags - Public Cloud",
  "nickname" => "service_tags_public20240318_json_get",
  "responseClass" => "Change",
  "endpoint" => "/ServiceTags_Public_20240318.json",
  "notes" => "Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.",
  "parameters" => [
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

