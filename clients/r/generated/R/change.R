#' Create a new Change
#'
#' @description
#' Change Class
#'
#' @docType class
#' @title Change
#' @description Change Class
#' @format An \code{R6Class} generator object
#' @field changeNumber The number associated with the change. integer [optional]
#' @field cloud The cloud environment. character [optional]
#' @field values  list(\link{Value}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Change <- R6::R6Class(
  "Change",
  public = list(
    `changeNumber` = NULL,
    `cloud` = NULL,
    `values` = NULL,

    #' @description
    #' Initialize a new Change class.
    #'
    #' @param changeNumber The number associated with the change.
    #' @param cloud The cloud environment.
    #' @param values values
    #' @param ... Other optional arguments.
    initialize = function(`changeNumber` = NULL, `cloud` = NULL, `values` = NULL, ...) {
      if (!is.null(`changeNumber`)) {
        if (!(is.numeric(`changeNumber`) && length(`changeNumber`) == 1)) {
          stop(paste("Error! Invalid data for `changeNumber`. Must be an integer:", `changeNumber`))
        }
        self$`changeNumber` <- `changeNumber`
      }
      if (!is.null(`cloud`)) {
        if (!(is.character(`cloud`) && length(`cloud`) == 1)) {
          stop(paste("Error! Invalid data for `cloud`. Must be a string:", `cloud`))
        }
        self$`cloud` <- `cloud`
      }
      if (!is.null(`values`)) {
        stopifnot(is.vector(`values`), length(`values`) != 0)
        sapply(`values`, function(x) stopifnot(R6::is.R6(x)))
        self$`values` <- `values`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return Change as a base R list.
    #' @examples
    #' # convert array of Change (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert Change to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChangeObject <- list()
      if (!is.null(self$`changeNumber`)) {
        ChangeObject[["changeNumber"]] <-
          self$`changeNumber`
      }
      if (!is.null(self$`cloud`)) {
        ChangeObject[["cloud"]] <-
          self$`cloud`
      }
      if (!is.null(self$`values`)) {
        ChangeObject[["values"]] <-
          lapply(self$`values`, function(x) x$toSimpleType())
      }
      return(ChangeObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Change
    #'
    #' @param input_json the JSON input
    #' @return the instance of Change
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`changeNumber`)) {
        self$`changeNumber` <- this_object$`changeNumber`
      }
      if (!is.null(this_object$`cloud`)) {
        self$`cloud` <- this_object$`cloud`
      }
      if (!is.null(this_object$`values`)) {
        self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[Value]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Change in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Change
    #'
    #' @param input_json the JSON input
    #' @return the instance of Change
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`changeNumber` <- this_object$`changeNumber`
      self$`cloud` <- this_object$`cloud`
      self$`values` <- ApiClient$new()$deserializeObj(this_object$`values`, "array[Value]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to Change and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Change
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
# Change$unlock()
#
## Below is an example to define the print function
# Change$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Change$lock()

