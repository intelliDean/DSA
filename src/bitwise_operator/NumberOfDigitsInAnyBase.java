package bitwise_operator;

public class NumberOfDigitsInAnyBase {
    public static int numberOfDigits(int number, int base) {
        return (int) (Math.log(number) / Math.log(base) + 1);
    }
}
