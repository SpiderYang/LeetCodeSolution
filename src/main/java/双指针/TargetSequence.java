package 双指针;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @Author: Hikari
 * @Date: 2022/1/11 0:29
 */

public class TargetSequence {
    public int[][] findContinousSequence(int target){
        int left = 1, right = 2;
        List<int[]> result = new ArrayList<>();
        while (left < (target/2+1) ){
            if(sumRange(left, right) < target){
                right++;
            }else if(sumRange(left, right) > target){
                left++;
            }else {
                int[] arr = IntStream.range(left, right+1).toArray();
                result.add(arr);
                left++;
                right++;
            }
        }
        return result.toArray(new int[result.size()][]);

    }
    private int sumRange(int start, int end){
        return IntStream.range(start, end+1).sum();
    }


}
