#' Azure IP Ranges and Service Tags - Public Cloud
#'
#' No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#'
#' The version of the OpenAPI document: 0.10.1-pre.0
#' Contact: blah+oapicf@cliffano.com
#' Generated by: https://openapi-generator.tech
#'
#' @docType class
#' @title Default operations
#' @description DefaultApi
#' @format An \code{R6Class} generator object
#' @field api_client Handles the client-server communication.
#'
#' @examples
#' \dontrun{
#' ####################  GetAzureIpRangesServiceTagsPublicCloud  ####################
#'
#' library(openapi)
#' var_version <- "version_example" # character | The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
#'
#' #Get Azure IP Ranges and Service Tags - Public Cloud
#' api_instance <- DefaultApi$new()
#'
#' # to save the result into a file, simply add the optional `data_file` parameter, e.g.
#' # result <- api_instance$GetAzureIpRangesServiceTagsPublicCloud(var_versiondata_file = "result.txt")
#' result <- api_instance$GetAzureIpRangesServiceTagsPublicCloud(var_version)
#' dput(result)
#'
#'
#' }
#' @importFrom R6 R6Class
#' @importFrom base64enc base64encode
#' @export
DefaultApi <- R6::R6Class(
  "DefaultApi",
  public = list(
    api_client = NULL,

    #' @description
    #' Initialize a new DefaultApi.
    #'
    #' @param api_client An instance of API client.
    initialize = function(api_client) {
      if (!missing(api_client)) {
        self$api_client <- api_client
      } else {
        self$api_client <- ApiClient$new()
      }
    },

    #' @description
    #' Get Azure IP Ranges and Service Tags - Public Cloud
    #'
    #' @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return Change
    GetAzureIpRangesServiceTagsPublicCloud = function(version, data_file = NULL, ...) {
      local_var_response <- self$GetAzureIpRangesServiceTagsPublicCloudWithHttpInfo(version, data_file = data_file, ...)
      if (local_var_response$status_code >= 200 && local_var_response$status_code <= 299) {
        return(local_var_response$content)
      } else if (local_var_response$status_code >= 300 && local_var_response$status_code <= 399) {
        return(local_var_response)
      } else if (local_var_response$status_code >= 400 && local_var_response$status_code <= 499) {
        return(local_var_response)
      } else if (local_var_response$status_code >= 500 && local_var_response$status_code <= 599) {
        return(local_var_response)
      }
    },

    #' @description
    #' Get Azure IP Ranges and Service Tags - Public Cloud
    #'
    #' @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
    #' @param data_file (optional) name of the data file to save the result
    #' @param ... Other optional arguments
    #'
    #' @return API response (Change) with additional information such as HTTP status code, headers
    GetAzureIpRangesServiceTagsPublicCloudWithHttpInfo = function(version, data_file = NULL, ...) {
      args <- list(...)
      query_params <- list()
      header_params <- c()
      form_params <- list()
      file_params <- list()
      local_var_body <- NULL
      oauth_scopes <- NULL
      is_oauth <- FALSE

      if (missing(`version`)) {
        stop("Missing required parameter `version`.")
      }


      local_var_url_path <- "/ServiceTags_Public_{version}.json"
      if (!missing(`version`)) {
        local_var_url_path <- gsub("\\{version\\}", URLencode(as.character(`version`), reserved = TRUE), local_var_url_path)
      }


      # The Accept request HTTP header
      local_var_accepts <- list("application/json")

      # The Content-Type representation header
      local_var_content_types <- list()

      local_var_resp <- self$api_client$CallApi(url = paste0(self$api_client$base_path, local_var_url_path),
                                 method = "GET",
                                 query_params = query_params,
                                 header_params = header_params,
                                 form_params = form_params,
                                 file_params = file_params,
                                 accepts = local_var_accepts,
                                 content_types = local_var_content_types,
                                 body = local_var_body,
                                 is_oauth = is_oauth,
                                 oauth_scopes = oauth_scopes,
                                 ...)

      if (local_var_resp$status_code >= 200 && local_var_resp$status_code <= 299) {
        # save response in a file
        if (!is.null(data_file)) {
          self$api_client$WriteFile(local_var_resp, data_file)
        }

        deserialized_resp_obj <- tryCatch(
          self$api_client$DeserializeResponse(local_var_resp, "Change"),
          error = function(e) {
            stop("Failed to deserialize response")
          }
        )
        local_var_resp$content <- deserialized_resp_obj
        return(local_var_resp)
      } 
      
      local_var_error_msg <- local_var_resp$response_as_text()      
      if (local_var_resp$status_code >= 300 && local_var_resp$status_code <= 399) {
        ApiResponse$new(paste("Server returned ", local_var_resp$status_code, " response status code."), local_var_resp)
      } else if (local_var_resp$status_code >= 400 && local_var_resp$status_code <= 499) {
        ApiResponse$new("API client error", local_var_resp)
      } else if (local_var_resp$status_code >= 500 && local_var_resp$status_code <= 599) {
        if (is.null(local_var_resp$response) || local_var_resp$response == "") {
          local_var_resp$response <- "API server error"
        }
        return(local_var_resp)
      }
    }
  )
)
