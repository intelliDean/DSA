package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {
    @Test
    void binaryNumber() {
        assertEquals(String.valueOf(1010), BinaryNumber.binaryNumber(10));
    }
}