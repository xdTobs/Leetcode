package M;

public class M55 {
    public boolean canJump(int[] nums) {
    boolean[]dp = new boolean[nums.length];
    dp[0]=true;
        for (int i = 0; i < nums.length; i++) {
            if(dp[i]) {
                for (int j = 0; j < nums[i]; j++) {
                    if (i + j+1 < nums.length) {
                        dp[i + j+1] = true;
                    }
                }
            }
        }

    return dp[nums.length-1];
    }

}
