package my_custom_arraylist;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DeansListTest {
    DeansList<Object> objList;
    DeansList<Integer> intList;
    DeansList<Double> doubleList;
    DeansList<Boolean> booList;
    DeansList<String> strList;
    DeansList<Number> numList;

    @BeforeEach
    void setUp() {
        objList = new DeansList<>();
        intList = new DeansList<>();
        doubleList = new DeansList<>();
        booList = new DeansList<>();
        numList = new DeansList<>();
    }

    //    @Test
//    void setUpConfirmation() {
//        assertArrayEquals(new Object[] {23, "Dean", 23.90}, list.getAll());
//        assertArrayEquals(new Integer[] {23, 98, 89}, intList.getAll());
//        assertArrayEquals(new Double[]{43.0, 89.90, 32.16}, doubleList.getAll());
//        assertArrayEquals(new Boolean[] {true, false, true}, booList.getAll());
//        assertArrayEquals(new Number[] {120, 9.18, -12.023}, numList.getAll());
//    }
    @Test
    void addItem() {
        intList.add(23);
        intList.add(900);
        assertEquals(2, intList.size());
        assertArrayEquals(new Object[]{23, 900}, intList.getAll());

        objList.add(23);
        objList.add(90.0);
        objList.add("fine boy");
        assertEquals(3, objList.size());
        assertArrayEquals(new Object[]{23, 90.0, "fine boy"}, objList.getAll());
    }

    @Test
    void getItem() {
        intList.add(23);
        intList.add(900);
        assertEquals(900, intList.get(1));


        objList.add(23);
        objList.add(90.0);
        objList.add("fine boy");
        assertEquals(23, objList.get(0));
    }

    @Test
    void addOtherLists() {
        intList.add(43);
        intList.add(90);
        assertEquals(2, intList.size());
        assertArrayEquals(new Integer[]{43, 90}, intList.getAll());

        Integer[] arr = {1, 2, 3, 4};
        intList.addAll(arr);

        assertEquals(6, intList.size());
        assertArrayEquals(new Integer[]{43, 90, 1, 2, 3, 4}, intList.getAll());
    }

    @Test
    void insert() {
        DeansList<String> strList = new DeansList<>("My", "Name", "Dean");
        assertEquals(3, strList.size());
        assertArrayEquals(new String[]{"My", "Name", "Dean"}, strList.getAll());

        strList.insert(2, "Is");
        assertEquals(4, strList.size());
        assertArrayEquals(new String[]{"My", "Name", "Is", "Dean"}, strList.getAll());
    }

    @Test
    void removeObjectByIndex() {
        objList.add("Welcome");
        objList.add(2);
        objList.add("Naija");
        assertEquals(3, objList.size());
        assertArrayEquals(new Object[]{"Welcome", 2, "Naija"}, objList.getAll());

        objList.removeByIndex(1);
        assertEquals(2, objList.size());
        assertArrayEquals(new Object[]{"Welcome", "Naija"}, objList.getAll());

        objList.insert(1, "to");
        assertArrayEquals(new Object[]{"Welcome", "to", "Naija"}, objList.getAll());
    }

    @Test
    void removeObjectByObjectValue() {
        intList.add(43);
        intList.add(90);
        intList.add(432);
        intList.removeByIndex(432);

        intList.removeByValue(432);
        assertArrayEquals(new Integer[]{43, 90}, intList.getAll());
    }

    @Test
    void initialiseListByConstructor() {
        DeansList<Object> newList = new DeansList<>("I", "Just", "Want", 2, "Give", "Thanks", 2, "God", 4.0, "Taking", "care", "of", "me.", "it's", true);
        assertArrayEquals(new Object[]{"I", "Just", "Want", 2, "Give", "Thanks", 2, "God", 4.0, "Taking", "care", "of", "me.", "it's", true}, newList.getAll());
    }

    @Test
    void insertBeyondDefaultSize() {
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        intList.add(11);
        intList.add(12);

        intList.insert(3, 100);
        assertEquals(100, intList.get(3));
        assertArrayEquals(new Integer[]{1, 2, 3, 100, 4, 5, 6, 7, 8, 9, 10, 11, 12}, intList.getAll());
    }

    @Test
    void removeAll() {
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(8);
        intList.add(9);
        intList.add(10);
        intList.add(11);
        intList.add(12);

        intList.removeAll();
        assertArrayEquals(new Integer[]{}, intList.getAll());

        intList.add(23);
        assertArrayEquals(new Integer[]{23}, intList.getAll());
    }
}