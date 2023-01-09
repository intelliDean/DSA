package maths_for_data_structure;

public class SievePrime {
    public static void main(String[] args) {
        int number = 40;
        boolean[] primes = new boolean[number + 1];

        sieve(number, primes );
    }
    public static void sieve(int number, boolean[] primes) {
        for (int i = 2; i * i <= number; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= number ; j += i) {
                    primes[j] =true;
                }
            }
        }
        for (int i = 2; i <= number ; i++) {
            if (!primes[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
