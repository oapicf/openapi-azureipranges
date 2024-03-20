@isTest
private class OASChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASChange change1 = OASChange.getExample();
        OASChange change2 = change1;
        OASChange change3 = new OASChange();
        OASChange change4 = change3;

        System.assert(change1.equals(change2));
        System.assert(change2.equals(change1));
        System.assert(change1.equals(change1));
        System.assert(change3.equals(change4));
        System.assert(change4.equals(change3));
        System.assert(change3.equals(change3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASChange change1 = OASChange.getExample();
        OASChange change2 = OASChange.getExample();
        OASChange change3 = new OASChange();
        OASChange change4 = new OASChange();

        System.assert(change1.equals(change2));
        System.assert(change2.equals(change1));
        System.assert(change3.equals(change4));
        System.assert(change4.equals(change3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASChange change1 = OASChange.getExample();
        OASChange change2 = new OASChange();

        System.assertEquals(false, change1.equals('foo'));
        System.assertEquals(false, change2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASChange change1 = OASChange.getExample();
        OASChange change2 = new OASChange();
        OASChange change3;

        System.assertEquals(false, change1.equals(change3));
        System.assertEquals(false, change2.equals(change3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASChange change1 = OASChange.getExample();
        OASChange change2 = new OASChange();

        System.assertEquals(change1.hashCode(), change1.hashCode());
        System.assertEquals(change2.hashCode(), change2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASChange change1 = OASChange.getExample();
        OASChange change2 = OASChange.getExample();
        OASChange change3 = new OASChange();
        OASChange change4 = new OASChange();

        System.assert(change1.equals(change2));
        System.assert(change3.equals(change4));
        System.assertEquals(change1.hashCode(), change2.hashCode());
        System.assertEquals(change3.hashCode(), change4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASChange change = new OASChange();
        System.assertEquals(new List<OASValue>(), change.values);
        System.assertEquals(null, change.changeNumber);
        System.assertEquals(null, change.cloud);
    }
}
