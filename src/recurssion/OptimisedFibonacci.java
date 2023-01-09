package recurssion;

public class OptimisedFibonacci {
    public static long bestFibonacci(int nth) {
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), nth) / Math.sqrt(5));
    }
}
