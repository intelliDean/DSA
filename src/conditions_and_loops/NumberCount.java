package conditions_and_loops;

public class NumberCount {
    public static void main(String[] args) {

    }

    public static int numberCount(long number, int target) {
        int count = 0;
        while (number > 0) {
            long rem = number % 10;
            if (rem == target) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}
