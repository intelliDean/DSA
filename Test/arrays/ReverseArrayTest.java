package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {
    @Test
    void reverseArray() {
        assertArrayEquals(new int[]{5,4,3,2,1}, ReverseArray.reverse(new int[]{1,2,3,4,5}));
        assertArrayEquals(new int[]{54, 1, 76, 45, 23}, ReverseArray.reverse(new int[]{23, 45, 76, 1, 54}));
        assertArrayEquals(new int[]{6, 1, 6, 4}, ReverseArray.reverse(new int[]{4, 6, 1, 6}));

    }

}