package arrays;

import java.util.Arrays;

public class MultiDArrays {
    public static void main(String[] args) {
        int[][] arrays = {
                {1,2,3},
                {4,5},
                {7,8,9}
        };

        multiArrays(arrays);
        System.out.println();
        multiToString(arrays);
    }

    public static void multiArrays(int[][] arrays) {
        System.out.println("print each element");
        for (int[] array : arrays) {
            for (int arr : array) {
                System.out.print(arr+"  ");
            }
            System.out.println();
        }
    }
    public static void multiToString(int[][] arrays) {
        System.out.println("print each row");
        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }
    }
}
