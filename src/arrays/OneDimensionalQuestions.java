package arrays;

public class OneDimensionalQuestions {

    public static int linearSearch(int[] arrays, int target) {
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arrays, int target) {
        int start = 0;
        int end = arrays.length - 1;
        while (start <= end) {
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

    public static int searchIndex(int[] arrays, int index) {
        for (int i = 0; i < arrays.length; i++) {
            if (index <= arrays.length - 1) {
                return arrays[index];
            }
        }
        return Integer.MAX_VALUE;   //-1 might be one of the elements hence returning -1 if the element is not found is dangerous
    }

    public static boolean searchString(String phrase, char target) {
        if (phrase.length() != 0) {
            for (int i = 0; i < phrase.length(); i++) {
                if (phrase.charAt(i) == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchString2(String phrase, char target) {
        if (phrase.length() != 0) {
            for (char ch : phrase.toCharArray()) {
                if (ch == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchRange(int[] arrays, int target, int startIndex, int endIndex) {
        if (arrays.length != 0) {
            for (int i = startIndex; i <= endIndex; i++) {
                if (arrays[i] == target) {
                    return true;
                }
            }
        }
        return false;
    }
     public static int evenNumber(int[] arrays) {
        if (arrays.length == 0) {
            return -1;
        }
        int count = 0;
        for (int array : arrays) {
            if (array % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int evenDigits(int[] arrays) {
        int count = 0;
        for (int array : arrays) {
            while (array > 0) {
                int rem = array % 10;
                if (rem % 2 == 0) {
                    count++;
                }
                array /= 10;
            }

        }
        return count;
    }


    public static int digits(int number) {
        String num = String.valueOf(number);
        return num.length();
        /*
        int count = 0;
        while (number > 0) {
            int rem = number % 10;
            number /=10;
            count++;
        }
        return count;*/
    }

    public static int digits2(int number) {
        return (int) Math.log10(number) + 1;
    }
}
