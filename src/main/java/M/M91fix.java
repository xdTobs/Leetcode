package M;

import java.util.HashMap;
import java.util.Map;

public class M91fix {
    public static int numDecodings(String s) {
    return dfs(s,0,new Integer[s.length()]);


    }
    public static int dfs(String s,int i,Integer[] dp){
        if (i==s.length())return 1;
        if (s.charAt(i)=='0')return 0;
        if (dp[i]!=null)return dp[i];
        int count =0;
        count +=dfs(s,i+1,dp);
        if(i<s.length()-1&&(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<'7')){
            count +=dfs(s,i+2,dp);
        }
        dp[i] = count;
        return dp[i];
    }
}
