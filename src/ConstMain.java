import java.util.List;

public class ConstMain {
    public static void main(String[] args) {
        ConstructorTest con1 = new ConstructorTest(23, "Dean");
        ConstructorTest con2 = new ConstructorTest(12, "Mike");
        ConstructorTest con3 = new ConstructorTest(54, "Sule");
        ConstructorTest con4 = new ConstructorTest(213, "Deaner");
        ConstructorTest con5 = new ConstructorTest(142, "Miko");
        ConstructorTest con6 = new ConstructorTest(542, "Suler");
        ConstructorTest con7 = new ConstructorTest(203, "Dean");
        ConstructorTest con8 = new ConstructorTest(126, "Mike");
        ConstructorTest con9 = new ConstructorTest(546, "Sule");
        ConstructorTest con10 = new ConstructorTest(231, "Deaner");
        ConstructorTest con11 = new ConstructorTest(149, "Miko");
        ConstructorTest con12 = new ConstructorTest(546, "Suler");

        List<ConstructorTest> here = ConstructorTest.getList();

//        for (int i = 0; i < ConstructorTest.getList().size(); i++) {
//            System.out.println(ConstructorTest.getList().get(i).getName());
//        }

        int start = 2;
        int end = 9;
        List<ConstructorTest> lists = ConstructorTest.searchRange(start, end);
        for (ConstructorTest list : lists) {
            System.out.println(list.getName()+" with id:: "+list.getId());
        }

    }
}
