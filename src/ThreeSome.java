import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSome {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(Arrays.toString(threeSome(nums)));
    }

    public static int[] threeSome(int[] nums) {
        int[] rays = new int[3];
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());

        boolean added = false;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = 2; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0 && nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]) {
                        rays[0] = nums[i];
                        rays[1] = nums[j];
                        rays[2] = nums[k];
                        return new int[]{nums[i], nums[j], nums[k]};
                        //added = true;
                    }

                }
                
            }
        }
        return new int[]{};
    }
}
