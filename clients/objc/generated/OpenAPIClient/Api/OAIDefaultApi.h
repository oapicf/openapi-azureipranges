#import <Foundation/Foundation.h>
#import "OAIChange.h"
#import "OAIApi.h"

/**
* Azure IP Ranges and Service Tags - Public Cloud
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIDefaultApi: NSObject <OAIApi>

extern NSString* kOAIDefaultApiErrorDomain;
extern NSInteger kOAIDefaultApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get Azure IP Ranges and Service Tags - Public Cloud
/// Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
///
/// @param version The version of the JSON file to be retrieved in the format YYYYMMDD, e.g. 20240506
/// 
///  code:200 message:"Successful response"
///
/// @return OAIChange*
-(NSURLSessionTask*) getAzureIpRangesServiceTagsPublicCloudWithVersion: (NSString*) version
    completionHandler: (void (^)(OAIChange* output, NSError* error)) handler;



@end
