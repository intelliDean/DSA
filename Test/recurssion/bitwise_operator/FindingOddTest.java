package recurssion.bitwise_operator;

import bitwise_operator.FindingOdd;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindingOddTest {
    @Test
    void idOdd(){
        assertTrue(FindingOdd.isOdd(7));
    }
    @Test
    void isEven() {
        assertFalse(FindingOdd.isOdd(6));
    }
}