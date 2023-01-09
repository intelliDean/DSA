package conditions_and_loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {
    @Test
    void fibonacci() {
        assertEquals(21, FibonacciNumber.fibonacci(8));
    }

}