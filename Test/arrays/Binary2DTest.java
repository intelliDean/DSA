package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Binary2DTest {
    @Test
    void linear2D() {
        assertArrayEquals(new int[]{1, 3}, Binary2D.linear2D(new int[][]{{1,2,3,4}, {4,5,7,8,9},{10, 11}}, 8));
    }
    @Test
    void binary2D() {
        assertArrayEquals(new int[]{1, 2}, Binary2D.binary2D(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}, 6));
    }

}