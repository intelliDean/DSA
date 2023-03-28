import java.util.ArrayList;
import java.util.List;

public class ConstructorTest {
    private int id;
    private String name;
    private static List<ConstructorTest> list = new ArrayList<>();

    public ConstructorTest(int id, String name) {
        this.id = id;
        this.name = name;
        list.add(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<ConstructorTest> getList() {
        return list;
    }

    public static void setList(List<ConstructorTest> list) {
        ConstructorTest.list = list;
    }

    public static List<ConstructorTest> searchRange(int start, int end) {
        List<ConstructorTest> newSearch = new ArrayList<>();
        if (start >= 0 || start < end && end <= list.size()) {
            for (int i = start; i <= end; i++) {
                newSearch.add(list.get(i));
            }
        }
        return newSearch;
    }
    public static int sizeOfDb() {
        return list.size();
    }
}
