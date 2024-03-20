@isTest
private class OASValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASValue value1 = OASValue.getExample();
        OASValue value2 = value1;
        OASValue value3 = new OASValue();
        OASValue value4 = value3;

        System.assert(value1.equals(value2));
        System.assert(value2.equals(value1));
        System.assert(value1.equals(value1));
        System.assert(value3.equals(value4));
        System.assert(value4.equals(value3));
        System.assert(value3.equals(value3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASValue value1 = OASValue.getExample();
        OASValue value2 = OASValue.getExample();
        OASValue value3 = new OASValue();
        OASValue value4 = new OASValue();

        System.assert(value1.equals(value2));
        System.assert(value2.equals(value1));
        System.assert(value3.equals(value4));
        System.assert(value4.equals(value3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASValue value1 = OASValue.getExample();
        OASValue value2 = new OASValue();

        System.assertEquals(false, value1.equals('foo'));
        System.assertEquals(false, value2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASValue value1 = OASValue.getExample();
        OASValue value2 = new OASValue();
        OASValue value3;

        System.assertEquals(false, value1.equals(value3));
        System.assertEquals(false, value2.equals(value3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASValue value1 = OASValue.getExample();
        OASValue value2 = new OASValue();

        System.assertEquals(value1.hashCode(), value1.hashCode());
        System.assertEquals(value2.hashCode(), value2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASValue value1 = OASValue.getExample();
        OASValue value2 = OASValue.getExample();
        OASValue value3 = new OASValue();
        OASValue value4 = new OASValue();

        System.assert(value1.equals(value2));
        System.assert(value3.equals(value4));
        System.assertEquals(value1.hashCode(), value2.hashCode());
        System.assertEquals(value3.hashCode(), value4.hashCode());
    }
}
