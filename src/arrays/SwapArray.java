package arrays;

public class SwapArray {

    public static int[] swap(int[] arrays, int index1, int index2) {
        int temp = arrays[index1];
        arrays[index1] = arrays[index2];
        arrays[index2] = temp;

        return arrays;

    }
}
