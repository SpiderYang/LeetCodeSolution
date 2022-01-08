package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/7 14:58
 */

/*
*
几张卡牌排成一行，每张卡牌都有一个对应的点数。点数由整数数组cardPoints给出。
每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿k张卡牌。
你的点数就是你拿到手中的所有卡牌的点数之和。
给你一个整数数组cardPoints和整数k，请你返回可以获得的最大点数
解法：由于只能在头尾取牌，可以把数组看成环形，容易理解该取值为连续的。通过双指针在该封闭区域取到最大值即可。
* */
public class maxScore {

    public int maxScore(int[] cardPoints, int k){
        int maxWindow = 0, length = cardPoints.length;
        for(int i =0 ;i < k; i++)
            maxWindow += cardPoints[i];
        int curWindow = maxWindow;
        for(int i = length -1; i >= length -k; i--){
            curWindow -= cardPoints[k - (length-i) ];
            curWindow += cardPoints[i];
            maxWindow = Math.max(maxWindow,curWindow);
        }
        return maxWindow;
    }
}
