package maths_for_data_structure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {
    @Test
    void sqrt() {
        assertEquals(6.00, SquareRoot.sqrt(36, 3));
        assertEquals(6.3239999999999945, SquareRoot.sqrt(40, 3));

    }

}