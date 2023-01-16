package maths_for_data_structure;

public class PrimeCheck {
    public static void main(String[] args) {
        int number = 59;
        primeCheck(number);

    }
    public static void primeCheck(int number) {
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
