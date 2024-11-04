@isTest
private class OASDefaultApiTest {
    /**
     * Get Azure IP Ranges and Service Tags - Public Cloud
     *
     * Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
     */
    @isTest
    private static void getAzureIpRangesServiceTagsPublicCloudTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'version' => 'null'
        };

        OASClient client;
        OASDefaultApi api;
        OASChange response;
        OASChange expectedResponse;
        String js = '';

        api = new OASDefaultApi(new OASClient());

        js = JSON.serialize(OASChange.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASChange.getExample();
        response = (OASChange) api.getAzureIpRangesServiceTagsPublicCloud(params);
        System.assertEquals(expectedResponse, response);
    }
}