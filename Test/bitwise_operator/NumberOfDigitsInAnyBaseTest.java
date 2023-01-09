package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDigitsInAnyBaseTest {
    @Test
    void numberOfDigitsInBase2() {
        assertEquals(4, NumberOfDigitsInAnyBase.numberOfDigits(10, 2));
    }
    @Test
    void numberOfDigitsInBase10() {
        assertEquals(5, NumberOfDigitsInAnyBase.numberOfDigits(54676, 10));
    }

}