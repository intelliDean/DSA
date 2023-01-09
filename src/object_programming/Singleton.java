package object_programming;

public class Singleton {
    private static Singleton instance;      //static instance variable not dependent on any object of the class

    private String name;
    private String phoneNumber;
    private int age;
    private Singleton(){}       //private constructor, which means it cannot be called or accessed anywhere

    public static Singleton getInstance() {        //method to create the only object of this class
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                '}';
    }
}
