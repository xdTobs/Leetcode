package L;

public class L268 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int expectedSum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            expectedSum += i;
        }
        return expectedSum-sum;
    }
}
