package L;

public class L121 {
    public int maxProfit(int[] prices) {
       int L = 0;
       int R =1;
        int highestProfit=0,profit=0;
       while (R<prices.length){

       profit = prices[R]-prices[L];
           if (profit<=0) {
               L=R;
               R++;
           }else{
               if (profit>highestProfit)highestProfit = profit;
               R++;
           }
       }
       return highestProfit;
    }
}
