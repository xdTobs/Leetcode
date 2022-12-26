package M;

public class M63 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length, n=obstacleGrid[0].length;
        int[][]dp = new int[m][n];
        for (int i = m-1; i >=0; i--) {
            for (int j = n-1; j >=0 ; j--) {
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                    continue;
                }
                if(j==n-1&&i==m-1){
                    dp[i][j]=1;
                }
                else if(j==n-1){
                    dp[i][j]=dp[i+1][j];
                }
                else if(i==m-1){
                    dp[i][j]=dp[i][j+1];
                }
                else{
                    dp[i][j]=dp[i+1][j]+dp[i][j+1];
                }


            }
        }
        return dp[0][0];
    }
}
