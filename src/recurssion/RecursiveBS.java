package recurssion;

public class RecursiveBS {

    public static int recursiveBS(int[] arrays, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arrays[m] == target) {
            return m;
        }
        if (target < arrays[m]) {
            return recursiveBS(arrays, target, s, m - 1);
        }
        return recursiveBS(arrays, target, m + 1, e);
    }
}
