package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxArrayTest {
    @Test
    void findMaxElement() {
        assertEquals(23, MaxArray.maxArray(new int[] {12, 18, 23, 5, 14}));
    }
    @Test
    void findMaxValueInARange() {
        assertEquals(23, MaxArray.rangeMax(new int[]{23, 45, 64, 18, 23, 5, 89}, 3, 5));
        assertEquals(-3, MaxArray.rangeMax(new int[]{23, 45, 64, 0, -3, -34, 89}, 4, 5));
        assertEquals(89, MaxArray.rangeMax(new int[]{23, 45, 64, 18, 23, 5, 89}, 2, 6));
        assertEquals(-1, MaxArray.rangeMax(new int[]{23, 45, 64, 18, 23, 5, 89}, 9, 5));
    }
}