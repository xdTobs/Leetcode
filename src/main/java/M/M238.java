package M;

import java.util.*;

public class M238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0]=nums[0];
        right[nums.length-1] = nums[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            left[i+1]=left[i]*nums[i+1];
            right[nums.length-2-i]=right[nums.length-1-i]*nums[nums.length-2-i];
        }

        for (int i = 0; i < nums.length; i++) {
            if(i==0)res[i]=right[i+1];
            else if (i==nums.length-1) res[i]=left[i-1];
            else {
                res[i] = left[i - 1] * right[i + 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
    }
}
