package functions_and_methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmstrongNumbersTest {
    @Test
    void armstrongNumber() {
        assertTrue(ArmstrongNumbers.isArmstrong(153));
    }
    @Test
    void notArmstrongNumber() {
        assertFalse(ArmstrongNumbers.isArmstrong(201));
    }

}