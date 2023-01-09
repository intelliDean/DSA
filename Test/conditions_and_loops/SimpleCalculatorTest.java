package conditions_and_loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, SimpleCalculator.simpleCalculator('+', 2,3));
    }
    @Test
    void testSubtraction() {
        assertEquals(5, SimpleCalculator.simpleCalculator('-', 13,8));
    }
    @Test
    void testMultiplication() {
        assertEquals(21, SimpleCalculator.simpleCalculator('*', 7,3));
    }
    @Test
    void testDivision() {
        assertEquals(3, SimpleCalculator.simpleCalculator('/', 15,5));
    }
    @Test
    void testModulo() {
        assertEquals(2, SimpleCalculator.simpleCalculator('%', 8,3));
    }

}