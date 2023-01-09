package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueNumberTest {

    @Test
    void uniqueNumber() {
        assertEquals(8, UniqueNumber.uniqueNumber(new int[] {2, 8, 3, 7, 2, 7, 3}));
    }
}