package M;

public class M53 {


    public int maxSubArray(int[] nums) {
        int res=nums[0], cursum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(cursum<0){
                cursum=0;
            }
            cursum+=nums[i];
            res=Math.max(cursum,res);
        }
        return res;
    }
}
