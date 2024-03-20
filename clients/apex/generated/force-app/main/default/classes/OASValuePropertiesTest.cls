@isTest
private class OASValuePropertiesTest {
    @isTest
    private static void equalsSameInstance() {
        OASValueProperties valueProperties1 = OASValueProperties.getExample();
        OASValueProperties valueProperties2 = valueProperties1;
        OASValueProperties valueProperties3 = new OASValueProperties();
        OASValueProperties valueProperties4 = valueProperties3;

        System.assert(valueProperties1.equals(valueProperties2));
        System.assert(valueProperties2.equals(valueProperties1));
        System.assert(valueProperties1.equals(valueProperties1));
        System.assert(valueProperties3.equals(valueProperties4));
        System.assert(valueProperties4.equals(valueProperties3));
        System.assert(valueProperties3.equals(valueProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASValueProperties valueProperties1 = OASValueProperties.getExample();
        OASValueProperties valueProperties2 = OASValueProperties.getExample();
        OASValueProperties valueProperties3 = new OASValueProperties();
        OASValueProperties valueProperties4 = new OASValueProperties();

        System.assert(valueProperties1.equals(valueProperties2));
        System.assert(valueProperties2.equals(valueProperties1));
        System.assert(valueProperties3.equals(valueProperties4));
        System.assert(valueProperties4.equals(valueProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASValueProperties valueProperties1 = OASValueProperties.getExample();
        OASValueProperties valueProperties2 = new OASValueProperties();

        System.assertEquals(false, valueProperties1.equals('foo'));
        System.assertEquals(false, valueProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASValueProperties valueProperties1 = OASValueProperties.getExample();
        OASValueProperties valueProperties2 = new OASValueProperties();
        OASValueProperties valueProperties3;

        System.assertEquals(false, valueProperties1.equals(valueProperties3));
        System.assertEquals(false, valueProperties2.equals(valueProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASValueProperties valueProperties1 = OASValueProperties.getExample();
        OASValueProperties valueProperties2 = new OASValueProperties();

        System.assertEquals(valueProperties1.hashCode(), valueProperties1.hashCode());
        System.assertEquals(valueProperties2.hashCode(), valueProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASValueProperties valueProperties1 = OASValueProperties.getExample();
        OASValueProperties valueProperties2 = OASValueProperties.getExample();
        OASValueProperties valueProperties3 = new OASValueProperties();
        OASValueProperties valueProperties4 = new OASValueProperties();

        System.assert(valueProperties1.equals(valueProperties2));
        System.assert(valueProperties3.equals(valueProperties4));
        System.assertEquals(valueProperties1.hashCode(), valueProperties2.hashCode());
        System.assertEquals(valueProperties3.hashCode(), valueProperties4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASValueProperties valueProperties = new OASValueProperties();
        System.assertEquals(new List<String>(), valueProperties.addressPrefixes);
        System.assertEquals(new List<String>(), valueProperties.networkFeatures);
        System.assertEquals(null, valueProperties.changeNumber);
        System.assertEquals(null, valueProperties.region);
        System.assertEquals(null, valueProperties.regionId);
        System.assertEquals(null, valueProperties.platform);
        System.assertEquals(null, valueProperties.systemService);
    }
}
