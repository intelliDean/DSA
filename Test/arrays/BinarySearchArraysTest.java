package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchArraysTest {
    @Test
    void binarySearch() {
        assertEquals(4, BinarySearchArrays.binary(new int[] {23, 54, 67, 78, 89, 90, 120}, 89));
    }
    @Test
    void unknownOrderBinary() {
        assertEquals(2, BinarySearchArrays.orderAgnosticBS(new int[] {52, 47, 32, 29, 12, 9}, 32));
        assertEquals(5, BinarySearchArrays.orderAgnosticBS(new int[] {23, 54, 67, 78, 89, 99, 120}, 99));
    }
    @Test
    void ceilingArray() {
        assertEquals(54, BinarySearchArrays.ceiling(new int[] {23, 54, 67, 78, 79, 99, 120}, 25));
        assertEquals(67, BinarySearchArrays.ceiling(new int[] {23, 54, 67, 78, 79, 99, 120}, 62));

    }
    @Test
    void floorArray() {
        assertEquals(23, BinarySearchArrays.floor(new int[] {23, 54, 67, 78, 79, 99, 120}, 25));
        assertEquals(54, BinarySearchArrays.floor(new int[] {23, 54, 67, 78, 79, 99, 120}, 62));

    }
    @Test
    void nextGreaterLetter() {
        assertEquals('f', BinarySearchArrays.nextGreatLetter(new char[] {'a', 'c', 'f', 'h','k'}, 'd'));
        assertEquals('a', BinarySearchArrays.nextGreatLetter(new char[] {'a', 'c', 'f', 'h','k'}, 'q'));
    }

}