package recurssion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {
@Test
    void fibo(){
    assertEquals(13, FibonacciNumber.recursiveFibonacci(7));
    assertEquals(21, FibonacciNumber.recursiveFibonacci(8));
}
}