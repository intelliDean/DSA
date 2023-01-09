package custom_linkedlist.doubly_linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DoublyLinkedListTest {
    DoublyLinkedList dll;

    @BeforeEach
    void setUp() {
        dll = new DoublyLinkedList();
    }

    @Test
    void prepend() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        assertArrayEquals(new Object[]{98, 89, 23}, dll.getAll().toArray(new Object[0]));
    }

    @Test
    void append() {
        dll.append(89);
        dll.append(67);
        dll.append(12);

        assertArrayEquals(new Object[]{89, 67, 12}, dll.getAll().toArray(new Object[0]));
    }

    @Test
    void prependAndAppend() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        assertArrayEquals(new Object[]{98, 89, 23, 89, 67, 12}, dll.getAll().toArray(new Object[0]));
    }

    @Test
    void insert() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        dll.insert(89, 63);
        assertArrayEquals(new Object[]{98, 89, 63, 23, 89, 67, 12}, dll.getAll().toArray(new Object[0]));
    }

    @Test
    void findByValue() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        Node node = dll.findByValue(98);
        assertEquals(98, node.getValue());
    }

    @Test
    void get() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        assertEquals(89, dll.get(3));
    }

    @Test
    void findByIndex() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        Node node = dll.findByIndex(4);
        assertEquals(67, node.getValue());
    }
    @Test
    void deleteFirst(){
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        int value = dll.deleteFirst();

        assertArrayEquals(new Object[]{89, 23, 89, 67, 12}, dll.getAll().toArray(new Object[0]));
    }

    @Test
    void deleteLast() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        int value = dll.deleteLast();

        assertArrayEquals(new Object[]{98, 89, 23, 89, 67}, dll.getAll().toArray(new Object[0]));
    }

    @Test
    void delete() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        dll.delete(3);

        assertArrayEquals(new Object[]{98, 89, 23, 67, 12}, dll.getAll().toArray(new Object[0]));
    }
    @Test
    void replaceWith() {
        dll.prepend(23);
        dll.prepend(89);
        dll.prepend(98);

        dll.append(89);
        dll.append(67);
        dll.append(12);

        dll.replyWith(2, 70);

        assertArrayEquals(new Object[]{98, 89, 70, 89, 67, 12}, dll.getAll().toArray(new Object[0]));
    }
}