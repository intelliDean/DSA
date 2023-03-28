public class HappyNumber {
    public static void main(String[] args) {
        boolean result = isHappy(23);
        System.out.println(result);
    }
    public static boolean isHappy(int number) {
        while (number != 1 && number != 4) {
            number = happyNumber(number);
        }
        return number == 1;
    }
    private static int happyNumber(int number) {
        int rem, square, total = 0;
       while (number > 0) {
           rem = number % 10;
           square = rem * rem;
           total = square + total;
           number /= 10;
       }
       return total;
    }
}