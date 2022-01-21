package 双指针;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Hikari
 * @Date: 2022/1/9 17:17
 */
public class sumTarget {
    public int[][] findContinousSequence(int target){
        int left = 1, right = 2;
        int sum = left+right;
        List<int[]> res = new ArrayList<>();
        while (left < target/2){
            if (sum < target){
                sum += ++right;
            }else if (sum > target){
                sum -= left++;
            }else {
                int[] arr = new int[right -left + 1];
                for(int k = left; k <= right; k++)
                    arr[k-left] = k;
                res.add(arr);
            }
            sum -= left++;
            sum += ++right;
        }
        return res.toArray(new int[res.size()][]);
    }
}
