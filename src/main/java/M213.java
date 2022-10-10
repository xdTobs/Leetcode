import java.util.Arrays;

public class M213 {
    public int rob(int[] nums) {
        if (nums.length ==1)return nums[0];
int[] start = new int[nums.length-1];
start = Arrays.copyOf(nums,nums.length-1);

int[] end = new int[nums.length-1];
end = Arrays.copyOfRange(nums,1,nums.length);

        return Integer.max(helper(start),helper(end));

    }
    public int helper(int[] nums){

            int rob1=0,rob2=0,temp=0;
            for (int n : nums){
                temp = Integer.max(n+rob1,rob2);
                rob1 = rob2;
                rob2 = temp;
            }
            return rob2;

    }
}
