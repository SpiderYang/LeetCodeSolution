package 双指针;

/**
 * @Author: Hikari
 * @Date: 2022/1/7 14:58
 */
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
