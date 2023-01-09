package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapArrayTest {
    @Test
    void swapArrayElements() {
        assertArrayEquals(new int[]{1,4,3,2,5}, SwapArray.swap(new int[]{1,2,3,4,5}, 1, 3));
    }

}