package bitwise_operator;

public class UniqueNumber {
    public static int uniqueNumber(int[] arrays) {
        int isUnique = 0;
        for (int array : arrays) {
            isUnique = isUnique ^ array;
        }
        return isUnique;
    }
}
