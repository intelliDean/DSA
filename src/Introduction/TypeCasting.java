package Introduction;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         System.out.println("enter the float number");
        int number = (int) input.nextFloat();
        System.out.println(number);

        int num = 273;
        byte numCopy = (byte) num;
        System.out.println(numCopy);    //it'll give the result 273 % 256(max of byte)
    }
}
