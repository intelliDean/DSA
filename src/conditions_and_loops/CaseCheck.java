package conditions_and_loops;

public class CaseCheck {
    public static void main(String[] args) {
        System.out.println(caseCheck("R"));
    }
    public static String caseCheck(String letter) {
        if (letter.charAt(0) >='a' && letter.charAt(0) <= 'z') {
            return "lowercase";
        } else if (letter.charAt(0) >='A' && letter.charAt(0) <= 'Z') {
            return "UPPERCASE";
        } else
            return "not an alphabet";
    }
}
