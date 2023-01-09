package arrays;

public class BinarySearchArrays {

    public static int binary(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
        for (int i = 0; i < arrays.length / 2; i++) {
            int mid = start + (end - start) / 2;
            if (target > arrays[mid]) {
                start = mid + 1;
            } else if (target < arrays[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int orderAgnosticBS(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
        while (start <=end) {
            int mid = start + (end - start) / 2;
            if (arrays[mid] == target) {
                return mid;
            }
            if (arrays[start] < arrays[end]) {
                if (target > arrays[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target < arrays[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int ceiling(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
        for (int i = 0; i < arrays.length / 2; i++) {
            int mid = start + (end - start) / 2;
            if (target > arrays[mid]) {
                start = mid + 1;
            } else if (target < arrays[mid]) {
                end = mid - 1;
            } else {
                return arrays[mid];
            }
        }
        return arrays[start];
    }

    public static int floor(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
        for (int i = 0; i < arrays.length / 2; i++) {
            int mid = start + (end - start) / 2;
            if (target > arrays[mid]) {
                start = mid + 1;
            } else if (target < arrays[mid]) {
                end = mid - 1;
            } else {
                return arrays[mid];
            }
        }
        return arrays[end];
    }

    public static char nextGreatLetter(char[] chars, char target) {
        int start = 0;
        int end = chars.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > chars[mid]) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        return chars[start % chars.length];
    }
}
