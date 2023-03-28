public class ConsecutiveGreaterFrequency {
    public static void main(String[] args) {
        int[] arrays = {2, 4, 7, 8, 5, 9, 7, 8};
        int a = days(arrays);
        System.out.println(a);
    }

    public static int days(int[] arrays) {
        int temp = 0;
        int count = 0;
        for (int array : arrays) {
            if (array > 6) {
                count++;
            }
            if (temp < count) {
                temp = count;
            }
            if (array <= 6) {
                count = 0;
            }
        }
        return temp;
    }
}
