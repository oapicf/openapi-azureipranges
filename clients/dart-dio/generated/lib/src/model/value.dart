//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/value_properties.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'value.g.dart';

/// Value
///
/// Properties:
/// * [name] - The name of the value.
/// * [id] - The unique identifier of the value.
/// * [properties] 
@BuiltValue()
abstract class Value implements Built<Value, ValueBuilder> {
  /// The name of the value.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The unique identifier of the value.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'properties')
  ValueProperties? get properties;

  Value._();

  factory Value([void updates(ValueBuilder b)]) = _$Value;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ValueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Value> get serializer => _$ValueSerializer();
}

class _$ValueSerializer implements PrimitiveSerializer<Value> {
  @override
  final Iterable<Type> types = const [Value, _$Value];

  @override
  final String wireName = r'Value';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Value object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.properties != null) {
      yield r'properties';
      yield serializers.serialize(
        object.properties,
        specifiedType: const FullType(ValueProperties),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Value object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ValueBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'properties':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ValueProperties),
          ) as ValueProperties;
          result.properties.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Value deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ValueBuilder();
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

