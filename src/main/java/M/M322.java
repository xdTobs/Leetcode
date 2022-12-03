package M;

public class M322 {
    public int coinChange(int[] coins, int amount) {
return dfs(coins,amount, new Integer[amount+1]);
    }
    public static int dfs(int[]coins,int amount,Integer[] dp){
        if (amount==0)return 0;
        if (dp[amount]!=null)return dp[amount];
        for(int coin : coins){
            if (amount>coin) {
                dp[amount]=1+dfs(coins, amount - coin, dp);
            }
        }
        return dp[amount];

    }
}
