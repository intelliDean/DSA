package custom_linkedlist.circular_linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularLinkedListTest {
    CircularLinkedList cll;

    @BeforeEach
    void setUp() {
        cll = new CircularLinkedList();
    }

    @Test
    void add() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        assertArrayEquals(new Object[]{54, 90, 23, 65}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void insert() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        cll.insert(1, 800);

        assertArrayEquals(new Object[]{54, 800, 90, 23, 65}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void get() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        assertEquals(23, cll.get(2));
    }

    @Test
    void findNodeByIndex() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        Node node = cll.findByIndex(1);

        assertEquals(90, node.getValue());
    }

    @Test
    void fineNodeByNodeValue() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        Node node = cll.findByValue(65);

        assertEquals(65, node.getValue());
    }

    @Test
    void deleteFirstNodeWithOnlyOneNode() {
        cll.add(54);

        cll.deleteFirst();

        assertArrayEquals(new Object[]{}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void deleteFirstNode() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        cll.deleteFirst();

        assertArrayEquals(new Object[]{90, 23, 65}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void deleteLastWithOneNode() {
        cll.add(54);

        cll.deleteLast();

        assertArrayEquals(new Object[]{}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void deleteLastNode() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        cll.deleteLast();

        assertArrayEquals(new Object[]{54, 90, 23}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void delete() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        int del = cll.deleteByValue(90);
        System.out.println(del);

        assertArrayEquals(new Object[]{54, 23, 65}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void deleteByIndex() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        int del = cll.deleteByIndex(2);
        System.out.println(del);

        assertArrayEquals(new Object[]{54, 90, 65}, cll.getAll().toArray(new Object[0]));
    }

    @Test
    void replaceWith() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        cll.replaceWith(90, 430);

        assertArrayEquals(new Object[]{54, 430, 23, 65}, cll.getAll().toArray(new Object[0]));
    }
    @Test
    void findIndexByValue() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        assertEquals(2, cll.findIndex(23));

        assertArrayEquals(new Object[]{54, 90, 23, 65}, cll.getAll().toArray(new Object[0]));
    }
    @Test
    void isContain() {
        cll.add(54);
        cll.add(90);
        cll.add(23);
        cll.add(65);

        assertTrue(cll.isContain(90));
        assertFalse(cll.isContain(200));
    }

}