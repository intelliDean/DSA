package recurssion;

public class FibonacciNumber {

    public static int recursiveFibonacci(int nth) {
        //base condition
        if (nth < 2) {
            return nth;
        }//body
        //recursive call
        return recursiveFibonacci(nth - 1) + recursiveFibonacci(nth - 2);
    }
}
