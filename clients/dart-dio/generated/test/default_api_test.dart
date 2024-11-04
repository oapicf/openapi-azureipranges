import 'package:test/test.dart';
import 'package:openapi/openapi.dart';


/// tests for DefaultApi
void main() {
  final instance = Openapi().getDefaultApi();

  group(DefaultApi, () {
    // Get Azure IP Ranges and Service Tags - Public Cloud
    //
    // Retrieve details about Azure IP Ranges and Service Tags - Public Cloud.
    //
    //Future<Change> getAzureIpRangesServiceTagsPublicCloud(String version) async
    test('test getAzureIpRangesServiceTagsPublicCloud', () async {
      // TODO
    });

  });
}
