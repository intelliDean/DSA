package recurssion;

public class RecursivePrint {
    public static void main(String[] args) {
        printNumbers(11);
    }

    public static void printNumbers(int number) {
        //base condition
        if (number == 100) {
            System.out.print(number + " ");
            return;
        }

        //body
        if (number % 10 == 0) {
            System.out.println(number);
        } else {
            System.out.print(number + " ");
        }

        //recursive call
        printNumbers(number + 1);
    }
}
