import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Change,  } from '../models';


@Injectable()
export abstract class DefaultApi {

  abstract getAzureIpRangesServiceTagsPublicCloud(version: string,  request: Request): Change | Promise<Change> | Observable<Change>;

} 