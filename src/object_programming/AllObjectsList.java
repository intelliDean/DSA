package object_programming;

import java.util.ArrayList;

public class AllObjectsList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(234);
        list.add(43.09);
        list.add("Name");
        list.add(false);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}
