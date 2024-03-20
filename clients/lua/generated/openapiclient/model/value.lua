--[[
  Azure IP Ranges and Service Tags - Public Cloud

  No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

  The version of the OpenAPI document: 0.9.0-pre.0
  Contact: blah+oapicf@cliffano.com
  Generated by: https://openapi-generator.tech
]]

-- value class
local value = {}
local value_mt = {
	__name = "value";
	__index = value;
}

local function cast_value(t)
	return setmetatable(t, value_mt)
end

local function new_value(name, id, properties)
	return cast_value({
		["name"] = name;
		["id"] = id;
		["properties"] = properties;
	})
end

return {
	cast = cast_value;
	new = new_value;
}