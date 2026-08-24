//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/value.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'change.g.dart';

/// Change
///
/// Properties:
/// * [changeNumber] - The number associated with the change.
/// * [cloud] - The cloud environment.
/// * [values] 
@BuiltValue()
abstract class Change implements Built<Change, ChangeBuilder> {
  /// The number associated with the change.
  @BuiltValueField(wireName: r'changeNumber')
  int? get changeNumber;

  /// The cloud environment.
  @BuiltValueField(wireName: r'cloud')
  String? get cloud;

  @BuiltValueField(wireName: r'values')
  BuiltList<Value>? get values;

  Change._();

  factory Change([void updates(ChangeBuilder b)]) = _$Change;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ChangeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Change> get serializer => _$ChangeSerializer();
}

class _$ChangeSerializer implements PrimitiveSerializer<Change> {
  @override
  final Iterable<Type> types = const [Change, _$Change];

  @override
  final String wireName = r'Change';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Change object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.changeNumber != null) {
      yield r'changeNumber';
      yield serializers.serialize(
        object.changeNumber,
        specifiedType: const FullType(int),
      );
    }
    if (object.cloud != null) {
      yield r'cloud';
      yield serializers.serialize(
        object.cloud,
        specifiedType: const FullType(String),
      );
    }
    if (object.values != null) {
      yield r'values';
      yield serializers.serialize(
        object.values,
        specifiedType: const FullType(BuiltList, [FullType(Value)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Change object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ChangeBuilder result,
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
        case r'cloud':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.cloud = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Value)]),
          ) as BuiltList<Value>?;
          if (valueDes == null) continue;
          result.values.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Change deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ChangeBuilder();
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

