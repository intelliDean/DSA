package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlipAndReverseImageTest {
    @Test
    void flipAndReverseImage() {
        assertArrayEquals(new int[][]{{0,1,0},{0,1,1},{0,0,0}}, FlipAndReverseImage.flipAndReverse(new int[][]{{1,0,1},{0,0,1},{1,1,1}}));
    }

}