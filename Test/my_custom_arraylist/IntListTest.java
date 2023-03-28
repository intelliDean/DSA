package my_custom_arraylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntListTest {
    IntList list;

    @BeforeEach
    void setUp() {
        list = new IntList();
    }
    @Test
    void addAnItem() {
        list.addItem(43);
        assertEquals(43, list.get(0));
    }
    @Test
    void addItems() {
        list.addItem(78);
        list.addItem(32);
        list.addItem(43);
        list.addItem(29);
        list.addItem(78);
        list.addItem(32);
        list.addItem(43);
        list.addItem(29);
        list.addItem(78);
        list.addItem(32);
        list.addItem(43);
        list.addItem(29);
        assertArrayEquals(new int[] {78, 32, 43, 29, 78, 32, 43, 29, 78, 32, 43, 29}, list.getAll());

    }
    @Test
    void canAddMultipleItemsToTheListConstructor() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32);
        assertArrayEquals(new int[] {23, 43, 56, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32}, newList.getAll());
    }
    @Test
    void insertAndShift() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 32);
        newList.insert(1, 120);
        assertEquals(120, newList.get(1));
        assertArrayEquals(new int[] {23, 120, 43, 56, 78, 23, 32}, newList.getAll());
    }
    @Test
    void insertBeyondDefaultSize() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32);
        newList.insert(3, 100);
        assertEquals(100, newList.get(3));
        assertArrayEquals(new int[] {23, 43, 56, 100, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32}, newList.getAll());
    }
    @Test
    void removeByIndex() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 32);
        newList.remove(4);
        assertArrayEquals(new int[]{23, 43, 56, 78, 32}, newList.getAll());
        newList.addItem(190);
        assertArrayEquals(new int[]{23, 43, 56, 78, 32, 190}, newList.getAll());
    }
     @Test
    void removeByObject() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 32);
        newList.remove(78);
        assertArrayEquals(new int[]{23, 43, 56, 23, 32}, newList.getAll());
        newList.addItem(190);
        assertArrayEquals(new int[]{23, 43, 56, 23, 32, 190}, newList.getAll());
    }
    @Test
    void deleteAll() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32);
        newList.insert(3, 100);
        assertEquals(100, newList.get(3));
        assertArrayEquals(new int[] {23, 43, 56, 100, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32}, newList.getAll());
        newList.remove(6);
        assertArrayEquals(new int[] {23, 43, 56, 100, 78, 23, 65, 34, 65, 34, 89, 90, 32}, newList.getAll());
        newList.removeAll();
        assertArrayEquals(new int[]{}, newList.getAll());
    }
    @Test
    void sizeOfList() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32);
        assertEquals(13, newList.size());
    }
    @Test
    void sort() {
        IntList newList = new IntList(23, 43, 56, 78, 23, 90, 65, 34, 65, 34, 89, 90, 32);
        assertEquals(13, newList.size());
        newList.sort();
        assertArrayEquals(new int[] {23, 23, 32, 34, 34, 43, 56, 65, 65, 78, 89, 90, 90}, newList.getAll());
    }
    @Test
    void addOtherArrays() {
        list.addItem(34);
        list.addItem(54);
        list.addItem(67);
        list.addItem(3);
        assertArrayEquals(new int[]{34, 54, 67, 3}, list.getAll());
        int[] otherArrays = {4,5,6,7,8,5,6,4,5,3,4,5,7,5};
        list.addAll(otherArrays);
        assertArrayEquals(new int[]{34, 54, 67, 3, 4,5,6,7,8,5,6,4,5,3,4,5,7,5}, list.getAll());
    }
    @Test
    void combinationOfAllMethods() {
        list.addItem(65);
        list.remove(0);
        assertArrayEquals(new int[]{}, list.getAll());
        list.addItem(34);
        list.addItem(90);
        assertEquals(90, list.get(1));
        list.insert(2, 90);
        assertArrayEquals(new int[]{34,90,90}, list.getAll());
        int[] n = {4,5,6,7,8};
        list.addAll(n);
        assertArrayEquals(new int[]{34,90,90,4,5,6,7,8}, list.getAll());
        list.remove(34);
        assertArrayEquals(new int[]{90,90,4,5,6,7,8}, list.getAll());
        list.remove(5);
        assertArrayEquals(new int[]{90,90,4,5,6,8}, list.getAll());
        list.sort();
        assertArrayEquals(new int[]{4,5,6,8,90,90}, list.getAll());
        list.removeAll();
        assertArrayEquals(new int[]{}, list.getAll());


    }
}