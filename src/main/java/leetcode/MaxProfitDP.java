package leetcode;

public class MaxProfitDP {
    static int maxProfit(int[] prices){
         int a;
        if (prices.length == 0 || prices == null)
            return 0;
        int length = prices.length;
        int[][] dp = new int[length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for(int i = 1; i< length; i++){
//            dp[i][0] = Math.max(dp[i-1][0]);
        }
        return 1;
    }
}
