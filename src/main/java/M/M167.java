package M;

public class M167 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r= numbers.length-1;
        while(true){
            int sum =numbers[l]+numbers[r];
            if(sum==target)
                break;
            if(sum>target)
                r--;
            if(sum<target)
                l++;

        }
        return new int[]{l+1,r+1};
    }

}
