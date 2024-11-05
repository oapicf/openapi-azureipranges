#' Create a new ValueProperties
#'
#' @description
#' ValueProperties Class
#'
#' @docType class
#' @title ValueProperties
#' @description ValueProperties Class
#' @format An \code{R6Class} generator object
#' @field changeNumber The number associated with the change. integer [optional]
#' @field region The region associated with the value. character [optional]
#' @field regionId The ID of the region. integer [optional]
#' @field platform The platform associated with the value. character [optional]
#' @field systemService The system service associated with the value. character [optional]
#' @field addressPrefixes The address prefixes associated with the value. list(character) [optional]
#' @field networkFeatures The network features associated with the value. list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ValueProperties <- R6::R6Class(
  "ValueProperties",
  public = list(
    `changeNumber` = NULL,
    `region` = NULL,
    `regionId` = NULL,
    `platform` = NULL,
    `systemService` = NULL,
    `addressPrefixes` = NULL,
    `networkFeatures` = NULL,

    #' @description
    #' Initialize a new ValueProperties class.
    #'
    #' @param changeNumber The number associated with the change.
    #' @param region The region associated with the value.
    #' @param regionId The ID of the region.
    #' @param platform The platform associated with the value.
    #' @param systemService The system service associated with the value.
    #' @param addressPrefixes The address prefixes associated with the value.
    #' @param networkFeatures The network features associated with the value.
    #' @param ... Other optional arguments.
    initialize = function(`changeNumber` = NULL, `region` = NULL, `regionId` = NULL, `platform` = NULL, `systemService` = NULL, `addressPrefixes` = NULL, `networkFeatures` = NULL, ...) {
      if (!is.null(`changeNumber`)) {
        if (!(is.numeric(`changeNumber`) && length(`changeNumber`) == 1)) {
          stop(paste("Error! Invalid data for `changeNumber`. Must be an integer:", `changeNumber`))
        }
        self$`changeNumber` <- `changeNumber`
      }
      if (!is.null(`region`)) {
        if (!(is.character(`region`) && length(`region`) == 1)) {
          stop(paste("Error! Invalid data for `region`. Must be a string:", `region`))
        }
        self$`region` <- `region`
      }
      if (!is.null(`regionId`)) {
        if (!(is.numeric(`regionId`) && length(`regionId`) == 1)) {
          stop(paste("Error! Invalid data for `regionId`. Must be an integer:", `regionId`))
        }
        self$`regionId` <- `regionId`
      }
      if (!is.null(`platform`)) {
        if (!(is.character(`platform`) && length(`platform`) == 1)) {
          stop(paste("Error! Invalid data for `platform`. Must be a string:", `platform`))
        }
        self$`platform` <- `platform`
      }
      if (!is.null(`systemService`)) {
        if (!(is.character(`systemService`) && length(`systemService`) == 1)) {
          stop(paste("Error! Invalid data for `systemService`. Must be a string:", `systemService`))
        }
        self$`systemService` <- `systemService`
      }
      if (!is.null(`addressPrefixes`)) {
        stopifnot(is.vector(`addressPrefixes`), length(`addressPrefixes`) != 0)
        sapply(`addressPrefixes`, function(x) stopifnot(is.character(x)))
        self$`addressPrefixes` <- `addressPrefixes`
      }
      if (!is.null(`networkFeatures`)) {
        stopifnot(is.vector(`networkFeatures`), length(`networkFeatures`) != 0)
        sapply(`networkFeatures`, function(x) stopifnot(is.character(x)))
        self$`networkFeatures` <- `networkFeatures`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ValueProperties in JSON format
    toJSON = function() {
      ValuePropertiesObject <- list()
      if (!is.null(self$`changeNumber`)) {
        ValuePropertiesObject[["changeNumber"]] <-
          self$`changeNumber`
      }
      if (!is.null(self$`region`)) {
        ValuePropertiesObject[["region"]] <-
          self$`region`
      }
      if (!is.null(self$`regionId`)) {
        ValuePropertiesObject[["regionId"]] <-
          self$`regionId`
      }
      if (!is.null(self$`platform`)) {
        ValuePropertiesObject[["platform"]] <-
          self$`platform`
      }
      if (!is.null(self$`systemService`)) {
        ValuePropertiesObject[["systemService"]] <-
          self$`systemService`
      }
      if (!is.null(self$`addressPrefixes`)) {
        ValuePropertiesObject[["addressPrefixes"]] <-
          self$`addressPrefixes`
      }
      if (!is.null(self$`networkFeatures`)) {
        ValuePropertiesObject[["networkFeatures"]] <-
          self$`networkFeatures`
      }
      ValuePropertiesObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ValueProperties
    #'
    #' @param input_json the JSON input
    #' @return the instance of ValueProperties
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`changeNumber`)) {
        self$`changeNumber` <- this_object$`changeNumber`
      }
      if (!is.null(this_object$`region`)) {
        self$`region` <- this_object$`region`
      }
      if (!is.null(this_object$`regionId`)) {
        self$`regionId` <- this_object$`regionId`
      }
      if (!is.null(this_object$`platform`)) {
        self$`platform` <- this_object$`platform`
      }
      if (!is.null(this_object$`systemService`)) {
        self$`systemService` <- this_object$`systemService`
      }
      if (!is.null(this_object$`addressPrefixes`)) {
        self$`addressPrefixes` <- ApiClient$new()$deserializeObj(this_object$`addressPrefixes`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`networkFeatures`)) {
        self$`networkFeatures` <- ApiClient$new()$deserializeObj(this_object$`networkFeatures`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ValueProperties in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`changeNumber`)) {
          sprintf(
          '"changeNumber":
            %d
                    ',
          self$`changeNumber`
          )
        },
        if (!is.null(self$`region`)) {
          sprintf(
          '"region":
            "%s"
                    ',
          self$`region`
          )
        },
        if (!is.null(self$`regionId`)) {
          sprintf(
          '"regionId":
            %d
                    ',
          self$`regionId`
          )
        },
        if (!is.null(self$`platform`)) {
          sprintf(
          '"platform":
            "%s"
                    ',
          self$`platform`
          )
        },
        if (!is.null(self$`systemService`)) {
          sprintf(
          '"systemService":
            "%s"
                    ',
          self$`systemService`
          )
        },
        if (!is.null(self$`addressPrefixes`)) {
          sprintf(
          '"addressPrefixes":
             [%s]
          ',
          paste(unlist(lapply(self$`addressPrefixes`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`networkFeatures`)) {
          sprintf(
          '"networkFeatures":
             [%s]
          ',
          paste(unlist(lapply(self$`networkFeatures`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ValueProperties
    #'
    #' @param input_json the JSON input
    #' @return the instance of ValueProperties
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`changeNumber` <- this_object$`changeNumber`
      self$`region` <- this_object$`region`
      self$`regionId` <- this_object$`regionId`
      self$`platform` <- this_object$`platform`
      self$`systemService` <- this_object$`systemService`
      self$`addressPrefixes` <- ApiClient$new()$deserializeObj(this_object$`addressPrefixes`, "array[character]", loadNamespace("openapi"))
      self$`networkFeatures` <- ApiClient$new()$deserializeObj(this_object$`networkFeatures`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ValueProperties and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ValueProperties
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ValueProperties$unlock()
#
## Below is an example to define the print function
# ValueProperties$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ValueProperties$lock()

