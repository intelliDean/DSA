package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiDArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<ArrayList<Integer>> arrayLists = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            arrayLists.add(new ArrayList<>());
        }
        for (ArrayList<Integer> arrayList : arrayLists) {
            for (int i = 0; i < 3; i++) {
                arrayList.add(input.nextInt());
            }
        }
        for (ArrayList<Integer> arrayList : arrayLists) {
            System.out.println(arrayList);
        }
    }
}
