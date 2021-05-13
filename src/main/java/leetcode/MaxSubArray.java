package leetcode;

public class MaxSubArray {

    static int maxSubArray(int[] nums){
        int length = nums.length;
        int[] dp = new int[length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i-1],0) + nums[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

}
