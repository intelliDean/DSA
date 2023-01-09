package recurssion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OptimisedFibonacciTest {
    @Test
    void testTheBestWayToFindFibonacciNumber() {
        assertEquals(21, OptimisedFibonacci.bestFibonacci(8));
    }

}