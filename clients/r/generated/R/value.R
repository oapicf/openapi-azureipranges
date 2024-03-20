#' Create a new Value
#'
#' @description
#' Value Class
#'
#' @docType class
#' @title Value
#' @description Value Class
#' @format An \code{R6Class} generator object
#' @field name The name of the value. character [optional]
#' @field id The unique identifier of the value. character [optional]
#' @field properties  \link{ValueProperties} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Value <- R6::R6Class(
  "Value",
  public = list(
    `name` = NULL,
    `id` = NULL,
    `properties` = NULL,
    #' Initialize a new Value class.
    #'
    #' @description
    #' Initialize a new Value class.
    #'
    #' @param name The name of the value.
    #' @param id The unique identifier of the value.
    #' @param properties properties
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name` = NULL, `id` = NULL, `properties` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!is.null(`properties`)) {
        stopifnot(R6::is.R6(`properties`))
        self$`properties` <- `properties`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Value in JSON format
    #' @export
    toJSON = function() {
      ValueObject <- list()
      if (!is.null(self$`name`)) {
        ValueObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`id`)) {
        ValueObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`properties`)) {
        ValueObject[["properties"]] <-
          self$`properties`$toJSON()
      }
      ValueObject
    },
    #' Deserialize JSON string into an instance of Value
    #'
    #' @description
    #' Deserialize JSON string into an instance of Value
    #'
    #' @param input_json the JSON input
    #' @return the instance of Value
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`properties`)) {
        `properties_object` <- ValueProperties$new()
        `properties_object`$fromJSON(jsonlite::toJSON(this_object$`properties`, auto_unbox = TRUE, digits = NA))
        self$`properties` <- `properties_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Value in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        },
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`properties`)) {
          sprintf(
          '"properties":
          %s
          ',
          jsonlite::toJSON(self$`properties`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Value
    #'
    #' @description
    #' Deserialize JSON string into an instance of Value
    #'
    #' @param input_json the JSON input
    #' @return the instance of Value
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self$`id` <- this_object$`id`
      self$`properties` <- ValueProperties$new()$fromJSON(jsonlite::toJSON(this_object$`properties`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to Value
    #'
    #' @description
    #' Validate JSON input with respect to Value and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Value
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# Value$unlock()
#
## Below is an example to define the print function
# Value$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Value$lock()

