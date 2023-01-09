package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
    @Test
    void powerOfANumber() {
        assertEquals(243, Power.powerOfANumber(3,5));
        assertEquals(8, Power.powerOfANumber(2,3));
    }
}