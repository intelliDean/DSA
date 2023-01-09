package bitwise_operator;

public class XORRange {

    public static int xorRange(int base, int peak) {
       return xor(peak) ^ xor(base - 1);
    }

    private static int xor(int number) {
        if (number % 4 == 0) {
            return  number;
        }
        if (number % 4 == 1) {
            return  1;
        }
        if (number % 4 == 2) {
            return  number + 1;
        }
        return 0;
    }
}
