import java.util.*;

public class M128 {
    public static int longestConsecutive(int[] nums) {

        if (nums.length ==0)return 0;
        Arrays.sort(nums);
        int res =1;
        int count =1;
        int num = nums[0];



        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==num)continue;
            if (nums[i]-1==num){
                count++;
                num = nums[i];

            }else{

                count = 1;
                num = nums[i];
            }
            if (count>res)res = count;
        }
return res;
    }

    public static void main(String[] args) {
        System.out.println(longestConsecutive( new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
}
