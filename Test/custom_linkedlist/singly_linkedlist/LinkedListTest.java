package custom_linkedlist.singly_linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    LinkedList ll;

    @BeforeEach
    void setUp() {
        ll = new LinkedList();
    }

    @Test
    void prepend() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);

        assertArrayEquals(new Object[]{90, 43, 23}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void append() {
        ll.append(23);
        ll.append(43);
        ll.append(90);
        assertArrayEquals(new Object[]{23, 43, 90}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void prependAndAppend() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        assertArrayEquals(new Object[]{90, 43, 23, 33, 43, 10}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void insert() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        ll.insert(670, 2);
        assertArrayEquals(new Object[]{90, 43, 670, 23, 33, 43, 10}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void insertInAnEmptyList() {
        ll.insert(670, 0);
        assertArrayEquals(new Object[]{670}, ll.getAll().toArray(new Object[0]));
    }
    @Test
    void insertUsingRecursion() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        ll.insertRec(490, 4);

        assertArrayEquals(new Object[]{90, 43, 23, 33, 490, 43, 10}, ll.getAll().toArray(new Object[0]));

    }

    @Test
    void get() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        assertEquals(23, ll.get(2));
    }

    @Test
    void findByValue() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        Node node = ll.findByValue(33);
        assertNotNull(node);
        assertEquals(33, node.getValue());
    }

    @Test
    void deleteFirst() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        ll.deleteFirst();

        assertArrayEquals(new Object[]{43, 23, 33, 43, 10}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void deleteLast() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        ll.deleteLast();

        assertArrayEquals(new Object[]{90, 43, 23, 33, 43}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void delete() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        int val = ll.delete(2);

        assertArrayEquals(new Object[]{90, 43, 33, 43, 10}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void findByIndex() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        Node node = ll.findByIndex(2);
        assertNotNull(node);
        assertEquals(23, node.getValue());
    }

    @Test
    void testToString() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        ll.delete(2);

        assertEquals("[90, 43, 33, 43, 10]", ll.toString());
    }

    @Test
    void getAll() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        ll.deleteLast();

        assertArrayEquals(new Object[]{90, 43, 23, 33, 43}, ll.getAll().toArray(new Object[0]));
    }

    @Test
    void replaceWith() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        ll.replaceWith(2, 30);

       assertArrayEquals(new Object[]{90, 43, 30, 33, 43, 10}, ll.getAll().toArray(new Object[0]));
    }
    @Test
    void getIndex() {
        ll.prepend(23);
        ll.prepend(43);
        ll.prepend(90);
        ll.append(33);
        ll.append(43);
        ll.append(10);

        assertArrayEquals(new Object[]{90, 43, 23, 33, 43, 10}, ll.getAll().toArray(new Object[0]));

        assertEquals(2, ll.getIndexByNodeValue(23));


    }
}