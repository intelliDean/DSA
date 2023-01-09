package object_programming;

public class SwapObject {
    private int name;
    public void username(int name) {
        this.name = name ;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object removed");
    }

    public static void main(String[] args) {
        Integer a = 120;
        Integer b = 250;
        swap(a, b);
        System.out.println(a+" "+b);

        int num1 = 10;
        int num2 = 20;
        System.out.println(num1+" "+num2);
        String name = "Dean";
        name = "MICHAEL";
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void swap(Integer a, Integer b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
