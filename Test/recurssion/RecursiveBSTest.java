package recurssion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecursiveBSTest {
    @Test
    void recursiveBS() {
        int[] a = {23, 35, 45, 67, 78, 99};
        int s = 0;
        int e = a.length - 1;
        assertEquals(3, RecursiveBS.recursiveBS(a, 67, s, e));
        assertEquals(0, RecursiveBS.recursiveBS(a, 23, s, e));
        assertEquals(5, RecursiveBS.recursiveBS(a, 99, s, e));
        assertEquals(-1, RecursiveBS.recursiveBS(a, 120, s, e));


    }

}