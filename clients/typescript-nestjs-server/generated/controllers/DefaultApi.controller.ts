import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { DefaultApi } from '../api';
import { Change,  } from '../models';

@Controller()
export class DefaultApiController {
  constructor(private readonly defaultApi: DefaultApi) {}

  @Get('/ServiceTags_Public_:version.json')
  getAzureIpRangesServiceTagsPublicCloud(@Param('version') version: string, @Req() request: Request): Change | Promise<Change> | Observable<Change> {
    return this.defaultApi.getAzureIpRangesServiceTagsPublicCloud(version, request);
  }

} 