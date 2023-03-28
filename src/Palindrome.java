import java.util.Arrays;
import java.util.Collections;

public class Palindrome {
    public static void main(String[] args) {
        Object[] arrays = {"fan", "milk", 23, false, true,  false, 23, "milk", "fan"};
        boolean result = isPalindrome(arrays);
        System.out.println(result);

        Object object = "manam";
        boolean answer = isPalindrome(object);
        System.out.println(answer);

    }
    public static boolean isPalindrome(Object object) {
        String obj = String.valueOf(object);
        for (int i = 0, j = obj.length() - 1; i < obj.length() / 2; i++, j--) {
            if (obj.charAt(i) != obj.charAt(j)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPalindrome(Object[] object) {
        for (int i = 0, j = object.length - 1; i < object.length / 2; i++, j--) {
            if (object[i] != object[j]) {
                return false;
            }
        }
        return true;
    }

}
