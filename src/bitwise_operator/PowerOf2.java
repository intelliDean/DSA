package bitwise_operator;

public class PowerOf2 {
    public static boolean isPowerOf2(int number) {
        if (number == 0) return false;
        return (number & (number - 1)) == 0;
    }
}
