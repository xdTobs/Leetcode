package M;

import java.util.*;

public class M15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2;i++) {

            if (i == 0 || nums[i] != nums[i - 1]) {

                int target = -nums[i];
                int l = i + 1;
                int r = nums.length - 1;

                while (l < r) {
                    if (nums[l] + nums[r] == target) {
                        res.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;
                        l++;
                        r--;
                    } else if (nums[l] + nums[r] > target) {
                        r--;
                    } else {
                        l++;
                    }


                }
            }
        }

        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println("done");
    }
}
