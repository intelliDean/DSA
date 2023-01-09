package conditions_and_loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaseCheckTest {
    @Test
    void caseCheckLowercase() {
        assertEquals("lowercase", CaseCheck.caseCheck("d"));
    }
    @Test
    void caseCheckUppercase() {
        assertEquals("UPPERCASE", CaseCheck.caseCheck("Z"));
    }
    @Test
    void caseCheckNotAlphabet() {
        assertEquals("not an alphabet", CaseCheck.caseCheck("3"));
    }

}