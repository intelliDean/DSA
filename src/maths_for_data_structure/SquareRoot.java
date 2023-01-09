package maths_for_data_structure;

public class SquareRoot {
    public static void main(String[] args) {

        double result = sqrt(40, 3);
        System.out.printf("%.3f", result);
    }

    public static double sqrt(int number, int p) {
        int start = 0;
        int end = number;

        double root = 0.0;

        while ( start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == number) {
                return mid; // perfect square root (also the same thing as the root)
            }
            if (mid * mid > number) {
                end  = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= number) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;
    }
}
