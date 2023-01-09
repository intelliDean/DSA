package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Multi2DQuestionsTest {
    @Test
    void linearSearchIn2D() {
        assertArrayEquals(new int[]{1, 3}, Multi2DQuestions.linearSearchIn2D(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, 8));
    }
    @Test
    void maxIn2DArray() {
        assertEquals(54,   Multi2DQuestions.maxim(new int[][]{{1, 2, 3, 4}, {5, 6, 54, 8}, {9, 10, 11, 12}}));
    }
    @Test
    void findMaxRowOfA2DArray() {
        assertEquals(19, Multi2DQuestions.max2DArray(new int[][]{{4,3,5}, {9,8,2},{1,2,3}}));
    }
}