package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetBitsTest {
    @Test
    void setBits() {
        assertEquals(2, SetBits.setBits(10));
    }
    @Test
    void setBits2() {
        assertEquals(3, SetBits.setBits2(7));
    }

}