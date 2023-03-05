package S;

import java.util.Arrays;

public class S42 {
    public static int trap(int[] height) {
        int[]water = new int[height.length];
        Arrays.fill(water,0);
        int l=0,r= 0,waterLevel=0;
        while(r< height.length-1){
            int lVal = height[l];
            int rVal = height[r];

            if(rVal>=rVal+1) {
                r++;
                continue;
            }

            r++;
            rVal = height[r];

            for (int i = l; i < r; i++) {
                water[i] = Math.max(Math.min(lVal,rVal) - height[i], water[i]);
            }


            if(lVal<=rVal)
                l=r;
        }
        int sum=0;
        for(int i : water)
            sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
        //
    }
}
