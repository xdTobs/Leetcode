import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            int k = i + 1;
            int j = nums.length - 1;
            while (k < j) {
                int sum = num + nums[k] + nums[j];
                if (sum > 0) {
                    j--;
                } else if (sum < 0) {
                    k++;
                } else res.add(new ArrayList<Integer>(Arrays.asList(num, nums[k], nums[j])));

                k++;
                while (nums[k] == nums[k - 1] && k > j) k++;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println("done");
    }
}
