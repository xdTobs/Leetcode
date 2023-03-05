package L;

import java.util.Arrays;

public class L704 {
    public static int search(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = ((l+r)/2);
            int compVal = nums[mid];


            if(compVal>target)
                r=mid-1;
            else if (compVal < target) {
                l=mid+1;
            }
            else return mid;

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},2));
    }
}
