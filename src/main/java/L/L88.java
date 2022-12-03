package L;

import java.util.Arrays;

public class L88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m+n-1,l=m-1,r=n-1;
        while(l>=0&&r>=0){
            if (nums1[l]>nums2[r]){
                nums1[i] = nums1[l];
                l--;

            }
            else {
                nums1[i] = nums2[r];
                r--;
            }
            i--;
        }
        while(l>=0){
            nums1[i] = nums1[l];
            l--;
            i--;
        }
        while(r>=0){
            nums1[i] = nums2[r];
            r--;
            i--;
        }
    }
}
