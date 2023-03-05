package M;

import java.util.Arrays;

public class M1143 {
    public int longestCommonSubsequence(String text1, String text2) {
    int[][]dp = new int[text1.length()+1][text2.length()+1];
        for (int i = 0; i < text1.length(); i++) {
            dp[i][text2.length()]=0;
        }
        for (int i = 0; i < text2.length(); i++) {
            dp[text1.length()][i]=0;
        }

        for (int i = text1.length()-1; i >=0; i--) {
            for (int j = text2.length()-1; j >=0; j--) {
                if (text1.charAt(i)==text2.charAt(j)){
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
                }

            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
    M1143 main = new M1143();
        System.out.println(main.longestCommonSubsequence("ezupkr","ubmrapg"));
    }
}
//while(keyC!=mainC){
//                keyC = text2.charAt(keyIndex);
//                mainC = text1.charAt(mainL);
//                mainL++;
//            }