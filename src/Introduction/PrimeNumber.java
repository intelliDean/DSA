package Introduction;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter number to check its prime");
        Scanner input = new Scanner(System.in);
        System.out.println(isPrime(input.nextInt()));




    }
    public static boolean isPrime(int number) {
        if (number <= 1) throw new IllegalArgumentException("1 is neither prime nor composite");
        int sqrtOfNumber = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrtOfNumber; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
