#import "OAIValueProperties.h"

@implementation OAIValueProperties

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"changeNumber": @"changeNumber", @"region": @"region", @"regionId": @"regionId", @"platform": @"platform", @"systemService": @"systemService", @"addressPrefixes": @"addressPrefixes", @"networkFeatures": @"networkFeatures" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"changeNumber", @"region", @"regionId", @"platform", @"systemService", @"addressPrefixes", @"networkFeatures"];
  return [optionalProperties containsObject:propertyName];
}

@end
