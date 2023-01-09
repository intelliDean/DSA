import Introduction.PrimeNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
  @Test
    void checkPrimeNumber() {
      assertTrue(PrimeNumber.isPrime(7));

      assertFalse(PrimeNumber.isPrime(12));
    }

}