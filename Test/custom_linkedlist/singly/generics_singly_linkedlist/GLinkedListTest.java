package custom_linkedlist.singly.generics_singly_linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GLinkedListTest {

    GLinkedList<Integer> gList;

    @BeforeEach
    void  setUp() {
        gList = new GLinkedList<>();
    }

//    @Test
//    void testThatNodeExistInGLinkedList() {
//        assertNotNull(gList.getObject());
//    }


    @Test
    void appendToList() {
        gList.append(4);
        assertEquals(1, gList.getSize());
        assertEquals(4, gList.getObject());
    }

}