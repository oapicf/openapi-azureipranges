//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'value_properties.g.dart';

/// ValueProperties
///
/// Properties:
/// * [changeNumber] - The number associated with the change.
/// * [region] - The region associated with the value.
/// * [regionId] - The ID of the region.
/// * [platform] - The platform associated with the value.
/// * [systemService] - The system service associated with the value.
/// * [addressPrefixes] - The address prefixes associated with the value.
/// * [networkFeatures] - The network features associated with the value.
@BuiltValue()
abstract class ValueProperties implements Built<ValueProperties, ValuePropertiesBuilder> {
  /// The number associated with the change.
  @BuiltValueField(wireName: r'changeNumber')
  int? get changeNumber;

  /// The region associated with the value.
  @BuiltValueField(wireName: r'region')
  String? get region;

  /// The ID of the region.
  @BuiltValueField(wireName: r'regionId')
  int? get regionId;

  /// The platform associated with the value.
  @BuiltValueField(wireName: r'platform')
  String? get platform;

  /// The system service associated with the value.
  @BuiltValueField(wireName: r'systemService')
  String? get systemService;

  /// The address prefixes associated with the value.
  @BuiltValueField(wireName: r'addressPrefixes')
  BuiltList<String>? get addressPrefixes;

  /// The network features associated with the value.
  @BuiltValueField(wireName: r'networkFeatures')
  BuiltList<String>? get networkFeatures;

  ValueProperties._();

  factory ValueProperties([void updates(ValuePropertiesBuilder b)]) = _$ValueProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ValuePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ValueProperties> get serializer => _$ValuePropertiesSerializer();
}

class _$ValuePropertiesSerializer implements PrimitiveSerializer<ValueProperties> {
  @override
  final Iterable<Type> types = const [ValueProperties, _$ValueProperties];

  @override
  final String wireName = r'ValueProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ValueProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.changeNumber != null) {
      yield r'changeNumber';
      yield serializers.serialize(
        object.changeNumber,
        specifiedType: const FullType(int),
      );
    }
    if (object.region != null) {
      yield r'region';
      yield serializers.serialize(
        object.region,
        specifiedType: const FullType(String),
      );
    }
    if (object.regionId != null) {
      yield r'regionId';
      yield serializers.serialize(
        object.regionId,
        specifiedType: const FullType(int),
      );
    }
    if (object.platform != null) {
      yield r'platform';
      yield serializers.serialize(
        object.platform,
        specifiedType: const FullType(String),
      );
    }
    if (object.systemService != null) {
      yield r'systemService';
      yield serializers.serialize(
        object.systemService,
        specifiedType: const FullType(String),
      );
    }
    if (object.addressPrefixes != null) {
      yield r'addressPrefixes';
      yield serializers.serialize(
        object.addressPrefixes,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.networkFeatures != null) {
      yield r'networkFeatures';
      yield serializers.serialize(
        object.networkFeatures,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ValueProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ValuePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'changeNumber':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.changeNumber = valueDes;
          break;
        case r'region':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.region = valueDes;
          break;
        case r'regionId':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.regionId = valueDes;
          break;
        case r'platform':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.platform = valueDes;
          break;
        case r'systemService':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.systemService = valueDes;
          break;
        case r'addressPrefixes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.addressPrefixes.replace(valueDes);
          break;
        case r'networkFeatures':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.networkFeatures.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ValueProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ValuePropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

