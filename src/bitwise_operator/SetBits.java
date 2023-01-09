package bitwise_operator;

public class SetBits {

    public static int setBits(int number) {
        int count = 0;
        while (number > 0) {
            number = number - (number & -number);
            count++;
        }
        return count;
    }
    public static int setBits2(int number) {
        int count = 0;
        while (number > 0) {
            number = number & (number - 1);
            count++;
        }
        return count;
    }
}
