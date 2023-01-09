package bitwise_operator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicNumberTest {
    @Test
    void magicNumber() {
        assertEquals(150, MagicNumber.magicNumber(6));
        assertEquals(5, MagicNumber.magicNumber(1));
        assertEquals(30, MagicNumber.magicNumber(3));
        assertEquals(130, MagicNumber.magicNumber(5));
        assertEquals(0, MagicNumber.magicNumber(-3));
    }

}