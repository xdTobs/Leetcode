package M;

public class M152 {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            int temp = max*nums[i];
            max = Math.max(Math.max(max*nums[i],min*nums[i]),nums[i]);
            min = Math.min(Math.min(temp,min*nums[i]),nums[i]);
            res = Math.max(Math.max(max,min),res);
        }

        return res;
    }

}
