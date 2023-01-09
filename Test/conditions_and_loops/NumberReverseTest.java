package conditions_and_loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberReverseTest {
    @Test
    void reverseNumber() {
        assertEquals(54321, NumberReverse.numberReverse(12345));
    }

}