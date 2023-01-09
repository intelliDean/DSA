package object_programming;

public class StaticBlock {
    private static int age = 23;
    private static String name;
    private static  boolean married;

    //this only run once when the first object is created, i.e, when class is loaded for the first time
    static {                //static block
        System.out.println(age);
        name = "Dean";
        age = 31;
    }

    public static void main(String[] args) {
        StaticBlock stat = new StaticBlock();
        married = false;
        System.out.println(" "+name+" "+married);

    }
    class  InnerClass{          //Inner class is dependent on the outer class hence may be static ot not
        private int id;
        private String name;
}

    }