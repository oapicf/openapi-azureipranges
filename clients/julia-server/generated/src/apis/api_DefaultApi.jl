# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


function get_azure_ip_ranges_service_tags_public_cloud_read(handler)
    function get_azure_ip_ranges_service_tags_public_cloud_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        path_params = HTTP.getparams(req)
        openapi_params["version"] = OpenAPI.Servers.to_param(String, path_params, "version", required=true, )
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function get_azure_ip_ranges_service_tags_public_cloud_validate(handler)
    function get_azure_ip_ranges_service_tags_public_cloud_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function get_azure_ip_ranges_service_tags_public_cloud_invoke(impl; post_invoke=nothing)
    function get_azure_ip_ranges_service_tags_public_cloud_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.get_azure_ip_ranges_service_tags_public_cloud(req::HTTP.Request, openapi_params["version"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end


function registerDefaultApi(router::HTTP.Router, impl; path_prefix::String="", optional_middlewares...)
    HTTP.register!(router, "GET", path_prefix * "/ServiceTags_Public_{version}.json", OpenAPI.Servers.middleware(impl, get_azure_ip_ranges_service_tags_public_cloud_read, get_azure_ip_ranges_service_tags_public_cloud_validate, get_azure_ip_ranges_service_tags_public_cloud_invoke; optional_middlewares...))
    return router
end