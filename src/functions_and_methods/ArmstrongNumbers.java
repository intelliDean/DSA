package functions_and_methods;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        printArmstrong();
    }
    public static void printArmstrong() {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int copy = number;
        int arm = 0;
        while (number > 0) {
            int rem = number % 10;      //take each digit apart
            arm += rem * rem * rem;     //sum the cube of each number
            number /= 10;
        }
        return arm == copy;             //compare it with the original number
    }
}
