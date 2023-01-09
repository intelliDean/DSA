package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneDimensionalQuestionsTest {
    @Test
    void linearSearch() {
        assertEquals(3, OneDimensionalQuestions.linearSearch(new int[]{3, 7, 9, 5, 8, 9, 4}, 5));
        assertEquals(4, OneDimensionalQuestions.linearSearch(new int[]{3, 5, 7, 9, 13, 15}, 13));
    }
    @Test
    void binarySearch() {
        assertEquals(4, OneDimensionalQuestions.binarySearch(new int[]{3, 5, 7, 9, 13, 15}, 13));
    }
    @Test
    void searchIndex() {
        assertEquals(34, OneDimensionalQuestions.searchIndex(new int[] {12, 54, 34, 89, 76}, 2));
        assertEquals(76, OneDimensionalQuestions.searchIndex(new int[] {12, 54, 34, 89, 76}, 4));
        assertEquals(Integer.MAX_VALUE, OneDimensionalQuestions.searchIndex(new int[] {12, 54, 74, 89, 76}, 6));
    }
    @Test
    void searchCharacterInAString() {
        assertTrue(OneDimensionalQuestions.searchString("Elephant", 'l'));
        assertFalse(OneDimensionalQuestions.searchString("Elephant", 'q'));
    }
    @Test
    void searchCharacterInAString2() {
        assertTrue(OneDimensionalQuestions.searchString2("Mandate", 'd'));
        assertFalse(OneDimensionalQuestions.searchString2("Mandate", 'r'));
    }
    @Test
    void searchRange() {
        assertTrue(OneDimensionalQuestions.searchRange(new int[] {2, 1, 4, 7, 8, 9, 7, 4}, 7, 1, 4));
        assertFalse(OneDimensionalQuestions.searchRange(new int[] {2, 1, 4, 7, 8, 9, 7, 4}, 17, 1, 4));
        assertFalse(OneDimensionalQuestions.searchRange(new int[] {}, 7, 1, 4));
    }

     @Test
    void evenNumber() {
        assertEquals(6, OneDimensionalQuestions.evenNumber(new int[] {2,3,4,3,4,5,46,43,5,8,4}));
        assertEquals(-1, OneDimensionalQuestions.evenNumber(new int[] {}));
        assertEquals(0, OneDimensionalQuestions.evenNumber(new int[] {5,3,7,9,13}));
    }
    @Test
    void evenDigits() {
        assertEquals(15, OneDimensionalQuestions.evenDigits(new int[] {12,23,74,123,544,655,46,43,65,48,24}));
    }
    @Test
    void numberOfDigits() {
        assertEquals(7, OneDimensionalQuestions.digits(2345356));
    }
    @Test
    void numberOfDigits2() {
        assertEquals(9, OneDimensionalQuestions.digits2(234895356));
    }
}