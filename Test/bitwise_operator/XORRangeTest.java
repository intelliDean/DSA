package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XORRangeTest {
    @Test
    void xor() {
        assertEquals(2, XORRange.xorRange(3, 9));
    }
}