package bitwise_operator;

public class FindingOdd {
    public static boolean isOdd(int number) {
        return (number & 1) == 1;
    }
}
