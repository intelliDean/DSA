package bitwise_operator;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(magicNumber(1000));
    }
    public static long magicNumber(int nth) {
        if (nth < 1) {
            return 0;
        }
        int magic = 0;
        int base = 5;
        while (nth > 0) {
            int toGetLastBinary = nth & 1;
            nth >>= 1;
            magic = magic + toGetLastBinary * base;
            base *= 5;
        }
        return magic;
    }
}
