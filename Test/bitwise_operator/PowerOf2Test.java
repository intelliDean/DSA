package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOf2Test {
    @Test
    void isPowerOf2() {
        assertTrue(PowerOf2.isPowerOf2(32));
        assertFalse(PowerOf2.isPowerOf2(9));
        assertFalse(PowerOf2.isPowerOf2(0));
    }
}