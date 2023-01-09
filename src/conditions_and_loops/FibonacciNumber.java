package conditions_and_loops;

public class FibonacciNumber {
    public static void main(String[] args) {

    }
    public static int fibonacci(int nthPlace) {
        int a = 0;
        int b = 1;
        int temp;
        int total = 0;
        for (int i = 2 ; i <= nthPlace; i++) {
            temp = b;
            b = a + b;
            a = temp;

        }
        return b;
    }
}
