package arrays;

public class Binary2D {

    public static int[] linear2D(int[][] arrays, int target) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }


    public static int[] binary2D(int[][] arrays, int target) {
        int row = 0;
        int column = arrays.length - 1;
        while (row < arrays.length && column >= 0) {
            if (arrays[row][column] == target) {
                return new int[] {row, column};
            }
            if (arrays[row][column] < target) {
                row++;
            } else {
                column--;
            }
        }
        return new int[]{-1, -1};
    }
}
