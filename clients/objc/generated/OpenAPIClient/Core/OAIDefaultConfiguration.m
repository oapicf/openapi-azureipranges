#import "OAIDefaultConfiguration.h"
#import "OAIBasicAuthTokenProvider.h"
#import "OAILogger.h"

@interface OAIDefaultConfiguration ()

@property (nonatomic, strong) NSMutableDictionary *mutableDefaultHeaders;
@property (nonatomic, strong) NSMutableDictionary *mutableApiKey;
@property (nonatomic, strong) NSMutableDictionary *mutableApiKeyPrefix;

@end

@implementation OAIDefaultConfiguration

#pragma mark - Singleton Methods

+ (instancetype) sharedConfig {
    static OAIDefaultConfiguration *shardConfig = nil;
    static dispatch_once_t onceToken;
    dispatch_once(&onceToken, ^{
        shardConfig = [[self alloc] init];
    });
    return shardConfig;
}

#pragma mark - Initialize Methods

- (instancetype) init {
    self = [super init];
    if (self) {
        _host = @"https://download.microsoft.com/download/7/1/D/71D86715-5596-4529-9B13-DA13A5DE5B63";
        _username = @"";
        _password = @"";
        _accessToken= @"";
        _verifySSL = YES;
        _mutableApiKey = [NSMutableDictionary dictionary];
        _mutableApiKeyPrefix = [NSMutableDictionary dictionary];
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
        
        _logger = [OAILogger sharedLogger];
    }
    return self;
}

#pragma mark - Instance Methods

- (NSString *) getApiKeyWithPrefix:(NSString *)key {
    NSString *prefix = self.apiKeyPrefix[key];
    NSString *apiKey = self.apiKey[key];
    if (prefix && apiKey != (id)[NSNull null] && apiKey.length > 0) { // both api key prefix and api key are set
        return [NSString stringWithFormat:@"%@ %@", prefix, apiKey];
    }
    else if (apiKey != (id)[NSNull null] && apiKey.length > 0) { // only api key, no api key prefix
        return [NSString stringWithFormat:@"%@", self.apiKey[key]];
    }
    else { // return empty string if nothing is set
        return @"";
    }
}

- (NSString *) getBasicAuthToken {

    NSString *basicAuthToken = [OAIBasicAuthTokenProvider createBasicAuthTokenWithUsername:self.username password:self.password];
    return basicAuthToken;
}

- (NSString *) getAccessToken {
    if (self.accessToken.length == 0) { // token not set, return empty string
        return @"";
    } else {
        return [NSString stringWithFormat:@"Bearer %@", self.accessToken];
    }
}

#pragma mark - Setter Methods

- (void) setApiKey:(NSString *)apiKey forApiKeyIdentifier:(NSString *)identifier {
    [self.mutableApiKey setValue:apiKey forKey:identifier];
}

- (void) removeApiKey:(NSString *)identifier {
    [self.mutableApiKey removeObjectForKey:identifier];
}

- (void) setApiKeyPrefix:(NSString *)prefix forApiKeyPrefixIdentifier:(NSString *)identifier {
    [self.mutableApiKeyPrefix setValue:prefix forKey:identifier];
}

- (void) removeApiKeyPrefix:(NSString *)identifier {
    [self.mutableApiKeyPrefix removeObjectForKey:identifier];
}

#pragma mark - Getter Methods

- (NSDictionary *) apiKey {
    return [NSDictionary dictionaryWithDictionary:self.mutableApiKey];
}

- (NSDictionary *) apiKeyPrefix {
    return [NSDictionary dictionaryWithDictionary:self.mutableApiKeyPrefix];
}

#pragma mark -

- (NSDictionary *) authSettings {
    return @{
               };
}

-(BOOL)debug {
    return self.logger.isEnabled;
}

-(void)setDebug:(BOOL)debug {
    self.logger.enabled = debug;
}

- (void)setDefaultHeaderValue:(NSString *)value forKey:(NSString *)key {
    if(!value) {
        [self.mutableDefaultHeaders removeObjectForKey:key];
        return;
    }
    self.mutableDefaultHeaders[key] = value;
}

-(void) removeDefaultHeaderForKey:(NSString*)key {
    [self.mutableDefaultHeaders removeObjectForKey:key];
}

- (NSString *)defaultHeaderForKey:(NSString *)key {
    return self.mutableDefaultHeaders[key];
}

- (NSDictionary *)defaultHeaders {
    return [self.mutableDefaultHeaders copy];
}

@end
