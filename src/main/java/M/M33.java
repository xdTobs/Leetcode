package M;

import java.util.Arrays;

public class M33 {
    public int search(int[] nums, int target) {
        int res = -1;
        int r = nums.length-1;
        int l = 0;
        int mid;

        while (l<=r){
            mid = ((r+l)/2);
            if (nums[mid]==target){
                res = mid;
                break;
            }

            else if (nums[l]<=nums[mid]){
                if (target>nums[mid]||target<nums[l]){
                    l= mid +1;
                }
                else{
                    r=mid-1;
                }
            }else{
                if (target<nums[mid]||target >nums[r]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }

            }

        }

        return res;

    }

    public static void main(String[] args) {
        int[]test = {4,5,6,7,0,1,2};
        M33 sol = new M33();
        System.out.println(sol.search(test,0));

    }
}
