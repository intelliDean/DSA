package bitwise_operator;

public class Power {
    public static int powerOfANumber(int number, int power) {
        int answer =  1;

        while (power > 0) {
            if ((power & 1) == 1) {
                answer = answer * number;
            }
            number = number * number;
            power = power >> 1;
        }
        return answer;
    }
}