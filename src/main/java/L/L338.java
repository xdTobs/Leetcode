package L;

import java.util.Arrays;

public class L338 {

    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            res[i] = hammingWeight(i);
        }
        return res;
    }

    public int hammingWeight(int n) {
        int res =0;
        int mask =1;
        for (int i = 0; i < 32; i++) {
            if((n&mask)!=0){
                res++;
            }
            n>>=1;
        }
        return res;
    }

    public static void main(String[] args) {
        L338 sol = new L338();
        System.out.println(Arrays.toString(sol.countBits(2)));
    }
}
class L338DP {
    public int[] countBits(int n) {
        int[]dp = new int[n+1];
        Arrays.fill(dp,0);
        int offset = 1;
        for (int i = 1; i < n + 1; i++) {
            if (offset*2==i)
                offset=i;
            dp[i]=1+dp[i-offset];
        }
        return dp;
    }
}
