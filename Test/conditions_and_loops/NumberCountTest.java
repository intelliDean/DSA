package conditions_and_loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCountTest {
    @Test
    void numberCount() {
        assertEquals(3, NumberCount.numberCount(243242, 2));
        assertEquals(0, NumberCount.numberCount(243242, 1));
        assertEquals(1, NumberCount.numberCount(243202, 0));
        assertEquals(2, NumberCount.numberCount(243242, 4));
    }
}