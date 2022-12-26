package M;

public class M153 {
    public int findMin(int[] nums) {
    int l=0;
    int r= nums.length-1;
    int mid;

    while(l<=r){
        if(nums[l]<=nums[r]){
            return nums[l];
        }
        mid = (l+r)/2;

        if (nums[mid]>=nums[l]){
            l=mid+1;
        }
        else{
            r=mid;

        }

    }

    return-1;
    }

    public static void main(String[] args) {

            int[]test = {3,1,2};
            M153 sol = new M153();
            System.out.println(sol.findMin(test));


    }
}
