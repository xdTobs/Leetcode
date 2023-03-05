package M;

public class M55_fix {
    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]+i>=goal){
                goal =i;
            }

        }
        return goal==0;
    }
}
