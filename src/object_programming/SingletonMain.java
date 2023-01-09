package object_programming;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        //all 3 reference variables are pointing to only one object

        singleton1.setAge(23);
        singleton1.setName("Dean");
        singleton1.setPhoneNumber("1234");

        singleton2.setAge(50);
        singleton2.setName("Mike");
        singleton2.setPhoneNumber("5678");

        singleton3.setAge(12);
        singleton3.setName("Sule");
        singleton3.setPhoneNumber("4342");
 
        System.out.println(singleton1.toString());
        System.out.println(singleton2.toString());
        System.out.println(singleton3.toString());
        //when printed, they all carried the information of the last object because the same object is what they are referencing

    }

}
