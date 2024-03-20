import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { Change } from '../models/Change';
import { Value } from '../models/Value';
import { ValueProperties } from '../models/ValueProperties';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class ObservableDefaultApi {
    private requestFactory: DefaultApiRequestFactory;
    private responseProcessor: DefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     */
    public serviceTagsPublic20240318JsonGetWithHttpInfo(_options?: Configuration): Observable<HttpInfo<Change>> {
        const requestContextPromise = this.requestFactory.serviceTagsPublic20240318JsonGet(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.serviceTagsPublic20240318JsonGetWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     * Get Azure IP Ranges and Service Tags - Public Cloud
     */
    public serviceTagsPublic20240318JsonGet(_options?: Configuration): Observable<Change> {
        return this.serviceTagsPublic20240318JsonGetWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<Change>) => apiResponse.data));
    }

}