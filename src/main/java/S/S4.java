package S;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class S4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = 0,r1 = nums1.length-1,l2=0,r2 = nums2.length-1;
        while(r1-l1>=0&&r2-l2>=0){
            int m1 = (r1+l1)/2, m2 = (r2+l2)/2;
            if(nums1[m1]>nums2[m2]){
                l2 = m2+1;
                r1 = m1-1;
            }
            else{
                l1 = m1+1;
                r2 = m2-1;
            }
        }
        String s = Arrays.stream(nums1).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(l1 +" "+ r1);
        String s2 = Arrays.stream(nums2).mapToObj(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(l2 +" "+ r2);
        return 0;
    }

    public static void main(String[] args) {
        //int[] nums1 = new int[]{1,3,5,7,9};
        //int[] nums2 = new int[]{2,4,6,8,10};
        int[] nums1 = new int[]{1,2,3,4,5};
        int[] nums2 = new int[]{6,7,8,9,10};
        S4 sol = new S4();
        sol.findMedianSortedArrays(nums1,nums2);
    }
}
