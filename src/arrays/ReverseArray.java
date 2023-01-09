package arrays;
import static arrays.SwapArray.swap;
public class ReverseArray {

    public static int[] reverse(int[] arrays) {
        int start = 0;
        int end = arrays.length - 1;
        for (int i = 0; i < arrays.length / 2; i++) {
            swap(arrays, start, end);
            start++;
            end --;
        }
        return arrays;
    }
}
