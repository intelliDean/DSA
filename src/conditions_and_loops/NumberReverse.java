package conditions_and_loops;

public class NumberReverse {
    public static int numberReverse(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int rem = number % 10;
            reversedNumber = reversedNumber * 10 + rem;
            number /= 10;
        }

        return reversedNumber;
    }
}