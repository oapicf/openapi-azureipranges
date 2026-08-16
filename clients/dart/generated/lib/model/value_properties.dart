//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ValueProperties {
  /// Returns a new [ValueProperties] instance.
  ValueProperties({
    this.changeNumber,
    this.region,
    this.regionId,
    this.platform,
    this.systemService,
    this.addressPrefixes = const [],
    this.networkFeatures = const [],
  });

  /// The number associated with the change.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? changeNumber;

  /// The region associated with the value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? region;

  /// The ID of the region.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? regionId;

  /// The platform associated with the value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? platform;

  /// The system service associated with the value.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? systemService;

  /// The address prefixes associated with the value.
  List<String> addressPrefixes;

  /// The network features associated with the value.
  List<String> networkFeatures;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ValueProperties &&
    other.changeNumber == changeNumber &&
    other.region == region &&
    other.regionId == regionId &&
    other.platform == platform &&
    other.systemService == systemService &&
    _deepEquality.equals(other.addressPrefixes, addressPrefixes) &&
    _deepEquality.equals(other.networkFeatures, networkFeatures);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (changeNumber == null ? 0 : changeNumber!.hashCode) +
    (region == null ? 0 : region!.hashCode) +
    (regionId == null ? 0 : regionId!.hashCode) +
    (platform == null ? 0 : platform!.hashCode) +
    (systemService == null ? 0 : systemService!.hashCode) +
    (addressPrefixes.hashCode) +
    (networkFeatures.hashCode);

  @override
  String toString() => 'ValueProperties[changeNumber=$changeNumber, region=$region, regionId=$regionId, platform=$platform, systemService=$systemService, addressPrefixes=$addressPrefixes, networkFeatures=$networkFeatures]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.changeNumber != null) {
      json[r'changeNumber'] = this.changeNumber;
    } else {
      json[r'changeNumber'] = null;
    }
    if (this.region != null) {
      json[r'region'] = this.region;
    } else {
      json[r'region'] = null;
    }
    if (this.regionId != null) {
      json[r'regionId'] = this.regionId;
    } else {
      json[r'regionId'] = null;
    }
    if (this.platform != null) {
      json[r'platform'] = this.platform;
    } else {
      json[r'platform'] = null;
    }
    if (this.systemService != null) {
      json[r'systemService'] = this.systemService;
    } else {
      json[r'systemService'] = null;
    }
      json[r'addressPrefixes'] = this.addressPrefixes;
      json[r'networkFeatures'] = this.networkFeatures;
    return json;
  }

  /// Returns a new [ValueProperties] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ValueProperties? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ValueProperties[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ValueProperties[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ValueProperties(
        changeNumber: mapValueOfType<int>(json, r'changeNumber'),
        region: mapValueOfType<String>(json, r'region'),
        regionId: mapValueOfType<int>(json, r'regionId'),
        platform: mapValueOfType<String>(json, r'platform'),
        systemService: mapValueOfType<String>(json, r'systemService'),
        addressPrefixes: json[r'addressPrefixes'] is Iterable
            ? (json[r'addressPrefixes'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        networkFeatures: json[r'networkFeatures'] is Iterable
            ? (json[r'networkFeatures'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<ValueProperties> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ValueProperties>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ValueProperties.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ValueProperties> mapFromJson(dynamic json) {
    final map = <String, ValueProperties>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ValueProperties.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ValueProperties-objects as value to a dart map
  static Map<String, List<ValueProperties>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ValueProperties>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ValueProperties.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

