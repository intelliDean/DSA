package arrays;

public class MaxArray {

    public static int maxArray(int[] arrays) {
        int maxValue = arrays[0];
        for (int array : arrays) {
            if (array > maxValue) {
                maxValue = array;
            }
        }
        return maxValue;
    }

    public static int rangeMax(int[] arrays, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (arrays.length == 0) {
            return -1;
        }
        int maxValue = arrays[start];
        for (int i = start + 1; i <= end; i++) {
            if (arrays[i] > maxValue) {
                maxValue = arrays[i];
            }
        }
        return maxValue;
    }
}
