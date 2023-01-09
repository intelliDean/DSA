package arrays;

public class Multi2DQuestions {
    public static int[] linearSearchIn2D(int[][] arrays, int target) {
        int[] newArray = new int[2];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int maxim(int[][] arrays) {
        int maxElement = arrays[0][0];
        for (int[] array : arrays) {
            for (int element : array) {
                if (element > maxElement) {
                    maxElement = element;
                }
            }
        }
        return maxElement;
    }



    private static boolean even(int number) {
        return number % 2 == 0;
    }

    public static int max2DArray(int[][] arrays) {
        int max = Integer.MIN_VALUE;
        for (int[] array : arrays) {
            int total = 0;
            for (int i : array) {
                total += i;
            }
            if (total > max) {
                max = total;
            }
        }
        return max;
    }
}
